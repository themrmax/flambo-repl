(defproject flambo-test "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [yieldbot/flambo "0.7.1"]]
  :profiles {:provided
              {:dependencies
               [[org.apache.spark/spark-core_2.10 "1.5.0"]]}
             :dev
               {:aot [flambo-test.core]}})
