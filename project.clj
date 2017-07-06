(defproject match-game "0.1.1-SNAPSHOT"
  :description "Clojurescript Match Game"
  :url "http://localhost/index.html"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "1.1.4"
             :exclusions [org.clojure/clojure]]
            [lein-figwheel "0.5.4-7"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [org.clojure/core.async "0.2.395"]
                 [cljsjs/react-dom-server "15.3.1-0"]  ;; for sablono
                 [cljsjs/react-dom "15.3.1-0"] ;; for sablono
                 [cljsjs/react "15.3.1-0"] ;; for sablono
                 [sablono "0.7.5"]]
  :min-lein-version "2.0.0"
  :source-paths ["src/main/clojure"]
  ;;  :resource-paths ["src/main/resource"]
  :test-paths ["src/test/clojure"]
  :compile-path "target/classes"
  ;;  :resource-root "src/main/resource"
  :cljsbuild {:builds [{:id "match-game"
                        :source-paths ["src/main/clojurescript"]
                        :figwheel true
                        :compiler {:main match-game.core
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/match_game.js"
                                   :output-dir "resources/public/js/out"
                                   :source-map-timestamp true
                                   :optimizations :none
                                   :pretty-print true}}]}
  :figwheel {:css-dirs ["resources/public/css"]
             :open-file-command "emacsclient"
             })
