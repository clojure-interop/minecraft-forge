(ns net.minecraft.block.properties.PropertyHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.properties PropertyHelper]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^PropertyHelper this]
    (-> this (.getName))))

(defn get-value-class
  "returns: `java.lang.Class<T>`"
  (^java.lang.Class [^PropertyHelper this]
    (-> this (.getValueClass))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PropertyHelper this]
    (-> this (.toString))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PropertyHelper this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PropertyHelper this]
    (-> this (.hashCode))))

