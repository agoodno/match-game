(ns match-game.util-test
  (:require [clojure.test :refer :all]
            [match-game.util :as util]))

(deftest human-name-test
  (let [code "happy_halloween_2016"]
    (testing "Splits code into a human readable string"
    (is (= "Happy Halloween 2016" (util/human-name code))))))
