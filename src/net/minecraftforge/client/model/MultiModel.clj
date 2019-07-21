(ns net.minecraftforge.client.model.MultiModel
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model MultiModel]))

(defn ->multi-model
  "Constructor.

  Deprecated.

  location - `net.minecraft.util.ResourceLocation`
  base - `net.minecraftforge.client.model.IModel`
  base-state - `net.minecraftforge.common.model.IModelState`
  parts - `com.google.common.collect.ImmutableMap`"
  (^MultiModel [^net.minecraft.util.ResourceLocation location ^net.minecraftforge.client.model.IModel base ^net.minecraftforge.common.model.IModelState base-state ^com.google.common.collect.ImmutableMap parts]
    (new MultiModel location base base-state parts)))

(defn get-dependencies
  "Deprecated.

  returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^MultiModel this]
    (-> this (.getDependencies))))

(defn get-textures
  "Deprecated.

  returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^MultiModel this]
    (-> this (.getTextures))))

(defn bake
  "Deprecated.

  state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^MultiModel this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

(defn get-default-state
  "Deprecated.

  returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^MultiModel this]
    (-> this (.getDefaultState))))

