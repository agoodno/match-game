(ns match-game
  (:require [match-game.core :as core])
  (:use [jayq.core :only [$ add-class remove-class bind has-class]]))
;  (:require [jayq.core :as jq]))

;(ns hello-world (:require [clojure.browser.repl :as repl]))
;(repl/connect "http://localhost:9000/repl")

; filter a map - this is what I've been looking for
;(let [m {:a 1 :b 2 :c 1}]
;  (select-keys m (for [[k v] m :when (= v 1)] k)))

(def $card ($ :img.card))

(defn print-pairs []
  (.log js/console "pairs are %s" (clojure.string/join "," @core/pairs)))

(defn print-card [prefix id]
  (.log js/console "%s %s" prefix id))

(defn hover-over-card [e]
  (let [target (.-target e)
        $target ($ target)]
    (if (has-class $target :hoverable)
      (add-class $target :hovering))))

(defn hover-leave-card [e]
  (remove-class ($ (.-target e)) :hovering))

(defn cover [card-id]
  (do
    (print-card "covering" card-id)
    (add-class ($ (keyword (str "#" card-id))) :covered)))

(defn retire-matched [card-id]
  (do
    (print-card "retiring" card-id)
    (remove-class ($ (keyword (str "#" card-id))) :hoverable)))

(defn cover-non-matched []
  (let [card-ids (map #(.-id %) $card)
        non-matched-ids (filter #(not (core/in-coll? % @core/pairs)) card-ids)]
    (if (= 0 (mod (count @core/pairs) 2))
      (doseq [card-id non-matched-ids] (cover card-id)))))

(defn retire-all-matched []
  (if (= 0 (mod (count @core/pairs) 2))
    (doseq [card-id @core/pairs] (retire-matched card-id))))

(defn reveal-card [e]
  (let [target (.-target e)
        card-id (.-id target)]
    (do
      (cover-non-matched)
      (print-card "adding" card-id)
      (core/card-action card-id)
      (print-pairs)
      (remove-class ($ target) :covered)
      (retire-all-matched))))

;(defn card-img-path-from-id-for-compare [card-id]
;  (let [{{np :normal-path} card-id} cards]
;  np))

;(defn matching-pair? [card-id]
;  (let [{{np :normal-path} card-id} cards]
;  np))

;(bind $card :mouseenter hover-over-card)
;(bind $card :mouseleave hover-leave-card)

(-> $card
  (bind :mouseenter hover-over-card)
  (bind :mouseleave hover-leave-card)
  (bind :click reveal-card))
