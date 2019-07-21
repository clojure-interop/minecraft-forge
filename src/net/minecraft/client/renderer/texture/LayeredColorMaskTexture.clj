(ns net.minecraft.client.renderer.texture.LayeredColorMaskTexture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture LayeredColorMaskTexture]))

(defn ->layered-color-mask-texture
  "Constructor.

  texture-location-in - `net.minecraft.util.ResourceLocation`
  p-i-46101-2 - `java.util.List`
  p-i-46101-3 - `java.util.List`"
  (^LayeredColorMaskTexture [^net.minecraft.util.ResourceLocation texture-location-in ^java.util.List p-i-46101-2 ^java.util.List p-i-46101-3]
    (new LayeredColorMaskTexture texture-location-in p-i-46101-2 p-i-46101-3)))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^LayeredColorMaskTexture this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

