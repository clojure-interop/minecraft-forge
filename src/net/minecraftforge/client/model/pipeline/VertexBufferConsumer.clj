(ns net.minecraftforge.client.model.pipeline.VertexBufferConsumer
  "Assumes VertexFormatElement is present in the VertexBuffer's vertex format."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline VertexBufferConsumer]))

(defn ->vertex-buffer-consumer
  "Constructor.

  renderer - `net.minecraft.client.renderer.VertexBuffer`"
  (^VertexBufferConsumer [^net.minecraft.client.renderer.VertexBuffer renderer]
    (new VertexBufferConsumer renderer)))

(defn get-vertex-format
  "returns: the format that should be used for passed data. - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^VertexBufferConsumer this]
    (-> this (.getVertexFormat))))

(defn put
  "e - `int`
  data - `float`"
  ([^VertexBufferConsumer this ^Integer e ^Float data]
    (-> this (.put e data))))

(defn set-offset
  "offset - `net.minecraft.util.math.BlockPos`"
  ([^VertexBufferConsumer this ^net.minecraft.util.math.BlockPos offset]
    (-> this (.setOffset offset))))

(defn set-quad-tint
  "tint - `int`"
  ([^VertexBufferConsumer this ^Integer tint]
    (-> this (.setQuadTint tint))))

(defn set-quad-orientation
  "orientation - `net.minecraft.util.EnumFacing`"
  ([^VertexBufferConsumer this ^net.minecraft.util.EnumFacing orientation]
    (-> this (.setQuadOrientation orientation))))

(defn set-apply-diffuse-lighting
  "diffuse - `boolean`"
  ([^VertexBufferConsumer this ^Boolean diffuse]
    (-> this (.setApplyDiffuseLighting diffuse))))

(defn set-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^VertexBufferConsumer this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setTexture texture))))

