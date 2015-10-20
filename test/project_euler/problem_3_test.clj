(ns project-euler.problem-3-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-3 :refer :all]))

(deftest suite
  (testing "public"
    (is (= (first (solver 13195)) 29)))
  (testing "prime"
    (is (= (first (solver 13)) 13)))
  (testing "composite"
    (is (= (first (solver 8)) 2))))
