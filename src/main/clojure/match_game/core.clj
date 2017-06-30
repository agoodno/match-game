(ns match-game.core
  (:require [clojure.java.io :refer [file]]
            [clojure.string :as str]
            [clojure.pprint :as pp]
            [clojure.set :refer [rename-keys]]
            [clojure.core.reducers :as reducers]))

(defn walk-dir [dirpath pattern]
  (doall (filter #(re-matches pattern (.getName %))
                 (file-seq (file dirpath)))))

(defn list-dir [dirpath pattern]
  (doall (filter #(re-matches pattern (.getName %))
                 (-> dirpath file .listFiles))))

(defn randomize [coll]
  (let [indexes (shuffle (range (count coll)))]
    (map #(second %)
         (sort-by first
                  (map list indexes coll)))))

(defn files-in-theme [theme-name]
  (let [theme-dirpath (str (.getFile (clojure.java.io/resource "public/img/themes/")) theme-name)
        files (list-dir theme-dirpath #".*\.png")]
    (map #(.getPath %) files)))

(defn short-path [filePath]
  (last (re-find #"^(.*)(/img/.*)$" filePath)))

(defn names-in-theme [theme-name]
  (comment '("alto_annie" "postman_pete"))
  (let [file-strs (files-in-theme theme-name)
        short-paths (map #(short-path %) file-strs)]
    (map #(last (re-find #"^.*\/(.*)\.png$" %)) short-paths)))

(defn human-name [code]
  (->>
   (str/split code #"_")
   (map str/capitalize)
   (str/join " ")))

(defn uri-path [dir base-name]
  (str "/" dir "/" base-name ".png"))

(defn load-design [theme-name design-name]
  {:name design-name
   :description (human-name design-name)
   :img (uri-path theme-name design-name)})

(defn load-theme [theme-name]
  (let [design-names (names-in-theme theme-name)
        theme-names (repeat (count design-names) theme-name)]
    {:name theme-name
     :description (human-name theme-name)
     :designs (map load-design theme-names design-names)}))

(def get-theme (memoize load-theme))

(defn init-card [face-design twin]
  (let [back-design { :back-img "/hoyle.png" }]
    (->
     (merge {:twin twin :state {:name :covered :img (:back-img back-design)}} face-design)
     (merge ,,, back-design)
     (rename-keys ,,, {:img :face-img}))))

(defn init-cards [designs]
  (let [twins [:left :right]]
    (shuffle
     (mapcat (fn [twin]
               (map (fn [design]
                      (init-card design twin))
                    designs))
             twins))))

(defn init-board [dimensions background-color designs]
  {:dimensions dimensions
   :background-color background-color
   :cards (init-cards designs)})

(defn init-player-turn [player]
  (merge { :flip-count 0 } player))

(defn init-player [name]
  {:name name :display-name (str/capitalize name)})

(defn init-game [theme-name player1 player2]
  (let [dimensions [4 5]
        background-color "black"
        theme (get-theme theme-name)
        designs (:designs theme)
        players [(init-player player1)
                 (init-player player2)]]
    {:players players
     :player-turn (init-player-turn (first players))
     ;;:theme theme
     :board (init-board dimensions background-color designs)}))

(defn toggle-state [state] (if (= :covered state) :facing :covered))

(defn toggle-img [img card]
  (if (= "/hoyle.png" img) (:face-img card) (:back-img card)))

(defn inc-flip-count [flip-count] (inc flip-count))

(defn flip-card [game idx]
  (let [board (:board game)
        cards (:cards board)
        card (get cards idx)]
    (->
     (update-in game [:board :cards idx :state :name] toggle-state)
     (update-in ,,, [:board :cards idx :state :img] toggle-img card)
     (update-in ,,, [:player-turn :flip-count] inc-flip-count))))

(defn toggle-turn [player-turn players]
  (if (= (:name (first players)) (:name player-turn))
    (init-player-turn (second players))
    (init-player-turn (first players))))

(defn end-turn [game]
  (let [players (:players game)]
  (update-in game [:player-turn] toggle-turn players)))

(defn flip-count [game] (get-in game [:player-turn :flip-count]))

(defn validate-turn [player-name game]
  (if (not= (:name (:player-turn game)) player-name)
    "It's not your turn"))

(defn matchable? [game]
  (let [cnt (flip-count game)]
    (and (> cnt 0) (= (mod cnt 2) 0))))

(defn finalize-matches [game]
  (let [cards (get-in game [:board :cards])
        facing (filter #(= (:name (:state %1)) :facing) cards)
        one (first facing)
        two (second facing)
        one-idx (.indexOf cards one)
        two-idx (.indexOf cards two)
        toggle-matched (fn [state] :matched)
        toggle-covered (fn [state] :covered)]
    (if (= (:name one) (:name two))
      (do
        ;; (println "finalizing matches")
        (->
         (update-in game [:board :cards one-idx :state :name] toggle-matched)
         (update-in ,,, [:board :cards two-idx :state :name] toggle-matched)))
      (do
        ;; (println "hiding non-matches")
        (->
         (update-in game [:board :cards one-idx :state :name] toggle-state)
         (update-in ,,, [:board :cards one-idx :state :img] toggle-img one)
         (update-in ,,, [:board :cards two-idx :state :name] toggle-state)
         (update-in ,,, [:board :cards two-idx :state :img] toggle-img two))))))

(defn validate-flip-count [game]
  (if (>= (flip-count game) 2) "Your turn is over"))

(defn validate
  ([xs x]
   (let [err (x)]
     (if (not-empty xs)
       (reduced xs)
       (if (some? err) (conj xs err)))))
  ([] []))

(defn validate-play [player-name game]
  (first (reducers/fold validate [(fn [] (validate-turn player-name game))
                                  (fn [] (validate-flip-count game))])))

(defn resolve-matches [game]
  (if (matchable? game)
    (do
      ;; (println "resolving matches")
      (finalize-matches game))
    game))

(defn play-card [player-name game idx]
  (let [msg (validate-play player-name game)]
    (if (some? msg)
      (assoc game :message msg)
      (->
        (flip-card game idx)
        (resolve-matches)))))

(defn -main
  [& args]
  (let [[theme-name player-1-name player-2-name] args
        game (atom (init-game theme-name player-1-name player-2-name))]
    (pp/pprint game)))
