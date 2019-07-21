(ns net.minecraft.nbt.NBTBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTBase]))

(defn ->nbt-base
  "Constructor."
  (^NBTBase []
    (new NBTBase )))

(def *-nbt-types
  "Static Constant.

  type: java.lang.String[]"
  NBTBase/NBT_TYPES)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTBase this]
    (-> this (.toString))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTBase this]
    (-> this (.getId))))

(defn copy
  "returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^NBTBase this]
    (-> this (.copy))))

(defn has-no-tags?
  "returns: `boolean`"
  (^Boolean [^NBTBase this]
    (-> this (.hasNoTags))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTBase this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTBase this]
    (-> this (.hashCode))))

