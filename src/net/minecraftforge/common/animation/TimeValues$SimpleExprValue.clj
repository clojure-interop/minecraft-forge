(ns net.minecraftforge.common.animation.TimeValues$SimpleExprValue
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$SimpleExprValue]))

(defn ->simple-expr-value
  "Constructor.

  operators - `java.lang.String`
  args - `com.google.common.collect.ImmutableList`"
  (^TimeValues$SimpleExprValue [^java.lang.String operators ^com.google.common.collect.ImmutableList args]
    (new TimeValues$SimpleExprValue operators args)))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^TimeValues$SimpleExprValue this ^Float input]
    (-> this (.apply input))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TimeValues$SimpleExprValue this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TimeValues$SimpleExprValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

