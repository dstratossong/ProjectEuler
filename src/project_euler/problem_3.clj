(ns project-euler.problem-3)

(defn solver
  "Returns a list of all factors of a given number"
  [number]
  (letfn [(multof [m n]
                  (= (mod m n) 0))]
    (loop [remaining number
           current 2
           factors []]
      (if (= remaining 1)
        factors
        (if (multof remaining current)
          (recur (/ remaining current)
                 current
                 (cons current factors))
          (recur remaining
                 (inc current)
                 factors))))))

(solver 80)

(def problem
  "Find the largest prime factor of 600851475143.")

(def solution
  (first (solver 600851475143)))
