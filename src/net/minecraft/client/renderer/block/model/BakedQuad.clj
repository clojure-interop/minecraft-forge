(ns net.minecraft.client.renderer.block.model.BakedQuad
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BakedQuad]))

(defn ->baked-quad
  "Constructor.

  vertex-data-in - `int[]`
  tint-index-in - `int`
  face-in - `net.minecraft.util.EnumFacing`
  sprite-in - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  apply-diffuse-lighting - `boolean`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^BakedQuad [vertex-data-in ^Integer tint-index-in ^net.minecraft.util.EnumFacing face-in ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite-in ^Boolean apply-diffuse-lighting ^net.minecraft.client.renderer.vertex.VertexFormat format]
    (new BakedQuad vertex-data-in tint-index-in face-in sprite-in apply-diffuse-lighting format))
  (^BakedQuad [vertex-data-in ^Integer tint-index-in ^net.minecraft.util.EnumFacing face-in ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite-in]
    (new BakedQuad vertex-data-in tint-index-in face-in sprite-in)))

(defn get-sprite
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^BakedQuad this]
    (-> this (.getSprite))))

(defn get-vertex-data
  "returns: `int[]`"
  ([^BakedQuad this]
    (-> this (.getVertexData))))

(defn has-tint-index?
  "returns: `boolean`"
  (^Boolean [^BakedQuad this]
    (-> this (.hasTintIndex))))

(defn get-tint-index
  "returns: `int`"
  (^Integer [^BakedQuad this]
    (-> this (.getTintIndex))))

(defn get-face
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^BakedQuad this]
    (-> this (.getFace))))

(defn pipe
  "consumer - consumer to receive the vertex data this producer can provide - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  ([^BakedQuad this ^net.minecraftforge.client.model.pipeline.IVertexConsumer consumer]
    (-> this (.pipe consumer))))

(defn get-format
  "returns: `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^BakedQuad this]
    (-> this (.getFormat))))

(defn should-apply-diffuse-lighting?
  "returns: `boolean`"
  (^Boolean [^BakedQuad this]
    (-> this (.shouldApplyDiffuseLighting))))

