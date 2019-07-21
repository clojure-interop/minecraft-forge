(ns net.minecraft.client.renderer.texture.DynamicTexture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture DynamicTexture]))

(defn ->dynamic-texture
  "Constructor.

  texture-width - `int`
  texture-height - `int`"
  (^DynamicTexture [^Integer texture-width ^Integer texture-height]
    (new DynamicTexture texture-width texture-height))
  (^DynamicTexture [^java.awt.image.BufferedImage buffered-image]
    (new DynamicTexture buffered-image)))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^DynamicTexture this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

(defn update-dynamic-texture
  ""
  ([^DynamicTexture this]
    (-> this (.updateDynamicTexture))))

(defn get-texture-data
  "returns: `int[]`"
  ([^DynamicTexture this]
    (-> this (.getTextureData))))

