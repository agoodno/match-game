(ns match-game.views.game
  (:require [net.cgrand.enlive-html :as html]
            [match-game.views.common :as common]
            [match-game.core :as core])
  (:use noir.core
        clojure.pprint))

(defn css-line [card]
  (let [card-selector (str "#" (:id card))]
  (str
   (str card-selector " { background-image: url('" (:normal-path card) "'); }\n")
   (str card-selector ".hovering { background-image: url('" (:hover-path card) "'); }\n")
   (str card-selector ".covered { background-image: url('/img/cover.png'); }\n")
   (str card-selector ".covered.hovering { background-image: url('/img/cover_hover.png'); }\n"))))

(defn css-lines [cards]
  (for [card cards] (css-line card)))

(defn card-base-name [card-id cards]
  (let [{{base-name :base-name} card-id} cards]
  base-name))

(html/defsnippet game-snippet
  "match_game/views/game.html" [:html]
  [cards]
  
  [:#boardCss]
  (html/content (clojure.string/join "\n" (css-lines cards)))

  [:img.card]
  (html/clone-for [card cards]
                  (html/set-attr :id (:id card)))) ;; :src v   [[{:base-name}] v]  :data-base-name (card-base-name k cards)

(defn get-card [name cardset name-ext]
  (let
      [file-path (fn [n] (format "/img/cardsets/%s/%s.png" cardset n))
       normal-path (file-path name)
       hover-path (file-path (str "hover/" name))]
    {:id (str name name-ext)
     :base-name name
     :normal-path normal-path
     :hover-path hover-path}))

(defn short-path [filePath] (last (re-find #"^(.*)(/img/.*)$" filePath)))

(defn cardset [cardset-name]
  (let [cardset-dirpath
        (str (.getFile (clojure.java.io/resource "public/img/cardsets/")) cardset-name)
        files (core/list-dir cardset-dirpath #".*\.png")
        file-strs (map #(.getPath %) files)
        short-paths (map #(short-path %) file-strs)
        ids (map #(last (re-find #"^.*\/(.*)\.png$" %)) short-paths)]
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

;;TODO: make sure cards are random with each request
(defpage "/game" {:keys [card-style]}
  (let [cards (cardset card-style)]
    (html/emit* (game-snippet cards))))
