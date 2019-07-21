(ns net.minecraft.world.storage.SaveDataMemoryStorage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage SaveDataMemoryStorage]))

(defn ->save-data-memory-storage
  "Constructor."
  (^SaveDataMemoryStorage []
    (new SaveDataMemoryStorage )))

(defn get-or-load-data
  "clazz - `java.lang.Class`
  data-identifier - `java.lang.String`

  returns: `net.minecraft.world.WorldSavedData`"
  (^net.minecraft.world.WorldSavedData [^SaveDataMemoryStorage this ^java.lang.Class clazz ^java.lang.String data-identifier]
    (-> this (.getOrLoadData clazz data-identifier))))

(defn set-data
  "data-identifier - `java.lang.String`
  data - `net.minecraft.world.WorldSavedData`"
  ([^SaveDataMemoryStorage this ^java.lang.String data-identifier ^net.minecraft.world.WorldSavedData data]
    (-> this (.setData data-identifier data))))

(defn save-all-data
  ""
  ([^SaveDataMemoryStorage this]
    (-> this (.saveAllData))))

(defn get-unique-data-id
  "key - `java.lang.String`

  returns: `int`"
  (^Integer [^SaveDataMemoryStorage this ^java.lang.String key]
    (-> this (.getUniqueDataId key))))

