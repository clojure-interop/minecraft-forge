(ns net.minecraft.client.resources.LegacyV2Adapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources LegacyV2Adapter]))

(defn ->legacy-v-2-adapter
  "Constructor.

  pack-in - `net.minecraft.client.resources.IResourcePack`"
  (^LegacyV2Adapter [^net.minecraft.client.resources.IResourcePack pack-in]
    (new LegacyV2Adapter pack-in)))

(defn get-input-stream
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^LegacyV2Adapter this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getInputStream location))))

(defn resource-exists
  "location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^LegacyV2Adapter this ^net.minecraft.util.ResourceLocation location]
    (-> this (.resourceExists location))))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^LegacyV2Adapter this]
    (-> this (.getResourceDomains))))

(defn get-pack-metadata
  "metadata-serializer - `net.minecraft.client.resources.data.MetadataSerializer`
  metadata-section-name - `java.lang.String`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`

  throws: java.io.IOException"
  ([^LegacyV2Adapter this ^net.minecraft.client.resources.data.MetadataSerializer metadata-serializer ^java.lang.String metadata-section-name]
    (-> this (.getPackMetadata metadata-serializer metadata-section-name))))

(defn get-pack-image
  "returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^LegacyV2Adapter this]
    (-> this (.getPackImage))))

(defn get-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^LegacyV2Adapter this]
    (-> this (.getPackName))))

