(ns net.minecraft.client.renderer.texture.TextureUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture TextureUtil]))

(defn ->texture-util
  "Constructor."
  (^TextureUtil []
    (new TextureUtil )))

(def *-missing-texture
  "Static Constant.

  type: net.minecraft.client.renderer.texture.DynamicTexture"
  TextureUtil/MISSING_TEXTURE)

(def *-missing-texture-data
  "Static Constant.

  type: int[]"
  TextureUtil/MISSING_TEXTURE_DATA)

(defn *update-anaglyph
  "p-110985-0 - `int[]`

  returns: `int[]`"
  ([p-110985-0]
    (TextureUtil/updateAnaglyph p-110985-0)))

(defn *process-pixel-values
  "p-147953-0 - `int[]`
  p-147953-1 - `int`
  p-147953-2 - `int`"
  ([p-147953-0 ^Integer p-147953-1 ^Integer p-147953-2]
    (TextureUtil/processPixelValues p-147953-0 p-147953-1 p-147953-2)))

(defn *read-image-data
  "resource-manager - `net.minecraft.client.resources.IResourceManager`
  image-location - `net.minecraft.util.ResourceLocation`

  returns: `int[]`

  throws: java.io.IOException"
  ([^net.minecraft.client.resources.IResourceManager resource-manager ^net.minecraft.util.ResourceLocation image-location]
    (TextureUtil/readImageData resource-manager image-location)))

(defn *upload-texture
  "texture-id - `int`
  p-110988-1 - `int[]`
  p-110988-2 - `int`
  p-110988-3 - `int`"
  ([^Integer texture-id p-110988-1 ^Integer p-110988-2 ^Integer p-110988-3]
    (TextureUtil/uploadTexture texture-id p-110988-1 p-110988-2 p-110988-3)))

(defn *allocate-texture
  "texture-id - `int`
  width - `int`
  height - `int`"
  ([^Integer texture-id ^Integer width ^Integer height]
    (TextureUtil/allocateTexture texture-id width height)))

(defn *upload-texture-image-allocate
  "texture-id - `int`
  texture - `java.awt.image.BufferedImage`
  blur - `boolean`
  clamp - `boolean`

  returns: `int`"
  (^Integer [^Integer texture-id ^java.awt.image.BufferedImage texture ^Boolean blur ^Boolean clamp]
    (TextureUtil/uploadTextureImageAllocate texture-id texture blur clamp)))

(defn *anaglyph-color
  "p-177054-0 - `int`

  returns: `int`"
  (^Integer [^Integer p-177054-0]
    (TextureUtil/anaglyphColor p-177054-0)))

(defn *upload-texture-image-sub
  "texture-id - `int`
  p-110995-1 - `java.awt.image.BufferedImage`
  p-110995-2 - `int`
  p-110995-3 - `int`
  p-110995-4 - `boolean`
  p-110995-5 - `boolean`

  returns: `int`"
  (^Integer [^Integer texture-id ^java.awt.image.BufferedImage p-110995-1 ^Integer p-110995-2 ^Integer p-110995-3 ^Boolean p-110995-4 ^Boolean p-110995-5]
    (TextureUtil/uploadTextureImageSub texture-id p-110995-1 p-110995-2 p-110995-3 p-110995-4 p-110995-5)))

(defn *generate-mipmap-data
  "p-147949-0 - `int`
  p-147949-1 - `int`
  p-147949-2 - `int[][]`

  returns: `int[][]`"
  ([^Integer p-147949-0 ^Integer p-147949-1 p-147949-2]
    (TextureUtil/generateMipmapData p-147949-0 p-147949-1 p-147949-2)))

(defn *delete-texture
  "texture-id - `int`"
  ([^Integer texture-id]
    (TextureUtil/deleteTexture texture-id)))

(defn *read-buffered-image
  "image-stream - `java.io.InputStream`

  returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^java.io.InputStream image-stream]
    (TextureUtil/readBufferedImage image-stream)))

(defn *allocate-texture-impl
  "gl-texture-id - `int`
  mipmap-levels - `int`
  width - `int`
  height - `int`"
  ([^Integer gl-texture-id ^Integer mipmap-levels ^Integer width ^Integer height]
    (TextureUtil/allocateTextureImpl gl-texture-id mipmap-levels width height)))

(defn *gl-gen-textures
  "returns: `int`"
  (^Integer []
    (TextureUtil/glGenTextures )))

(defn *upload-texture-mipmap
  "p-147955-0 - `int[][]`
  p-147955-1 - `int`
  p-147955-2 - `int`
  p-147955-3 - `int`
  p-147955-4 - `int`
  p-147955-5 - `boolean`
  p-147955-6 - `boolean`"
  ([p-147955-0 ^Integer p-147955-1 ^Integer p-147955-2 ^Integer p-147955-3 ^Integer p-147955-4 ^Boolean p-147955-5 ^Boolean p-147955-6]
    (TextureUtil/uploadTextureMipmap p-147955-0 p-147955-1 p-147955-2 p-147955-3 p-147955-4 p-147955-5 p-147955-6)))

(defn *upload-texture-image
  "texture-id - `int`
  texture - `java.awt.image.BufferedImage`

  returns: `int`"
  (^Integer [^Integer texture-id ^java.awt.image.BufferedImage texture]
    (TextureUtil/uploadTextureImage texture-id texture)))

