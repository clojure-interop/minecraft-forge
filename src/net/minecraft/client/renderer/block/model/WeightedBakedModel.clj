(ns net.minecraft.client.renderer.block.model.WeightedBakedModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model WeightedBakedModel]))

(defn ->weighted-baked-model
  "Constructor.

  models-in - `java.util.List`"
  (^WeightedBakedModel [^java.util.List models-in]
    (new WeightedBakedModel models-in)))

(defn get-quads
  "state - `net.minecraft.block.state.IBlockState`
  side - `net.minecraft.util.EnumFacing`
  rand - `long`

  returns: `java.util.List<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^java.util.List [^WeightedBakedModel this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing side ^Long rand]
    (-> this (.getQuads state side rand))))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^WeightedBakedModel this]
    (-> this (.isAmbientOcclusion))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^WeightedBakedModel this]
    (-> this (.isGui3d))))

(defn built-in-renderer?
  "returns: `boolean`"
  (^Boolean [^WeightedBakedModel this]
    (-> this (.isBuiltInRenderer))))

(defn get-particle-texture
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^WeightedBakedModel this]
    (-> this (.getParticleTexture))))

(defn get-item-camera-transforms
  "returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^WeightedBakedModel this]
    (-> this (.getItemCameraTransforms))))

(defn get-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^WeightedBakedModel this]
    (-> this (.getOverrides))))

