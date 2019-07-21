(ns net.minecraftforge.client.model.pipeline.UnpackedBakedQuad
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline UnpackedBakedQuad]))

(defn ->unpacked-baked-quad
  "Constructor.

  unpacked-data - `float[][][]`
  tint - `int`
  orientation - `net.minecraft.util.EnumFacing`
  texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  apply-diffuse-lighting - `boolean`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^UnpackedBakedQuad [unpacked-data ^Integer tint ^net.minecraft.util.EnumFacing orientation ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture ^Boolean apply-diffuse-lighting ^net.minecraft.client.renderer.vertex.VertexFormat format]
    (new UnpackedBakedQuad unpacked-data tint orientation texture apply-diffuse-lighting format)))

(defn get-vertex-data
  "returns: `int[]`"
  ([^UnpackedBakedQuad this]
    (-> this (.getVertexData))))

(defn pipe
  "consumer - consumer to receive the vertex data this producer can provide - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  ([^UnpackedBakedQuad this ^net.minecraftforge.client.model.pipeline.IVertexConsumer consumer]
    (-> this (.pipe consumer))))

