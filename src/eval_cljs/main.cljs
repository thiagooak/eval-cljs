(ns eval-cljs.main
  (:require [sci.core :as sci]))

(defn evaluate
      "Evaluates the input string and returns a Vector where the first item is the output of the evaluation
       and the second items is a String that concatenates the output of any calls to a print function"
      [input]
  (let [print-output (atom [])
        print-function #(reset! print-output (conj @print-output %))
        eval-output (sci/with-bindings {sci/print-fn print-function} (sci/eval-string input))]
    (clj->js [eval-output @print-output])))
