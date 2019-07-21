(ns net.minecraft.client.resources.SimpleResource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources SimpleResource]))

(defn ->simple-resource
  "Constructor.

  resource-pack-name-in - `java.lang.String`
  sr-resource-location-in - `net.minecraft.util.ResourceLocation`
  resource-input-stream-in - `java.io.InputStream`
  mcmeta-input-stream-in - `java.io.InputStream`
  sr-metadata-serializer-in - `net.minecraft.client.resources.data.MetadataSerializer`"
  (^SimpleResource [^java.lang.String resource-pack-name-in ^net.minecraft.util.ResourceLocation sr-resource-location-in ^java.io.InputStream resource-input-stream-in ^java.io.InputStream mcmeta-input-stream-in ^net.minecraft.client.resources.data.MetadataSerializer sr-metadata-serializer-in]
    (new SimpleResource resource-pack-name-in sr-resource-location-in resource-input-stream-in mcmeta-input-stream-in sr-metadata-serializer-in)))

(defn get-resource-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^SimpleResource this]
    (-> this (.getResourceLocation))))

(defn get-input-stream
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^SimpleResource this]
    (-> this (.getInputStream))))

(defn has-metadata?
  "returns: `boolean`"
  (^Boolean [^SimpleResource this]
    (-> this (.hasMetadata))))

(defn get-metadata
  "section-name - `java.lang.String`

  returns: `<T extends net.minecraft.client.resources.data.IMetadataSection> T`"
  ([^SimpleResource this ^java.lang.String section-name]
    (-> this (.getMetadata section-name))))

(defn get-resource-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SimpleResource this]
    (-> this (.getResourcePackName))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SimpleResource this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SimpleResource this]
    (-> this (.hashCode))))

(defn close
  "throws: java.io.IOException"
  ([^SimpleResource this]
    (-> this (.close))))

