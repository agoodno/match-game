(ns match-game.core
  (:require
   [cljsjs.react]
   [cljsjs.react.dom]
   [sablono.core :as sab :include-macros true]
   [clojure.string :as str]
   [clojure.pprint :as pp]
   [clojure.set :refer [rename-keys]]
   [clojure.core.reducers :as reducers]
   [match-game.util :as util]))

(enable-console-print!)

(def deck-img "/img/cover.png")
(def session-player-name "Andy")

(defn names-in-theme [theme-name]
  (comment ex. '("alto_annie" "postman_pete"))
  ;; (let [file-strs (files-in-theme theme-name)]
  ;;   (map #(last (re-find #"^.*\/(.*)\.png$" %)) file-strs))
  ;; '("alto_annie" "arnie_angler" "bagpipe_barney" "baker_benny" "billy_blaze" "careless_carrie" "clancy_clown" "courageous_cop" "diver_dan" "fifi_fluff" "freddie_falloff" "greenthumb_gert" "hayseed_hank" "heap_big_talk" "lasso_louie" "loggin_larry" "milkman_mo" "postman_pete" "slap_on_sam" "tumbledown_tess"))
  '("candycane" "hat" "ornament" "present" "snowman" "tree"))

(defn uri-path [dir base-name]
  (str "/img/themes/" dir "/" base-name ".png"))

(defn load-design [theme-name design-name]
  {:name design-name
   :description (util/human-name design-name)
   :img (uri-path theme-name design-name)})

(defn load-theme [theme-name]
  (let [design-names (names-in-theme theme-name)
        theme-names (repeat (count design-names) theme-name)]
    {:name theme-name
     :description (util/human-name theme-name)
     :designs (map load-design theme-names design-names)}))

(def get-theme (memoize load-theme))

(defn init-card [face-design twin]
  (let [back-design { :back-img deck-img }]
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

(defn init-player [name & {:keys [current] :or { current false }}]
  {:name name :display-name (str/capitalize name) :current current})

(defn toggle-state [state] (if (= :covered state) :facing :covered))

(defn toggle-img [img card]
  (if (= deck-img img) (:face-img card) (:back-img card)))

(defn flip-card [game idx]
  (let [board (:board game)
        cards (:cards board)
        card (get cards idx)]
    ;; (println "flipping card " card)
    (->
     game
     (update-in ,,, [:board :cards idx :state :name] toggle-state)
     (update-in ,,, [:board :cards idx :state :img] toggle-img card))))

(defn player [game iplay-fn]
  (let [players (:players game)]
  (first (filter iplay-fn players))))

(defn current-player [game]
  (let [current-fn (fn [player] (:current player))]
    (player game current-fn)))

(defn other-player [game]
  (let [not-current-fn (fn [player] (not (:current player)))]
    (player game not-current-fn)))

(defn validate-turn [player-name game]
  (if (not= player-name (:name (current-player game)))
    (str "It's not your turn " player-name)))

(defn finalize-matches [game]
  (let [current-player-idx (util/index-of (:players game) (current-player game))
        cards (get-in game [:board :cards])
        cards-facing (filter #(= (:name (:state %1)) :facing) cards)
        one (first cards-facing)
        two (second cards-facing)
        one-idx (util/index-of cards one)
        two-idx (util/index-of cards two)]
    (if (= (:name one) (:name two))
      (do
        ;; (println "finalizing matches")
        ;; (println "cards" cards)
        ;; (println "one" one)
        ;; (println "two" two)
        ;; (println "one idx" one-idx)
        ;; (println "two idx" two-idx)
        (->
         game
         (update-in ,,, [:players current-player-idx :match-count] inc)
         (assoc-in ,,, [:board :cards one-idx :state :name] :matched)
         (assoc-in ,,, [:board :cards two-idx :state :name] :matched)))
      game)))

(defn two-cards-facing? [game]
  (let [cards (get-in game [:board :cards])]
  (= (count (filter #(= (:name (:state %1)) :facing) cards)) 2)))

(defn validate-flip-count [game]
  (if (two-cards-facing? game) "Your turn is over"))

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
  (if (two-cards-facing? game)
    (do
      ;; (println "resolving matches")
      (finalize-matches game))
    game))

(defn init-game [theme-name player1 player2]
  (let [dimensions [4 5]
        background-color "black"
        theme (get-theme theme-name)
        designs (:designs theme)
        players [(init-player player1 :current true)
                 (init-player player2)]]
    {:players players
     ;; :theme theme
     :board (init-board dimensions background-color designs)}))

(defn play-card [player-name game idx]
  (let [msg (validate-play player-name game)]
    ;; (println "playing card for " player-name)
    (if (some? msg)
      (do
        (println "msg " msg)
        (assoc game :message msg))
      (->
       (flip-card game idx)
       (resolve-matches ,,,)))))

(defn end-player-turn [game]
  (let [players (:players game)
        current-player-idx (util/index-of players (current-player game))
        other-player-idx (util/index-of players (other-player game))]
    (->
     game
     (assoc-in ,,, [:players current-player-idx :current] false)
     (assoc-in ,,, [:players other-player-idx :current] true))))

(defn reset-cards [game]
  (let [cards (get-in game [:board :cards])
        cards-facing (filter #(= (:name (:state %1)) :facing) cards)
        one (first cards-facing)
        two (second cards-facing)
        one-idx (util/index-of cards one)
        two-idx (util/index-of cards two)]
    (if (not-empty cards-facing)
      (do
        ;; (println "some non-matches to hide")
        ;; (println "cards" cards)
        ;; (println "one" one)
        ;; (println "two" two)
        ;; (println "one idx" one-idx)
        ;; (println "two idx" two-idx)
        (->
         game
         (flip-card ,,, one-idx)
         (flip-card ,,, two-idx))))))

(defn end-turn [game]
  (->
   game
   (reset-cards)
   (end-player-turn)))

(def starting-game-state (init-game "xmas" "Andy" "Cal"))
(def starting-user-state session-player-name)

(defonce game-state (atom starting-game-state))
(defonce session-user-state (atom starting-user-state))

(defn reset-state []
  (starting-game-state))

(defn start-game []
  (reset! game-state starting-game-state))

(defn end-my-turn []
  (reset! game-state (end-turn @game-state)))

(defn dev-only-become-current-user []
  (reset! session-user-state (:name (current-player @game-state))))

(defn world [state] state)

(defn player-template [player]
  (let [player-name (:display-name player)]
  (if (:current player)
    [:span.player.current-player player-name]
    [:span.player player-name])))

(defn players-template [game]
  (let [players (:players game)
        current-player (current-player game)]
    [:span.form-data
     (player-template (first players))
     (player-template (second players))]))

(defn card-src-template [card]
  (if (not= (get-in card [:state :name]) :covered) (:face-img card) (:back-img card)))

(defn card-clicked [idx]
  (reset! game-state (play-card @session-user-state @game-state idx)))

(defn card-template [idx card]
  [:img.card {:src (card-src-template card)
              :alt (:name card)
              :on-click #(card-clicked idx)
              :data-idx idx} ])

(defn cards-template [cards]
  [:div.cards
   (map-indexed card-template cards)])

(defn main-template [game]
  (sab/html [:div.main
             [:div.game-info
              [:div {:class "actions"}
               [:a.action-button {:onClick #(start-game)} "Start"]
               [:a.action-button {:onClick #(end-my-turn)} "End My Turn"]
               [:a.action-button {:onClick #(dev-only-become-current-user)} "Become Current User"]]
              [:div {:class "players"}
               [:span {:class "form-header"} "Players"]
               (players-template game)]]
             [:div.board
              (cards-template (:cards (:board game)))]]))

(let [node (.getElementById js/document "main")]
  (defn renderer [full-state]
    (.render js/ReactDOM (main-template full-state) node)))

(add-watch game-state :renderer
           (fn [_ _ _ n]
             ;; (println "state of n is" n)
             ;; (println "firing watch")
             (renderer n)))

;; ping the state to trigger the first render
(reset! game-state @game-state)
(reset! session-user-state @session-user-state)
