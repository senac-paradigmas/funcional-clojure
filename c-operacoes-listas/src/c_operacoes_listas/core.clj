(ns c-operacoes-listas.core
  (:gen-class))

; contador
(defn contador [lista] 
  (if (empty? lista)
    0
    (inc (contador (rest lista)))
  )
)

(defn -main
  "Operações listas"
  [& args]
  (println "\n---- Operações com listas ----")
  
  (def a [1 2 3 4]) ; listas no clojure são imutáveis
  (println (conj a 45 56)) ;; operações com listas geram novas listas

  ; uso comum de listas
  ; gero uma função que trabalha o primeiro argumento
  ; segundo argumento é o resto da lista que passo como argumento recursivo
  (println "Primeiro item:")
  (println (first a))
  (println "Resto da lista:")
  (println (rest a))
  (println "Exemplo de função: Contator de itens")
  (println (contador a))

  ; List Comprehension
  (println "\n---- LIST COMPREHENSION ----")
  ; Geração de Listas
  ; o for do Clojure é usado para geração de listas
  ; primeira parte, definição da regra de cada elemento
  ; segundo parte: elemento
  ; https://blog.jeaye.com/2016/07/27/clojure-for/
  ; Exemplo 1
  (println 
    (for 
      [ x (range 3)
        y (range 3)
        :when (not= x y)
      ] ; regra de formação de cada elemento
      [x y] ; formato do elemento
    )
  )

  ; Exemplo 2 - baralho
  (println 
    (for 
      [c [:2 :3 :4 :5 :6 :7 :8 :9 :10 :J :Q :K :A] s [:♠ :♥ :♣ :♦]]
      [c s]
    )
  )
)
