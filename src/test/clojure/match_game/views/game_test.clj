(ns match-game.views.game-test
  (:use clojure.test
        match-game.views.game))

(deftest css-line-test
  (let [card "flamingo"
        card-selector (str "#" (:id card))
        flamingo-css-line
        (str
         (str card-selector " { background-image: url('" (:normal-path card) "'); }\n")
         (str card-selector ".hovering { background-image: url('" (:hover-path card) "'); }\n")
         (str card-selector ".covered { background-image: url('/img/cover.png'); }\n")
         (str card-selector ".covered.hovering { background-image: url('/img/cover_hover.png'); }\n"))]
  (testing "Creates CSS for each card"
    (is (= flamingo-css-line (css-line "flamingo"))))))

(deftest get-card-test
  (let [flamingo-card
        {:id "flamingo.png",
         :base-name "flamingo",
         :normal-path "/img/cardsets/animals/flamingo.png",
         :hover-path "/img/cardsets/animals/hover/flamingo.png"}]
    (testing "Constructs card"
      (is (= flamingo-card (get-card "flamingo" "animals" ".png"))))))

;(def imgs (cardset "/home/andrew/work/cljs-match-game/resources/public/img/cardsets/xmas"))
;(def hover-imgs (cardset "/home/andrew/work/cljs-match-game/resources/public/img/cardsets/xmas/hover"))
