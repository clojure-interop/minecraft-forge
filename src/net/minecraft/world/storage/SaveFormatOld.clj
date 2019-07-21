(ns net.minecraft.world.storage.SaveFormatOld
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage SaveFormatOld]))

(defn ->save-format-old
  "Constructor.

  saves-directory-in - `java.io.File`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`"
  (^SaveFormatOld [^java.io.File saves-directory-in ^net.minecraft.util.datafix.DataFixer data-fixer-in]
    (new SaveFormatOld saves-directory-in data-fixer-in)))

(defn saves-directory
  "Instance Constant.

  type: java.io.File"
  (^java.io.File [^SaveFormatOld this]
    (-> this .-savesDirectory)))

(defn *get-world-data
  "p-186353-0 - `java.io.File`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`

  returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^java.io.File p-186353-0 ^net.minecraft.util.datafix.DataFixer data-fixer-in]
    (SaveFormatOld/getWorldData p-186353-0 data-fixer-in)))

(defn *load-and-fix
  "file - `java.io.File`
  fixer - `net.minecraft.util.datafix.DataFixer`
  save - `net.minecraft.world.storage.SaveHandler`

  returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^java.io.File file ^net.minecraft.util.datafix.DataFixer fixer ^net.minecraft.world.storage.SaveHandler save]
    (SaveFormatOld/loadAndFix file fixer save)))

(defn flush-cache
  ""
  ([^SaveFormatOld this]
    (-> this (.flushCache))))

(defn old-map-format?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SaveFormatOld this ^java.lang.String save-name]
    (-> this (.isOldMapFormat save-name))))

(defn convert-map-format
  "filename - `java.lang.String`
  progress-callback - `net.minecraft.util.IProgressUpdate`

  returns: `boolean`"
  (^Boolean [^SaveFormatOld this ^java.lang.String filename ^net.minecraft.util.IProgressUpdate progress-callback]
    (-> this (.convertMapFormat filename progress-callback))))

(defn can-load-world?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SaveFormatOld this ^java.lang.String save-name]
    (-> this (.canLoadWorld save-name))))

(defn get-save-loader
  "save-name - `java.lang.String`
  store-playerdata - `boolean`

  returns: `net.minecraft.world.storage.ISaveHandler`"
  (^net.minecraft.world.storage.ISaveHandler [^SaveFormatOld this ^java.lang.String save-name ^Boolean store-playerdata]
    (-> this (.getSaveLoader save-name store-playerdata))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SaveFormatOld this]
    (-> this (.getName))))

(defn rename-world
  "dir-name - `java.lang.String`
  new-name - `java.lang.String`"
  ([^SaveFormatOld this ^java.lang.String dir-name ^java.lang.String new-name]
    (-> this (.renameWorld dir-name new-name))))

(defn new-level-id-acceptable?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SaveFormatOld this ^java.lang.String save-name]
    (-> this (.isNewLevelIdAcceptable save-name))))

(defn convertible?
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SaveFormatOld this ^java.lang.String save-name]
    (-> this (.isConvertible save-name))))

(defn get-save-list
  "returns: `java.util.List<net.minecraft.world.storage.WorldSummary>`

  throws: net.minecraft.client.AnvilConverterException"
  (^java.util.List [^SaveFormatOld this]
    (-> this (.getSaveList))))

(defn get-world-info
  "save-name - `java.lang.String`

  returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^SaveFormatOld this ^java.lang.String save-name]
    (-> this (.getWorldInfo save-name))))

(defn get-file
  "p-186352-1 - `java.lang.String`
  p-186352-2 - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^SaveFormatOld this ^java.lang.String p-186352-1 ^java.lang.String p-186352-2]
    (-> this (.getFile p-186352-1 p-186352-2))))

(defn delete-world-directory
  "save-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SaveFormatOld this ^java.lang.String save-name]
    (-> this (.deleteWorldDirectory save-name))))

