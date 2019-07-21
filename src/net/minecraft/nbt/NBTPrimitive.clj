(ns net.minecraft.nbt.NBTPrimitive
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTPrimitive]))

(defn ->nbt-primitive
  "Constructor."
  (^NBTPrimitive []
    (new NBTPrimitive )))

(defn get-long
  "returns: `long`"
  (^Long [^NBTPrimitive this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTPrimitive this]
    (-> this (.getInt))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTPrimitive this]
    (-> this (.getShort))))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTPrimitive this]
    (-> this (.getByte))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTPrimitive this]
    (-> this (.getDouble))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTPrimitive this]
    (-> this (.getFloat))))

