(ns project-euler.problem-4)

(defn solver
  "Returns a list of all palindromes within the product set formed by the range."
  [m n]
  (letfn [(palindrome? [x]
                       (= (reverse (str x))
                          (seq (str x))))]
    (filter palindrome?
            (for [a (range m n)
                  b (range m n)]
              (* a b)))))

(def problem
  "Find the largest palindrome made from the product of two 3-digit numbers.")

(defn solution
  []
  (apply max (solver 100 1000)))
