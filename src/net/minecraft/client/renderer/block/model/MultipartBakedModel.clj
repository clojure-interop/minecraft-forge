(ns net.minecraft.client.renderer.block.model.MultipartBakedModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model MultipartBakedModel]))

(defn ->multipart-baked-model
  "Constructor.

  selectors-in - `java.util.Map`"
  (^MultipartBakedModel [^java.util.Map selectors-in]
    (new MultipartBakedModel selectors-in)))

(defn get-quads
  "state - `net.minecraft.block.state.IBlockState`
  side - `net.minecraft.util.EnumFacing`
  rand - `long`

  returns: `java.util.List<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^java.util.List [^MultipartBakedModel this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing side ^Long rand]
    (-> this (.getQuads state side rand))))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^MultipartBakedModel this]
    (-> this (.isAmbientOcclusion))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^MultipartBakedModel this]
    (-> this (.isGui3d))))

(defn built-in-renderer?
  "returns: `boolean`"
  (^Boolean [^MultipartBakedModel this]
    (-> this (.isBuiltInRenderer))))

(defn get-particle-texture
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^MultipartBakedModel this]
    (-> this (.getParticleTexture))))

(defn get-item-camera-transforms
  "returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^MultipartBakedModel this]
    (-> this (.getItemCameraTransforms))))

(defn get-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^MultipartBakedModel this]
    (-> this (.getOverrides))))

