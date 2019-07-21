(ns net.minecraft.nbt.NBTTagByte
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagByte]))

(defn ->nbt-tag-byte
  "Constructor.

  data - `byte`"
  (^NBTTagByte [^Byte data]
    (new NBTTagByte data)))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTTagByte this]
    (-> this (.getByte))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagByte`"
  (^net.minecraft.nbt.NBTTagByte [^NBTTagByte this]
    (-> this (.copy))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTTagByte this]
    (-> this (.getShort))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagByte this]
    (-> this (.toString))))

(defn get-long
  "returns: `long`"
  (^Long [^NBTTagByte this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTTagByte this]
    (-> this (.getInt))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagByte this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagByte this]
    (-> this (.hashCode))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTTagByte this]
    (-> this (.getFloat))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTTagByte this]
    (-> this (.getDouble))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagByte this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

