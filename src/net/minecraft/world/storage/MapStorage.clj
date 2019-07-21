(ns net.minecraft.world.storage.MapStorage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage MapStorage]))

(defn ->map-storage
  "Constructor.

  save-handler-in - `net.minecraft.world.storage.ISaveHandler`"
  (^MapStorage [^net.minecraft.world.storage.ISaveHandler save-handler-in]
    (new MapStorage save-handler-in)))

(defn get-or-load-data
  "clazz - `java.lang.Class`
  data-identifier - `java.lang.String`

  returns: `net.minecraft.world.WorldSavedData`"
  (^net.minecraft.world.WorldSavedData [^MapStorage this ^java.lang.Class clazz ^java.lang.String data-identifier]
    (-> this (.getOrLoadData clazz data-identifier))))

(defn set-data
  "data-identifier - `java.lang.String`
  data - `net.minecraft.world.WorldSavedData`"
  ([^MapStorage this ^java.lang.String data-identifier ^net.minecraft.world.WorldSavedData data]
    (-> this (.setData data-identifier data))))

(defn save-all-data
  ""
  ([^MapStorage this]
    (-> this (.saveAllData))))

(defn get-unique-data-id
  "key - `java.lang.String`

  returns: `int`"
  (^Integer [^MapStorage this ^java.lang.String key]
    (-> this (.getUniqueDataId key))))

