(ns net.minecraft.network.datasync.EntityDataManager$DataEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.datasync EntityDataManager$DataEntry]))

(defn ->data-entry
  "Constructor.

  key-in - `net.minecraft.network.datasync.DataParameter`
  value-in - `T`"
  (^EntityDataManager$DataEntry [^net.minecraft.network.datasync.DataParameter key-in value-in]
    (new EntityDataManager$DataEntry key-in value-in)))

(defn get-key
  "returns: `net.minecraft.network.datasync.DataParameter<T>`"
  (^net.minecraft.network.datasync.DataParameter [^EntityDataManager$DataEntry this]
    (-> this (.getKey))))

(defn set-value
  "value-in - `T`"
  ([^EntityDataManager$DataEntry this value-in]
    (-> this (.setValue value-in))))

(defn get-value
  "returns: `T`"
  ([^EntityDataManager$DataEntry this]
    (-> this (.getValue))))

(defn dirty?
  "returns: `boolean`"
  (^Boolean [^EntityDataManager$DataEntry this]
    (-> this (.isDirty))))

(defn set-dirty
  "dirty-in - `boolean`"
  ([^EntityDataManager$DataEntry this ^Boolean dirty-in]
    (-> this (.setDirty dirty-in))))

