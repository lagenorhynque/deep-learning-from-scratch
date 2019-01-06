(ns user
  (:require [clojure.repl :refer :all]
            [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as stest]
            [clojure.tools.namespace.repl]))

(defn refresh [& options]
  (let [result (apply clojure.tools.namespace.repl/refresh options)]
    (stest/instrument)
    result))
