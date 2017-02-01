(ns project-euler.problem-7)

(defn solver
  "Returns the first n primes."
  [n]
  (letfn [(multof [m n] (= (mod m n) 0))]
    (loop [primes [2]
           current 3
           counter 1]
      (if (= counter n)
        primes
        (if (some (partial multof current) primes)
          (recur primes
                 (+ current 2)
                 counter)
          (recur (cons current primes)
                 (+ current 2)
                 (inc counter)))))))

(def problem
  "Find the 10001st prime.")

(defn solution
  []
  (first (solver 10001)))
