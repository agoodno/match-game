(ns match-game.core-test
  (:require [clojure.test :refer :all]
            [match-game.core :as core]))

;; (require 'match-game.core :reload-all)
;; (require 'clojure.test)
;; (require 'match-game.core)
;; (require 'match-game.core-test :reload-all)
;; (clojure.test/run-tests 'match-game.core-test)

(deftest human-name-test
  (let [code "happy_halloween_2016"]
    (testing "Splits code into a human readable string"
    ;(println (core/human-name code))
    (is (= "Happy Halloween 2016" (core/human-name code))))))

(deftest load-deck-test
  (let [deck-name "old_maid"
        deck (core/load-deck deck-name)]
    (testing "Loads a deck"
      (do
        ;(println deck)
        (is (= "old_maid" (:code deck)))
        (is (= "Old Maid" (:description deck)))))))

(deftest load-card-test
  (let [card-name "alto_annie"
        card (core/load-card card-name)]
    (testing "Loads a card"
      (do
        ;(println deck)
        (is (= "alto_annie" (:code card)))
        (is (= "Alto Annie" (:description card)))))))
