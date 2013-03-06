(ns match-game.core)

(defn in-coll? [elem coll]
  (boolean (some #{elem} coll)))

(def pairs (atom ()))

(defn base-id [id]
  (second (re-find #"^(.*)-(.*)$" id)))

(defn card-action [id]
  (do
    (swap! pairs #(conj % id))
    (if (= 0 (mod (count @pairs) 2))
      (if (not (= (base-id (first @pairs)) (base-id (second @pairs))))
;        (do
          (swap! pairs #(rest (rest %))))))); delete ))))
;          (.log js/console "no match"))
;        (.log js/console "match!!"))
;      (.log js/console "one on stack"))))
