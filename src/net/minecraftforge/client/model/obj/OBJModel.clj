(ns net.minecraftforge.client.model.obj.OBJModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel]))

(defn ->obj-model
  "Constructor.

  mat-lib - `net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary`
  model-location - `net.minecraft.util.ResourceLocation`
  custom-data - `net.minecraftforge.client.model.obj.OBJModel.CustomData`"
  (^OBJModel [^net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary mat-lib ^net.minecraft.util.ResourceLocation model-location ^net.minecraftforge.client.model.obj.OBJModel.CustomData custom-data]
    (new OBJModel mat-lib model-location custom-data))
  (^OBJModel [^net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary mat-lib ^net.minecraft.util.ResourceLocation model-location]
    (new OBJModel mat-lib model-location)))

(defn get-dependencies
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^OBJModel this]
    (-> this (.getDependencies))))

(defn get-textures
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^OBJModel this]
    (-> this (.getTextures))))

(defn bake
  "state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^OBJModel this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

(defn get-mat-lib
  "returns: `net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary`"
  (^net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary [^OBJModel this]
    (-> this (.getMatLib))))

(defn process
  "Description copied from interface: IModelCustomData

  custom-data - `com.google.common.collect.ImmutableMap`

  returns: a new model, with data applied. - `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^OBJModel this ^com.google.common.collect.ImmutableMap custom-data]
    (-> this (.process custom-data))))

(defn retexture
  "Description copied from interface: IRetexturableModel

  textures - New - `com.google.common.collect.ImmutableMap`

  returns: Model with textures applied. - `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^OBJModel this ^com.google.common.collect.ImmutableMap textures]
    (-> this (.retexture textures))))

(defn get-default-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^OBJModel this]
    (-> this (.getDefaultState))))

