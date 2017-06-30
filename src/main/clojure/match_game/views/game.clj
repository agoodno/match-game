  (ns match-game.views.game
  (:import (javax.imageio.ImageIO))
  (:import (java.io.File))
  (:require [net.cgrand.enlive-html :as html]
            [match-game.views.common :as common]
            [match-game.core :as core]
            [match-game.util :as util])
  (:use noir.core
        clojure.pprint))

(defn card-dimensions [filename]
  (let [file (java.io.File. filename)
        img (javax.imageio.ImageIO/read file)]
      (vector (.getWidth img) (.getHeight img))))

(defn css-line [card]
  (let [card-selector (str "." (:id card))]
    (str card-selector " { background-image: url('" (:normal-path card) "'); }")))

(defn css-lines [cards]
  (for [card cards]
    (css-line card)))

;call (card-base-name k cards)
(defn card-base-name [card-id cards]
  (let [{{base-name :base-name} card-id} cards]
    base-name))

(defn card-line [dims]
  (let [[width height] dims]
    (str ".card { width: " width "px; height: " height "px; }\n")))

(html/defsnippet game-snippet
  "match_game/views/game.html" [:html]
  [unique-cards game-cards dimensions]

  [:#boardCss]
  (html/content
   (str
    (card-line dimensions) ;
    (clojure.string/join "\n"
                         (css-lines unique-cards))))

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

(defn files-in-cardset [cardset-name]
  (let [cardset-dirpath (str (.getFile (clojure.java.io/resource "public/img/cardsets/")) cardset-name)
        files (util/list-dir cardset-dirpath #".*\.png")]
        (map #(.getPath %) files)))

(defn ids-in-cardset [cardset-name]
  (let [file-strs (files-in-cardset cardset-name)
        short-paths (map #(short-path %) file-strs)]
    (map #(last (re-find #"^.*\/(.*)\.png$" %)) short-paths)))

(defn cards-in-cardset [cardset-name]
  (map #(get-card %1 cardset-name "") (ids-in-cardset cardset-name)))

(defn cards-in-round [cardset-name]
  (let [ids (ids-in-cardset cardset-name)]
    (util/randomize
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

(defpage "/game" {:keys [card-style card-size]}
  (html/emit*
   (game-snippet
    (cards-in-cardset card-style)
    (cards-in-round card-style)
    (card-dimensions (first (files-in-cardset card-style))))))
