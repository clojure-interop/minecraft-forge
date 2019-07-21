(ns net.minecraft.network.datasync.EntityDataManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.datasync EntityDataManager]))

(defn ->entity-data-manager
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^EntityDataManager [^net.minecraft.entity.Entity entity-in]
    (new EntityDataManager entity-in)))

(defn *create-key
  "clazz - `java.lang.Class`
  serializer - `net.minecraft.network.datasync.DataSerializer`

  returns: `<T> net.minecraft.network.datasync.DataParameter<T>`"
  ([^java.lang.Class clazz ^net.minecraft.network.datasync.DataSerializer serializer]
    (EntityDataManager/createKey clazz serializer)))

(defn *write-entries
  "entries-in - `java.util.List`
  buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^java.util.List entries-in ^net.minecraft.network.PacketBuffer buf]
    (EntityDataManager/writeEntries entries-in buf)))

(defn *read-entries
  "buf - `net.minecraft.network.PacketBuffer`

  returns: `java.util.List<net.minecraft.network.datasync.EntityDataManager$DataEntry<?>>`

  throws: java.io.IOException"
  (^java.util.List [^net.minecraft.network.PacketBuffer buf]
    (EntityDataManager/readEntries buf)))

(defn dirty?
  "returns: `boolean`"
  (^Boolean [^EntityDataManager this]
    (-> this (.isDirty))))

(defn set-entry-values
  "entries-in - `java.util.List`"
  ([^EntityDataManager this ^java.util.List entries-in]
    (-> this (.setEntryValues entries-in))))

(defn get-all
  "returns: `java.util.List<net.minecraft.network.datasync.EntityDataManager$DataEntry<?>>`"
  (^java.util.List [^EntityDataManager this]
    (-> this (.getAll))))

(defn write-entries
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^EntityDataManager this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writeEntries buf))))

(defn register
  "key - `net.minecraft.network.datasync.DataParameter`
  value - `T`

  returns: `<T> void`"
  ([^EntityDataManager this ^net.minecraft.network.datasync.DataParameter key value]
    (-> this (.register key value))))

(defn set-dirty
  "key - `net.minecraft.network.datasync.DataParameter`

  returns: `<T> void`"
  ([^EntityDataManager this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.setDirty key))))

(defn get-dirty
  "returns: `java.util.List<net.minecraft.network.datasync.EntityDataManager$DataEntry<?>>`"
  (^java.util.List [^EntityDataManager this]
    (-> this (.getDirty))))

(defn set
  "key - `net.minecraft.network.datasync.DataParameter`
  value - `T`

  returns: `<T> void`"
  ([^EntityDataManager this ^net.minecraft.network.datasync.DataParameter key value]
    (-> this (.set key value))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^EntityDataManager this]
    (-> this (.isEmpty))))

(defn get
  "key - `net.minecraft.network.datasync.DataParameter`

  returns: `<T> T`"
  ([^EntityDataManager this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.get key))))

(defn set-clean
  ""
  ([^EntityDataManager this]
    (-> this (.setClean))))

