(ns net.minecraft.client.renderer.texture.Stitcher$Holder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture Stitcher$Holder]))

(defn ->holder
  "Constructor.

  the-texture-in - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  mipmap-level-holder-in - `int`"
  (^Stitcher$Holder [^net.minecraft.client.renderer.texture.TextureAtlasSprite the-texture-in ^Integer mipmap-level-holder-in]
    (new Stitcher$Holder the-texture-in mipmap-level-holder-in)))

(defn get-atlas-sprite
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^Stitcher$Holder this]
    (-> this (.getAtlasSprite))))

(defn get-width
  "returns: `int`"
  (^Integer [^Stitcher$Holder this]
    (-> this (.getWidth))))

(defn get-height
  "returns: `int`"
  (^Integer [^Stitcher$Holder this]
    (-> this (.getHeight))))

(defn rotate
  ""
  ([^Stitcher$Holder this]
    (-> this (.rotate))))

(defn rotated?
  "returns: `boolean`"
  (^Boolean [^Stitcher$Holder this]
    (-> this (.isRotated))))

(defn set-new-dimension
  "p-94196-1 - `int`"
  ([^Stitcher$Holder this ^Integer p-94196-1]
    (-> this (.setNewDimension p-94196-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Stitcher$Holder this]
    (-> this (.toString))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.client.renderer.texture.Stitcher$Holder`

  returns: `int`"
  (^Integer [^Stitcher$Holder this ^net.minecraft.client.renderer.texture.Stitcher$Holder p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

