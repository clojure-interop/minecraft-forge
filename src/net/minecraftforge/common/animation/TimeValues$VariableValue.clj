(ns net.minecraftforge.common.animation.TimeValues$VariableValue
  "Simple value holder."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$VariableValue]))

(defn ->variable-value
  "Constructor.

  initial-value - `float`"
  (^TimeValues$VariableValue [^Float initial-value]
    (new TimeValues$VariableValue initial-value)))

(defn set-value
  "new-value - `float`"
  ([^TimeValues$VariableValue this ^Float new-value]
    (-> this (.setValue new-value))))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^TimeValues$VariableValue this ^Float input]
    (-> this (.apply input))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TimeValues$VariableValue this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TimeValues$VariableValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

