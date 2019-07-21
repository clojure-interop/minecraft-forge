(ns net.minecraft.nbt.NBTTagIntArray
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagIntArray]))

(defn ->nbt-tag-int-array
  "Constructor.

  p-i-45132-1 - `int[]`"
  (^NBTTagIntArray [p-i-45132-1]
    (new NBTTagIntArray p-i-45132-1)))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagIntArray this]
    (-> this (.getId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagIntArray this]
    (-> this (.toString))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagIntArray`"
  (^net.minecraft.nbt.NBTTagIntArray [^NBTTagIntArray this]
    (-> this (.copy))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagIntArray this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagIntArray this]
    (-> this (.hashCode))))

(defn get-int-array
  "returns: `int[]`"
  ([^NBTTagIntArray this]
    (-> this (.getIntArray))))

