(ns net.minecraftforge.client.model.IPerspectiveAwareModel$MapWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IPerspectiveAwareModel$MapWrapper]))

(defn ->map-wrapper
  "Constructor.

  parent - `net.minecraft.client.renderer.block.model.IBakedModel`
  transforms - `com.google.common.collect.ImmutableMap`"
  (^IPerspectiveAwareModel$MapWrapper [^net.minecraft.client.renderer.block.model.IBakedModel parent ^com.google.common.collect.ImmutableMap transforms]
    (new IPerspectiveAwareModel$MapWrapper parent transforms)))

(defn *get-transforms
  "state - `net.minecraftforge.common.model.IModelState`

  returns: `com.google.common.collect.ImmutableMap<net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType,net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.collect.ImmutableMap [^net.minecraftforge.common.model.IModelState state]
    (IPerspectiveAwareModel$MapWrapper/getTransforms state)))

(defn *handle-perspective
  "model - `net.minecraft.client.renderer.block.model.IBakedModel`
  transforms - `com.google.common.collect.ImmutableMap`
  camera-transform-type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`

  returns: `org.apache.commons.lang3.tuple.Pair<? extends net.minecraft.client.renderer.block.model.IBakedModel,javax.vecmath.Matrix4f>`"
  ([^net.minecraft.client.renderer.block.model.IBakedModel model ^com.google.common.collect.ImmutableMap transforms ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType camera-transform-type]
    (IPerspectiveAwareModel$MapWrapper/handlePerspective model transforms camera-transform-type)))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^IPerspectiveAwareModel$MapWrapper this]
    (-> this (.isAmbientOcclusion))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^IPerspectiveAwareModel$MapWrapper this]
    (-> this (.isGui3d))))

(defn built-in-renderer?
  "returns: `boolean`"
  (^Boolean [^IPerspectiveAwareModel$MapWrapper this]
    (-> this (.isBuiltInRenderer))))

(defn get-particle-texture
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^IPerspectiveAwareModel$MapWrapper this]
    (-> this (.getParticleTexture))))

(defn get-item-camera-transforms
  "returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^IPerspectiveAwareModel$MapWrapper this]
    (-> this (.getItemCameraTransforms))))

(defn get-quads
  "state - `net.minecraft.block.state.IBlockState`
  side - `net.minecraft.util.EnumFacing`
  rand - `long`

  returns: `java.util.List<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^java.util.List [^IPerspectiveAwareModel$MapWrapper this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing side ^Long rand]
    (-> this (.getQuads state side rand))))

(defn get-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^IPerspectiveAwareModel$MapWrapper this]
    (-> this (.getOverrides))))

(defn handle-perspective
  "camera-transform-type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`

  returns: `org.apache.commons.lang3.tuple.Pair<? extends net.minecraft.client.renderer.block.model.IBakedModel,javax.vecmath.Matrix4f>`"
  ([^IPerspectiveAwareModel$MapWrapper this ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType camera-transform-type]
    (-> this (.handlePerspective camera-transform-type))))

