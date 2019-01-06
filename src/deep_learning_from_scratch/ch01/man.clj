(ns deep-learning-from-scratch.ch01.man
  (:require [clojure.spec.alpha :as s]))

(s/def ::name string?)
(s/def ::man (s/keys :req [::name]))

(s/fdef hello
  :args (s/cat :man ::man))

(defn hello [man]
  (println (str "Hello " (::name man) "!")))

(s/fdef goodbye
  :args (s/cat :man ::man))

(defn goodbye [man]
  (println (str "Good-bye " (::name man) "!")))
