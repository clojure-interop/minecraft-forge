(ns net.minecraftforge.client.model.ModelFluid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelFluid]))

(defn ->model-fluid
  "Constructor.

  fluid - `net.minecraftforge.fluids.Fluid`"
  (^ModelFluid [^net.minecraftforge.fluids.Fluid fluid]
    (new ModelFluid fluid)))

(def *-water
  "Static Constant.

  type: net.minecraftforge.client.model.ModelFluid"
  ModelFluid/WATER)

(def *-lava
  "Static Constant.

  type: net.minecraftforge.client.model.ModelFluid"
  ModelFluid/LAVA)

(defn get-dependencies
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ModelFluid this]
    (-> this (.getDependencies))))

(defn get-textures
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ModelFluid this]
    (-> this (.getTextures))))

(defn bake
  "state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ModelFluid this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

(defn get-default-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^ModelFluid this]
    (-> this (.getDefaultState))))

(defn process
  "Description copied from interface: IModelCustomData

  custom-data - `com.google.common.collect.ImmutableMap`

  returns: a new model, with data applied. - `net.minecraftforge.client.model.ModelFluid`"
  (^net.minecraftforge.client.model.ModelFluid [^ModelFluid this ^com.google.common.collect.ImmutableMap custom-data]
    (-> this (.process custom-data))))

