;start a webserver for my app
(use 'ring.adapter.jetty)
(use 'compojure.route)
(run-jetty (resources "/") {:port 3000 :join? false})

;start the server bREPL
;(require 'cljs.repl)
;(require 'cljs.repl.browser)
;(cljs.repl/repl (cljs.repl.browser/repl-env))

;test it
;(.log js/console "I'm in")
