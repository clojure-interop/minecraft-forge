(ns net.minecraftforge.client.model.pipeline.IVertexConsumer
  "Assumes that the data length is not less than e.getElementCount().
  Also assumes that element index passed will increment from 0 to format.getElementCount() - 1.
  Normal, Color and UV are assumed to be in 0-1 range."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline IVertexConsumer]))

(defn get-vertex-format
  "returns: the format that should be used for passed data. - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^IVertexConsumer this]
    (-> this (.getVertexFormat))))

(defn set-quad-tint
  "tint - `int`"
  ([^IVertexConsumer this ^Integer tint]
    (-> this (.setQuadTint tint))))

(defn set-quad-orientation
  "orientation - `net.minecraft.util.EnumFacing`"
  ([^IVertexConsumer this ^net.minecraft.util.EnumFacing orientation]
    (-> this (.setQuadOrientation orientation))))

(defn set-apply-diffuse-lighting
  "diffuse - `boolean`"
  ([^IVertexConsumer this ^Boolean diffuse]
    (-> this (.setApplyDiffuseLighting diffuse))))

(defn set-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^IVertexConsumer this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setTexture texture))))

(defn put
  "element - `int`
  data - `float`"
  ([^IVertexConsumer this ^Integer element ^Float data]
    (-> this (.put element data))))

