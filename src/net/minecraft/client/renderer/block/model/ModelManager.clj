(ns net.minecraft.client.renderer.block.model.ModelManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelManager]))

(defn ->model-manager
  "Constructor.

  textures - `net.minecraft.client.renderer.texture.TextureMap`"
  (^ModelManager [^net.minecraft.client.renderer.texture.TextureMap textures]
    (new ModelManager textures)))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^ModelManager this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn get-model
  "model-location - `net.minecraft.client.renderer.block.model.ModelResourceLocation`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ModelManager this ^net.minecraft.client.renderer.block.model.ModelResourceLocation model-location]
    (-> this (.getModel model-location))))

(defn get-missing-model
  "returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ModelManager this]
    (-> this (.getMissingModel))))

(defn get-texture-map
  "returns: `net.minecraft.client.renderer.texture.TextureMap`"
  (^net.minecraft.client.renderer.texture.TextureMap [^ModelManager this]
    (-> this (.getTextureMap))))

(defn get-block-model-shapes
  "returns: `net.minecraft.client.renderer.BlockModelShapes`"
  (^net.minecraft.client.renderer.BlockModelShapes [^ModelManager this]
    (-> this (.getBlockModelShapes))))

