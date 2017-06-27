(ns match-game.core
  (:require [clojure.java.io :refer [file]]
            [clojure.string :as str]))

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

(defn files-in-deck [deck-name]
  (let [deck-dirpath (str (.getFile (clojure.java.io/resource "public/img/decks/")) deck-name)
        files (list-dir deck-dirpath #".*\.png")]
    (map #(.getPath %) files)))

(defn short-path [filePath]
  (last (re-find #"^(.*)(/img/.*)$" filePath)))

(defn names-in-deck [deck-name]
  (let [file-strs (files-in-deck deck-name)
        short-paths (map #(short-path %) file-strs)]
    (map #(last (re-find #"^.*\/(.*)\.png$" %)) short-paths)))

(defn human-name [code]
  (->>
   (str/split code #"_")
   (map str/capitalize)
   (str/join " ")))

(defn load-deck [deck-name]
  (let [card-names (names-in-deck deck-name)
        deck-names (repeat (count card-names) deck-name)]
    {:name deck-name
     :description (human-name deck-name)
     :cards (set (map load-card deck-names card-names))}))

(defn load-card [deck-name card-name]
  {:name card-name
   :description (human-name card-name)
   :img (uri-path deck-name card-name)})

(defn uri-path [dir base-name]
  (str "/" dir "/" base-name ".png"))

(defn init-board [dimensions background-color deck]
  {:dimensions dimensions
   :background-color background-color
   :slots (init-slots deck)})

(defn init-slots [deck]
  (let [cards (:cards deck)
        twins [:left :right]]
    (shuffle
     (mapcat (fn [twin]
               (map (fn [card]
                      (init-slot card twin)) cards)) twins))))

(defn init-slot [card twin]
  (merge { :twin twin :state :covered } card))

(defn init-game [deck-name]
  (let [dimensions [4 5]
        background-color "black"]
  {:players { :agoodno { :name "Andy" } :cjgoodno { :name "Cal" }}
    :turn :cjgoodno
    :board (init-board dimensions background-color (load-deck deck-name))}))
