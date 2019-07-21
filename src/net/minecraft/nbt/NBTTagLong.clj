(ns net.minecraft.nbt.NBTTagLong
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagLong]))

(defn ->nbt-tag-long
  "Constructor.

  data - `long`"
  (^NBTTagLong [^Long data]
    (new NBTTagLong data)))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTTagLong this]
    (-> this (.getByte))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagLong`"
  (^net.minecraft.nbt.NBTTagLong [^NBTTagLong this]
    (-> this (.copy))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTTagLong this]
    (-> this (.getShort))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagLong this]
    (-> this (.toString))))

(defn get-long
  "returns: `long`"
  (^Long [^NBTTagLong this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTTagLong this]
    (-> this (.getInt))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagLong this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagLong this]
    (-> this (.hashCode))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTTagLong this]
    (-> this (.getFloat))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTTagLong this]
    (-> this (.getDouble))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagLong this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

