(ns project-euler.problem-5-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-5 :refer :all]))

(deftest suite
  (testing "public"
    (is (= (solver 1 10) 2520)))
  (testing "lower bound"
    (is (= (solver 5 10) 2520))))
