(ns net.minecraft.client.renderer.texture.Stitcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture Stitcher]))

(defn ->stitcher
  "Constructor.

  max-width-in - `int`
  max-height-in - `int`
  max-tile-dimension-in - `int`
  mipmap-level-stitcher-in - `int`"
  (^Stitcher [^Integer max-width-in ^Integer max-height-in ^Integer max-tile-dimension-in ^Integer mipmap-level-stitcher-in]
    (new Stitcher max-width-in max-height-in max-tile-dimension-in mipmap-level-stitcher-in)))

(defn get-current-width
  "returns: `int`"
  (^Integer [^Stitcher this]
    (-> this (.getCurrentWidth))))

(defn get-current-height
  "returns: `int`"
  (^Integer [^Stitcher this]
    (-> this (.getCurrentHeight))))

(defn add-sprite
  "texture-atlas - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^Stitcher this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture-atlas]
    (-> this (.addSprite texture-atlas))))

(defn do-stitch
  ""
  ([^Stitcher this]
    (-> this (.doStitch))))

(defn get-stich-slots
  "returns: `java.util.List<net.minecraft.client.renderer.texture.TextureAtlasSprite>`"
  (^java.util.List [^Stitcher this]
    (-> this (.getStichSlots))))

