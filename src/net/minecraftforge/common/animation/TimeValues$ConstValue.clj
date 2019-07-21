(ns net.minecraftforge.common.animation.TimeValues$ConstValue
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$ConstValue]))

(defn ->const-value
  "Constructor.

  output - `float`"
  (^TimeValues$ConstValue [^Float output]
    (new TimeValues$ConstValue output)))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^TimeValues$ConstValue this ^Float input]
    (-> this (.apply input))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TimeValues$ConstValue this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TimeValues$ConstValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

