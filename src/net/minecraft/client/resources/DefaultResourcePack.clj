(ns net.minecraft.client.resources.DefaultResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources DefaultResourcePack]))

(defn ->default-resource-pack
  "Constructor.

  resource-index-in - `net.minecraft.client.resources.ResourceIndex`"
  (^DefaultResourcePack [^net.minecraft.client.resources.ResourceIndex resource-index-in]
    (new DefaultResourcePack resource-index-in)))

(def *-default-resource-domains
  "Static Constant.

  type: java.util.Set<java.lang.String>"
  DefaultResourcePack/DEFAULT_RESOURCE_DOMAINS)

(defn get-input-stream
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^DefaultResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getInputStream location))))

(defn get-input-stream-assets
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^DefaultResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getInputStreamAssets location))))

(defn resource-exists
  "location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^DefaultResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.resourceExists location))))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^DefaultResourcePack this]
    (-> this (.getResourceDomains))))

(defn get-pack-metadata
  "metadata-serializer - `net.minecraft.client.resources.data.MetadataSerializer`
  metadata-section-name - `java.lang.String`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`

  throws: java.io.IOException"
  ([^DefaultResourcePack this ^net.minecraft.client.resources.data.MetadataSerializer metadata-serializer ^java.lang.String metadata-section-name]
    (-> this (.getPackMetadata metadata-serializer metadata-section-name))))

(defn get-pack-image
  "returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^DefaultResourcePack this]
    (-> this (.getPackImage))))

(defn get-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultResourcePack this]
    (-> this (.getPackName))))

