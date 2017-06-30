(require 'match-game.core)
(require 'match-game.core :reload-all)

(def game-state
  {
   :players { :agoodno { :name "Andy" } :cjgoodno { :name "Cal" }}
   :deck { :code "old_maid"
          :description "Old Maid"
          :cards #{{ :code "alto_annie" :description "Alto Annie" }
                   { :code "arnie_angler" :description "Arnie Angler" }
                   { :code "bagpipe_barney" :description "Bagpipe Barney" }
                   { :code "baker_benny" :description "Baker Benny" }
                   { :code "billy_blaze" :description "Billy Blaze" }
                   { :code "careless_carrie" :description "Careless Carrie" }
                   { :code "clancy_clown" :description "Clancy Clown" }
                   { :code "courageous_cop" :description "Courageous Cop" }
                   { :code "diver_dan" :description "Diver Dan" }
                   { :code "fifi_fluff" :description "Fifi Fluff" }
                   { :code "freddie_falloff" :description "Freddie Falloff" }
                   { :code "greenthumb_gert" :description "Greenthumb Gert" }
                   { :code "hayseed_hank" :description "Hayseed Hank" }
                   { :code "heap_big_talk" :description "Heap Big Talk" }
                   { :code "lasso_louie" :description "Lasso Louie" }
                   { :code "loggin_larry" :description "Loggin Larry" }
                   { :code "milkman_mo" :description "Milkman Mo" }
                   { :code "postman_pete" :description "Postman Pete" }
                   { :code "slap_on_sam" :description "Slap On Sam" }
                   { :code "tumbledown_tess" :description "Tumbledown Tess" }}}
   :turn :cjgoodno
   :board {
           :dimensions [4 5]
           :matte "black"
           :cards [
                   { :code "alto_annie" :twin :left :state :covered }
                   { :code "arnie_angler" :twin :left :state :covered }
                   { :code "bagpipe_barney" :twin :left :state :matched }
                   { :code "baker_benny" :twin :left :state :covered }
                   { :code "billy_blaze" :twin :left :state :covered }
                   { :code "careless_carrie" :twin :left :state :covered }
                   { :code "clancy_clown" :twin :left :state :covered }
                   { :code "courageous_cop" :twin :left :state :covered }
                   { :code "diver_dan" :twin :left :state :covered }
                   { :code "fifi_fluff" :twin :left :state :covered }
                   { :code "freddie_falloff" :twin :left :state :covered }
                   { :code "greenthumb_gert" :twin :left :state :covered }
                   { :code "hayseed_hank" :twin :left :state :covered }
                   { :code "heap_big_talk" :twin :left :state :covered }
                   { :code "lasso_louie" :twin :left :state :covered }
                   { :code "loggin_larry" :twin :left :state :covered }
                   { :code "milkman_mo" :twin :left :state :covered }
                   { :code "postman_pete" :twin :left :state :covered }
                   { :code "slap_on_sam" :twin :left :state :covered }
                   { :code "tumbledown_tess" :twin :left :state :covered }
                   { :code "alto_annie" :twin :right :state :covered }
                   { :code "arnie_angler" :twin :right :state :covered }
                   { :code "bagpipe_barney" :twin :right :state :matched }
                   { :code "baker_benny" :twin :right :state :covered }
                   { :code "billy_blaze" :twin :right :state :covered }
                   { :code "careless_carrie" :twin :right :state :covered }
                   { :code "clancy_clown" :twin :right :state :covered }
                   { :code "courageous_cop" :twin :right :state :covered }
                   { :code "diver_dan" :twin :right :state :covered }
                   { :code "fifi_fluff" :twin :right :state :covered }
                   { :code "freddie_falloff" :twin :right :state :covered }
                   { :code "greenthumb_gert" :twin :right :state :covered }
                   { :code "hayseed_hank" :twin :right :state :covered }
                   { :code "heap_big_talk" :twin :right :state :covered }
                   { :code "lasso_louie" :twin :right :state :covered }
                   { :code "loggin_larry" :twin :right :state :covered }
                   { :code "milkman_mo" :twin :right :state :covered }
                   { :code "postman_pete" :twin :right :state :covered }
                   { :code "slap_on_sam" :twin :right :state :covered }
                   { :code "tumbledown_tess" :twin :right :state :covered }]}})



;; Connected to nREPL server - nrepl://localhost:55342
;; CIDER 0.15.0snapshot (package: 20170509.208), nREPL 0.2.12
;; Clojure 1.7.0, Java 1.8.0_112
;;     Docs: (doc function-name)
;;           (find-doc part-of-name)
;;   Source: (source function-name)
;;  Javadoc: (javadoc java-object-or-class)
;;     Exit: <C-c C-q>
;;  Results: Stored in vars *1, *2, *3, an exception in *e;
;; ======================================================================
;; If you’re new to CIDER it is highly recommended to go through its
;; manual first. Type <M-x cider-view-manual> to view it.
;; In case you’re seeing any warnings you should consult the manual’s
;; "Troubleshooting" section.
;;
;; Here are few tips to get you started:
;;
;; * Press <C-h m> to see a list of the keybindings available (this
;;   will work in every Emacs buffer)
;; * Press <,> to quickly invoke some REPL command
;; * Press <C-c C-z> to switch between the REPL and a Clojure file
;; * Press <M-.> to jump to the source of something (e.g. a var, a
;;   Java method)
;; * Press <C-c C-d C-d> to view the documentation for something (e.g.
;;   a var, a Java method)
;; * Enable ‘eldoc-mode’ to display function & method signatures in the minibuffer.
;; * Print CIDER’s refcard and keep it close to your keyboard.
;;
;; CIDER is super customizable - try <M-x customize-group cider> to
;; get a feel for this. If you’re thirsty for knowledge you should try
;; <M-x cider-drink-a-sip>.
;;
;; If you think you’ve encountered a bug (or have some suggestions for
;; improvements) use <M-x cider-report-bug> to report it.
;;
;; Above all else - don’t panic! In case of an emergency - procure
;; some (hard) cider and enjoy it responsibly!
;;
;; You can remove this message with the ‘cider-repl-clear-help-banner’ command.
;; You can disable it from appearing on start by setting
;; ‘cider-repl-display-help-banner’ to nil.
;; ======================================================================
user> (require 'clojure.test/run-tests)
FileNotFoundException Could not locate run_tests__init.class or run_tests.clj on classpath. Please check that namespaces with dashes use underscores in the Clojure file name.  clojure.lang.RT.load (RT.java:449)
user> (require 'clojure.test :refer :all)
CompilerException java.lang.Exception: Unsupported option(s) supplied: :all, compiling:(*cider-repl match-game*:45:7)
user> (require 'clojure.test :refer all)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: all in this context, compiling:(*cider-repl match-game*:47:7)
user> (require 'clojure.test)
nil
user> (clojure.test/run-tests)

Testing user

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
{:test 0, :pass 0, :fail 0, :error 0, :type :summary}
user> (clojure.test/run-all-tests)

Testing clojure.tools.nrepl.ack

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.edn

Testing cider.nrepl.middleware.track-state

Testing clojure.stacktrace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.whitespace

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.protocols

Testing clojure.tools.nrepl.middleware.session

Testing clojure.test

Testing cider.nrepl.middleware.test

Testing clojure.tools.nrepl.server

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.custom-zipper.utils

Testing dynapath.util

Testing cider.nrepl.middleware.debug

Testing cider.nrepl.middleware.apropos

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.nodes

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.custom-zipper.core

Testing cider.inlined-deps.javaclasspath.v0v2v3.clojure.java.classpath

Testing cider.inlined-deps.puget.v1v0v1.puget.color

Testing clojure.reflect

Testing cider.nrepl.middleware.inspect

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.keyword

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.find

Testing cider.inlined-deps.fipp.v0v6v6.fipp.engine

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.util.analysis

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.insert

Testing cider.nrepl.middleware.version

Testing cider.nrepl.middleware.util.error-handling

Testing cider.inlined-deps.fipp.v0v6v6.fipp.deque

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser

Testing cider.inlined-deps.puget.v1v0v1.puget.color.html

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.remove

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.file

Testing cider.inlined-deps.compliment.v0v3v4.compliment.context

Testing cider.nrepl.middleware.ns

Testing clojure.set

Testing cider.nrepl.middleware.complete

Testing cider.nrepl.middleware.stacktrace

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.util.misc

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.complete

Testing cider.nrepl.middleware.util.java

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.class-members

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.find

Testing clojure.string

Testing clojure.java.browse

Testing cider.nrepl.middleware.util.java.parser

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.special-forms

Testing cider.nrepl.middleware.undef

Testing clojure.java.javadoc

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.comment

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip

Testing clojure.tools.nrepl

Testing clojure.core.reducers

Testing clojure.repl

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.track

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.protocols

Testing cider.inlined-deps.puget.v1v0v1.puget.printer

Testing clojure.tools.nrepl.bencode

Testing cider.nrepl.middleware.resource

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.rrbt

Testing clojure.template

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.quote

Testing cider.nrepl.middleware.refresh

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.string

Testing cider.nrepl.middleware.util.misc

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.utils

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.fork-join

Testing clojure.core

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.keyword

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.transients

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.impl.commons

Testing clojure.walk

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.token

Testing cider.nrepl.middleware.util.namespace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.walk

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.potemkin

Testing dynapath.defaults

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.impl.utils

Testing cider.nrepl.middleware.enlighten

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.keywords

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.uneval

Testing cider.inlined-deps.toolstrace.v0v7v9.clojure.tools.trace

Testing cider.inlined-deps.fipp.v0v6v6.fipp.visit

Testing cider.inlined-deps.puget.v1v0v1.puget.dispatch

Testing clojure.uuid

Testing complete.core

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.whitespace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.whitespace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.integer

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.core

Testing clojure.main

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.base

Testing cider.nrepl.middleware.util.cljs

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.info

Testing user

Testing dynapath.dynamic-classpath

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.dir

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.reader

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.forms

Testing clojure.edn

Testing clojure.java.io

Testing cider.inlined-deps.compliment.v0v3v4.compliment.core

Testing clojure.core.protocols

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.fn

Testing clojure.tools.nrepl.transport

Testing clojure.tools.nrepl.middleware.interruptible-eval

Testing clojure.pprint

Testing cider.nrepl.middleware.trace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.meta

Testing cider.inlined-deps.puget.v1v0v1.puget.color.ansi

Testing cider.inlined-deps.compliment.v0v3v4.compliment.utils

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.reader-macro

Testing clojure.tools.nrepl.middleware.pr-values

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.reload

Testing cider.nrepl.version

Testing cider.inlined-deps.fipp.v0v6v6.fipp.edn

Testing clojure.instant

Testing cider.nrepl.middleware.classpath

Testing cider.nrepl.middleware.macroexpand

Testing cider.nrepl.middleware.util.meta

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.local-bindings

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.interop

Testing cider.inlined-deps.puget.v1v0v1.arrangement.v1v1v0.arrangement.core

Testing cider.nrepl.middleware.out

Testing clojure.tools.nrepl.middleware.load-file

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.namespaces-and-classes

Testing cider.nrepl.middleware.info

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.reader-types

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.string

Testing cider.nrepl.print-method

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.parse

Testing cider.nrepl.middleware.format

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.seq

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.seq

Testing cider.nrepl.middleware.pprint

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.dependency

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.resources

Testing clojure.tools.nrepl.middleware

Testing clojure.java.shell

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.token

Testing cider.nrepl.middleware.util.inspect

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.ns-mappings

Testing clojure.tools.nrepl.misc

Testing cider.nrepl.middleware.util.spec

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.default-data-readers

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.coerce

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.edit

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.move

Testing clojure.zip

Testing cider.inlined-deps.fipp.v0v6v6.fipp.ednize

Testing cider.nrepl.middleware.util.instrument

Testing cider.inlined-deps.cljfmt.v0v5v6.cljfmt.core

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.subedit

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
{:test 0, :pass 0, :fail 0, :error 0, :type :summary}
user> (in-ns match-game.core)
CompilerException java.lang.ClassNotFoundException: match-game.core, compiling:(*cider-repl match-game*:375:7)
user> (in-ns 'match-game.core)
#namespace[match-game.core]
match-game.core> (clojure.test/run-all-tests)

Testing clojure.tools.nrepl.ack

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.edn

Testing cider.nrepl.middleware.track-state

Testing clojure.stacktrace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.whitespace

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.protocols

Testing clojure.tools.nrepl.middleware.session

Testing clojure.test

Testing cider.nrepl.middleware.test

Testing clojure.tools.nrepl.server

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.custom-zipper.utils

Testing dynapath.util

Testing cider.nrepl.middleware.debug

Testing cider.nrepl.middleware.apropos

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.nodes

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.custom-zipper.core

Testing cider.inlined-deps.javaclasspath.v0v2v3.clojure.java.classpath

Testing cider.inlined-deps.puget.v1v0v1.puget.color

Testing clojure.reflect

Testing cider.nrepl.middleware.inspect

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.keyword

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.find

Testing cider.inlined-deps.fipp.v0v6v6.fipp.engine

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.util.analysis

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.insert

Testing cider.nrepl.middleware.version

Testing cider.nrepl.middleware.util.error-handling

Testing cider.inlined-deps.fipp.v0v6v6.fipp.deque

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser

Testing cider.inlined-deps.puget.v1v0v1.puget.color.html

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.remove

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.file

Testing cider.inlined-deps.compliment.v0v3v4.compliment.context

Testing cider.nrepl.middleware.ns

Testing clojure.set

Testing cider.nrepl.middleware.complete

Testing cider.nrepl.middleware.stacktrace

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.util.misc

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.complete

Testing cider.nrepl.middleware.util.java

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.class-members

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.find

Testing clojure.string

Testing clojure.java.browse

Testing cider.nrepl.middleware.util.java.parser

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.special-forms

Testing cider.nrepl.middleware.undef

Testing clojure.java.javadoc

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.comment

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip

Testing clojure.tools.nrepl

Testing clojure.core.reducers

Testing clojure.repl

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.track

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.protocols

Testing cider.inlined-deps.puget.v1v0v1.puget.printer

Testing clojure.tools.nrepl.bencode

Testing cider.nrepl.middleware.resource

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.rrbt

Testing clojure.template

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.quote

Testing cider.nrepl.middleware.refresh

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.string

Testing cider.nrepl.middleware.util.misc

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.utils

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.fork-join

Testing clojure.core

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.keyword

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.transients

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.impl.commons

Testing match-game.core

Testing clojure.walk

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.token

Testing cider.nrepl.middleware.util.namespace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.walk

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.potemkin

Testing dynapath.defaults

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.impl.utils

Testing cider.nrepl.middleware.enlighten

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.keywords

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.uneval

Testing cider.inlined-deps.toolstrace.v0v7v9.clojure.tools.trace

Testing cider.inlined-deps.fipp.v0v6v6.fipp.visit

Testing cider.inlined-deps.puget.v1v0v1.puget.dispatch

Testing clojure.uuid

Testing complete.core

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.whitespace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.whitespace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.integer

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.core

Testing clojure.main

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.base

Testing cider.nrepl.middleware.util.cljs

Testing cider.inlined-deps.cljs-tooling.v0v2v0.cljs-tooling.info

Testing user

Testing dynapath.dynamic-classpath

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.dir

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.reader

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.forms

Testing clojure.edn

Testing clojure.java.io

Testing cider.inlined-deps.compliment.v0v3v4.compliment.core

Testing clojure.core.protocols

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.fn

Testing clojure.tools.nrepl.transport

Testing clojure.tools.nrepl.middleware.interruptible-eval

Testing clojure.pprint

Testing cider.nrepl.middleware.trace

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.meta

Testing cider.inlined-deps.puget.v1v0v1.puget.color.ansi

Testing cider.inlined-deps.compliment.v0v3v4.compliment.utils

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.reader-macro

Testing clojure.tools.nrepl.middleware.pr-values

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.reload

Testing cider.nrepl.version

Testing cider.inlined-deps.fipp.v0v6v6.fipp.edn

Testing clojure.instant

Testing cider.nrepl.middleware.classpath

Testing cider.nrepl.middleware.macroexpand

Testing cider.nrepl.middleware.util.meta

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.local-bindings

Testing cider.inlined-deps.fipp.v0v6v6.corerrb-vector.v0v0v11.clojure.core.rrb-vector.interop

Testing cider.inlined-deps.puget.v1v0v1.arrangement.v1v1v0.arrangement.core

Testing cider.nrepl.middleware.out

Testing clojure.tools.nrepl.middleware.load-file

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.namespaces-and-classes

Testing cider.nrepl.middleware.info

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.reader-types

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.string

Testing cider.nrepl.print-method

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.parse

Testing cider.nrepl.middleware.format

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.seq

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.seq

Testing cider.nrepl.middleware.pprint

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources

Testing cider.inlined-deps.toolsnamespace.v0v3v0-alpha3.clojure.tools.namespace.dependency

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.resources

Testing clojure.tools.nrepl.middleware

Testing clojure.java.shell

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.parser.token

Testing cider.nrepl.middleware.util.inspect

Testing cider.inlined-deps.compliment.v0v3v4.compliment.sources.ns-mappings

Testing clojure.tools.nrepl.misc

Testing cider.nrepl.middleware.util.spec

Testing cider.inlined-deps.toolsreader.v0v10v0.clojure.tools.reader.default-data-readers

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.node.coerce

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.edit

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.move

Testing clojure.zip

Testing cider.inlined-deps.fipp.v0v6v6.fipp.ednize

Testing cider.nrepl.middleware.util.instrument

Testing cider.inlined-deps.cljfmt.v0v5v6.cljfmt.core

Testing cider.inlined-deps.cljfmt.v0v5v6.rewrite-clj.v0v5v2.rewrite-clj.zip.subedit

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
{:test 0, :pass 0, :fail 0, :error 0, :type :summary}
match-game.core> (clojure.test/run-tests 'match-game.core)

Testing match-game.core

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
{:test 0, :pass 0, :fail 0, :error 0, :type :summary}
match-game.core> (require match-game.core-test)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: require in this context, compiling:(*cider-repl match-game*:705:18)
match-game.core> (require 'match-game.core-test)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: require in this context, compiling:(*cider-repl match-game*:707:18)
match-game.core> (in-ns user)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: user in this context, compiling:(*cider-repl match-game*:709:18)
match-game.core> (in-ns 'user)
#namespace[user]
user> (require 'match-game.core-test)
nil
user> (clojure.test/run-tests 'match-game.core)

Testing match-game.core

Ran 0 tests containing 0 assertions.
0 failures, 0 errors.
{:test 0, :pass 0, :fail 0, :error 0, :type :summary}
user> (clojure.test/run-tests 'match-game.core-test)

Testing match-game.core-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
{:test 1, :pass 1, :fail 0, :error 0, :type :summary}
user> (require 'match-game.core-test :reload-all)
nil
user> (clojure.test/run-tests 'match-game.core-test)

Testing match-game.core-test
{:code old_maid, :description Happy Halloween 2016, :cards #{{:code loggin_larry, :description Loggin Larry} {:code fifi_fluff, :description Fifi Fluff} {:code heap_big_talk, :description Heap Big Talk} {:code alto_annie, :description Alto Annie} {:code tumbledown_tess, :description Tumbledown Tess} {:code courageous_cop, :description Courageous Cop} {:code arnie_angler, :description Arnie Angler} {:code freddie_falloff, :description Freddie Falloff} {:code baker_benny, :description Baker Benny} {:code billy_blaze, :description Billy Blaze} {:code diver_dan, :description Diver Dan} {:code hayseed_hank, :description Hayseed Hank} {:code careless_carrie, :description Careless Carrie} {:code lasso_louie, :description Lasso Louie} {:code bagpipe_barney, :description Bagpipe Barney} {:code slap_on_sam, :description Slap On Sam} {:code postman_pete, :description Postman Pete} {:code milkman_mo, :description Milkman Mo} {:code clancy_clown, :description Clancy Clown} {:code greenthumb_gert, :description Greenthumb Gert}}}

FAIL in (load-deck-test) (core_test.clj:24)
Loads a deck
expected: (= "Old Maid" (:description deck))
  actual: (not (= "Old Maid" "Happy Halloween 2016"))

Ran 2 tests containing 3 assertions.
1 failures, 0 errors.
{:test 2, :pass 2, :fail 1, :error 0, :type :summary}
user> (require 'match-game.core-test :reload-all)
nil
user> (clojure.test/run-tests 'match-game.core-test)

Testing match-game.core-test
{:code old_maid, :description Old Maid, :cards #{{:code loggin_larry, :description Loggin Larry} {:code fifi_fluff, :description Fifi Fluff} {:code heap_big_talk, :description Heap Big Talk} {:code alto_annie, :description Alto Annie} {:code tumbledown_tess, :description Tumbledown Tess} {:code courageous_cop, :description Courageous Cop} {:code arnie_angler, :description Arnie Angler} {:code freddie_falloff, :description Freddie Falloff} {:code baker_benny, :description Baker Benny} {:code billy_blaze, :description Billy Blaze} {:code diver_dan, :description Diver Dan} {:code hayseed_hank, :description Hayseed Hank} {:code careless_carrie, :description Careless Carrie} {:code lasso_louie, :description Lasso Louie} {:code bagpipe_barney, :description Bagpipe Barney} {:code slap_on_sam, :description Slap On Sam} {:code postman_pete, :description Postman Pete} {:code milkman_mo, :description Milkman Mo} {:code clancy_clown, :description Clancy Clown} {:code greenthumb_gert, :description Greenthumb Gert}}}

Ran 2 tests containing 3 assertions.
0 failures, 0 errors.
{:test 2, :pass 3, :fail 0, :error 0, :type :summary}
user> (require 'match-game.core-test :reload-all)
nil
user> (clojure.test/run-tests 'match-game.core-test)

Testing match-game.core-test

Ran 3 tests containing 5 assertions.
0 failures, 0 errors.
{:test 3, :pass 5, :fail 0, :error 0, :type :summary}
user> (defn files-in-cardset [cardset-name]
  (let [cardset-dirpath (str (.getFile (clojure.java.io/resource "public/img/cardsets/")) cardset-name)
        files (core/list-dir cardset-dirpath #".*\.png")]
        (map #(.getPath %) files)))

CompilerException java.lang.RuntimeException: No such namespace: core, compiling:(*cider-repl match-game*:765:15)
user> (require 'match-game.core)
nil
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/files-in-cardset "old_maid")
CompilerException java.lang.RuntimeException: No such var: match-game.core/files-in-cardset, compiling:(*cider-repl match-game*:773:7)
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: No such namespace: core, compiling:(match_game/core.clj:21:15)
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/files-in-cardset "old_maid")
()
user> (match-game.core/files-in-cardset "oldmaid")
("/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/alto_annie.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/arnie_angler.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/bagpipe_barney.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/baker_benny.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/billy_blaze.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/careless_carrie.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/clancy_clown.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/courageous_cop.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/diver_dan.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/fifi_fluff.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/freddie_falloff.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/greenthumb_gert.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/hayseed_hank.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/heap_big_talk.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/lasso_louie.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/loggin_larry.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/milkman_mo.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/postman_pete.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/slap_on_sam.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/oldmaid/tumbledown_tess.png")
user> (match-game.core/files-in-cardset "old_maid")
("/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/alto_annie.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/arnie_angler.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/bagpipe_barney.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/baker_benny.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/billy_blaze.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/careless_carrie.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/clancy_clown.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/courageous_cop.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/diver_dan.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/fifi_fluff.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/freddie_falloff.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/greenthumb_gert.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/hayseed_hank.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/heap_big_talk.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/lasso_louie.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/loggin_larry.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/milkman_mo.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/postman_pete.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/slap_on_sam.png" "/Users/agoodnough/src/match-game/resources/public/img/cardsets/old_maid/tumbledown_tess.png")
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: short-path in this context, compiling:(match_game/core.clj:26:27)
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/names-in-deck "old_maid")
("alto_annie" "arnie_angler" "bagpipe_barney" "baker_benny" "billy_blaze" "careless_carrie" "clancy_clown" "courageous_cop" "diver_dan" "fifi_fluff" "freddie_falloff" "greenthumb_gert" "hayseed_hank" "heap_big_talk" "lasso_louie" "loggin_larry" "milkman_mo" "postman_pete" "slap_on_sam" "tumbledown_tess")
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Unmatched delimiter: }, compiling:(match_game/core.clj:43:2)
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/names-in-deck "old_maid")
("alto_annie" "arnie_angler" "bagpipe_barney" "baker_benny" "billy_blaze" "careless_carrie" "clancy_clown" "courageous_cop" "diver_dan" "fifi_fluff" "freddie_falloff" "greenthumb_gert" "hayseed_hank" "heap_big_talk" "lasso_louie" "loggin_larry" "milkman_mo" "postman_pete" "slap_on_sam" "tumbledown_tess")
user> (match-game.core/load-deck "old_maid")
{:code "old_maid", :description "Old Maid", :cards ({:code "alto_annie", :description "Alto Annie"} {:code "arnie_angler", :description "Arnie Angler"} {:code "bagpipe_barney", :description "Bagpipe Barney"} {:code "baker_benny", :description "Baker Benny"} {:code "billy_blaze", :description "Billy Blaze"} {:code "careless_carrie", :description "Careless Carrie"} {:code "clancy_clown", :description "Clancy Clown"} {:code "courageous_cop", :description "Courageous Cop"} {:code "diver_dan", :description "Diver Dan"} {:code "fifi_fluff", :description "Fifi Fluff"} {:code "freddie_falloff", :description "Freddie Falloff"} {:code "greenthumb_gert", :description "Greenthumb Gert"} {:code "hayseed_hank", :description "Hayseed Hank"} {:code "heap_big_talk", :description "Heap Big Talk"} {:code "lasso_louie", :description "Lasso Louie"} {:code "loggin_larry", :description "Loggin Larry"} {:code "milkman_mo", :description "Milkman Mo"} {:code "postman_pete", :description "Postman Pete"} {:code "slap_on_sam", :description "Slap On Sam"} {:code "tumbledown_tess", :description "Tumbledown Tess"})}
user> (set *1)
#{[:code "old_maid"] [:description "Old Maid"] [:cards ({:code "alto_annie", :description "Alto Annie"} {:code "arnie_angler", :description "Arnie Angler"} {:code "bagpipe_barney", :description "Bagpipe Barney"} {:code "baker_benny", :description "Baker Benny"} {:code "billy_blaze", :description "Billy Blaze"} {:code "careless_carrie", :description "Careless Carrie"} {:code "clancy_clown", :description "Clancy Clown"} {:code "courageous_cop", :description "Courageous Cop"} {:code "diver_dan", :description "Diver Dan"} {:code "fifi_fluff", :description "Fifi Fluff"} {:code "freddie_falloff", :description "Freddie Falloff"} {:code "greenthumb_gert", :description "Greenthumb Gert"} {:code "hayseed_hank", :description "Hayseed Hank"} {:code "heap_big_talk", :description "Heap Big Talk"} {:code "lasso_louie", :description "Lasso Louie"} {:code "loggin_larry", :description "Loggin Larry"} {:code "milkman_mo", :description "Milkman Mo"} {:code "postman_pete", :description "Postman Pete"} {:code "slap_on_sam", :description "Slap On Sam"} {:code "tumbledown_tess", :description "Tumbledown Tess"})]}
user> (match-game.core/names-in-deck "old_maid")
("alto_annie" "arnie_angler" "bagpipe_barney" "baker_benny" "billy_blaze" "careless_carrie" "clancy_clown" "courageous_cop" "diver_dan" "fifi_fluff" "freddie_falloff" "greenthumb_gert" "hayseed_hank" "heap_big_talk" "lasso_louie" "loggin_larry" "milkman_mo" "postman_pete" "slap_on_sam" "tumbledown_tess")
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/load-deck "old_maid")
{:code "old_maid", :description "Old Maid", :cards #{{:code "loggin_larry", :description "Loggin Larry"} {:code "fifi_fluff", :description "Fifi Fluff"} {:code "heap_big_talk", :description "Heap Big Talk"} {:code "alto_annie", :description "Alto Annie"} {:code "tumbledown_tess", :description "Tumbledown Tess"} {:code "courageous_cop", :description "Courageous Cop"} {:code "arnie_angler", :description "Arnie Angler"} {:code "freddie_falloff", :description "Freddie Falloff"} {:code "baker_benny", :description "Baker Benny"} {:code "billy_blaze", :description "Billy Blaze"} {:code "diver_dan", :description "Diver Dan"} {:code "hayseed_hank", :description "Hayseed Hank"} {:code "careless_carrie", :description "Careless Carrie"} {:code "lasso_louie", :description "Lasso Louie"} {:code "bagpipe_barney", :description "Bagpipe Barney"} {:code "slap_on_sam", :description "Slap On Sam"} {:code "postman_pete", :description "Postman Pete"} {:code "milkman_mo", :description "Milkman Mo"} {:code "clancy_clown", :description "Clancy Clown"} {:code "greenthumb_gert", :description "Greenthumb Gert"}}}
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/load-deck "old_maid")
{:code "old_maid", :description "Old Maid", :cards #{{:code "loggin_larry", :description "Loggin Larry"} {:code "fifi_fluff", :description "Fifi Fluff"} {:code "heap_big_talk", :description "Heap Big Talk"} {:code "alto_annie", :description "Alto Annie"} {:code "tumbledown_tess", :description "Tumbledown Tess"} {:code "courageous_cop", :description "Courageous Cop"} {:code "arnie_angler", :description "Arnie Angler"} {:code "freddie_falloff", :description "Freddie Falloff"} {:code "baker_benny", :description "Baker Benny"} {:code "billy_blaze", :description "Billy Blaze"} {:code "diver_dan", :description "Diver Dan"} {:code "hayseed_hank", :description "Hayseed Hank"} {:code "careless_carrie", :description "Careless Carrie"} {:code "lasso_louie", :description "Lasso Louie"} {:code "bagpipe_barney", :description "Bagpipe Barney"} {:code "slap_on_sam", :description "Slap On Sam"} {:code "postman_pete", :description "Postman Pete"} {:code "milkman_mo", :description "Milkman Mo"} {:code "clancy_clown", :description "Clancy Clown"} {:code "greenthumb_gert", :description "Greenthumb Gert"}}}
user> (match-game.core/game-state "old_maid")
nil
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-game)
ArityException Wrong number of args (0) passed to: PersistentArrayMap  clojure.lang.AFn.throwArity (AFn.java:429)
user> (match-game.core/init-game "old_maid")
nil
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-game "old_maid")
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}}, :deck {:code "old_maid", :description "Old Maid", :cards #{{:code "loggin_larry", :description "Loggin Larry"} {:code "fifi_fluff", :description "Fifi Fluff"} {:code "heap_big_talk", :description "Heap Big Talk"} {:code "alto_annie", :description "Alto Annie"} {:code "tumbledown_tess", :description "Tumbledown Tess"} {:code "courageous_cop", :description "Courageous Cop"} {:code "arnie_angler", :description "Arnie Angler"} {:code "freddie_falloff", :description "Freddie Falloff"} {:code "baker_benny", :description "Baker Benny"} {:code "billy_blaze", :description "Billy Blaze"} {:code "diver_dan", :description "Diver Dan"} {:code "hayseed_hank", :description "Hayseed Hank"} {:code "careless_carrie", :description "Careless Carrie"} {:code "lasso_louie", :description "Lasso Louie"} {:code "bagpipe_barney", :description "Bagpipe Barney"} {:code "slap_on_sam", :description "Slap On Sam"} {:code "postman_pete", :description "Postman Pete"} {:code "milkman_mo", :description "Milkman Mo"} {:code "clancy_clown", :description "Clancy Clown"} {:code "greenthumb_gert", :description "Greenthumb Gert"}}}, :turn :cjgoodno, :board {:dimensions [4 5], :matte "black", :cards [{:code "alto_annie", :twin :left, :state :covered} {:code "arnie_angler", :twin :left, :state :covered} {:code "bagpipe_barney", :twin :left, :state :matched} {:code "baker_benny", :twin :left, :state :covered} {:code "billy_blaze", :twin :left, :state :covered} {:code "careless_carrie", :twin :left, :state :covered} {:code "clancy_clown", :twin :left, :state :covered} {:code "courageous_cop", :twin :left, :state :covered} {:code "diver_dan", :twin :left, :state :covered} {:code "fifi_fluff", :twin :left, :state :covered} {:code "freddie_falloff", :twin :left, :state :covered} {:code "greenthumb_gert", :twin :left, :state :covered} {:code "hayseed_hank", :twin :left, :state :covered} {:code "heap_big_talk", :twin :left, :state :covered} {:code "lasso_louie", :twin :left, :state :covered} {:code "loggin_larry", :twin :left, :state :covered} {:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :left, :state :covered} {:code "slap_on_sam", :twin :left, :state :covered} {:code "tumbledown_tess", :twin :left, :state :covered} {:code "alto_annie", :twin :right, :state :covered} {:code "arnie_angler", :twin :right, :state :covered} {:code "bagpipe_barney", :twin :right, :state :matched} {:code "baker_benny", :twin :right, :state :covered} {:code "billy_blaze", :twin :right, :state :covered} {:code "careless_carrie", :twin :right, :state :covered} {:code "clancy_clown", :twin :right, :state :covered} {:code "courageous_cop", :twin :right, :state :covered} {:code "diver_dan", :twin :right, :state :covered} {:code "fifi_fluff", :twin :right, :state :covered} {:code "freddie_falloff", :twin :right, :state :covered} {:code "greenthumb_gert", :twin :right, :state :covered} {:code "hayseed_hank", :twin :right, :state :covered} {:code "heap_big_talk", :twin :right, :state :covered} {:code "lasso_louie", :twin :right, :state :covered} {:code "loggin_larry", :twin :right, :state :covered} {:code "milkman_mo", :twin :right, :state :covered} {:code "postman_pete", :twin :right, :state :covered} {:code "slap_on_sam", :twin :right, :state :covered} {:code "tumbledown_tess", :twin :right, :state :covered}]}}
user> (pprint *1)
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :deck
 {:code "old_maid",
  :description "Old Maid",
  :cards
  #{{:code "loggin_larry", :description "Loggin Larry"}
    {:code "fifi_fluff", :description "Fifi Fluff"}
    {:code "heap_big_talk", :description "Heap Big Talk"}
    {:code "alto_annie", :description "Alto Annie"}
    {:code "tumbledown_tess", :description "Tumbledown Tess"}
    {:code "courageous_cop", :description "Courageous Cop"}
    {:code "arnie_angler", :description "Arnie Angler"}
    {:code "freddie_falloff", :description "Freddie Falloff"}
    {:code "baker_benny", :description "Baker Benny"}
    {:code "billy_blaze", :description "Billy Blaze"}
    {:code "diver_dan", :description "Diver Dan"}
    {:code "hayseed_hank", :description "Hayseed Hank"}
    {:code "careless_carrie", :description "Careless Carrie"}
    {:code "lasso_louie", :description "Lasso Louie"}
    {:code "bagpipe_barney", :description "Bagpipe Barney"}
    {:code "slap_on_sam", :description "Slap On Sam"}
    {:code "postman_pete", :description "Postman Pete"}
    {:code "milkman_mo", :description "Milkman Mo"}
    {:code "clancy_clown", :description "Clancy Clown"}
    {:code "greenthumb_gert", :description "Greenthumb Gert"}}},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :matte "black",
  :cards
  [{:code "alto_annie", :twin :left, :state :covered}
   {:code "arnie_angler", :twin :left, :state :covered}
   {:code "bagpipe_barney", :twin :left, :state :matched}
   {:code "baker_benny", :twin :left, :state :covered}
   {:code "billy_blaze", :twin :left, :state :covered}
   {:code "careless_carrie", :twin :left, :state :covered}
   {:code "clancy_clown", :twin :left, :state :covered}
   {:code "courageous_cop", :twin :left, :state :covered}
   {:code "diver_dan", :twin :left, :state :covered}
   {:code "fifi_fluff", :twin :left, :state :covered}
   {:code "freddie_falloff", :twin :left, :state :covered}
   {:code "greenthumb_gert", :twin :left, :state :covered}
   {:code "hayseed_hank", :twin :left, :state :covered}
   {:code "heap_big_talk", :twin :left, :state :covered}
   {:code "lasso_louie", :twin :left, :state :covered}
   {:code "loggin_larry", :twin :left, :state :covered}
   {:code "milkman_mo", :twin :left, :state :covered}
   {:code "postman_pete", :twin :left, :state :covered}
   {:code "slap_on_sam", :twin :left, :state :covered}
   {:code "tumbledown_tess", :twin :left, :state :covered}
   {:code "alto_annie", :twin :right, :state :covered}
   {:code "arnie_angler", :twin :right, :state :covered}
   {:code "bagpipe_barney", :twin :right, :state :matched}
   {:code "baker_benny", :twin :right, :state :covered}
   {:code "billy_blaze", :twin :right, :state :covered}
   {:code "careless_carrie", :twin :right, :state :covered}
   {:code "clancy_clown", :twin :right, :state :covered}
   {:code "courageous_cop", :twin :right, :state :covered}
   {:code "diver_dan", :twin :right, :state :covered}
   {:code "fifi_fluff", :twin :right, :state :covered}
   {:code "freddie_falloff", :twin :right, :state :covered}
   {:code "greenthumb_gert", :twin :right, :state :covered}
   {:code "hayseed_hank", :twin :right, :state :covered}
   {:code "heap_big_talk", :twin :right, :state :covered}
   {:code "lasso_louie", :twin :right, :state :covered}
   {:code "loggin_larry", :twin :right, :state :covered}
   {:code "milkman_mo", :twin :right, :state :covered}
   {:code "postman_pete", :twin :right, :state :covered}
   {:code "slap_on_sam", :twin :right, :state :covered}
   {:code "tumbledown_tess", :twin :right, :state :covered}]}}
nil
user> (require 'match-game.core :reload-all)
CompilerException java.lang.IllegalArgumentException: Parameter declaration missing, compiling:(match_game/core.clj:47:1)
user> (require 'match-game.core :reload-all)
CompilerException java.lang.IllegalArgumentException: Parameter declaration "let" should be a vector, compiling:(match_game/core.clj:49:1)
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: init-slot in this context, compiling:(match_game/core.clj:51:9)
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: init-slot in this context, compiling:(match_game/core.clj:51:9)
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: init-slot in this context, compiling:(match_game/core.clj:51:3)
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-slots "old_maid")
()
user> (match-game.core/init-slot "postman_pete")
ArityException Wrong number of args (1) passed to: core/init-slot  clojure.lang.AFn.throwArity (AFn.java:429)
user> (match-game.core/init-slot "postman_pete" :left)
{:code "postman_pete", :twin :left, :state :covered}
user> (map list ["milkman_mo" "postman_pete" "slap_on_sam"])
(("milkman_mo") ("postman_pete") ("slap_on_sam"))
user> (map identidy ["milkman_mo" "postman_pete" "slap_on_sam"])
CompilerException java.lang.RuntimeException: Unable to resolve symbol: identidy in this context, compiling:(*cider-repl match-game*:915:7)
user> (map identity ["milkman_mo" "postman_pete" "slap_on_sam"])
("milkman_mo" "postman_pete" "slap_on_sam")
user> (map identity ["milkman_mo" "postman_pete" "slap_on_sam"] [:left :right])
ArityException Wrong number of args (2) passed to: core/identity  clojure.lang.AFn.throwArity (AFn.java:429)
user> (map #(#{%1 %2}) ["milkman_mo" "postman_pete" "slap_on_sam"] [:left :right])
ArityException Wrong number of args (0) passed to: PersistentHashSet  clojure.lang.AFn.throwArity (AFn.java:429)
user> (map #('(%1 %2)) ["milkman_mo" "postman_pete" "slap_on_sam"] [:left :right])
ClassCastException clojure.lang.PersistentList cannot be cast to clojure.lang.IFn  user/eval11600/fn--11601 (form-init2936891342910542357.clj:923)
user> (map #(init-slot %1 %2) ["milkman_mo" "postman_pete" "slap_on_sam"] [:left :right])
CompilerException java.lang.RuntimeException: Unable to resolve symbol: init-slot in this context, compiling:(*cider-repl match-game*:925:13)
user> (map #(match-game.core/init-slot %1 %2) ["milkman_mo" "postman_pete" "slap_on_sam"] [:left :right])
({:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :right, :state :covered})
user> (map #(match-game.core/init-slot %1 %2) ["milkman_mo" "postman_pete" "slap_on_sam"])
ArityException Wrong number of args (1) passed to: user/eval11622/fn--11623  clojure.lang.AFn.throwArity (AFn.java:429)
user> (map #(match-game.core/init-slot %1 :left) ["milkman_mo" "postman_pete" "slap_on_sam"])
({:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :left, :state :covered} {:code "slap_on_sam", :twin :left, :state :covered})
user> (map (map #(match-game.core/init-slot %1 :left) ["milkman_mo" "postman_pete" "slap_on_sam"]) (:left :right))
()
user> (map (map #(match-game.core/init-slot %1 :left) ["milkman_mo" "postman_pete" "slap_on_sam"]) [:left :right])
ClassCastException clojure.lang.LazySeq cannot be cast to clojure.lang.IFn  clojure.core/map/fn--4553 (core.clj:2622)
user> (map #(map #(match-game.core/init-slot %1 :left) ["milkman_mo" "postman_pete" "slap_on_sam"]) [:left :right])
IllegalStateException Nested #()s are not allowed  clojure.lang.LispReader$FnReader.invoke (LispReader.java:703)
#function[match-game.core/init-slot]CompilerException java.lang.RuntimeException: Unable to resolve symbol: %1 in this context, compiling:(*cider-repl match-game*:1:7018)
:leftRuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:221)
["milkman_mo" "postman_pete" "slap_on_sam"]RuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:221)
[:left :right]RuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:221)
user> (map #(map #(match-game.core/init-slot %1 :left) ["milkman_mo" "postman_pete" "slap_on_sam"]) [:left :right])
IllegalStateException Nested #()s are not allowed  clojure.lang.LispReader$FnReader.invoke (LispReader.java:703)
#function[match-game.core/init-slot]CompilerException java.lang.RuntimeException: Unable to resolve symbol: %1 in this context, compiling:(*cider-repl match-game*:1:7018)
:leftRuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:221)
["milkman_mo" "postman_pete" "slap_on_sam"]RuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:221)
[:left :right]RuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:221)
user> (map (fn [name] (match-game.core/init-slot name :left)) ["milkman_mo" "postman_pete" "slap_on_sam"])
(:left :left :left)
user> (map (fn [name] (match-game.core/init-slot name :left)) ["milkman_mo" "postman_pete" "slap_on_sam"])
({:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :left, :state :covered} {:code "slap_on_sam", :twin :left, :state :covered})
user> (map (fn [twin] (map (fn [name] (match-game.core/init-slot name :left)) ["milkman_mo" "postman_pete" "slap_on_sam"])) (:left :right))
()
user> (map (fn [twin] (map (fn [name] (match-game.core/init-slot name twin)) ["milkman_mo" "postman_pete" "slap_on_sam"])) (:left :right))
()
user> (map (fn [twin] (map (fn [name] (match-game.core/init-slot name twin)) ["milkman_mo" "postman_pete" "slap_on_sam"])) [:left :right])
(({:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :left, :state :covered} {:code "slap_on_sam", :twin :left, :state :covered}) ({:code "milkman_mo", :twin :right, :state :covered} {:code "postman_pete", :twin :right, :state :covered} {:code "slap_on_sam", :twin :right, :state :covered}))
user> (mapcat (fn [twin] (map (fn [name] (match-game.core/init-slot name twin)) ["milkman_mo" "postman_pete" "slap_on_sam"])) [:left :right])
({:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :left, :state :covered} {:code "slap_on_sam", :twin :left, :state :covered} {:code "milkman_mo", :twin :right, :state :covered} {:code "postman_pete", :twin :right, :state :covered} {:code "slap_on_sam", :twin :right, :state :covered})
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-slots "old_maid")
({:code "alto_annie", :twin :left, :state :covered} {:code "arnie_angler", :twin :left, :state :covered} {:code "bagpipe_barney", :twin :left, :state :covered} {:code "baker_benny", :twin :left, :state :covered} {:code "billy_blaze", :twin :left, :state :covered} {:code "careless_carrie", :twin :left, :state :covered} {:code "clancy_clown", :twin :left, :state :covered} {:code "courageous_cop", :twin :left, :state :covered} {:code "diver_dan", :twin :left, :state :covered} {:code "fifi_fluff", :twin :left, :state :covered} {:code "freddie_falloff", :twin :left, :state :covered} {:code "greenthumb_gert", :twin :left, :state :covered} {:code "hayseed_hank", :twin :left, :state :covered} {:code "heap_big_talk", :twin :left, :state :covered} {:code "lasso_louie", :twin :left, :state :covered} {:code "loggin_larry", :twin :left, :state :covered} {:code "milkman_mo", :twin :left, :state :covered} {:code "postman_pete", :twin :left, :state :covered} {:code "slap_on_sam", :twin :left, :state :covered} {:code "tumbledown_tess", :twin :left, :state :covered} {:code "alto_annie", :twin :right, :state :covered} {:code "arnie_angler", :twin :right, :state :covered} {:code "bagpipe_barney", :twin :right, :state :covered} {:code "baker_benny", :twin :right, :state :covered} {:code "billy_blaze", :twin :right, :state :covered} {:code "careless_carrie", :twin :right, :state :covered} {:code "clancy_clown", :twin :right, :state :covered} {:code "courageous_cop", :twin :right, :state :covered} {:code "diver_dan", :twin :right, :state :covered} {:code "fifi_fluff", :twin :right, :state :covered} {:code "freddie_falloff", :twin :right, :state :covered} {:code "greenthumb_gert", :twin :right, :state :covered} {:code "hayseed_hank", :twin :right, :state :covered} {:code "heap_big_talk", :twin :right, :state :covered} {:code "lasso_louie", :twin :right, :state :covered} {:code "loggin_larry", :twin :right, :state :covered} {:code "milkman_mo", :twin :right, :state :covered} {:code "postman_pete", :twin :right, :state :covered} {:code "slap_on_sam", :twin :right, :state :covered} {:code "tumbledown_tess", :twin :right, :state :covered})
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-game "old_maid")
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}}, :deck {:name "old_maid", :description "Old Maid", :cards #{{:name "greenthumb_gert", :description "Greenthumb Gert"} {:name "postman_pete", :description "Postman Pete"} {:name "diver_dan", :description "Diver Dan"} {:name "milkman_mo", :description "Milkman Mo"} {:name "arnie_angler", :description "Arnie Angler"} {:name "clancy_clown", :description "Clancy Clown"} {:name "heap_big_talk", :description "Heap Big Talk"} {:name "lasso_louie", :description "Lasso Louie"} {:name "freddie_falloff", :description "Freddie Falloff"} {:name "courageous_cop", :description "Courageous Cop"} {:name "hayseed_hank", :description "Hayseed Hank"} {:name "alto_annie", :description "Alto Annie"} {:name "baker_benny", :description "Baker Benny"} {:name "fifi_fluff", :description "Fifi Fluff"} {:name "loggin_larry", :description "Loggin Larry"} {:name "slap_on_sam", :description "Slap On Sam"} {:name "tumbledown_tess", :description "Tumbledown Tess"} {:name "careless_carrie", :description "Careless Carrie"} {:name "bagpipe_barney", :description "Bagpipe Barney"} {:name "billy_blaze", :description "Billy Blaze"}}}, :turn :cjgoodno, :board {:dimensions [4 5], :matte "black", :slots ({:name "alto_annie", :twin :left, :state :covered} {:name "arnie_angler", :twin :left, :state :covered} {:name "bagpipe_barney", :twin :left, :state :covered} {:name "baker_benny", :twin :left, :state :covered} {:name "billy_blaze", :twin :left, :state :covered} {:name "careless_carrie", :twin :left, :state :covered} {:name "clancy_clown", :twin :left, :state :covered} {:name "courageous_cop", :twin :left, :state :covered} {:name "diver_dan", :twin :left, :state :covered} {:name "fifi_fluff", :twin :left, :state :covered} {:name "freddie_falloff", :twin :left, :state :covered} {:name "greenthumb_gert", :twin :left, :state :covered} {:name "hayseed_hank", :twin :left, :state :covered} {:name "heap_big_talk", :twin :left, :state :covered} {:name "lasso_louie", :twin :left, :state :covered} {:name "loggin_larry", :twin :left, :state :covered} {:name "milkman_mo", :twin :left, :state :covered} {:name "postman_pete", :twin :left, :state :covered} {:name "slap_on_sam", :twin :left, :state :covered} {:name "tumbledown_tess", :twin :left, :state :covered} {:name "alto_annie", :twin :right, :state :covered} {:name "arnie_angler", :twin :right, :state :covered} {:name "bagpipe_barney", :twin :right, :state :covered} {:name "baker_benny", :twin :right, :state :covered} {:name "billy_blaze", :twin :right, :state :covered} {:name "careless_carrie", :twin :right, :state :covered} {:name "clancy_clown", :twin :right, :state :covered} {:name "courageous_cop", :twin :right, :state :covered} {:name "diver_dan", :twin :right, :state :covered} {:name "fifi_fluff", :twin :right, :state :covered} {:name "freddie_falloff", :twin :right, :state :covered} {:name "greenthumb_gert", :twin :right, :state :covered} {:name "hayseed_hank", :twin :right, :state :covered} {:name "heap_big_talk", :twin :right, :state :covered} {:name "lasso_louie", :twin :right, :state :covered} {:name "loggin_larry", :twin :right, :state :covered} {:name "milkman_mo", :twin :right, :state :covered} {:name "postman_pete", :twin :right, :state :covered} {:name "slap_on_sam", :twin :right, :state :covered} {:name "tumbledown_tess", :twin :right, :state :covered})}}
user> (pprint *1)
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :deck
 {:name "old_maid",
  :description "Old Maid",
  :cards
  #{{:name "greenthumb_gert", :description "Greenthumb Gert"}
    {:name "postman_pete", :description "Postman Pete"}
    {:name "diver_dan", :description "Diver Dan"}
    {:name "milkman_mo", :description "Milkman Mo"}
    {:name "arnie_angler", :description "Arnie Angler"}
    {:name "clancy_clown", :description "Clancy Clown"}
    {:name "heap_big_talk", :description "Heap Big Talk"}
    {:name "lasso_louie", :description "Lasso Louie"}
    {:name "freddie_falloff", :description "Freddie Falloff"}
    {:name "courageous_cop", :description "Courageous Cop"}
    {:name "hayseed_hank", :description "Hayseed Hank"}
    {:name "alto_annie", :description "Alto Annie"}
    {:name "baker_benny", :description "Baker Benny"}
    {:name "fifi_fluff", :description "Fifi Fluff"}
    {:name "loggin_larry", :description "Loggin Larry"}
    {:name "slap_on_sam", :description "Slap On Sam"}
    {:name "tumbledown_tess", :description "Tumbledown Tess"}
    {:name "careless_carrie", :description "Careless Carrie"}
    {:name "bagpipe_barney", :description "Bagpipe Barney"}
    {:name "billy_blaze", :description "Billy Blaze"}}},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :matte "black",
  :slots
  ({:name "alto_annie", :twin :left, :state :covered}
   {:name "arnie_angler", :twin :left, :state :covered}
   {:name "bagpipe_barney", :twin :left, :state :covered}
   {:name "baker_benny", :twin :left, :state :covered}
   {:name "billy_blaze", :twin :left, :state :covered}
   {:name "careless_carrie", :twin :left, :state :covered}
   {:name "clancy_clown", :twin :left, :state :covered}
   {:name "courageous_cop", :twin :left, :state :covered}
   {:name "diver_dan", :twin :left, :state :covered}
   {:name "fifi_fluff", :twin :left, :state :covered}
   {:name "freddie_falloff", :twin :left, :state :covered}
   {:name "greenthumb_gert", :twin :left, :state :covered}
   {:name "hayseed_hank", :twin :left, :state :covered}
   {:name "heap_big_talk", :twin :left, :state :covered}
   {:name "lasso_louie", :twin :left, :state :covered}
   {:name "loggin_larry", :twin :left, :state :covered}
   {:name "milkman_mo", :twin :left, :state :covered}
   {:name "postman_pete", :twin :left, :state :covered}
   {:name "slap_on_sam", :twin :left, :state :covered}
   {:name "tumbledown_tess", :twin :left, :state :covered}
   {:name "alto_annie", :twin :right, :state :covered}
   {:name "arnie_angler", :twin :right, :state :covered}
   {:name "bagpipe_barney", :twin :right, :state :covered}
   {:name "baker_benny", :twin :right, :state :covered}
   {:name "billy_blaze", :twin :right, :state :covered}
   {:name "careless_carrie", :twin :right, :state :covered}
   {:name "clancy_clown", :twin :right, :state :covered}
   {:name "courageous_cop", :twin :right, :state :covered}
   {:name "diver_dan", :twin :right, :state :covered}
   {:name "fifi_fluff", :twin :right, :state :covered}
   {:name "freddie_falloff", :twin :right, :state :covered}
   {:name "greenthumb_gert", :twin :right, :state :covered}
   {:name "hayseed_hank", :twin :right, :state :covered}
   {:name "heap_big_talk", :twin :right, :state :covered}
   {:name "lasso_louie", :twin :right, :state :covered}
   {:name "loggin_larry", :twin :right, :state :covered}
   {:name "milkman_mo", :twin :right, :state :covered}
   {:name "postman_pete", :twin :right, :state :covered}
   {:name "slap_on_sam", :twin :right, :state :covered}
   {:name "tumbledown_tess", :twin :right, :state :covered})}}
nil
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-game "old_maid")
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}}, :deck {:name "old_maid", :description "Old Maid", :cards #{{:name "greenthumb_gert", :description "Greenthumb Gert"} {:name "postman_pete", :description "Postman Pete"} {:name "diver_dan", :description "Diver Dan"} {:name "milkman_mo", :description "Milkman Mo"} {:name "arnie_angler", :description "Arnie Angler"} {:name "clancy_clown", :description "Clancy Clown"} {:name "heap_big_talk", :description "Heap Big Talk"} {:name "lasso_louie", :description "Lasso Louie"} {:name "freddie_falloff", :description "Freddie Falloff"} {:name "courageous_cop", :description "Courageous Cop"} {:name "hayseed_hank", :description "Hayseed Hank"} {:name "alto_annie", :description "Alto Annie"} {:name "baker_benny", :description "Baker Benny"} {:name "fifi_fluff", :description "Fifi Fluff"} {:name "loggin_larry", :description "Loggin Larry"} {:name "slap_on_sam", :description "Slap On Sam"} {:name "tumbledown_tess", :description "Tumbledown Tess"} {:name "careless_carrie", :description "Careless Carrie"} {:name "bagpipe_barney", :description "Bagpipe Barney"} {:name "billy_blaze", :description "Billy Blaze"}}}, :turn :cjgoodno, :board {:dimensions [4 5], :matte "black", :slots ({:name "alto_annie", :description "Alto Annie", :twin :left, :state :covered} {:name "arnie_angler", :description "Arnie Angler", :twin :left, :state :covered} {:name "bagpipe_barney", :description "Bagpipe Barney", :twin :left, :state :covered} {:name "baker_benny", :description "Baker Benny", :twin :left, :state :covered} {:name "billy_blaze", :description "Billy Blaze", :twin :left, :state :covered} {:name "careless_carrie", :description "Careless Carrie", :twin :left, :state :covered} {:name "clancy_clown", :description "Clancy Clown", :twin :left, :state :covered} {:name "courageous_cop", :description "Courageous Cop", :twin :left, :state :covered} {:name "diver_dan", :description "Diver Dan", :twin :left, :state :covered} {:name "fifi_fluff", :description "Fifi Fluff", :twin :left, :state :covered} {:name "freddie_falloff", :description "Freddie Falloff", :twin :left, :state :covered} {:name "greenthumb_gert", :description "Greenthumb Gert", :twin :left, :state :covered} {:name "hayseed_hank", :description "Hayseed Hank", :twin :left, :state :covered} {:name "heap_big_talk", :description "Heap Big Talk", :twin :left, :state :covered} {:name "lasso_louie", :description "Lasso Louie", :twin :left, :state :covered} {:name "loggin_larry", :description "Loggin Larry", :twin :left, :state :covered} {:name "milkman_mo", :description "Milkman Mo", :twin :left, :state :covered} {:name "postman_pete", :description "Postman Pete", :twin :left, :state :covered} {:name "slap_on_sam", :description "Slap On Sam", :twin :left, :state :covered} {:name "tumbledown_tess", :description "Tumbledown Tess", :twin :left, :state :covered} {:name "alto_annie", :description "Alto Annie", :twin :right, :state :covered} {:name "arnie_angler", :description "Arnie Angler", :twin :right, :state :covered} {:name "bagpipe_barney", :description "Bagpipe Barney", :twin :right, :state :covered} {:name "baker_benny", :description "Baker Benny", :twin :right, :state :covered} {:name "billy_blaze", :description "Billy Blaze", :twin :right, :state :covered} {:name "careless_carrie", :description "Careless Carrie", :twin :right, :state :covered} {:name "clancy_clown", :description "Clancy Clown", :twin :right, :state :covered} {:name "courageous_cop", :description "Courageous Cop", :twin :right, :state :covered} {:name "diver_dan", :description "Diver Dan", :twin :right, :state :covered} {:name "fifi_fluff", :description "Fifi Fluff", :twin :right, :state :covered} {:name "freddie_falloff", :description "Freddie Falloff", :twin :right, :state :covered} {:name "greenthumb_gert", :description "Greenthumb Gert", :twin :right, :state :covered} {:name "hayseed_hank", :description "Hayseed Hank", :twin :right, :state :covered} {:name "heap_big_talk", :description "Heap Big Talk", :twin :right, :state :covered} {:name "lasso_louie", :description "Lasso Louie", :twin :right, :state :covered} {:name "loggin_larry", :description "Loggin Larry", :twin :right, :state :covered} {:name "milkman_mo", :description "Milkman Mo", :twin :right, :state :covered} {:name "postman_pete", :description "Postman Pete", :twin :right, :state :covered} {:name "slap_on_sam", :description "Slap On Sam", :twin :right, :state :covered} {:name "tumbledown_tess", :description "Tumbledown Tess", :twin :right, :state :covered})}}
user> (pprint (match-game.core/init-game "old_maid"))
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :deck
 {:name "old_maid",
  :description "Old Maid",
  :cards
  #{{:name "greenthumb_gert", :description "Greenthumb Gert"}
    {:name "postman_pete", :description "Postman Pete"}
    {:name "diver_dan", :description "Diver Dan"}
    {:name "milkman_mo", :description "Milkman Mo"}
    {:name "arnie_angler", :description "Arnie Angler"}
    {:name "clancy_clown", :description "Clancy Clown"}
    {:name "heap_big_talk", :description "Heap Big Talk"}
    {:name "lasso_louie", :description "Lasso Louie"}
    {:name "freddie_falloff", :description "Freddie Falloff"}
    {:name "courageous_cop", :description "Courageous Cop"}
    {:name "hayseed_hank", :description "Hayseed Hank"}
    {:name "alto_annie", :description "Alto Annie"}
    {:name "baker_benny", :description "Baker Benny"}
    {:name "fifi_fluff", :description "Fifi Fluff"}
    {:name "loggin_larry", :description "Loggin Larry"}
    {:name "slap_on_sam", :description "Slap On Sam"}
    {:name "tumbledown_tess", :description "Tumbledown Tess"}
    {:name "careless_carrie", :description "Careless Carrie"}
    {:name "bagpipe_barney", :description "Bagpipe Barney"}
    {:name "billy_blaze", :description "Billy Blaze"}}},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :matte "black",
  :slots
  ({:name "alto_annie",
    :description "Alto Annie",
    :twin :left,
    :state :covered}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :left,
    :state :covered}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :left,
    :state :covered}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :left,
    :state :covered}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :left,
    :state :covered}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :left,
    :state :covered}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :left,
    :state :covered}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :left,
    :state :covered}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :left,
    :state :covered}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :left,
    :state :covered}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :left,
    :state :covered}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :left,
    :state :covered}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :left,
    :state :covered}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :left,
    :state :covered}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :left,
    :state :covered}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :left,
    :state :covered}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :left,
    :state :covered}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :left,
    :state :covered}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :left,
    :state :covered}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :left,
    :state :covered}
   {:name "alto_annie",
    :description "Alto Annie",
    :twin :right,
    :state :covered}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :right,
    :state :covered}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :right,
    :state :covered}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :right,
    :state :covered}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :right,
    :state :covered}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :right,
    :state :covered}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :right,
    :state :covered}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :right,
    :state :covered}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :right,
    :state :covered}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :right,
    :state :covered}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :right,
    :state :covered}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :right,
    :state :covered}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :right,
    :state :covered}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :right,
    :state :covered}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :right,
    :state :covered}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :right,
    :state :covered}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :right,
    :state :covered}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :right,
    :state :covered}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :right,
    :state :covered}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :right,
    :state :covered})}}
