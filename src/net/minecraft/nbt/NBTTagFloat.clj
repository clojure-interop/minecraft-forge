(ns net.minecraft.nbt.NBTTagFloat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagFloat]))

(defn ->nbt-tag-float
  "Constructor.

  data - `float`"
  (^NBTTagFloat [^Float data]
    (new NBTTagFloat data)))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTTagFloat this]
    (-> this (.getByte))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagFloat`"
  (^net.minecraft.nbt.NBTTagFloat [^NBTTagFloat this]
    (-> this (.copy))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTTagFloat this]
    (-> this (.getShort))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagFloat this]
    (-> this (.toString))))

(defn get-long
  "returns: `long`"
  (^Long [^NBTTagFloat this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTTagFloat this]
    (-> this (.getInt))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagFloat this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagFloat this]
    (-> this (.hashCode))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTTagFloat this]
    (-> this (.getFloat))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTTagFloat this]
    (-> this (.getDouble))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagFloat this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

