(ns net.minecraft.client.renderer.block.model.IBakedModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model IBakedModel]))

(defn get-quads
  "state - `net.minecraft.block.state.IBlockState`
  side - `net.minecraft.util.EnumFacing`
  rand - `long`

  returns: `java.util.List<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^java.util.List [^IBakedModel this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing side ^Long rand]
    (-> this (.getQuads state side rand))))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^IBakedModel this]
    (-> this (.isAmbientOcclusion))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^IBakedModel this]
    (-> this (.isGui3d))))

(defn built-in-renderer?
  "returns: `boolean`"
  (^Boolean [^IBakedModel this]
    (-> this (.isBuiltInRenderer))))

(defn get-particle-texture
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^IBakedModel this]
    (-> this (.getParticleTexture))))

(defn get-item-camera-transforms
  "Deprecated.

  returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^IBakedModel this]
    (-> this (.getItemCameraTransforms))))

(defn get-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^IBakedModel this]
    (-> this (.getOverrides))))