nil
user> (match-game.core/init-game "old_maid")
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}}, :deck {:name "old_maid", :description "Old Maid", :cards #{{:name "greenthumb_gert", :description "Greenthumb Gert"} {:name "postman_pete", :description "Postman Pete"} {:name "diver_dan", :description "Diver Dan"} {:name "milkman_mo", :description "Milkman Mo"} {:name "arnie_angler", :description "Arnie Angler"} {:name "clancy_clown", :description "Clancy Clown"} {:name "heap_big_talk", :description "Heap Big Talk"} {:name "lasso_louie", :description "Lasso Louie"} {:name "freddie_falloff", :description "Freddie Falloff"} {:name "courageous_cop", :description "Courageous Cop"} {:name "hayseed_hank", :description "Hayseed Hank"} {:name "alto_annie", :description "Alto Annie"} {:name "baker_benny", :description "Baker Benny"} {:name "fifi_fluff", :description "Fifi Fluff"} {:name "loggin_larry", :description "Loggin Larry"} {:name "slap_on_sam", :description "Slap On Sam"} {:name "tumbledown_tess", :description "Tumbledown Tess"} {:name "careless_carrie", :description "Careless Carrie"} {:name "bagpipe_barney", :description "Bagpipe Barney"} {:name "billy_blaze", :description "Billy Blaze"}}}, :turn :cjgoodno, :board {:dimensions [4 5], :matte "black", :slots ({:name "alto_annie", :description "Alto Annie", :twin :left, :state :covered} {:name "arnie_angler", :description "Arnie Angler", :twin :left, :state :covered} {:name "bagpipe_barney", :description "Bagpipe Barney", :twin :left, :state :covered} {:name "baker_benny", :description "Baker Benny", :twin :left, :state :covered} {:name "billy_blaze", :description "Billy Blaze", :twin :left, :state :covered} {:name "careless_carrie", :description "Careless Carrie", :twin :left, :state :covered} {:name "clancy_clown", :description "Clancy Clown", :twin :left, :state :covered} {:name "courageous_cop", :description "Courageous Cop", :twin :left, :state :covered} {:name "diver_dan", :description "Diver Dan", :twin :left, :state :covered} {:name "fifi_fluff", :description "Fifi Fluff", :twin :left, :state :covered} {:name "freddie_falloff", :description "Freddie Falloff", :twin :left, :state :covered} {:name "greenthumb_gert", :description "Greenthumb Gert", :twin :left, :state :covered} {:name "hayseed_hank", :description "Hayseed Hank", :twin :left, :state :covered} {:name "heap_big_talk", :description "Heap Big Talk", :twin :left, :state :covered} {:name "lasso_louie", :description "Lasso Louie", :twin :left, :state :covered} {:name "loggin_larry", :description "Loggin Larry", :twin :left, :state :covered} {:name "milkman_mo", :description "Milkman Mo", :twin :left, :state :covered} {:name "postman_pete", :description "Postman Pete", :twin :left, :state :covered} {:name "slap_on_sam", :description "Slap On Sam", :twin :left, :state :covered} {:name "tumbledown_tess", :description "Tumbledown Tess", :twin :left, :state :covered} {:name "alto_annie", :description "Alto Annie", :twin :right, :state :covered} {:name "arnie_angler", :description "Arnie Angler", :twin :right, :state :covered} {:name "bagpipe_barney", :description "Bagpipe Barney", :twin :right, :state :covered} {:name "baker_benny", :description "Baker Benny", :twin :right, :state :covered} {:name "billy_blaze", :description "Billy Blaze", :twin :right, :state :covered} {:name "careless_carrie", :description "Careless Carrie", :twin :right, :state :covered} {:name "clancy_clown", :description "Clancy Clown", :twin :right, :state :covered} {:name "courageous_cop", :description "Courageous Cop", :twin :right, :state :covered} {:name "diver_dan", :description "Diver Dan", :twin :right, :state :covered} {:name "fifi_fluff", :description "Fifi Fluff", :twin :right, :state :covered} {:name "freddie_falloff", :description "Freddie Falloff", :twin :right, :state :covered} {:name "greenthumb_gert", :description "Greenthumb Gert", :twin :right, :state :covered} {:name "hayseed_hank", :description "Hayseed Hank", :twin :right, :state :covered} {:name "heap_big_talk", :description "Heap Big Talk", :twin :right, :state :covered} {:name "lasso_louie", :description "Lasso Louie", :twin :right, :state :covered} {:name "loggin_larry", :description "Loggin Larry", :twin :right, :state :covered} {:name "milkman_mo", :description "Milkman Mo", :twin :right, :state :covered} {:name "postman_pete", :description "Postman Pete", :twin :right, :state :covered} {:name "slap_on_sam", :description "Slap On Sam", :twin :right, :state :covered} {:name "tumbledown_tess", :description "Tumbledown Tess", :twin :right, :state :covered})}}
user> (require 'match-game.core :reload-all)
nil
user> (pprint (match-game.core/init-game "old_maid"))
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :deck {:name "old_maid", :description "Old Maid"},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :matte "black",
  :slots
  ({:name "alto_annie",
    :description "Alto Annie",
    :twin :left,
    :state :covered}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :left,
    :state :covered}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :left,
    :state :covered}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :left,
    :state :covered}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :left,
    :state :covered}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :left,
    :state :covered}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :left,
    :state :covered}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :left,
    :state :covered}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :left,
    :state :covered}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :left,
    :state :covered}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :left,
    :state :covered}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :left,
    :state :covered}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :left,
    :state :covered}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :left,
    :state :covered}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :left,
    :state :covered}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :left,
    :state :covered}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :left,
    :state :covered}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :left,
    :state :covered}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :left,
    :state :covered}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :left,
    :state :covered}
   {:name "alto_annie",
    :description "Alto Annie",
    :twin :right,
    :state :covered}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :right,
    :state :covered}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :right,
    :state :covered}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :right,
    :state :covered}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :right,
    :state :covered}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :right,
    :state :covered}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :right,
    :state :covered}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :right,
    :state :covered}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :right,
    :state :covered}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :right,
    :state :covered}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :right,
    :state :covered}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :right,
    :state :covered}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :right,
    :state :covered}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :right,
    :state :covered}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :right,
    :state :covered}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :right,
    :state :covered}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :right,
    :state :covered}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :right,
    :state :covered}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :right,
    :state :covered}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :right,
    :state :covered})}}
