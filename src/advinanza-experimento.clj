(ns tomatuturno.adivinanza-experimento
  (:require [clojure.core.async :as async :refer :all]))

(comment
  (ns-publics (find-ns 'core.async)))
(comment (require '[clojure.tools.deps.alpha.extensions.deps :refer [add-lib]]))

(defn generar-numero [] (rand-int 500))

(defn arbitro
  "El arbitro determina el conjunto de números sobre el que se realiza la adivinanza y elige el número ganador.
   Devuelve como output true si el número coincide o una pista, mayor o menor, según corresponda."
  []
  (letfn [(consultar [numAdv numReal]
            (cond
              (= numAdv numReal) true
              (< numAdv numReal) :menor
              (> numAdv numReal) :mayor))]
    (let [num-act (generar-numero)
          num-recibidos (async/chan 5)]
      
      )))

(def jugador1 (atom 0))
(def jugador2 (atom 0))
(def jugador3 (atom 0))
(def jugador4 (atom 0))
(def jugador5 (atom 0))

