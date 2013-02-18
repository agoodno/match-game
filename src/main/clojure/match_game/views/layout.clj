;; (ns match-game.views.layout
;;   (:require [noir.content.pages :as pages]
;;             [net.cgrand.enlive-html :as html])
;;   (:use noir.core
;;         clojure.pprint))


;; (html/deftemplate layout
;;   "match-game/views/layout.html"
;;   [body & jquery-lines]

;;   [:div#wrapper]
;;   (html/content body)

;;   [:script#jquery_code]
;;   (html/content
;;    (cl-format nil "~%jQuery(function() {~%~{ ~A~%~}});~%" jquery-lines)))
