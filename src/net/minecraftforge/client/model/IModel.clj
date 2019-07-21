(ns net.minecraftforge.client.model.IModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IModel]))

(defn get-dependencies
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^IModel this]
    (-> this (.getDependencies))))

(defn get-textures
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^IModel this]
    (-> this (.getTextures))))

(defn bake
  "state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^IModel this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

(defn get-default-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^IModel this]
    (-> this (.getDefaultState))))

