(ns net.minecraft.client.resources.AbstractResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources AbstractResourcePack]))

(defn ->abstract-resource-pack
  "Constructor.

  resource-pack-file-in - `java.io.File`"
  (^AbstractResourcePack [^java.io.File resource-pack-file-in]
    (new AbstractResourcePack resource-pack-file-in)))

(defn get-input-stream
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^AbstractResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getInputStream location))))

(defn resource-exists
  "location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^AbstractResourcePack this ^net.minecraft.util.ResourceLocation location]
    (-> this (.resourceExists location))))

(defn get-pack-metadata
  "metadata-serializer - `net.minecraft.client.resources.data.MetadataSerializer`
  metadata-section-name - `java.lang.String`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`

  throws: java.io.IOException"
  ([^AbstractResourcePack this ^net.minecraft.client.resources.data.MetadataSerializer metadata-serializer ^java.lang.String metadata-section-name]
    (-> this (.getPackMetadata metadata-serializer metadata-section-name))))

(defn get-pack-image
  "returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^AbstractResourcePack this]
    (-> this (.getPackImage))))

(defn get-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractResourcePack this]
    (-> this (.getPackName))))

