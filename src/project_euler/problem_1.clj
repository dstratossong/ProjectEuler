(ns project-euler.problem-1)

(defn solver
  "Given an upper bound, return the sum of positive numbers divisible by 3 and 5 within the bound."
  [upper-bound]
  (reduce + (filter #(zero? (min (mod % 3)
                                 (mod % 5)))
                    (range upper-bound))))

(def problem
  "Find the sum of all the multiples of 3 or 5 below 1000.")

(def solution
  (solver 1000))
