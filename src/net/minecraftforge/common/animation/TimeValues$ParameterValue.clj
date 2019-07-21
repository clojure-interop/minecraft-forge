(ns net.minecraftforge.common.animation.TimeValues$ParameterValue
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$ParameterValue]))

(defn ->parameter-value
  "Constructor.

  parameter-name - `java.lang.String`
  value-resolver - `com.google.common.base.Function`"
  (^TimeValues$ParameterValue [^java.lang.String parameter-name ^com.google.common.base.Function value-resolver]
    (new TimeValues$ParameterValue parameter-name value-resolver)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TimeValues$ParameterValue this]
    (-> this (.getName))))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^TimeValues$ParameterValue this ^Float input]
    (-> this (.apply input))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TimeValues$ParameterValue this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TimeValues$ParameterValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

