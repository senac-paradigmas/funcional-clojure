(ns e-pattern-matching.core
  (:gen-class)
  (:require [clojure.core.match :refer [match]])
  )

(defn -main
  [& args]

  ; Pattern Matching
  (println "------- Pattern Matching -------")
  (doseq [n (range 1 10)]
    (println
      (match [(mod n 3) (mod n 5)]
        [0 0] "FizzBuzz"
        [0 _] "Fizz"
        [_ 0] "Buzz"
        :else n)))
  
  ; Binding
  (println "------- Binding -------")
  (def tabuleiro [[:x :o :x] [:x :o :x] [:x :o :x]])
  (defn central [ [_ [_ c _]_]  ] c)
  (println (central tabuleiro))
)
