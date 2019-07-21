(ns net.minecraft.client.renderer.texture.AbstractTexture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture AbstractTexture]))

(defn ->abstract-texture
  "Constructor."
  (^AbstractTexture []
    (new AbstractTexture )))

(defn set-blur-mipmap-direct
  "blur-in - `boolean`
  mipmap-in - `boolean`"
  ([^AbstractTexture this ^Boolean blur-in ^Boolean mipmap-in]
    (-> this (.setBlurMipmapDirect blur-in mipmap-in))))

(defn set-blur-mipmap
  "blur-in - `boolean`
  mipmap-in - `boolean`"
  ([^AbstractTexture this ^Boolean blur-in ^Boolean mipmap-in]
    (-> this (.setBlurMipmap blur-in mipmap-in))))

(defn restore-last-blur-mipmap
  ""
  ([^AbstractTexture this]
    (-> this (.restoreLastBlurMipmap))))

(defn get-gl-texture-id
  "returns: `int`"
  (^Integer [^AbstractTexture this]
    (-> this (.getGlTextureId))))

(defn delete-gl-texture
  ""
  ([^AbstractTexture this]
    (-> this (.deleteGlTexture))))

