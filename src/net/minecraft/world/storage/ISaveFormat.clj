(ns net.minecraft.world.storage.ISaveFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage ISaveFormat]))

(defn flush-cache
  ""
  ([^ISaveFormat this]
    (-> this (.flushCache))))

(defn old-map-format?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ISaveFormat this ^java.lang.String save-name]
    (-> this (.isOldMapFormat save-name))))

(defn convert-map-format
  "filename - `java.lang.String`
  progress-callback - `net.minecraft.util.IProgressUpdate`

  returns: `boolean`"
  (^Boolean [^ISaveFormat this ^java.lang.String filename ^net.minecraft.util.IProgressUpdate progress-callback]
    (-> this (.convertMapFormat filename progress-callback))))

(defn can-load-world?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ISaveFormat this ^java.lang.String save-name]
    (-> this (.canLoadWorld save-name))))

(defn get-save-loader
  "save-name - `java.lang.String`
  store-playerdata - `boolean`

  returns: `net.minecraft.world.storage.ISaveHandler`"
  (^net.minecraft.world.storage.ISaveHandler [^ISaveFormat this ^java.lang.String save-name ^Boolean store-playerdata]
    (-> this (.getSaveLoader save-name store-playerdata))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ISaveFormat this]
    (-> this (.getName))))

(defn rename-world
  "dir-name - `java.lang.String`
  new-name - `java.lang.String`"
  ([^ISaveFormat this ^java.lang.String dir-name ^java.lang.String new-name]
    (-> this (.renameWorld dir-name new-name))))

(defn new-level-id-acceptable?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ISaveFormat this ^java.lang.String save-name]
    (-> this (.isNewLevelIdAcceptable save-name))))

(defn convertible?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ISaveFormat this ^java.lang.String save-name]
    (-> this (.isConvertible save-name))))

(defn get-save-list
  "returns: `java.util.List<net.minecraft.world.storage.WorldSummary>`

  throws: net.minecraft.client.AnvilConverterException"
  (^java.util.List [^ISaveFormat this]
    (-> this (.getSaveList))))

(defn get-world-info
  "save-name - `java.lang.String`

  returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^ISaveFormat this ^java.lang.String save-name]
    (-> this (.getWorldInfo save-name))))

(defn get-file
  "p-186352-1 - `java.lang.String`
  p-186352-2 - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^ISaveFormat this ^java.lang.String p-186352-1 ^java.lang.String p-186352-2]
    (-> this (.getFile p-186352-1 p-186352-2))))

(defn delete-world-directory
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ISaveFormat this ^java.lang.String save-name]
    (-> this (.deleteWorldDirectory save-name))))

