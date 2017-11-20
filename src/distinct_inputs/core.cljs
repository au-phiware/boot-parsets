(ns distinct-inputs.core
  (:require [d3]
            [circle :refer [circle]]))

(-> d3
    (.select "body")
    (.append "svg")
    (.attr "width" 200)
    (.attr "height" 200)
    (.call circle "steelblue"))
