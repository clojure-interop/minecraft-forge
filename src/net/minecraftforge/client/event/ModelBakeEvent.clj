(ns net.minecraftforge.client.event.ModelBakeEvent
  "Fired when the ModelManager is notified of the resource manager reloading.
  Called after model registry is setup, but before it's passed to BlockModelShapes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event ModelBakeEvent]))

(defn ->model-bake-event
  "Constructor.

  model-manager - `net.minecraft.client.renderer.block.model.ModelManager`
  model-registry - `net.minecraft.util.registry.IRegistry`
  model-loader - `net.minecraftforge.client.model.ModelLoader`"
  (^ModelBakeEvent [^net.minecraft.client.renderer.block.model.ModelManager model-manager ^net.minecraft.util.registry.IRegistry model-registry ^net.minecraftforge.client.model.ModelLoader model-loader]
    (new ModelBakeEvent model-manager model-registry model-loader)))

(defn get-model-manager
  "returns: `net.minecraft.client.renderer.block.model.ModelManager`"
  (^net.minecraft.client.renderer.block.model.ModelManager [^ModelBakeEvent this]
    (-> this (.getModelManager))))

(defn get-model-registry
  "returns: `net.minecraft.util.registry.IRegistry<net.minecraft.client.renderer.block.model.ModelResourceLocation,net.minecraft.client.renderer.block.model.IBakedModel>`"
  (^net.minecraft.util.registry.IRegistry [^ModelBakeEvent this]
    (-> this (.getModelRegistry))))

(defn get-model-loader
  "returns: `net.minecraftforge.client.model.ModelLoader`"
  (^net.minecraftforge.client.model.ModelLoader [^ModelBakeEvent this]
    (-> this (.getModelLoader))))

