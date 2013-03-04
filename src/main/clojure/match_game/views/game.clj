(ns match-game.views.game
  (:require [net.cgrand.enlive-html :as html]
            [match-game.views.common :as common]
            [match-game.core :as core])
  (:use noir.core
        clojure.pprint))

(defn css-line [card]
  (let [card-selector (str "." (:id card))]
    (str
     (str card-selector " { background-image: url('" (:normal-path card) "'); }"))))

(defn css-lines [cards]
  (for [card cards] (css-line card)))

;call (card-base-name k cards)
(defn card-base-name [card-id cards]
  (let [{{base-name :base-name} card-id} cards]
    base-name))

(html/defsnippet game-snippet
  "match_game/views/game.html" [:html]
  [unique-cards game-cards]
  
  [:#boardCss]
  (html/content (clojure.string/join "\n" (css-lines unique-cards)))

  [:img.card]
  (html/clone-for [card game-cards]
                  (html/do->
                      (html/set-attr :id (:id card))
                      (html/add-class (:base-name card)))))

(defn get-card [name cardset name-ext]
  (let
      [file-path (fn [n] (format "/img/cardsets/%s/%s.png" cardset n))
       normal-path (file-path name)]
    {:id (str name name-ext)
     :base-name name
     :normal-path normal-path}))

(defn short-path [filePath] (last (re-find #"^(.*)(/img/.*)$" filePath)))

(defn ids-in-cardset [cardset-name]
  (let [cardset-dirpath
        (str (.getFile (clojure.java.io/resource "public/img/cardsets/")) cardset-name)
        files (core/list-dir cardset-dirpath #".*\.png")
        file-strs (map #(.getPath %) files)
        short-paths (map #(short-path %) file-strs)]
        (map #(last (re-find #"^.*\/(.*)\.png$" %)) short-paths)))

(defn cards-in-cardset [cardset-name]
    (map #(get-card %1 cardset-name "") (ids-in-cardset cardset-name)))

(defn cards-in-round [cardset-name]
  (let [ids (ids-in-cardset cardset-name)]
    (core/randomize
     (concat (map #(get-card %1 cardset-name "-left") ids)
             (map #(get-card %1 cardset-name "-right") ids)))))

;; Save for client js code
;; (defn get-cards [cardset]
;;   (let [members #{"candycane" "hat" "ornament" "present" "snowman" "tree"}
;;         cardmaps (map #(hash-map (keyword %1) (apply str "/img/cardsets/" cardset "/" %1 ".png" )) members)
;;         cards (into {} cardmaps)]
;;     (do
;;       (println cards)
;;       cards)))

(defpage "/game" {:keys [card-style]}
    (html/emit* (game-snippet (cards-in-cardset card-style) (cards-in-round card-style))))
