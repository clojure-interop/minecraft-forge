(ns net.minecraft.nbt.NBTTagString
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagString]))

(defn ->nbt-tag-string
  "Constructor.

  data - `java.lang.String`"
  (^NBTTagString [^java.lang.String data]
    (new NBTTagString data))
  (^NBTTagString []
    (new NBTTagString )))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagString this]
    (-> this (.getId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagString this]
    (-> this (.toString))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagString`"
  (^net.minecraft.nbt.NBTTagString [^NBTTagString this]
    (-> this (.copy))))

(defn has-no-tags?
  "returns: `boolean`"
  (^Boolean [^NBTTagString this]
    (-> this (.hasNoTags))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagString this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagString this]
    (-> this (.hashCode))))

(defn get-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagString this]
    (-> this (.getString))))

