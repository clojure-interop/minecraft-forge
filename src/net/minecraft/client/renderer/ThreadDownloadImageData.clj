(ns net.minecraft.client.renderer.ThreadDownloadImageData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ThreadDownloadImageData]))

(defn ->thread-download-image-data
  "Constructor.

  cache-file-in - `java.io.File`
  image-url-in - `java.lang.String`
  texture-resource-location - `net.minecraft.util.ResourceLocation`
  image-buffer-in - `net.minecraft.client.renderer.IImageBuffer`"
  (^ThreadDownloadImageData [^java.io.File cache-file-in ^java.lang.String image-url-in ^net.minecraft.util.ResourceLocation texture-resource-location ^net.minecraft.client.renderer.IImageBuffer image-buffer-in]
    (new ThreadDownloadImageData cache-file-in image-url-in texture-resource-location image-buffer-in)))

(defn get-gl-texture-id
  "returns: `int`"
  (^Integer [^ThreadDownloadImageData this]
    (-> this (.getGlTextureId))))

(defn set-buffered-image
  "buffered-image-in - `java.awt.image.BufferedImage`"
  ([^ThreadDownloadImageData this ^java.awt.image.BufferedImage buffered-image-in]
    (-> this (.setBufferedImage buffered-image-in))))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^ThreadDownloadImageData this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

