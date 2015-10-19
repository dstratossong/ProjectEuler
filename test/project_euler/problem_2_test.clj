(ns project-euler.problem-2-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-2 :refer :all]))

(deftest suite
  (testing "zero not included"
    (is (= (solver 0) 0)))
  (testing "multiples under 100"
    (is (= (solver 100) 44)))
  (testing "inclusivity"
    (is (= (solver 89) 44))))
