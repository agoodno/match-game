(defproject match-game "0.1.0-SNAPSHOT"
  :description "Clojurescript Match Game"
  :url "http://localhost/index.html"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "0.3.0"]]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [enlive "1.0.0"]
                 [noir "1.3.0-beta3"]
                 [jayq "2.0.0"]]
  :source-paths ["src/main/clojure"]
;;  :resource-paths ["src/main/resource"]
  :test-paths ["src/test/clojure"]
  :compile-path "target/classes"
;;  :resource-root "src/main/resource"
  :cljsbuild {
              :builds [{
                        :source-paths ["src/main/clojurescript"]
                        :compiler {
                                   :output-to "resources/public/js/matchgame.js"
                                   :optimizations :whitespace
                                   :pretty-print true
                                   :externs ["externs/jquery.js"]}}]}
  :main match-game.server)
