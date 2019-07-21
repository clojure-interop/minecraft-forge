(ns net.minecraft.client.main.GameConfiguration$FolderInformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main GameConfiguration$FolderInformation]))

(defn ->folder-information
  "Constructor.

  mc-data-dir-in - `java.io.File`
  resource-packs-dir-in - `java.io.File`
  assets-dir-in - `java.io.File`
  asset-index-in - `java.lang.String`"
  (^GameConfiguration$FolderInformation [^java.io.File mc-data-dir-in ^java.io.File resource-packs-dir-in ^java.io.File assets-dir-in ^java.lang.String asset-index-in]
    (new GameConfiguration$FolderInformation mc-data-dir-in resource-packs-dir-in assets-dir-in asset-index-in)))

(defn mc-data-dir
  "Instance Constant.

  type: java.io.File"
  (^java.io.File [^GameConfiguration$FolderInformation this]
    (-> this .-mcDataDir)))

(defn resource-packs-dir
  "Instance Constant.

  type: java.io.File"
  (^java.io.File [^GameConfiguration$FolderInformation this]
    (-> this .-resourcePacksDir)))

(defn assets-dir
  "Instance Constant.

  type: java.io.File"
  (^java.io.File [^GameConfiguration$FolderInformation this]
    (-> this .-assetsDir)))

(defn asset-index
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^GameConfiguration$FolderInformation this]
    (-> this .-assetIndex)))

(defn get-assets-index
  "returns: `net.minecraft.client.resources.ResourceIndex`"
  (^net.minecraft.client.resources.ResourceIndex [^GameConfiguration$FolderInformation this]
    (-> this (.getAssetsIndex))))

