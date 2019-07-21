(ns net.minecraft.nbt.NBTTagCompound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagCompound]))

(defn ->nbt-tag-compound
  "Constructor."
  (^NBTTagCompound []
    (new NBTTagCompound )))

(defn set-string
  "key - `java.lang.String`
  value - `java.lang.String`"
  ([^NBTTagCompound this ^java.lang.String key ^java.lang.String value]
    (-> this (.setString key value))))

(defn get-byte
  "key - `java.lang.String`

  returns: `byte`"
  (^Byte [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getByte key))))

(defn get-int-array
  "key - `java.lang.String`

  returns: `int[]`"
  ([^NBTTagCompound this ^java.lang.String key]
    (-> this (.getIntArray key))))

(defn get-tag-id
  "key - `java.lang.String`

  returns: `byte`"
  (^Byte [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getTagId key))))

(defn set-boolean
  "key - `java.lang.String`
  value - `boolean`"
  ([^NBTTagCompound this ^java.lang.String key ^Boolean value]
    (-> this (.setBoolean key value))))

(defn get-tag
  "key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getTag key))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^NBTTagCompound this]
    (-> this (.copy))))

(defn get-string
  "key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getString key))))

(defn get-short
  "key - `java.lang.String`

  returns: `short`"
  (^Short [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getShort key))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagCompound this]
    (-> this (.toString))))

(defn has-unique-id?
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NBTTagCompound this ^java.lang.String key]
    (-> this (.hasUniqueId key))))

(defn has-no-tags?
  "returns: `boolean`"
  (^Boolean [^NBTTagCompound this]
    (-> this (.hasNoTags))))

(defn set-unique-id
  "key - `java.lang.String`
  value - `java.util.UUID`"
  ([^NBTTagCompound this ^java.lang.String key ^java.util.UUID value]
    (-> this (.setUniqueId key value))))

(defn get-long
  "key - `java.lang.String`

  returns: `long`"
  (^Long [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getLong key))))

(defn set-double
  "key - `java.lang.String`
  value - `double`"
  ([^NBTTagCompound this ^java.lang.String key ^Double value]
    (-> this (.setDouble key value))))

(defn get-compound-tag
  "key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getCompoundTag key))))

(defn set-long
  "key - `java.lang.String`
  value - `long`"
  ([^NBTTagCompound this ^java.lang.String key ^Long value]
    (-> this (.setLong key value))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagCompound this]
    (-> this (.getId))))

(defn set-byte
  "key - `java.lang.String`
  value - `byte`"
  ([^NBTTagCompound this ^java.lang.String key ^Byte value]
    (-> this (.setByte key value))))

(defn get-key-set
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^NBTTagCompound this]
    (-> this (.getKeySet))))

(defn set-byte-array
  "key - `java.lang.String`
  value - `byte[]`"
  ([^NBTTagCompound this ^java.lang.String key value]
    (-> this (.setByteArray key value))))

(defn set-short
  "key - `java.lang.String`
  value - `short`"
  ([^NBTTagCompound this ^java.lang.String key ^Short value]
    (-> this (.setShort key value))))

(defn get-tag-list
  "key - `java.lang.String`
  type - `int`

  returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^NBTTagCompound this ^java.lang.String key ^Integer type]
    (-> this (.getTagList key type))))

(defn remove-tag
  "key - `java.lang.String`"
  ([^NBTTagCompound this ^java.lang.String key]
    (-> this (.removeTag key))))

(defn get-integer
  "key - `java.lang.String`

  returns: `int`"
  (^Integer [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getInteger key))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagCompound this]
    (-> this (.hashCode))))

(defn get-unique-id
  "key - `java.lang.String`

  returns: `java.util.UUID`"
  (^java.util.UUID [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getUniqueId key))))

(defn get-byte-array
  "key - `java.lang.String`

  returns: `byte[]`"
  ([^NBTTagCompound this ^java.lang.String key]
    (-> this (.getByteArray key))))

(defn get-boolean?
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getBoolean key))))

(defn set-tag
  "key - `java.lang.String`
  value - `net.minecraft.nbt.NBTBase`"
  ([^NBTTagCompound this ^java.lang.String key ^net.minecraft.nbt.NBTBase value]
    (-> this (.setTag key value))))

(defn has-key?
  "key - `java.lang.String`
  type - `int`

  returns: `boolean`"
  (^Boolean [^NBTTagCompound this ^java.lang.String key ^Integer type]
    (-> this (.hasKey key type)))
  (^Boolean [^NBTTagCompound this ^java.lang.String key]
    (-> this (.hasKey key))))

(defn get-float
  "key - `java.lang.String`

  returns: `float`"
  (^Float [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getFloat key))))

(defn set-int-array
  "key - `java.lang.String`
  value - `int[]`"
  ([^NBTTagCompound this ^java.lang.String key value]
    (-> this (.setIntArray key value))))

(defn get-double
  "key - `java.lang.String`

  returns: `double`"
  (^Double [^NBTTagCompound this ^java.lang.String key]
    (-> this (.getDouble key))))

(defn get-size
  "returns: `int`"
  (^Integer [^NBTTagCompound this]
    (-> this (.getSize))))

(defn merge
  "other - `net.minecraft.nbt.NBTTagCompound`"
  ([^NBTTagCompound this ^net.minecraft.nbt.NBTTagCompound other]
    (-> this (.merge other))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagCompound this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn set-float
  "key - `java.lang.String`
  value - `float`"
  ([^NBTTagCompound this ^java.lang.String key ^Float value]
    (-> this (.setFloat key value))))

(defn set-integer
  "key - `java.lang.String`
  value - `int`"
  ([^NBTTagCompound this ^java.lang.String key ^Integer value]
    (-> this (.setInteger key value))))

