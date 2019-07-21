(ns net.minecraft.client.renderer.texture.ITextureObject
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture ITextureObject]))

(defn set-blur-mipmap
  "blur-in - `boolean`
  mipmap-in - `boolean`"
  ([^ITextureObject this ^Boolean blur-in ^Boolean mipmap-in]
    (-> this (.setBlurMipmap blur-in mipmap-in))))

(defn restore-last-blur-mipmap
  ""
  ([^ITextureObject this]
    (-> this (.restoreLastBlurMipmap))))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^ITextureObject this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

(defn get-gl-texture-id
  "returns: `int`"
  (^Integer [^ITextureObject this]
    (-> this (.getGlTextureId))))