nil
user> (require 'match-game.core :reload-all)
nil
user> (pprint (match-game.core/init-game "old_maid"))
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :deck {:name "old_maid", :description "Old Maid"},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :matte "black",
  :slots
  [{:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :right,
    :state :covered}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :left,
    :state :covered}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :left,
    :state :covered}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :right,
    :state :covered}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :left,
    :state :covered}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :right,
    :state :covered}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :left,
    :state :covered}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :left,
    :state :covered}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :left,
    :state :covered}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :right,
    :state :covered}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :right,
    :state :covered}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :right,
    :state :covered}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :right,
    :state :covered}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :left,
    :state :covered}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :left,
    :state :covered}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :right,
    :state :covered}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :right,
    :state :covered}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :right,
    :state :covered}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :left,
    :state :covered}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :right,
    :state :covered}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :left,
    :state :covered}
   {:name "alto_annie",
    :description "Alto Annie",
    :twin :left,
    :state :covered}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :left,
    :state :covered}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :right,
    :state :covered}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :right,
    :state :covered}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :left,
    :state :covered}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :right,
    :state :covered}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :right,
    :state :covered}
   {:name "alto_annie",
    :description "Alto Annie",
    :twin :right,
    :state :covered}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :right,
    :state :covered}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :left,
    :state :covered}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :left,
    :state :covered}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :left,
    :state :covered}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :left,
    :state :covered}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :left,
    :state :covered}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :right,
    :state :covered}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :right,
    :state :covered}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :left,
    :state :covered}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :right,
    :state :covered}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :left,
    :state :covered}]}}
