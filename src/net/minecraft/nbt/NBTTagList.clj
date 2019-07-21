(ns net.minecraft.nbt.NBTTagList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTTagList]))

(defn ->nbt-tag-list
  "Constructor."
  (^NBTTagList []
    (new NBTTagList )))

(defn get-string-tag-at
  "i - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^NBTTagList this ^Integer i]
    (-> this (.getStringTagAt i))))

(defn copy
  "returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^NBTTagList this]
    (-> this (.copy))))

(defn tag-count
  "returns: `int`"
  (^Integer [^NBTTagList this]
    (-> this (.tagCount))))

(defn get-int-at
  "p-186858-1 - `int`

  returns: `int`"
  (^Integer [^NBTTagList this ^Integer p-186858-1]
    (-> this (.getIntAt p-186858-1))))

(defn append-tag
  "nbt - `net.minecraft.nbt.NBTBase`"
  ([^NBTTagList this ^net.minecraft.nbt.NBTBase nbt]
    (-> this (.appendTag nbt))))

(defn get-float-at
  "i - `int`

  returns: `float`"
  (^Float [^NBTTagList this ^Integer i]
    (-> this (.getFloatAt i))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NBTTagList this]
    (-> this (.toString))))

(defn has-no-tags?
  "returns: `boolean`"
  (^Boolean [^NBTTagList this]
    (-> this (.hasNoTags))))

(defn get-double-at
  "i - `int`

  returns: `double`"
  (^Double [^NBTTagList this ^Integer i]
    (-> this (.getDoubleAt i))))

(defn get-id
  "returns: `byte`"
  (^Byte [^NBTTagList this]
    (-> this (.getId))))

(defn get-compound-tag-at
  "i - `int`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^NBTTagList this ^Integer i]
    (-> this (.getCompoundTagAt i))))

(defn remove-tag
  "i - `int`

  returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^NBTTagList this ^Integer i]
    (-> this (.removeTag i))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NBTTagList this]
    (-> this (.hashCode))))

(defn set
  "idx - `int`
  nbt - `net.minecraft.nbt.NBTBase`"
  ([^NBTTagList this ^Integer idx ^net.minecraft.nbt.NBTBase nbt]
    (-> this (.set idx nbt))))

(defn get-int-array-at
  "i - `int`

  returns: `int[]`"
  ([^NBTTagList this ^Integer i]
    (-> this (.getIntArrayAt i))))

(defn get-tag-type
  "returns: `int`"
  (^Integer [^NBTTagList this]
    (-> this (.getTagType))))

(defn get
  "idx - `int`

  returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^NBTTagList this ^Integer idx]
    (-> this (.get idx))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NBTTagList this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

