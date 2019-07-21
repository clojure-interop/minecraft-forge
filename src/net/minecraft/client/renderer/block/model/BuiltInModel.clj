(ns net.minecraft.client.renderer.block.model.BuiltInModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BuiltInModel]))

(defn ->built-in-model
  "Constructor.

  p-i-46537-1 - `net.minecraft.client.renderer.block.model.ItemCameraTransforms`
  p-i-46537-2 - `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^BuiltInModel [^net.minecraft.client.renderer.block.model.ItemCameraTransforms p-i-46537-1 ^net.minecraft.client.renderer.block.model.ItemOverrideList p-i-46537-2]
    (new BuiltInModel p-i-46537-1 p-i-46537-2)))

(defn get-quads
  "state - `net.minecraft.block.state.IBlockState`
  side - `net.minecraft.util.EnumFacing`
  rand - `long`

  returns: `java.util.List<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^java.util.List [^BuiltInModel this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing side ^Long rand]
    (-> this (.getQuads state side rand))))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^BuiltInModel this]
    (-> this (.isAmbientOcclusion))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^BuiltInModel this]
    (-> this (.isGui3d))))

(defn built-in-renderer?
  "returns: `boolean`"
  (^Boolean [^BuiltInModel this]
    (-> this (.isBuiltInRenderer))))

(defn get-particle-texture
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^BuiltInModel this]
    (-> this (.getParticleTexture))))

(defn get-item-camera-transforms
  "returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^BuiltInModel this]
    (-> this (.getItemCameraTransforms))))

(defn get-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^BuiltInModel this]
    (-> this (.getOverrides))))

