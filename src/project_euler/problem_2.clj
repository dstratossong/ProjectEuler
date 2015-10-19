(ns project-euler.problem-2)

(defn solver
  "Given an upper bound, return the sum of Fibonacci numbers that are even within the bound (inclusive)."
  [upper-bound]
  (letfn [(fib [a b] (cons a (lazy-seq (fib b (+ a b)))))]
    (->> (fib 1 2)
         (take-while #(<= % upper-bound))
         (filter even?)
         (reduce +))))

(def problem
  "Find the sum of even-valued Fibonacci numbers that do not exceed four million.")

(def solution
  (solver 4000000))
