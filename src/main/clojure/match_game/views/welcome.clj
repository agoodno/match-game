(ns match-game.views.welcome
  (:require [match-game.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to Match Game"]))
