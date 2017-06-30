# match-game

A game for kids built in Clojure and ClojureScript.

## Usage

FIXME

## Setup

## checkout project
<code>git clone https://github.com/agoodno/match-game.git</code>

## setup build
<code>wget https://raw.github.com/technomancy/leiningen/stable/bin/lein -O ~/bin/lein</code>

<code>chmod u+x ~/bin/lein</code>

## run server
<code>lein run</code>

## play game
[http://localhost:8080/game?card-style=xmas](http://localhost:8080/game?card-style=xmas)

## run tests in console

(require 'match-game.core-test :reload-all)

;; Run for one namespace
(clojure.test/run-tests 'match-game.core-test)

;; Run all tests in project
(clojure.test/run-all-tests #"match-game.*-test")


## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
