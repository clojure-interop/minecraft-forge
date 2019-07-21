(ns net.minecraft.client.resources.ResourcePackRepository
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourcePackRepository]))

(defn ->resource-pack-repository
  "Constructor.

  dir-resourcepacks-in - `java.io.File`
  dir-server-resourcepacks-in - `java.io.File`
  rpr-default-resource-pack-in - `net.minecraft.client.resources.IResourcePack`
  rpr-metadata-serializer-in - `net.minecraft.client.resources.data.MetadataSerializer`
  settings - `net.minecraft.client.settings.GameSettings`"
  (^ResourcePackRepository [^java.io.File dir-resourcepacks-in ^java.io.File dir-server-resourcepacks-in ^net.minecraft.client.resources.IResourcePack rpr-default-resource-pack-in ^net.minecraft.client.resources.data.MetadataSerializer rpr-metadata-serializer-in ^net.minecraft.client.settings.GameSettings settings]
    (new ResourcePackRepository dir-resourcepacks-in dir-server-resourcepacks-in rpr-default-resource-pack-in rpr-metadata-serializer-in settings)))

(defn rpr-default-resource-pack
  "Instance Constant.

  type: net.minecraft.client.resources.IResourcePack"
  (^net.minecraft.client.resources.IResourcePack [^ResourcePackRepository this]
    (-> this .-rprDefaultResourcePack)))

(defn rpr-metadata-serializer
  "Instance Constant.

  type: net.minecraft.client.resources.data.MetadataSerializer"
  (^net.minecraft.client.resources.data.MetadataSerializer [^ResourcePackRepository this]
    (-> this .-rprMetadataSerializer)))

(defn *get-download-headers
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map []
    (ResourcePackRepository/getDownloadHeaders )))

(defn set-resource-pack-instance
  "resource-file - `java.io.File`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^ResourcePackRepository this ^java.io.File resource-file]
    (-> this (.setResourcePackInstance resource-file))))

(defn update-repository-entries-all
  ""
  ([^ResourcePackRepository this]
    (-> this (.updateRepositoryEntriesAll))))

(defn get-repository-entries
  "returns: `java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry>`"
  (^java.util.List [^ResourcePackRepository this]
    (-> this (.getRepositoryEntries))))

(defn get-resource-pack-instance
  "returns: `net.minecraft.client.resources.IResourcePack`"
  (^net.minecraft.client.resources.IResourcePack [^ResourcePackRepository this]
    (-> this (.getResourcePackInstance))))

(defn download-resource-pack
  "url - `java.lang.String`
  hash - `java.lang.String`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^ResourcePackRepository this ^java.lang.String url ^java.lang.String hash]
    (-> this (.downloadResourcePack url hash))))

(defn get-resource-pack-entry
  "returns: `net.minecraft.client.resources.ResourcePackRepository$Entry`"
  (^net.minecraft.client.resources.ResourcePackRepository$Entry [^ResourcePackRepository this]
    (-> this (.getResourcePackEntry))))

(defn clear-resource-pack
  ""
  ([^ResourcePackRepository this]
    (-> this (.clearResourcePack))))

(defn get-dir-resourcepacks
  "returns: `java.io.File`"
  (^java.io.File [^ResourcePackRepository this]
    (-> this (.getDirResourcepacks))))

(defn set-repositories
  "repositories - `java.util.List`"
  ([^ResourcePackRepository this ^java.util.List repositories]
    (-> this (.setRepositories repositories))))

(defn get-repository-entries-all
  "returns: `java.util.List<net.minecraft.client.resources.ResourcePackRepository$Entry>`"
  (^java.util.List [^ResourcePackRepository this]
    (-> this (.getRepositoryEntriesAll))))

