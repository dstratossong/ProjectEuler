;; Author: Arshan Alam
;; Date Completed: 20151103
;;
;; Project Euler
;; Problem 7
;;
;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
;;
;; What is the 10 001st prime number?

#lang racket

;; Get the 'num-th' prime number from the set of all prime numbers
;; num : Positive Integer >= 1
(define (prime num)
  (local
    [
    ;; Get the square root of n
     (define (floor-sqrt n) (inexact->exact (floor (sqrt n))))

     ;; A predicate function to determine
     ;; if y is a factor of x
     ;; x : Integer
     ;; y : Integer
     (define (factor? x y) (equal? 0 (remainder x y)))

     ;; Get a list of consecutive integers from 1 to n
     ;; n : positive Integer
     (define (list-to-n n)
       (local
         [(define (n-to-one x)
            (if(<= x 1) (cons 1 empty)
               (cons x (n-to-one (- x 1))))) ]
         (reverse (n-to-one n))))

     ;; A list of possible factor to the given integer n excluding 1
     ;;
     ;; This list contains 2 and all odd numbers from 2 to floor-sqrt-n
     ;;
     ;; The reason for this is, all prime numbers greater than 2 are odd
     ;; and 2 is prime
     (define (possible-factors n)
       (if (<= n 2)
           empty
           (cons 2 (filter odd? (rest (list-to-n (floor-sqrt n)))))))

     ;; Determine if 'x' is a prime number
     ;; x : Positive Integer
     (define (prime? x)
       (equal? 0 (length
                  (filter
                   (lambda (y) (factor? x y))
                   (possible-factors x)))))

     ;; Generate a list of the first 'n' prime numbers
     ;; n : positive Integer >= 1
     (define (prime-list n)
       (local [(define (make-prime-list n iterator list)
                 (cond
                   [(equal? n 1) (cons 2 empty)]
                   [(equal? (length list) n) list]
                   [(prime? iterator)
                    (make-prime-list n (+ 1 iterator) (cons iterator list))]
                   [else (make-prime-list n (+ 1 iterator) list)]))
               ;; The iterator for make-prime-list starts at 2
               ;; because the first prime number is 2
               ] (reverse (make-prime-list n 2 empty))))
     ] (last (prime-list num))))