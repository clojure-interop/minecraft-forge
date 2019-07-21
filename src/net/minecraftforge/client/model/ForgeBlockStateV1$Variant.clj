(ns net.minecraftforge.client.model.ForgeBlockStateV1$Variant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ForgeBlockStateV1$Variant]))

(def *-set-value
  "Static Constant.

  type: java.lang.Object"
  ForgeBlockStateV1$Variant/SET_VALUE)

(defn get-custom-data
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`"
  (^com.google.common.collect.ImmutableMap [^ForgeBlockStateV1$Variant this]
    (-> this (.getCustomData))))

(defn get-uv-lock
  "returns: `com.google.common.base.Optional<java.lang.Boolean>`"
  (^com.google.common.base.Optional [^ForgeBlockStateV1$Variant this]
    (-> this (.getUvLock))))

(defn get-submodels
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,java.util.List<net.minecraftforge.client.model.ForgeBlockStateV1$Variant>>`"
  (^com.google.common.collect.ImmutableMap [^ForgeBlockStateV1$Variant this]
    (-> this (.getSubmodels))))

(defn get-gui-3d
  "returns: `com.google.common.base.Optional<java.lang.Boolean>`"
  (^com.google.common.base.Optional [^ForgeBlockStateV1$Variant this]
    (-> this (.getGui3d))))

(defn get-weight
  "returns: `com.google.common.base.Optional<java.lang.Integer>`"
  (^com.google.common.base.Optional [^ForgeBlockStateV1$Variant this]
    (-> this (.getWeight))))

(defn get-only-parts-variant
  "Gets a list containing the single variant of each part.
   Will throw an error if this Variant has multiple variants for a submodel.

  returns: `com.google.common.collect.ImmutableMap<java.lang.String,net.minecraftforge.client.model.BlockStateLoader$SubModel>`"
  (^com.google.common.collect.ImmutableMap [^ForgeBlockStateV1$Variant this]
    (-> this (.getOnlyPartsVariant))))

(defn get-state
  "returns: `com.google.common.base.Optional<net.minecraftforge.common.model.IModelState>`"
  (^com.google.common.base.Optional [^ForgeBlockStateV1$Variant this]
    (-> this (.getState))))

(defn get-smooth
  "returns: `com.google.common.base.Optional<java.lang.Boolean>`"
  (^com.google.common.base.Optional [^ForgeBlockStateV1$Variant this]
    (-> this (.getSmooth))))

(defn get-textures
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`"
  (^com.google.common.collect.ImmutableMap [^ForgeBlockStateV1$Variant this]
    (-> this (.getTextures))))

(defn model-set?
  "returns: `boolean`"
  (^Boolean [^ForgeBlockStateV1$Variant this]
    (-> this (.isModelSet))))

(defn get-model
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^ForgeBlockStateV1$Variant this]
    (-> this (.getModel))))

