(defproject juxt/crux-decorators "0.1.0"
  :description "Crux Decorators"
  :url "https://github.com/crux-labs/crux-decorators"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [juxt/crux-core "19.12-1.6.1-alpha"]
                 [juxt/crux-rocksdb "19.12-1.6.1-alpha"]]
  :profiles {:dev {:dependencies [[ch.qos.logback/logback-classic "1.2.3"]]}})
