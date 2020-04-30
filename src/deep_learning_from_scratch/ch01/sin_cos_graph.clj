(ns deep-learning-from-scratch.ch01.sin-cos-graph
  (:require [clojure.core.matrix :as m]
            [incanter.charts :as charts]
            [incanter.core :as incanter]))

(defn -main []
  (m/set-current-implementation :clatrix)
  (let [x (m/array (range 0 6 0.1))
        y1 (m/sin x)
        y2 (m/cos x)]
    (doto (charts/xy-plot x y1
                          :series-label "sin"
                          :x-label "x"
                          :y-label "y"
                          :title "sin & cos"
                          :legend true)
      (charts/add-lines x y2
                        :series-label "cos")
      (charts/set-stroke :dataset 1
                         :dash 5)
      incanter/view)))
