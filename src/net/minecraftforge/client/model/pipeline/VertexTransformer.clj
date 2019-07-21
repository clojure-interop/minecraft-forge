(ns net.minecraftforge.client.model.pipeline.VertexTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline VertexTransformer]))

(defn ->vertex-transformer
  "Constructor.

  parent - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  (^VertexTransformer [^net.minecraftforge.client.model.pipeline.IVertexConsumer parent]
    (new VertexTransformer parent)))

(defn get-vertex-format
  "returns: the format that should be used for passed data. - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^VertexTransformer this]
    (-> this (.getVertexFormat))))

(defn set-quad-tint
  "tint - `int`"
  ([^VertexTransformer this ^Integer tint]
    (-> this (.setQuadTint tint))))

(defn set-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^VertexTransformer this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setTexture texture))))

(defn set-quad-orientation
  "orientation - `net.minecraft.util.EnumFacing`"
  ([^VertexTransformer this ^net.minecraft.util.EnumFacing orientation]
    (-> this (.setQuadOrientation orientation))))

(defn set-apply-diffuse-lighting
  "diffuse - `boolean`"
  ([^VertexTransformer this ^Boolean diffuse]
    (-> this (.setApplyDiffuseLighting diffuse))))

(defn put
  "element - `int`
  data - `float`"
  ([^VertexTransformer this ^Integer element ^Float data]
    (-> this (.put element data))))

