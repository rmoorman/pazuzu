(defproject pazuzu-cli "0.1.0-SNAPSHOT"
  :description "Pazuzu, the Docker Maker CLI"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [pazuzu-core "0.1.0"]
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot pazuzu-cli.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:plugins      [[lein-midje "3.2"]]
                   :dependencies [[midje "1.8.3"]
                                  [org.clojure/tools.namespace "0.2.11"]]}})


