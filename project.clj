(defproject deep-learning-from-scratch "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[clatrix "0.5.0"]
                 [incanter "1.9.3"]
                 [net.mikera/core.matrix "0.62.0"]
                 [org.clojure/clojure "1.10.1"]]
  :profiles
  {:dev {:source-paths ["dev/src"]
         :dependencies [[orchestra "2019.02.06-1"]
                        [org.clojure/tools.namespace "1.0.0"]]}})
