(ns net.minecraftforge.client.model.MultiLayerModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model MultiLayerModel]))

(defn ->multi-layer-model
  "Constructor.

  models - `com.google.common.collect.ImmutableMap`"
  (^MultiLayerModel [^com.google.common.collect.ImmutableMap models]
    (new MultiLayerModel models)))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.client.model.MultiLayerModel"
  MultiLayerModel/INSTANCE)

(defn get-dependencies
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^MultiLayerModel this]
    (-> this (.getDependencies))))

(defn get-textures
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^MultiLayerModel this]
    (-> this (.getTextures))))

(defn bake
  "state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^MultiLayerModel this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

(defn get-default-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^MultiLayerModel this]
    (-> this (.getDefaultState))))

(defn process
  "Description copied from interface: IModelCustomData

  custom-data - `com.google.common.collect.ImmutableMap`

  returns: a new model, with data applied. - `net.minecraftforge.client.model.MultiLayerModel`"
  (^net.minecraftforge.client.model.MultiLayerModel [^MultiLayerModel this ^com.google.common.collect.ImmutableMap custom-data]
    (-> this (.process custom-data))))

