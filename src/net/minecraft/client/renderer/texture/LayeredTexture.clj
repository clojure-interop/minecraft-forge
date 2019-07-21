(ns net.minecraft.client.renderer.texture.LayeredTexture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture LayeredTexture]))

(defn ->layered-texture
  "Constructor.

  texture-names - `java.lang.String`"
  (^LayeredTexture [^java.lang.String texture-names]
    (new LayeredTexture texture-names)))

(defn layered-texture-names
  "Instance Constant.

  type: java.util.List<java.lang.String>"
  (^java.util.List [^LayeredTexture this]
    (-> this .-layeredTextureNames)))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^LayeredTexture this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

