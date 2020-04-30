(ns deep-learning-from-scratch.ch03.step-function
  (:require [clojure.core.matrix :as m]
            [incanter.charts :as charts]
            [incanter.core :as incanter]))

(defn step-function [x]
  (m/gt x 0))

(defn -main []
  (m/set-current-implementation :clatrix)
  (let [x (m/array (range -5.0 5.0 0.1))
        y (step-function x)]
    (doto (charts/xy-plot x y)
      incanter/view)))
