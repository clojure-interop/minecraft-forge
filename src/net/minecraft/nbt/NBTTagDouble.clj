(ns net.minecraft.nbt.NBTTagDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagDouble]))

(defn ->nbt-tag-double
  "Constructor.

  data - `double`"
  (^NBTTagDouble [^Double data]
    (new NBTTagDouble data)))

(defn get-byte
  "returns: `byte`"
  (^Byte [^NBTTagDouble this]
    (-> this (.getByte))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagDouble`"
  (^net.minecraft.nbt.NBTTagDouble [^NBTTagDouble this]
    (-> this (.copy))))

(defn get-short
  "returns: `short`"
  (^Short [^NBTTagDouble this]
    (-> this (.getShort))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagDouble this]
    (-> this (.toString))))

(defn get-long
  "returns: `long`"
  (^Long [^NBTTagDouble this]
    (-> this (.getLong))))

(defn get-int
  "returns: `int`"
  (^Integer [^NBTTagDouble this]
    (-> this (.getInt))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagDouble this]
    (-> this (.getId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagDouble this]
    (-> this (.hashCode))))

(defn get-float
  "returns: `float`"
  (^Float [^NBTTagDouble this]
    (-> this (.getFloat))))

(defn get-double
  "returns: `double`"
  (^Double [^NBTTagDouble this]
    (-> this (.getDouble))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagDouble this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

