(ns net.minecraft.world.storage.loot.RandomValueRange
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot RandomValueRange]))

(defn ->random-value-range
  "Constructor.

  min-in - `float`
  max-in - `float`"
  (^RandomValueRange [^Float min-in ^Float max-in]
    (new RandomValueRange min-in max-in))
  (^RandomValueRange [^Float value]
    (new RandomValueRange value)))

(defn get-min
  "returns: `float`"
  (^Float [^RandomValueRange this]
    (-> this (.getMin))))

(defn get-max
  "returns: `float`"
  (^Float [^RandomValueRange this]
    (-> this (.getMax))))

(defn generate-int
  "rand - `java.util.Random`

  returns: `int`"
  (^Integer [^RandomValueRange this ^java.util.Random rand]
    (-> this (.generateInt rand))))

(defn generate-float
  "rand - `java.util.Random`

  returns: `float`"
  (^Float [^RandomValueRange this ^java.util.Random rand]
    (-> this (.generateFloat rand))))

(defn in-range?
  "value - `int`

  returns: `boolean`"
  (^Boolean [^RandomValueRange this ^Integer value]
    (-> this (.isInRange value))))

