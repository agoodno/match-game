(ns match-game.core
  (:require [clojure.java.io :refer [file]]
            [clojure.string :as str]
            [clojure.pprint :as pp]
            [clojure.set :refer [rename-keys]]))

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

(defn init-game [theme-name player1 player2]
  (let [dimensions [4 5]
        background-color "black"
        theme (get-theme theme-name)
        designs (:designs theme)
        players [player1 player2]]
    {:players players
     :turn (first players)
     :theme theme
     :board (init-board dimensions background-color designs)}))

(defn flip-state [state] (if (= :covered state) :facing :covered))

(defn flip-img [img card]
  (if (= "/hoyle.png" img) (:face-img card) (:back-img card)))

(defn flip-card [game idx]
  (let [board (:board game)
        cards (:cards board)
        card (get cards idx)]
    (->
     (update-in game [:board :cards idx :state :name] flip-state)
     (update-in ,,, [:board :cards idx :state :img] flip-img card))))

(defn flip-turn [turn] (if (= "Andy" turn) "Cal" "Andy"))

(defn end-turn [game]
  (update-in game [:turn] flip-turn))

(defn action [player game f & args]
  (if (= (:turn game) player)
    {:status :success :result (apply f (cons game args))}
    {:status :failure :message "It's not your turn" :result game}))

(defn -main
  [& args]
  (let [[theme-name player1 player2] args
        game (atom (init-game theme-name player1 player2))]
    (pp/pprint game)))

;;(reset! game (match-game.core/flip-card game 2))

;;(def game (match-game.core/init-game "old_maid"))
;;(def game (:result (match-game.core/action "Cal" game flip-card 6)))
;;(def game (:result (match-game.core/action "Cal" game flip-card 1))
;;(def game (:result (match-game.core/action "Cal" game end-turn)))
;;(def game (:result (match-game.core/action "Andy" game flip-card 5)))
;;(def game (:result (match-game.core/action "Andy" game flip-card 4))
;;(def game (:result (match-game.core/action "Andy" game end-turn)))
