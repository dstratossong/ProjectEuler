(ns project-euler.problem-6-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-6 :refer :all]))

(deftest suite
  (testing "public"
    (is (= (solver 10) 2640)))
  (testing "small"
    (is (= (solver 1) 0)))
  (testing "two"
    (is (= (solver 2) 4))))
