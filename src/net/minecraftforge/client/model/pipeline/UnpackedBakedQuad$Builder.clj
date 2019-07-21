(ns net.minecraftforge.client.model.pipeline.UnpackedBakedQuad$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline UnpackedBakedQuad$Builder]))

(defn ->builder
  "Constructor.

  format - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^UnpackedBakedQuad$Builder [^net.minecraft.client.renderer.vertex.VertexFormat format]
    (new UnpackedBakedQuad$Builder format)))

(defn get-vertex-format
  "returns: the format that should be used for passed data. - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^UnpackedBakedQuad$Builder this]
    (-> this (.getVertexFormat))))

(defn set-contract-u-vs
  "value - `boolean`"
  ([^UnpackedBakedQuad$Builder this ^Boolean value]
    (-> this (.setContractUVs value))))

(defn set-quad-tint
  "tint - `int`"
  ([^UnpackedBakedQuad$Builder this ^Integer tint]
    (-> this (.setQuadTint tint))))

(defn set-quad-orientation
  "orientation - `net.minecraft.util.EnumFacing`"
  ([^UnpackedBakedQuad$Builder this ^net.minecraft.util.EnumFacing orientation]
    (-> this (.setQuadOrientation orientation))))

(defn set-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^UnpackedBakedQuad$Builder this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setTexture texture))))

(defn set-apply-diffuse-lighting
  "diffuse - `boolean`"
  ([^UnpackedBakedQuad$Builder this ^Boolean diffuse]
    (-> this (.setApplyDiffuseLighting diffuse))))

(defn put
  "element - `int`
  data - `float`"
  ([^UnpackedBakedQuad$Builder this ^Integer element ^Float data]
    (-> this (.put element data))))

(defn build
  "returns: `net.minecraftforge.client.model.pipeline.UnpackedBakedQuad`"
  (^net.minecraftforge.client.model.pipeline.UnpackedBakedQuad [^UnpackedBakedQuad$Builder this]
    (-> this (.build))))

