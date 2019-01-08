(ns deep-learning-from-scratch.ch01.sin-graph
  (:require [clojure.core.matrix :as m]
            [incanter [charts :as charts] [core :as incanter]]))

(defn -main []
  (let [x (m/array (range 0 6 0.1))
        y (m/sin x)]
    (doto (charts/xy-plot x y)
      incanter/view)))
