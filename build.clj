(require 'cljs.build.api)

(cljs.build.api/build
  "src"
  {:main 'distinct-inputs.core
   :output-to "out/main.js"
   :install-deps true
   :foreign-libs [{:file "es6"
                   :module-type :es6}]
   :npm-deps     {:d3 "3.5.16"}})
