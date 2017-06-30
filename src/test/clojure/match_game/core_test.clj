(ns match-game.core-test
  (:require [clojure.test :refer :all]
            [match-game.core :as core]))

(defn short-path [dir-path file-path]
  (let [pat (re-pattern (str "^.*(/" dir-path "/.*)$"))]
    (last (re-find pat file-path))))

(deftest files-in-theme-test
  (let [theme-name "old_maid"
        file-paths (core/files-in-theme theme-name)
        short-paths (map #(short-path theme-name %) file-paths)]
    (testing "Lists full path to files in a theme"
      (is (= '("/old_maid/alto_annie.png" "/old_maid/arnie_angler.png")
             (take 2 short-paths))))))

(deftest names-in-theme-test
  (let [theme-name "old_maid"
        names (core/names-in-theme theme-name)]
    (testing "Lists base names in a theme"
      (is (= '("alto_annie" "arnie_angler") (take 2 names))))))

(deftest uri-path-test
  (let [dir "old_maid"
        base-name "alto_annie"
        path (core/uri-path dir base-name)]
    (testing "Constructs a URI to file"
      (is (= "/images/old_maid/alto_annie.png" path)))))

(deftest load-design-test
  (let [theme-name "old_maid"
        design-name "alto_annie"
        design (core/load-design theme-name design-name)]
    (testing "Loads a design"
      (do
        (is (= "alto_annie" (:name design)))
        (is (= "Alto Annie" (:description design)))))))

(deftest load-theme-test
  (let [theme-name "old_maid"
        theme (core/load-theme theme-name)]
    (testing "Loads a theme"
      (do
        (is (= "old_maid" (:name theme)))
        (is (= "Old Maid" (:description theme)))))))

(deftest init-card-test
  (let [design {:name "alto_annie"
                :description "Alto Annie"
                :img "/images/old_maid/alto_annie.png"}
        twin :left
        card (core/init-card design twin)]
    (testing "Initializes a card by adding more info to the hash map"
      (is (= {:twin :left
              :state {:name :covered, :img "/hoyle.png"}
              :name "alto_annie"
              :description "Alto Annie"
              :back-img "/hoyle.png"
              :face-img "/images/old_maid/alto_annie.png"}
             card)))))

(deftest toggles-card-state
  (testing "toggles the card state from covered to facing (and back)"
    (is (= true false))))
