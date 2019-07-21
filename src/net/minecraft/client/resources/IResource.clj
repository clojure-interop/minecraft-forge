(ns net.minecraft.client.resources.IResource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources IResource]))

(defn get-resource-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^IResource this]
    (-> this (.getResourceLocation))))

(defn get-input-stream
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^IResource this]
    (-> this (.getInputStream))))

(defn has-metadata?
  "returns: `boolean`"
  (^Boolean [^IResource this]
    (-> this (.hasMetadata))))

(defn get-metadata
  "section-name - `java.lang.String`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`"
  ([^IResource this ^java.lang.String section-name]
    (-> this (.getMetadata section-name))))

(defn get-resource-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IResource this]
    (-> this (.getResourcePackName))))

