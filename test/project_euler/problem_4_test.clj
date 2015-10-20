(ns project-euler.problem-4-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-4 :refer :all]))

(deftest suite
  (testing "public test"
    (is (apply max (solver 10 100)) 9009)))
