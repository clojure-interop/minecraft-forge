(ns net.minecraft.world.chunk.storage.AnvilSaveConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage AnvilSaveConverter]))

(defn ->anvil-save-converter
  "Constructor.

  dir - `java.io.File`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`"
  (^AnvilSaveConverter [^java.io.File dir ^net.minecraft.util.datafix.DataFixer data-fixer-in]
    (new AnvilSaveConverter dir data-fixer-in)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AnvilSaveConverter this]
    (-> this (.getName))))

(defn get-save-list
  "returns: `java.util.List<net.minecraft.world.storage.WorldSummary>`

  throws: net.minecraft.client.AnvilConverterException"
  (^java.util.List [^AnvilSaveConverter this]
    (-> this (.getSaveList))))

(defn flush-cache
  ""
  ([^AnvilSaveConverter this]
    (-> this (.flushCache))))

(defn get-save-loader
  "save-name - `java.lang.String`
  store-playerdata - `boolean`

  returns: `net.minecraft.world.storage.ISaveHandler`"
  (^net.minecraft.world.storage.ISaveHandler [^AnvilSaveConverter this ^java.lang.String save-name ^Boolean store-playerdata]
    (-> this (.getSaveLoader save-name store-playerdata))))

(defn convertible?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^AnvilSaveConverter this ^java.lang.String save-name]
    (-> this (.isConvertible save-name))))

(defn old-map-format?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^AnvilSaveConverter this ^java.lang.String save-name]
    (-> this (.isOldMapFormat save-name))))

(defn convert-map-format
  "filename - `java.lang.String`
  progress-callback - `net.minecraft.util.IProgressUpdate`

  returns: `boolean`"
  (^Boolean [^AnvilSaveConverter this ^java.lang.String filename ^net.minecraft.util.IProgressUpdate progress-callback]
    (-> this (.convertMapFormat filename progress-callback))))

