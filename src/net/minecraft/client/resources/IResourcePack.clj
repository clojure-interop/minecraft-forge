(ns net.minecraft.client.resources.IResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources IResourcePack]))

(defn get-input-stream
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^IResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getInputStream location))))

(defn resource-exists
  "location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^IResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.resourceExists location))))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^IResourcePack this]
    (-> this (.getResourceDomains))))

(defn get-pack-metadata
  "metadata-serializer - `net.minecraft.client.resources.data.MetadataSerializer`
  metadata-section-name - `java.lang.String`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`

  throws: java.io.IOException"
  ([^IResourcePack this ^net.minecraft.client.resources.data.MetadataSerializer metadata-serializer ^java.lang.String metadata-section-name]
    (-> this (.getPackMetadata metadata-serializer metadata-section-name))))

(defn get-pack-image
  "returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^IResourcePack this]
    (-> this (.getPackImage))))

(defn get-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IResourcePack this]
    (-> this (.getPackName))))

