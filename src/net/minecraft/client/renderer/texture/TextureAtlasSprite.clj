(ns net.minecraft.client.renderer.texture.TextureAtlasSprite
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture TextureAtlasSprite]))

(defn get-min-u
  "returns: `float`"
  (^Float [^TextureAtlasSprite this]
    (-> this (.getMinU))))

(defn get-icon-height
  "returns: `int`"
  (^Integer [^TextureAtlasSprite this]
    (-> this (.getIconHeight))))

(defn load-sprite-frames
  "resource - `net.minecraft.client.resources.IResource`
  mipmaplevels - `int`

  throws: java.io.IOException"
  ([^TextureAtlasSprite this ^net.minecraft.client.resources.IResource resource ^Integer mipmaplevels]
    (-> this (.loadSpriteFrames resource mipmaplevels))))

(defn copy-from
  "atlas-spirit - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^TextureAtlasSprite this ^net.minecraft.client.renderer.texture.TextureAtlasSprite atlas-spirit]
    (-> this (.copyFrom atlas-spirit))))

(defn update-animation
  ""
  ([^TextureAtlasSprite this]
    (-> this (.updateAnimation))))

(defn get-frame-texture-data
  "index - `int`

  returns: `int[][]`"
  ([^TextureAtlasSprite this ^Integer index]
    (-> this (.getFrameTextureData index))))

(defn load
  "Load the specified resource as this sprite's data.
   Returning false from this function will prevent this icon from being stitched onto the master texture.

  manager - Main resource manager - `net.minecraft.client.resources.IResourceManager`
  location - File resource location - `net.minecraft.util.ResourceLocation`

  returns: False to prevent this Icon from being stitched - `boolean`"
  (^Boolean [^TextureAtlasSprite this ^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.util.ResourceLocation location]
    (-> this (.load manager location))))

(defn has-custom-loader?
  "The result of this function determines is the below 'load' function is called, and the
   default vanilla loading code is bypassed completely.

  manager - Main resource manager - `net.minecraft.client.resources.IResourceManager`
  location - File resource location - `net.minecraft.util.ResourceLocation`

  returns: True to use your own custom load code and bypass vanilla loading. - `boolean`"
  (^Boolean [^TextureAtlasSprite this ^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.util.ResourceLocation location]
    (-> this (.hasCustomLoader manager location))))

(defn get-un-interpolated-u
  "u - `float`

  returns: `float`"
  (^Float [^TextureAtlasSprite this ^Float u]
    (-> this (.getUnInterpolatedU u))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextureAtlasSprite this]
    (-> this (.toString))))

(defn set-icon-height
  "new-height - `int`"
  ([^TextureAtlasSprite this ^Integer new-height]
    (-> this (.setIconHeight new-height))))

(defn load-sprite
  "size-info - `net.minecraft.client.renderer.texture.PngSizeInfo`
  p-188538-2 - `boolean`

  throws: java.io.IOException"
  ([^TextureAtlasSprite this ^net.minecraft.client.renderer.texture.PngSizeInfo size-info ^Boolean p-188538-2]
    (-> this (.loadSprite size-info p-188538-2))))

(defn init-sprite
  "in-x - `int`
  in-y - `int`
  origin-in-x - `int`
  origin-in-y - `int`
  rotated-in - `boolean`"
  ([^TextureAtlasSprite this ^Integer in-x ^Integer in-y ^Integer origin-in-x ^Integer origin-in-y ^Boolean rotated-in]
    (-> this (.initSprite in-x in-y origin-in-x origin-in-y rotated-in))))

(defn set-icon-width
  "new-width - `int`"
  ([^TextureAtlasSprite this ^Integer new-width]
    (-> this (.setIconWidth new-width))))

(defn get-origin-x
  "returns: `int`"
  (^Integer [^TextureAtlasSprite this]
    (-> this (.getOriginX))))

(defn get-interpolated-v
  "v - `double`

  returns: `float`"
  (^Float [^TextureAtlasSprite this ^Double v]
    (-> this (.getInterpolatedV v))))

(defn get-icon-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TextureAtlasSprite this]
    (-> this (.getIconName))))

(defn get-icon-width
  "returns: `int`"
  (^Integer [^TextureAtlasSprite this]
    (-> this (.getIconWidth))))

(defn get-max-v
  "returns: `float`"
  (^Float [^TextureAtlasSprite this]
    (-> this (.getMaxV))))

(defn get-un-interpolated-v
  "p-188536-1 - `float`

  returns: `float`"
  (^Float [^TextureAtlasSprite this ^Float p-188536-1]
    (-> this (.getUnInterpolatedV p-188536-1))))

(defn get-max-u
  "returns: `float`"
  (^Float [^TextureAtlasSprite this]
    (-> this (.getMaxU))))

(defn has-animation-metadata?
  "returns: `boolean`"
  (^Boolean [^TextureAtlasSprite this]
    (-> this (.hasAnimationMetadata))))

(defn get-frame-count
  "returns: `int`"
  (^Integer [^TextureAtlasSprite this]
    (-> this (.getFrameCount))))

(defn get-origin-y
  "returns: `int`"
  (^Integer [^TextureAtlasSprite this]
    (-> this (.getOriginY))))

(defn set-frames-texture-data
  "new-frames-texture-data - `java.util.List`"
  ([^TextureAtlasSprite this ^java.util.List new-frames-texture-data]
    (-> this (.setFramesTextureData new-frames-texture-data))))

(defn generate-mipmaps
  "level - `int`"
  ([^TextureAtlasSprite this ^Integer level]
    (-> this (.generateMipmaps level))))

(defn clear-frames-texture-data
  ""
  ([^TextureAtlasSprite this]
    (-> this (.clearFramesTextureData))))

(defn get-interpolated-u
  "u - `double`

  returns: `float`"
  (^Float [^TextureAtlasSprite this ^Double u]
    (-> this (.getInterpolatedU u))))

(defn get-min-v
  "returns: `float`"
  (^Float [^TextureAtlasSprite this]
    (-> this (.getMinV))))

