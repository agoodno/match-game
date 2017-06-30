(ns match-game.core-test
  (:require [clojure.test :refer :all]
            [match-game.core :as core]))

(deftest load-theme-test
  (let [theme-name "old_maid"
        theme (core/load-theme theme-name)]
    (testing "Loads a theme"
      (do
        (is (= "old_maid" (:name theme)))
        (is (= "Old Maid" (:description theme)))))))

(deftest load-design-test
  (let [theme-name "old_maid"
        design-name "alto_annie"
        design (core/load-design theme-name design-name)]
    (testing "Loads a design"
      (do
        (is (= "alto_annie" (:name design)))
        (is (= "Alto Annie" (:description design)))))))