nil
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Too many arguments to def, compiling:(match_game/core.clj:49:1)
user> (require 'match-game.core :reload-all)
nil
user> (pprint (match-game.core/init-game "old_maid"))
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :deck {:name "old_maid", :description "Old Maid"},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :matte "black",
  :slots
  [{:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/slap_on_sam.png"}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/lasso_louie.png"}
   {:name "alto_annie",
    :description "Alto Annie",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/alto_annie.png"}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/diver_dan.png"}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/freddie_falloff.png"}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/careless_carrie.png"}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/billy_blaze.png"}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/bagpipe_barney.png"}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"}
   {:name "careless_carrie",
    :description "Careless Carrie",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/careless_carrie.png"}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/milkman_mo.png"}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/heap_big_talk.png"}
   {:name "billy_blaze",
    :description "Billy Blaze",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/billy_blaze.png"}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/arnie_angler.png"}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/greenthumb_gert.png"}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/postman_pete.png"}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/clancy_clown.png"}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/baker_benny.png"}
   {:name "bagpipe_barney",
    :description "Bagpipe Barney",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/bagpipe_barney.png"}
   {:name "lasso_louie",
    :description "Lasso Louie",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/lasso_louie.png"}
   {:name "heap_big_talk",
    :description "Heap Big Talk",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/heap_big_talk.png"}
   {:name "arnie_angler",
    :description "Arnie Angler",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/arnie_angler.png"}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/loggin_larry.png"}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/hayseed_hank.png"}
   {:name "greenthumb_gert",
    :description "Greenthumb Gert",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/greenthumb_gert.png"}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :left,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/courageous_cop.png"}
   {:name "slap_on_sam",
    :description "Slap On Sam",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/slap_on_sam.png"}
   {:name "courageous_cop",
    :description "Courageous Cop",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/courageous_cop.png"}
   {:name "alto_annie",
    :description "Alto Annie",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/alto_annie.png"}
   {:name "postman_pete",
    :description "Postman Pete",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/postman_pete.png"}
   {:name "clancy_clown",
    :description "Clancy Clown",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/clancy_clown.png"}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :right,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/fifi_fluff.png"}
   {:name "tumbledown_tess",
    :description "Tumbledown Tess",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"}
   {:name "loggin_larry",
    :description "Loggin Larry",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/loggin_larry.png"}
   {:name "diver_dan",
    :description "Diver Dan",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/diver_dan.png"}
   {:name "baker_benny",
    :description "Baker Benny",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/baker_benny.png"}
   {:name "fifi_fluff",
    :description "Fifi Fluff",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/fifi_fluff.png"}
   {:name "hayseed_hank",
    :description "Hayseed Hank",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/hayseed_hank.png"}
   {:name "freddie_falloff",
    :description "Freddie Falloff",
    :twin :right,
    :state :covered,
    :img
    "http://objinx.com/images/cardsets/old_maid/freddie_falloff.png"}
   {:name "milkman_mo",
    :description "Milkman Mo",
    :twin :left,
    :state :covered,
    :img "http://objinx.com/images/cardsets/old_maid/milkman_mo.png"}]}}
nil
user> (def card {:name name, :description (human-name name), :img (uri-path deck-name name)})
CompilerException java.lang.RuntimeException: Unable to resolve symbol: human-name in this context, compiling:(*cider-repl match-game*:1808:43)
user> (def card {:name name, :description (match-game.core/human-name name), :img (uri-path deck-name name)})
CompilerException java.lang.RuntimeException: Unable to resolve symbol: uri-path in this context, compiling:(*cider-repl match-game*:1810:83)
user> (require 'match-game.core :reload-all)
nil
user> (def card (let [deck-name "old_maid" name "tumbledown_tess"] {:name name, :description (match-game.core/human-name name), :img (match-game.core/uri-path deck-name name)}))
#'user/card
user> card
{:name "tumbledown_tess", :description "Tumbledown Tess", :img "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"}
user> (merge { :twin :left, :state :covered } card)
{:twin :left, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"}
user> (require 'match-game.core :reload-all)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: deck in this context, compiling:(match_game/core.clj:72:11)
user> (require 'match-game.core :reload-all)
nil
user> (pprint (match-game.core/init-game "old_maid"))
ArityException Wrong number of args (1) passed to: core/load-card  clojure.lang.AFn.throwArity (AFn.java:429)
user> (def names (match-game.core/names-in-deck "old_maid"))
#'user/names
user> names
("alto_annie" "arnie_angler" "bagpipe_barney" "baker_benny" "billy_blaze" "careless_carrie" "clancy_clown" "courageous_cop" "diver_dan" "fifi_fluff" "freddie_falloff" "greenthumb_gert" "hayseed_hank" "heap_big_talk" "lasso_louie" "loggin_larry" "milkman_mo" "postman_pete" "slap_on_sam" "tumbledown_tess")
user> count(names)
#function[clojure.core/count]ClassCastException clojure.lang.LazySeq cannot be cast to clojure.lang.IFn  user/eval12345 (form-init2936891342910542357.clj:1830)
user> (count names)
20
user> (repeat "andy" (count names))
ClassCastException java.lang.String cannot be cast to java.lang.Number  clojure.core/repeat (core.clj:2868)
user> (repeat (count names) "andy")
("andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy" "andy")
user> (require 'match-game.core :reload-all)
nil
user> (def names (match-game.core/names-in-deck "old_maid"))
#'user/names
user> (pprint (match-game.core/init-game "old_maid"))
ArityException Wrong number of args (0) passed to: PersistentArrayMap  clojure.lang.AFn.throwArity (AFn.java:429)
user> (def names (match-game.core/names-in-deck "old_maid"))
#'user/names
user> (def deck-names (repeat (count card-names) deck-name))
CompilerException java.lang.RuntimeException: Unable to resolve symbol: card-names in this context, compiling:(*cider-repl match-game*:1846:31)
user> (def card-names (match-game.core/names-in-deck "old_maid"))
#'user/card-names
user> (def deck-names (repeat (count card-names) deck-name))
CompilerException java.lang.RuntimeException: Unable to resolve symbol: deck-name in this context, compiling:(*cider-repl match-game*:1850:23)
user> (def deck-names (repeat (count card-names) "old_maid"))
#'user/deck-names
user> (map match-game.core/load-card deck-names card-names)
({:name "alto_annie", :description "Alto Annie", :img "http://objinx.com/images/cardsets/old_maid/alto_annie.png"} {:name "arnie_angler", :description "Arnie Angler", :img "http://objinx.com/images/cardsets/old_maid/arnie_angler.png"} {:name "bagpipe_barney", :description "Bagpipe Barney", :img "http://objinx.com/images/cardsets/old_maid/bagpipe_barney.png"} {:name "baker_benny", :description "Baker Benny", :img "http://objinx.com/images/cardsets/old_maid/baker_benny.png"} {:name "billy_blaze", :description "Billy Blaze", :img "http://objinx.com/images/cardsets/old_maid/billy_blaze.png"} {:name "careless_carrie", :description "Careless Carrie", :img "http://objinx.com/images/cardsets/old_maid/careless_carrie.png"} {:name "clancy_clown", :description "Clancy Clown", :img "http://objinx.com/images/cardsets/old_maid/clancy_clown.png"} {:name "courageous_cop", :description "Courageous Cop", :img "http://objinx.com/images/cardsets/old_maid/courageous_cop.png"} {:name "diver_dan", :description "Diver Dan", :img "http://objinx.com/images/cardsets/old_maid/diver_dan.png"} {:name "fifi_fluff", :description "Fifi Fluff", :img "http://objinx.com/images/cardsets/old_maid/fifi_fluff.png"} {:name "freddie_falloff", :description "Freddie Falloff", :img "http://objinx.com/images/cardsets/old_maid/freddie_falloff.png"} {:name "greenthumb_gert", :description "Greenthumb Gert", :img "http://objinx.com/images/cardsets/old_maid/greenthumb_gert.png"} {:name "hayseed_hank", :description "Hayseed Hank", :img "http://objinx.com/images/cardsets/old_maid/hayseed_hank.png"} {:name "heap_big_talk", :description "Heap Big Talk", :img "http://objinx.com/images/cardsets/old_maid/heap_big_talk.png"} {:name "lasso_louie", :description "Lasso Louie", :img "http://objinx.com/images/cardsets/old_maid/lasso_louie.png"} {:name "loggin_larry", :description "Loggin Larry", :img "http://objinx.com/images/cardsets/old_maid/loggin_larry.png"} {:name "milkman_mo", :description "Milkman Mo", :img "http://objinx.com/images/cardsets/old_maid/milkman_mo.png"} {:name "postman_pete", :description "Postman Pete", :img "http://objinx.com/images/cardsets/old_maid/postman_pete.png"} {:name "slap_on_sam", :description "Slap On Sam", :img "http://objinx.com/images/cardsets/old_maid/slap_on_sam.png"} {:name "tumbledown_tess", :description "Tumbledown Tess", :img "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"})
user> (match-game.core/load-deck "old_maid")
{:name "old_maid", :description "Old Maid", :cards #{{:name "milkman_mo", :description "Milkman Mo", :img "http://objinx.com/images/cardsets/old_maid/milkman_mo.png"} {:name "alto_annie", :description "Alto Annie", :img "http://objinx.com/images/cardsets/old_maid/alto_annie.png"} {:name "arnie_angler", :description "Arnie Angler", :img "http://objinx.com/images/cardsets/old_maid/arnie_angler.png"} {:name "loggin_larry", :description "Loggin Larry", :img "http://objinx.com/images/cardsets/old_maid/loggin_larry.png"} {:name "billy_blaze", :description "Billy Blaze", :img "http://objinx.com/images/cardsets/old_maid/billy_blaze.png"} {:name "bagpipe_barney", :description "Bagpipe Barney", :img "http://objinx.com/images/cardsets/old_maid/bagpipe_barney.png"} {:name "careless_carrie", :description "Careless Carrie", :img "http://objinx.com/images/cardsets/old_maid/careless_carrie.png"} {:name "postman_pete", :description "Postman Pete", :img "http://objinx.com/images/cardsets/old_maid/postman_pete.png"} {:name "slap_on_sam", :description "Slap On Sam", :img "http://objinx.com/images/cardsets/old_maid/slap_on_sam.png"} {:name "clancy_clown", :description "Clancy Clown", :img "http://objinx.com/images/cardsets/old_maid/clancy_clown.png"} {:name "courageous_cop", :description "Courageous Cop", :img "http://objinx.com/images/cardsets/old_maid/courageous_cop.png"} {:name "tumbledown_tess", :description "Tumbledown Tess", :img "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"} {:name "baker_benny", :description "Baker Benny", :img "http://objinx.com/images/cardsets/old_maid/baker_benny.png"} {:name "lasso_louie", :description "Lasso Louie", :img "http://objinx.com/images/cardsets/old_maid/lasso_louie.png"} {:name "diver_dan", :description "Diver Dan", :img "http://objinx.com/images/cardsets/old_maid/diver_dan.png"} {:name "heap_big_talk", :description "Heap Big Talk", :img "http://objinx.com/images/cardsets/old_maid/heap_big_talk.png"} {:name "hayseed_hank", :description "Hayseed Hank", :img "http://objinx.com/images/cardsets/old_maid/hayseed_hank.png"} {:name "greenthumb_gert", :description "Greenthumb Gert", :img "http://objinx.com/images/cardsets/old_maid/greenthumb_gert.png"} {:name "freddie_falloff", :description "Freddie Falloff", :img "http://objinx.com/images/cardsets/old_maid/freddie_falloff.png"} {:name "fifi_fluff", :description "Fifi Fluff", :img "http://objinx.com/images/cardsets/old_maid/fifi_fluff.png"}}}
user> (match-game.core/init-board (match-game.core/load-deck "old_maid"))
{:dimensions [4 5], :matte "black", :slots [{:twin :right, :state :covered, :name "lasso_louie", :description "Lasso Louie", :img "http://objinx.com/images/cardsets/old_maid/lasso_louie.png"} {:twin :right, :state :covered, :name "bagpipe_barney", :description "Bagpipe Barney", :img "http://objinx.com/images/cardsets/old_maid/bagpipe_barney.png"} {:twin :left, :state :covered, :name "diver_dan", :description "Diver Dan", :img "http://objinx.com/images/cardsets/old_maid/diver_dan.png"} {:twin :right, :state :covered, :name "alto_annie", :description "Alto Annie", :img "http://objinx.com/images/cardsets/old_maid/alto_annie.png"} {:twin :left, :state :covered, :name "billy_blaze", :description "Billy Blaze", :img "http://objinx.com/images/cardsets/old_maid/billy_blaze.png"} {:twin :right, :state :covered, :name "diver_dan", :description "Diver Dan", :img "http://objinx.com/images/cardsets/old_maid/diver_dan.png"} {:twin :right, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"} {:twin :left, :state :covered, :name "fifi_fluff", :description "Fifi Fluff", :img "http://objinx.com/images/cardsets/old_maid/fifi_fluff.png"} {:twin :right, :state :covered, :name "baker_benny", :description "Baker Benny", :img "http://objinx.com/images/cardsets/old_maid/baker_benny.png"} {:twin :right, :state :covered, :name "careless_carrie", :description "Careless Carrie", :img "http://objinx.com/images/cardsets/old_maid/careless_carrie.png"} {:twin :left, :state :covered, :name "baker_benny", :description "Baker Benny", :img "http://objinx.com/images/cardsets/old_maid/baker_benny.png"} {:twin :right, :state :covered, :name "greenthumb_gert", :description "Greenthumb Gert", :img "http://objinx.com/images/cardsets/old_maid/greenthumb_gert.png"} {:twin :left, :state :covered, :name "lasso_louie", :description "Lasso Louie", :img "http://objinx.com/images/cardsets/old_maid/lasso_louie.png"} {:twin :right, :state :covered, :name "arnie_angler", :description "Arnie Angler", :img "http://objinx.com/images/cardsets/old_maid/arnie_angler.png"} {:twin :left, :state :covered, :name "hayseed_hank", :description "Hayseed Hank", :img "http://objinx.com/images/cardsets/old_maid/hayseed_hank.png"} {:twin :right, :state :covered, :name "postman_pete", :description "Postman Pete", :img "http://objinx.com/images/cardsets/old_maid/postman_pete.png"} {:twin :left, :state :covered, :name "alto_annie", :description "Alto Annie", :img "http://objinx.com/images/cardsets/old_maid/alto_annie.png"} {:twin :left, :state :covered, :name "loggin_larry", :description "Loggin Larry", :img "http://objinx.com/images/cardsets/old_maid/loggin_larry.png"} {:twin :left, :state :covered, :name "postman_pete", :description "Postman Pete", :img "http://objinx.com/images/cardsets/old_maid/postman_pete.png"} {:twin :left, :state :covered, :name "heap_big_talk", :description "Heap Big Talk", :img "http://objinx.com/images/cardsets/old_maid/heap_big_talk.png"} {:twin :right, :state :covered, :name "billy_blaze", :description "Billy Blaze", :img "http://objinx.com/images/cardsets/old_maid/billy_blaze.png"} {:twin :right, :state :covered, :name "milkman_mo", :description "Milkman Mo", :img "http://objinx.com/images/cardsets/old_maid/milkman_mo.png"} {:twin :right, :state :covered, :name "clancy_clown", :description "Clancy Clown", :img "http://objinx.com/images/cardsets/old_maid/clancy_clown.png"} {:twin :right, :state :covered, :name "hayseed_hank", :description "Hayseed Hank", :img "http://objinx.com/images/cardsets/old_maid/hayseed_hank.png"} {:twin :left, :state :covered, :name "courageous_cop", :description "Courageous Cop", :img "http://objinx.com/images/cardsets/old_maid/courageous_cop.png"} {:twin :left, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "http://objinx.com/images/cardsets/old_maid/tumbledown_tess.png"} {:twin :right, :state :covered, :name "courageous_cop", :description "Courageous Cop", :img "http://objinx.com/images/cardsets/old_maid/courageous_cop.png"} {:twin :right, :state :covered, :name "heap_big_talk", :description "Heap Big Talk", :img "http://objinx.com/images/cardsets/old_maid/heap_big_talk.png"} {:twin :right, :state :covered, :name "loggin_larry", :description "Loggin Larry", :img "http://objinx.com/images/cardsets/old_maid/loggin_larry.png"} {:twin :right, :state :covered, :name "fifi_fluff", :description "Fifi Fluff", :img "http://objinx.com/images/cardsets/old_maid/fifi_fluff.png"} {:twin :left, :state :covered, :name "clancy_clown", :description "Clancy Clown", :img "http://objinx.com/images/cardsets/old_maid/clancy_clown.png"} {:twin :left, :state :covered, :name "greenthumb_gert", :description "Greenthumb Gert", :img "http://objinx.com/images/cardsets/old_maid/greenthumb_gert.png"} {:twin :left, :state :covered, :name "careless_carrie", :description "Careless Carrie", :img "http://objinx.com/images/cardsets/old_maid/careless_carrie.png"} {:twin :right, :state :covered, :name "slap_on_sam", :description "Slap On Sam", :img "http://objinx.com/images/cardsets/old_maid/slap_on_sam.png"} {:twin :left, :state :covered, :name "milkman_mo", :description "Milkman Mo", :img "http://objinx.com/images/cardsets/old_maid/milkman_mo.png"} {:twin :left, :state :covered, :name "slap_on_sam", :description "Slap On Sam", :img "http://objinx.com/images/cardsets/old_maid/slap_on_sam.png"} {:twin :left, :state :covered, :name "bagpipe_barney", :description "Bagpipe Barney", :img "http://objinx.com/images/cardsets/old_maid/bagpipe_barney.png"} {:twin :right, :state :covered, :name "freddie_falloff", :description "Freddie Falloff", :img "http://objinx.com/images/cardsets/old_maid/freddie_falloff.png"} {:twin :left, :state :covered, :name "freddie_falloff", :description "Freddie Falloff", :img "http://objinx.com/images/cardsets/old_maid/freddie_falloff.png"} {:twin :left, :state :covered, :name "arnie_angler", :description "Arnie Angler", :img "http://objinx.com/images/cardsets/old_maid/arnie_angler.png"}]}
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-board (match-game.core/load-deck "old_maid"))
{:dimensions [4 5], :matte "black", :slots [{:twin :right, :state :covered, :name "bagpipe_barney", :description "Bagpipe Barney", :img "old_maid/bagpipe_barney.png"} {:twin :left, :state :covered, :name "bagpipe_barney", :description "Bagpipe Barney", :img "old_maid/bagpipe_barney.png"} {:twin :right, :state :covered, :name "greenthumb_gert", :description "Greenthumb Gert", :img "old_maid/greenthumb_gert.png"} {:twin :left, :state :covered, :name "greenthumb_gert", :description "Greenthumb Gert", :img "old_maid/greenthumb_gert.png"} {:twin :right, :state :covered, :name "freddie_falloff", :description "Freddie Falloff", :img "old_maid/freddie_falloff.png"} {:twin :left, :state :covered, :name "clancy_clown", :description "Clancy Clown", :img "old_maid/clancy_clown.png"} {:twin :right, :state :covered, :name "diver_dan", :description "Diver Dan", :img "old_maid/diver_dan.png"} {:twin :left, :state :covered, :name "heap_big_talk", :description "Heap Big Talk", :img "old_maid/heap_big_talk.png"} {:twin :right, :state :covered, :name "heap_big_talk", :description "Heap Big Talk", :img "old_maid/heap_big_talk.png"} {:twin :right, :state :covered, :name "fifi_fluff", :description "Fifi Fluff", :img "old_maid/fifi_fluff.png"} {:twin :right, :state :covered, :name "milkman_mo", :description "Milkman Mo", :img "old_maid/milkman_mo.png"} {:twin :right, :state :covered, :name "courageous_cop", :description "Courageous Cop", :img "old_maid/courageous_cop.png"} {:twin :right, :state :covered, :name "baker_benny", :description "Baker Benny", :img "old_maid/baker_benny.png"} {:twin :left, :state :covered, :name "alto_annie", :description "Alto Annie", :img "old_maid/alto_annie.png"} {:twin :left, :state :covered, :name "hayseed_hank", :description "Hayseed Hank", :img "old_maid/hayseed_hank.png"} {:twin :right, :state :covered, :name "slap_on_sam", :description "Slap On Sam", :img "old_maid/slap_on_sam.png"} {:twin :right, :state :covered, :name "loggin_larry", :description "Loggin Larry", :img "old_maid/loggin_larry.png"} {:twin :left, :state :covered, :name "courageous_cop", :description "Courageous Cop", :img "old_maid/courageous_cop.png"} {:twin :right, :state :covered, :name "lasso_louie", :description "Lasso Louie", :img "old_maid/lasso_louie.png"} {:twin :right, :state :covered, :name "hayseed_hank", :description "Hayseed Hank", :img "old_maid/hayseed_hank.png"} {:twin :right, :state :covered, :name "careless_carrie", :description "Careless Carrie", :img "old_maid/careless_carrie.png"} {:twin :left, :state :covered, :name "lasso_louie", :description "Lasso Louie", :img "old_maid/lasso_louie.png"} {:twin :left, :state :covered, :name "freddie_falloff", :description "Freddie Falloff", :img "old_maid/freddie_falloff.png"} {:twin :left, :state :covered, :name "fifi_fluff", :description "Fifi Fluff", :img "old_maid/fifi_fluff.png"} {:twin :right, :state :covered, :name "alto_annie", :description "Alto Annie", :img "old_maid/alto_annie.png"} {:twin :right, :state :covered, :name "clancy_clown", :description "Clancy Clown", :img "old_maid/clancy_clown.png"} {:twin :left, :state :covered, :name "slap_on_sam", :description "Slap On Sam", :img "old_maid/slap_on_sam.png"} {:twin :left, :state :covered, :name "loggin_larry", :description "Loggin Larry", :img "old_maid/loggin_larry.png"} {:twin :left, :state :covered, :name "milkman_mo", :description "Milkman Mo", :img "old_maid/milkman_mo.png"} {:twin :right, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "old_maid/tumbledown_tess.png"} {:twin :left, :state :covered, :name "diver_dan", :description "Diver Dan", :img "old_maid/diver_dan.png"} {:twin :right, :state :covered, :name "arnie_angler", :description "Arnie Angler", :img "old_maid/arnie_angler.png"} {:twin :left, :state :covered, :name "careless_carrie", :description "Careless Carrie", :img "old_maid/careless_carrie.png"} {:twin :left, :state :covered, :name "billy_blaze", :description "Billy Blaze", :img "old_maid/billy_blaze.png"} {:twin :left, :state :covered, :name "postman_pete", :description "Postman Pete", :img "old_maid/postman_pete.png"} {:twin :right, :state :covered, :name "billy_blaze", :description "Billy Blaze", :img "old_maid/billy_blaze.png"} {:twin :left, :state :covered, :name "baker_benny", :description "Baker Benny", :img "old_maid/baker_benny.png"} {:twin :right, :state :covered, :name "postman_pete", :description "Postman Pete", :img "old_maid/postman_pete.png"} {:twin :left, :state :covered, :name "arnie_angler", :description "Arnie Angler", :img "old_maid/arnie_angler.png"} {:twin :left, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "old_maid/tumbledown_tess.png"}]}
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-board (match-game.core/load-deck "old_maid"))
{:dimensions [4 5], :matte "black", :slots [{:twin :left, :state :covered, :name "diver_dan", :description "Diver Dan", :img "/old_maid/diver_dan.png"} {:twin :left, :state :covered, :name "billy_blaze", :description "Billy Blaze", :img "/old_maid/billy_blaze.png"} {:twin :left, :state :covered, :name "careless_carrie", :description "Careless Carrie", :img "/old_maid/careless_carrie.png"} {:twin :right, :state :covered, :name "greenthumb_gert", :description "Greenthumb Gert", :img "/old_maid/greenthumb_gert.png"} {:twin :right, :state :covered, :name "billy_blaze", :description "Billy Blaze", :img "/old_maid/billy_blaze.png"} {:twin :right, :state :covered, :name "loggin_larry", :description "Loggin Larry", :img "/old_maid/loggin_larry.png"} {:twin :left, :state :covered, :name "baker_benny", :description "Baker Benny", :img "/old_maid/baker_benny.png"} {:twin :left, :state :covered, :name "bagpipe_barney", :description "Bagpipe Barney", :img "/old_maid/bagpipe_barney.png"} {:twin :right, :state :covered, :name "freddie_falloff", :description "Freddie Falloff", :img "/old_maid/freddie_falloff.png"} {:twin :right, :state :covered, :name "slap_on_sam", :description "Slap On Sam", :img "/old_maid/slap_on_sam.png"} {:twin :right, :state :covered, :name "hayseed_hank", :description "Hayseed Hank", :img "/old_maid/hayseed_hank.png"} {:twin :left, :state :covered, :name "courageous_cop", :description "Courageous Cop", :img "/old_maid/courageous_cop.png"} {:twin :left, :state :covered, :name "fifi_fluff", :description "Fifi Fluff", :img "/old_maid/fifi_fluff.png"} {:twin :left, :state :covered, :name "lasso_louie", :description "Lasso Louie", :img "/old_maid/lasso_louie.png"} {:twin :left, :state :covered, :name "loggin_larry", :description "Loggin Larry", :img "/old_maid/loggin_larry.png"} {:twin :left, :state :covered, :name "slap_on_sam", :description "Slap On Sam", :img "/old_maid/slap_on_sam.png"} {:twin :right, :state :covered, :name "fifi_fluff", :description "Fifi Fluff", :img "/old_maid/fifi_fluff.png"} {:twin :right, :state :covered, :name "alto_annie", :description "Alto Annie", :img "/old_maid/alto_annie.png"} {:twin :left, :state :covered, :name "milkman_mo", :description "Milkman Mo", :img "/old_maid/milkman_mo.png"} {:twin :right, :state :covered, :name "bagpipe_barney", :description "Bagpipe Barney", :img "/old_maid/bagpipe_barney.png"} {:twin :left, :state :covered, :name "postman_pete", :description "Postman Pete", :img "/old_maid/postman_pete.png"} {:twin :right, :state :covered, :name "postman_pete", :description "Postman Pete", :img "/old_maid/postman_pete.png"} {:twin :right, :state :covered, :name "milkman_mo", :description "Milkman Mo", :img "/old_maid/milkman_mo.png"} {:twin :left, :state :covered, :name "heap_big_talk", :description "Heap Big Talk", :img "/old_maid/heap_big_talk.png"} {:twin :left, :state :covered, :name "freddie_falloff", :description "Freddie Falloff", :img "/old_maid/freddie_falloff.png"} {:twin :left, :state :covered, :name "arnie_angler", :description "Arnie Angler", :img "/old_maid/arnie_angler.png"} {:twin :right, :state :covered, :name "arnie_angler", :description "Arnie Angler", :img "/old_maid/arnie_angler.png"} {:twin :left, :state :covered, :name "greenthumb_gert", :description "Greenthumb Gert", :img "/old_maid/greenthumb_gert.png"} {:twin :left, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "/old_maid/tumbledown_tess.png"} {:twin :right, :state :covered, :name "heap_big_talk", :description "Heap Big Talk", :img "/old_maid/heap_big_talk.png"} {:twin :right, :state :covered, :name "courageous_cop", :description "Courageous Cop", :img "/old_maid/courageous_cop.png"} {:twin :right, :state :covered, :name "clancy_clown", :description "Clancy Clown", :img "/old_maid/clancy_clown.png"} {:twin :left, :state :covered, :name "alto_annie", :description "Alto Annie", :img "/old_maid/alto_annie.png"} {:twin :right, :state :covered, :name "tumbledown_tess", :description "Tumbledown Tess", :img "/old_maid/tumbledown_tess.png"} {:twin :right, :state :covered, :name "lasso_louie", :description "Lasso Louie", :img "/old_maid/lasso_louie.png"} {:twin :right, :state :covered, :name "careless_carrie", :description "Careless Carrie", :img "/old_maid/careless_carrie.png"} {:twin :right, :state :covered, :name "baker_benny", :description "Baker Benny", :img "/old_maid/baker_benny.png"} {:twin :right, :state :covered, :name "diver_dan", :description "Diver Dan", :img "/old_maid/diver_dan.png"} {:twin :left, :state :covered, :name "hayseed_hank", :description "Hayseed Hank", :img "/old_maid/hayseed_hank.png"} {:twin :left, :state :covered, :name "clancy_clown", :description "Clancy Clown", :img "/old_maid/clancy_clown.png"}]}
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-board (match-game.core/load-deck "old_maid"))
ArityException Wrong number of args (1) passed to: core/init-board  clojure.lang.AFn.throwArity (AFn.java:429)
user> (require 'match-game.core :reload-all)
nil
user> (match-game.core/init-board (match-game.core/load-deck "old_maid"))
ArityException Wrong number of args (1) passed to: core/init-board  clojure.lang.AFn.throwArity (AFn.java:429)
user> (pprint (match-game.core/init-game "old_maid"))
{:players {:agoodno {:name "Andy"}, :cjgoodno {:name "Cal"}},
 :turn :cjgoodno,
 :board
 {:dimensions [4 5],
  :background-color "black",
  :slots
  [{:twin :right,
    :state :covered,
    :name "postman_pete",
    :description "Postman Pete",
    :img "/old_maid/postman_pete.png"}
   {:twin :left,
    :state :covered,
    :name "heap_big_talk",
    :description "Heap Big Talk",
    :img "/old_maid/heap_big_talk.png"}
   {:twin :left,
    :state :covered,
    :name "baker_benny",
    :description "Baker Benny",
    :img "/old_maid/baker_benny.png"}
   {:twin :left,
    :state :covered,
    :name "bagpipe_barney",
    :description "Bagpipe Barney",
    :img "/old_maid/bagpipe_barney.png"}
   {:twin :right,
    :state :covered,
    :name "alto_annie",
    :description "Alto Annie",
    :img "/old_maid/alto_annie.png"}
   {:twin :left,
    :state :covered,
    :name "slap_on_sam",
    :description "Slap On Sam",
    :img "/old_maid/slap_on_sam.png"}
   {:twin :right,
    :state :covered,
    :name "slap_on_sam",
    :description "Slap On Sam",
    :img "/old_maid/slap_on_sam.png"}
   {:twin :left,
    :state :covered,
    :name "arnie_angler",
    :description "Arnie Angler",
    :img "/old_maid/arnie_angler.png"}
   {:twin :right,
    :state :covered,
    :name "tumbledown_tess",
    :description "Tumbledown Tess",
    :img "/old_maid/tumbledown_tess.png"}
   {:twin :right,
    :state :covered,
    :name "loggin_larry",
    :description "Loggin Larry",
    :img "/old_maid/loggin_larry.png"}
   {:twin :left,
    :state :covered,
    :name "alto_annie",
    :description "Alto Annie",
    :img "/old_maid/alto_annie.png"}
   {:twin :right,
    :state :covered,
    :name "diver_dan",
    :description "Diver Dan",
    :img "/old_maid/diver_dan.png"}
   {:twin :right,
    :state :covered,
    :name "arnie_angler",
    :description "Arnie Angler",
    :img "/old_maid/arnie_angler.png"}
   {:twin :left,
    :state :covered,
    :name "fifi_fluff",
    :description "Fifi Fluff",
    :img "/old_maid/fifi_fluff.png"}
   {:twin :left,
    :state :covered,
    :name "careless_carrie",
    :description "Careless Carrie",
    :img "/old_maid/careless_carrie.png"}
   {:twin :left,
    :state :covered,
    :name "diver_dan",
    :description "Diver Dan",
    :img "/old_maid/diver_dan.png"}
   {:twin :right,
    :state :covered,
    :name "fifi_fluff",
    :description "Fifi Fluff",
    :img "/old_maid/fifi_fluff.png"}
   {:twin :right,
    :state :covered,
    :name "milkman_mo",
    :description "Milkman Mo",
    :img "/old_maid/milkman_mo.png"}
   {:twin :right,
    :state :covered,
    :name "heap_big_talk",
    :description "Heap Big Talk",
    :img "/old_maid/heap_big_talk.png"}
   {:twin :right,
    :state :covered,
    :name "baker_benny",
    :description "Baker Benny",
    :img "/old_maid/baker_benny.png"}
   {:twin :left,
    :state :covered,
    :name "billy_blaze",
    :description "Billy Blaze",
    :img "/old_maid/billy_blaze.png"}
   {:twin :right,
    :state :covered,
    :name "lasso_louie",
    :description "Lasso Louie",
    :img "/old_maid/lasso_louie.png"}
   {:twin :right,
    :state :covered,
    :name "courageous_cop",
    :description "Courageous Cop",
    :img "/old_maid/courageous_cop.png"}
   {:twin :left,
    :state :covered,
    :name "greenthumb_gert",
    :description "Greenthumb Gert",
    :img "/old_maid/greenthumb_gert.png"}
   {:twin :left,
    :state :covered,
    :name "loggin_larry",
    :description "Loggin Larry",
    :img "/old_maid/loggin_larry.png"}
   {:twin :left,
    :state :covered,
    :name "hayseed_hank",
    :description "Hayseed Hank",
    :img "/old_maid/hayseed_hank.png"}
   {:twin :left,
    :state :covered,
    :name "tumbledown_tess",
    :description "Tumbledown Tess",
    :img "/old_maid/tumbledown_tess.png"}
   {:twin :right,
    :state :covered,
    :name "bagpipe_barney",
    :description "Bagpipe Barney",
    :img "/old_maid/bagpipe_barney.png"}
   {:twin :left,
    :state :covered,
    :name "clancy_clown",
    :description "Clancy Clown",
    :img "/old_maid/clancy_clown.png"}
   {:twin :right,
    :state :covered,
    :name "hayseed_hank",
    :description "Hayseed Hank",
    :img "/old_maid/hayseed_hank.png"}
   {:twin :right,
    :state :covered,
    :name "billy_blaze",
    :description "Billy Blaze",
    :img "/old_maid/billy_blaze.png"}
   {:twin :right,
    :state :covered,
    :name "careless_carrie",
    :description "Careless Carrie",
    :img "/old_maid/careless_carrie.png"}
   {:twin :right,
    :state :covered,
    :name "freddie_falloff",
    :description "Freddie Falloff",
    :img "/old_maid/freddie_falloff.png"}
   {:twin :left,
    :state :covered,
    :name "milkman_mo",
    :description "Milkman Mo",
    :img "/old_maid/milkman_mo.png"}
   {:twin :right,
    :state :covered,
    :name "greenthumb_gert",
    :description "Greenthumb Gert",
    :img "/old_maid/greenthumb_gert.png"}
   {:twin :left,
    :state :covered,
    :name "freddie_falloff",
    :description "Freddie Falloff",
    :img "/old_maid/freddie_falloff.png"}
   {:twin :right,
    :state :covered,
    :name "clancy_clown",
    :description "Clancy Clown",
    :img "/old_maid/clancy_clown.png"}
   {:twin :left,
    :state :covered,
    :name "postman_pete",
    :description "Postman Pete",
    :img "/old_maid/postman_pete.png"}
   {:twin :left,
    :state :covered,
    :name "courageous_cop",
    :description "Courageous Cop",
    :img "/old_maid/courageous_cop.png"}
   {:twin :left,
    :state :covered,
    :name "lasso_louie",
    :description "Lasso Louie",
    :img "/old_maid/lasso_louie.png"}]}}
nil
user>



;; (defn action [player game f & args]
;;   (if (not= (:turn game) (:name player))
;;     (assoc game :message "It's not your turn")
;;     (apply f (cons (dissoc game :message) args))))

;; (defn process-action-result [res]
;;   (let [status (first res)
;;         value (second res)]
;;   (do
;;     (if (= status :failure)
;;       (merge {(:message value)))
;;       value))))

;; (defn play-card [player-name game idx]
;;   (->
;;    (validate-turn player-name game)
;;    (validate-flip-count ,,,)
;;    (flip-card ,,, idx)))

;; (defn validate-play [player-name game]
;;   (reducers/fold validate [(fn [] ((fn [x y] nil) player-name game))
;;                            (fn [] ((fn [x] "Something went wrong 2") game))]))

;;(into [] (map #(%) [ (fn [] nil) (fn [] nil)]))
;;(reducers/fold diddly [(fn [] nil) (fn [] nil) (fn [] "Something 3")])


(require 'match-game.core :reload-all)
(def game (atom (match-game.core/init-game "old_maid" "Andy" "Cal")))
(reset! game (match-game.core/play-card "Cal" @game 0))
(:message @game) ;; "It's not your turn"
(reset! game (match-game.core/flip-card @game 1))
(reset! game (match-game.core/flip-card @game 4))
(reset! game (match-game.core/play-card "Cal" @game 0))
(:message @game) ;; "Your turn is over"
(reset! game (match-game.core/play-card "Andy" @game 0))
(reset! game (match-game.core/end-turn @game))

;;match
(require 'match-game.core :reload-all)
(def game (atom (match-game.core/init-game "old_maid" "Andy" "Cal")))
(def cards (:cards (:board @game)))
(def postpetes (map first (filter #(= (second %) "postman_pete") (map-indexed vector (map :name cards)))))
(map #(reset! game (match-game.core/play-card "Andy" @game %)) postpetes)
(pprint @game)

;;random, probably non-match
(require 'match-game.core :reload-all)
(def game (atom (match-game.core/init-game "old_maid" "Andy" "Cal")))
(def cards (:cards (:board @game)))
(def pick-two (map first (take 2 (map-indexed vector (map :name cards)))))
(map #(reset! game (match-game.core/play-card "Andy" @game %)) pick-two)
(pprint @game)
