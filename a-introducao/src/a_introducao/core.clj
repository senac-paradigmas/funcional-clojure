(ns a-introducao.core
  (:gen-class))

;; Para rodar este código 
;; lein run
(defn -main
  "Introdução ao Clojure"
  [& args]
  (println "\n---- Expressões ----")
  ; Notação infixa (nome-funcao arg1 arg 2 ...)
  ; trate tudo como lista
  (println (+ 1 3 23 234))
  (println (/ 100 2 5)) ; primeiro argumento é numerado e os outros os numeradores

  ; booleanos
  ; a mesma lógica se aplica aos booleanos
  (println "\n---- Booleanos ----")
  (println (= 1 2 2)) ; este é um operador de igualdade
  (println (< 10 24 77))

  ; strings
  ; função str converte os outros tipos para string ou concatena
  (println "\n---- Strings ----")
  (println (str 13 " é a idade de " "Enzo"))
  

  ; definição de variavel
  (println "\n---- Variável ----")
  (def a 1243)
  (println (str a " é o código de entrada"))
  ; as variávels são imutáveis
  (def a (+ a 1)) ; mas se pode redefinir os valores
  (println (str a " é o novo código de entrada"))
)