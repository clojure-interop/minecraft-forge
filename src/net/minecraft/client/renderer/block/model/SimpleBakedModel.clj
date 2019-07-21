(ns net.minecraft.client.renderer.block.model.SimpleBakedModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model SimpleBakedModel]))

(defn ->simple-baked-model
  "Constructor.

  general-quads-in - `java.util.List`
  face-quads-in - `java.util.Map`
  ambient-occlusion-in - `boolean`
  gui-3d-in - `boolean`
  texture-in - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  camera-transforms-in - `net.minecraft.client.renderer.block.model.ItemCameraTransforms`
  item-override-list-in - `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^SimpleBakedModel [^java.util.List general-quads-in ^java.util.Map face-quads-in ^Boolean ambient-occlusion-in ^Boolean gui-3d-in ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture-in ^net.minecraft.client.renderer.block.model.ItemCameraTransforms camera-transforms-in ^net.minecraft.client.renderer.block.model.ItemOverrideList item-override-list-in]
    (new SimpleBakedModel general-quads-in face-quads-in ambient-occlusion-in gui-3d-in texture-in camera-transforms-in item-override-list-in)))

(defn get-quads
  "state - `net.minecraft.block.state.IBlockState`
  side - `net.minecraft.util.EnumFacing`
  rand - `long`

  returns: `java.util.List<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^java.util.List [^SimpleBakedModel this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing side ^Long rand]
    (-> this (.getQuads state side rand))))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^SimpleBakedModel this]
    (-> this (.isAmbientOcclusion))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^SimpleBakedModel this]
    (-> this (.isGui3d))))

(defn built-in-renderer?
  "returns: `boolean`"
  (^Boolean [^SimpleBakedModel this]
    (-> this (.isBuiltInRenderer))))

(defn get-particle-texture
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^SimpleBakedModel this]
    (-> this (.getParticleTexture))))

(defn get-item-camera-transforms
  "returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^SimpleBakedModel this]
    (-> this (.getItemCameraTransforms))))

(defn get-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^SimpleBakedModel this]
    (-> this (.getOverrides))))

