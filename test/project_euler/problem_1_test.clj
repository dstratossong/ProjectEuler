(ns project-euler.problem-1-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-1 :refer :all]))

(deftest suite
  (testing "zero not included"
    (is (= (multiples-of-3-and-5 0) 0)))
  (testing "multiples under 10"
    (is (= (multiples-of-3-and-5 10) 23))))
