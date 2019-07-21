(ns net.minecraftforge.client.model.BlockStateLoader$SubModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model BlockStateLoader$SubModel]))

(defn ->sub-model
  "Constructor.

  state - `net.minecraftforge.common.model.IModelState`
  uv-lock - `boolean`
  smooth - `boolean`
  gui-3d - `boolean`
  textures - `com.google.common.collect.ImmutableMap`
  model - `net.minecraft.util.ResourceLocation`
  custom-data - `com.google.common.collect.ImmutableMap`"
  (^BlockStateLoader$SubModel [^net.minecraftforge.common.model.IModelState state ^Boolean uv-lock ^Boolean smooth ^Boolean gui-3d ^com.google.common.collect.ImmutableMap textures ^net.minecraft.util.ResourceLocation model ^com.google.common.collect.ImmutableMap custom-data]
    (new BlockStateLoader$SubModel state uv-lock smooth gui-3d textures model custom-data)))

(defn get-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^BlockStateLoader$SubModel this]
    (-> this (.getState))))

(defn uv-lock?
  "returns: `boolean`"
  (^Boolean [^BlockStateLoader$SubModel this]
    (-> this (.isUVLock))))

(defn get-textures
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`"
  (^com.google.common.collect.ImmutableMap [^BlockStateLoader$SubModel this]
    (-> this (.getTextures))))

(defn get-model-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^BlockStateLoader$SubModel this]
    (-> this (.getModelLocation))))

(defn get-custom-data
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`"
  (^com.google.common.collect.ImmutableMap [^BlockStateLoader$SubModel this]
    (-> this (.getCustomData))))

