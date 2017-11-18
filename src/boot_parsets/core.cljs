(ns
  boot-parsets.core
  (:require [d3]
            [d3.parsets])
  (:import (goog.string format)))

(let [w 400
      h 300
      svg (-> d3
              (.select "body")
              (.append "svg")
              (.attr "width" w)
              (.attr "height" h)
              (.datum []))
      chart (-> d3 .parsets
                (.width w)
                (.height h))
      svg (-> svg
              (.call chart))])