(ns net.minecraft.nbt.NBTTagByteArray
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagByteArray]))

(defn ->nbt-tag-byte-array
  "Constructor.

  data - `byte[]`"
  (^NBTTagByteArray [data]
    (new NBTTagByteArray data)))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagByteArray this]
    (-> this (.getId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagByteArray this]
    (-> this (.toString))))

(defn copy
  "returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^NBTTagByteArray this]
    (-> this (.copy))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagByteArray this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagByteArray this]
    (-> this (.hashCode))))

(defn get-byte-array
  "returns: `byte[]`"
  ([^NBTTagByteArray this]
    (-> this (.getByteArray))))

