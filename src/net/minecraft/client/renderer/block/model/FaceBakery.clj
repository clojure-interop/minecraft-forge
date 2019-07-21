(ns net.minecraft.client.renderer.block.model.FaceBakery
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model FaceBakery]))

(defn ->face-bakery
  "Constructor."
  (^FaceBakery []
    (new FaceBakery )))

(defn *get-facing-from-vertex-data
  "face-data - `int[]`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [face-data]
    (FaceBakery/getFacingFromVertexData face-data)))

(defn make-baked-quad
  "pos-from - `org.lwjgl.util.vector.Vector3f`
  pos-to - `org.lwjgl.util.vector.Vector3f`
  face - `net.minecraft.client.renderer.block.model.BlockPartFace`
  sprite - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  facing - `net.minecraft.util.EnumFacing`
  model-rotation-in - `net.minecraft.client.renderer.block.model.ModelRotation`
  part-rotation - `net.minecraft.client.renderer.block.model.BlockPartRotation`
  uv-locked - `boolean`
  shade - `boolean`

  returns: `net.minecraft.client.renderer.block.model.BakedQuad`"
  (^net.minecraft.client.renderer.block.model.BakedQuad [^FaceBakery this ^org.lwjgl.util.vector.Vector3f pos-from ^org.lwjgl.util.vector.Vector3f pos-to ^net.minecraft.client.renderer.block.model.BlockPartFace face ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite ^net.minecraft.util.EnumFacing facing ^net.minecraft.client.renderer.block.model.ModelRotation model-rotation-in ^net.minecraft.client.renderer.block.model.BlockPartRotation part-rotation ^Boolean uv-locked ^Boolean shade]
    (-> this (.makeBakedQuad pos-from pos-to face sprite facing model-rotation-in part-rotation uv-locked shade))))

(defn rotate-vertex
  "p-188011-1 - `org.lwjgl.util.vector.Vector3f`
  p-188011-2 - `net.minecraft.util.EnumFacing`
  p-188011-3 - `int`
  p-188011-4 - `net.minecraft.client.renderer.block.model.ModelRotation`

  returns: `int`"
  (^Integer [^FaceBakery this ^org.lwjgl.util.vector.Vector3f p-188011-1 ^net.minecraft.util.EnumFacing p-188011-2 ^Integer p-188011-3 ^net.minecraft.client.renderer.block.model.ModelRotation p-188011-4]
    (-> this (.rotateVertex p-188011-1 p-188011-2 p-188011-3 p-188011-4))))

