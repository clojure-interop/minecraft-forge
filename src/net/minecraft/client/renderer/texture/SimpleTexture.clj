(ns net.minecraft.client.renderer.texture.SimpleTexture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture SimpleTexture]))

(defn ->simple-texture
  "Constructor.

  texture-resource-location - `net.minecraft.util.ResourceLocation`"
  (^SimpleTexture [^net.minecraft.util.ResourceLocation texture-resource-location]
    (new SimpleTexture texture-resource-location)))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^SimpleTexture this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

