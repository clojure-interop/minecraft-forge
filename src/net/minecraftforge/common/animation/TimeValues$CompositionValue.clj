(ns net.minecraftforge.common.animation.TimeValues$CompositionValue
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$CompositionValue]))

(defn ->composition-value
  "Constructor.

  g - `net.minecraftforge.common.animation.ITimeValue`
  f - `net.minecraftforge.common.animation.ITimeValue`"
  (^TimeValues$CompositionValue [^net.minecraftforge.common.animation.ITimeValue g ^net.minecraftforge.common.animation.ITimeValue f]
    (new TimeValues$CompositionValue g f)))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^TimeValues$CompositionValue this ^Float input]
    (-> this (.apply input))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TimeValues$CompositionValue this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TimeValues$CompositionValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

