(ns project-euler.problem-6)

(defn solver
  "Returns the difference between sum-of-squares and square-of-sum of first n integers."
  [n]
  (letfn [(sum-of-squares [n]
                          (* (/ 1 6)
                             n
                             (+ n 1)
                             (+ (* 2 n) 1)))
          (square-of-sum [n]
                         (let [sum (* (/ 1 2)
                                      n
                                      (+ n 1))]
                           (* sum sum)))]
    (- (square-of-sum n)
       (sum-of-squares n))))


(def problem
  "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.")

(def solution
  (solver 100))
