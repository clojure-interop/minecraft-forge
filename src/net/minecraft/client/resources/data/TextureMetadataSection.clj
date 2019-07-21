(ns net.minecraft.client.resources.data.TextureMetadataSection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data TextureMetadataSection]))

(defn ->texture-metadata-section
  "Constructor.

  texture-blur-in - `boolean`
  texture-clamp-in - `boolean`"
  (^TextureMetadataSection [^Boolean texture-blur-in ^Boolean texture-clamp-in]
    (new TextureMetadataSection texture-blur-in texture-clamp-in)))

(defn get-texture-blur?
  "returns: `boolean`"
  (^Boolean [^TextureMetadataSection this]
    (-> this (.getTextureBlur))))

(defn get-texture-clamp?
  "returns: `boolean`"
  (^Boolean [^TextureMetadataSection this]
    (-> this (.getTextureClamp))))

