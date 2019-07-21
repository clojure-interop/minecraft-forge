(ns net.minecraftforge.client.model.pipeline.LightUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline LightUtil]))

(defn ->light-util
  "Constructor."
  (^LightUtil []
    (new LightUtil )))

(defn *pack
  "from - `float[]`
  to - `int[]`
  format-to - `net.minecraft.client.renderer.vertex.VertexFormat`
  v - `int`
  e - `int`"
  ([from to ^net.minecraft.client.renderer.vertex.VertexFormat format-to ^Integer v ^Integer e]
    (LightUtil/pack from to format-to v e)))

(defn *render-quad-color-slow
  "wr - `net.minecraft.client.renderer.VertexBuffer`
  quad - `net.minecraft.client.renderer.block.model.BakedQuad`
  aux-color - `int`"
  ([^net.minecraft.client.renderer.VertexBuffer wr ^net.minecraft.client.renderer.block.model.BakedQuad quad ^Integer aux-color]
    (LightUtil/renderQuadColorSlow wr quad aux-color)))

(defn *to-side
  "x - `float`
  y - `float`
  z - `float`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Float x ^Float y ^Float z]
    (LightUtil/toSide x y z)))

(defn *render-quad-color
  "wr - `net.minecraft.client.renderer.VertexBuffer`
  quad - `net.minecraft.client.renderer.block.model.BakedQuad`
  aux-color - `int`"
  ([^net.minecraft.client.renderer.VertexBuffer wr ^net.minecraft.client.renderer.block.model.BakedQuad quad ^Integer aux-color]
    (LightUtil/renderQuadColor wr quad aux-color)))

(defn *put-baked-quad
  "consumer - `net.minecraftforge.client.model.pipeline.IVertexConsumer`
  quad - `net.minecraft.client.renderer.block.model.BakedQuad`"
  ([^net.minecraftforge.client.model.pipeline.IVertexConsumer consumer ^net.minecraft.client.renderer.block.model.BakedQuad quad]
    (LightUtil/putBakedQuad consumer quad)))

(defn *diffuse-light
  "x - `float`
  y - `float`
  z - `float`

  returns: `float`"
  (^Float [^Float x ^Float y ^Float z]
    (LightUtil/diffuseLight x y z))
  (^Float [^net.minecraft.util.EnumFacing side]
    (LightUtil/diffuseLight side)))

(defn *get-tessellator
  "returns: `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  (^net.minecraftforge.client.model.pipeline.IVertexConsumer []
    (LightUtil/getTessellator )))

(defn *map-formats
  "from - `net.minecraft.client.renderer.vertex.VertexFormat`
  to - `net.minecraft.client.renderer.vertex.VertexFormat`

  returns: `int[]`"
  ([^net.minecraft.client.renderer.vertex.VertexFormat from ^net.minecraft.client.renderer.vertex.VertexFormat to]
    (LightUtil/mapFormats from to)))

(defn *unpack
  "from - `int[]`
  to - `float[]`
  format-from - `net.minecraft.client.renderer.vertex.VertexFormat`
  v - `int`
  e - `int`"
  ([from to ^net.minecraft.client.renderer.vertex.VertexFormat format-from ^Integer v ^Integer e]
    (LightUtil/unpack from to format-from v e)))

(defn *get-item-consumer
  "returns: `net.minecraftforge.client.model.pipeline.LightUtil$ItemConsumer`"
  (^net.minecraftforge.client.model.pipeline.LightUtil$ItemConsumer []
    (LightUtil/getItemConsumer )))

