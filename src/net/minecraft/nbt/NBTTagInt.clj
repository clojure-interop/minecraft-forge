(ns net.minecraft.nbt.NBTTagInt
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagInt]))

(defn ->nbt-tag-int
  "Constructor.

  data - `int`"
  (^NBTTagInt [^Integer data]
    (new NBTTagInt data)))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTTagInt this]
    (-> this (.getByte))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagInt`"
  (^net.minecraft.nbt.NBTTagInt [^NBTTagInt this]
    (-> this (.copy))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTTagInt this]
    (-> this (.getShort))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagInt this]
    (-> this (.toString))))

(defn get-long
  "returns: `long`"
  (^Long [^NBTTagInt this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTTagInt this]
    (-> this (.getInt))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagInt this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagInt this]
    (-> this (.hashCode))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTTagInt this]
    (-> this (.getFloat))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTTagInt this]
    (-> this (.getDouble))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagInt this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

