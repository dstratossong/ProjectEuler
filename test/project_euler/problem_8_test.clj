(ns project-euler.problem-8-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-8 :refer :all]))

(deftest suite
  (testing "increasing"
    (is (= (solver 3 "12345") 60)))
  (testing "decreasing"
    (is (= (solver 3 "54321") 60)))
  (testing "long"
    (is (= (solver 3 "123") 6)))
  (testing "one"
    (is (= (solver 5 "11111") 1)))
  (testing "zero"
    (is (= (solver 3 "12045") 0)))
  (testing "given"
    (is (= (solver 4 thousand-digit-number-str) 5832))))
