(ns net.minecraft.nbt.NBTTagShort
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagShort]))

(defn ->nbt-tag-short
  "Constructor.

  data - `short`"
  (^NBTTagShort [^Short data]
    (new NBTTagShort data))
  (^NBTTagShort []
    (new NBTTagShort )))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTTagShort this]
    (-> this (.getByte))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagShort`"
  (^net.minecraft.nbt.NBTTagShort [^NBTTagShort this]
    (-> this (.copy))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTTagShort this]
    (-> this (.getShort))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagShort this]
    (-> this (.toString))))

(defn get-long
  "returns: `long`"
  (^Long [^NBTTagShort this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTTagShort this]
    (-> this (.getInt))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagShort this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagShort this]
    (-> this (.hashCode))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTTagShort this]
    (-> this (.getFloat))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTTagShort this]
    (-> this (.getDouble))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagShort this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

