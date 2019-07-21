(ns net.minecraft.realms.RealmsAnvilLevelStorageSource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsAnvilLevelStorageSource]))

(defn ->realms-anvil-level-storage-source
  "Constructor.

  level-storage-source-in - `net.minecraft.world.storage.ISaveFormat`"
  (^RealmsAnvilLevelStorageSource [^net.minecraft.world.storage.ISaveFormat level-storage-source-in]
    (new RealmsAnvilLevelStorageSource level-storage-source-in)))

(defn level-exists
  "p-level-exists-1 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RealmsAnvilLevelStorageSource this ^java.lang.String p-level-exists-1]
    (-> this (.levelExists p-level-exists-1))))

(defn get-level-list
  "returns: `java.util.List<net.minecraft.realms.RealmsLevelSummary>`

  throws: net.minecraft.client.AnvilConverterException"
  (^java.util.List [^RealmsAnvilLevelStorageSource this]
    (-> this (.getLevelList))))

(defn rename-level
  "p-rename-level-1 - `java.lang.String`
  p-rename-level-2 - `java.lang.String`"
  ([^RealmsAnvilLevelStorageSource this ^java.lang.String p-rename-level-1 ^java.lang.String p-rename-level-2]
    (-> this (.renameLevel p-rename-level-1 p-rename-level-2))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsAnvilLevelStorageSource this]
    (-> this (.getName))))

(defn new-level-id-acceptable?
  "p-is-new-level-id-acceptable-1 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RealmsAnvilLevelStorageSource this ^java.lang.String p-is-new-level-id-acceptable-1]
    (-> this (.isNewLevelIdAcceptable p-is-new-level-id-acceptable-1))))

(defn convertible?
  "p-is-convertible-1 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RealmsAnvilLevelStorageSource this ^java.lang.String p-is-convertible-1]
    (-> this (.isConvertible p-is-convertible-1))))

(defn clear-all
  ""
  ([^RealmsAnvilLevelStorageSource this]
    (-> this (.clearAll))))

(defn delete-level
  "p-delete-level-1 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RealmsAnvilLevelStorageSource this ^java.lang.String p-delete-level-1]
    (-> this (.deleteLevel p-delete-level-1))))

(defn requires-conversion
  "p-requires-conversion-1 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RealmsAnvilLevelStorageSource this ^java.lang.String p-requires-conversion-1]
    (-> this (.requiresConversion p-requires-conversion-1))))

(defn convert-level
  "p-convert-level-1 - `java.lang.String`
  p-convert-level-2 - `net.minecraft.util.IProgressUpdate`

  returns: `boolean`"
  (^Boolean [^RealmsAnvilLevelStorageSource this ^java.lang.String p-convert-level-1 ^net.minecraft.util.IProgressUpdate p-convert-level-2]
    (-> this (.convertLevel p-convert-level-1 p-convert-level-2))))

