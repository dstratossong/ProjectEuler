(ns project-euler.problem-7-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-7 :refer :all]))

(deftest suite
  (testing "first prime"
    (is (= (first (solver 1)) 2)))
  (testing "fifth prime"
    (is (= (first (solver 5)) 11)))
  (testing "sixth"
    (is (= (first (solver 6)) 13)))
  (testing "ten thousand"
    (is (= (first (solver 10000)) 104729))))
