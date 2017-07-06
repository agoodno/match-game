(ns match-game.util
  (:require [clojure.pprint :as pp]
            [clojure.string :as str]))

(defn human-name [code]
  (->>
   (str/split code #"_")
   (map str/capitalize)
   (str/join " ")))

(defn index-of [coll v]
  (let [i (count (take-while #(not= v %) coll))]
    (when (or (< i (count coll))
              (= v (last coll)))
      i)))
