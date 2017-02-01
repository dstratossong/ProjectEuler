(ns project-euler.problem-5)

(defn solver
  "Returns least common multiple of all numbers within range (inclusive)"
  [m n]
  (letfn [(gcd [a b]
               (if (zero? b)
                 a
                 (recur b (mod a b))))
          (lcm [a b]
               (/ (* a b) (gcd a b)))]
    (reduce lcm (range m (inc n)))))


(def problem
  "Find the smallest positive number that is evenly divisible by all of the numbers from 1 to 20")

(defn solution
  []
  (solver 1 20))
