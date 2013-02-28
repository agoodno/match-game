(ns match-game.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
  (html5
   [:head
    [:title "match-game"]
    (include-css "/css/app.css")]
   [:body
    [:div#wrapper
     content]]))
