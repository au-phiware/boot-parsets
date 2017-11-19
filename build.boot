(set-env!
  :dependencies '[[org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.9.946" :scope "test"]
                  [adzerk/boot-cljs "2.1.3" :scope "test"]

                  #_[cljsjs/d3 "3.5.16-0"]
                  ]

  :resource-paths #{"resources"}
  :source-paths #{"src"})

(require
  '[adzerk.boot-cljs :refer [cljs]]
  '[clojure.set :as set]
  '[clojure.java.io :as io])

(task-options! cljs
               {:compiler-options
                {:main 'boot-parsets.core
                 :install-deps true
                 :foreign-libs [{:file "es6"
                                :module-type :es6}]
                 :npm-deps     {:d3 "3.5.16"
                                }
                 :optimizations        :none
                 :pretty-print         true
                 :source-map           true
                 :source-map-timestamp true}})

#_(deftask
  npm-install
  "Download node modules."
  []
  (comp
    (npm :managed true)
    (sift :include [#"^node_modules/"])
    (target :no-clean true :dir #{"."})))

