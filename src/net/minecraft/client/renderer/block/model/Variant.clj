(ns net.minecraft.client.renderer.block.model.Variant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model Variant]))

(defn ->variant
  "Constructor.

  model-location-in - `net.minecraft.util.ResourceLocation`
  rotation-in - `net.minecraft.client.renderer.block.model.ModelRotation`
  uv-lock-in - `boolean`
  weight-in - `int`"
  (^Variant [^net.minecraft.util.ResourceLocation model-location-in ^net.minecraft.client.renderer.block.model.ModelRotation rotation-in ^Boolean uv-lock-in ^Integer weight-in]
    (new Variant model-location-in rotation-in uv-lock-in weight-in)))

(defn get-weight
  "returns: `int`"
  (^Integer [^Variant this]
    (-> this (.getWeight))))

(defn process
  "base - `net.minecraftforge.client.model.IModel`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^Variant this ^net.minecraftforge.client.model.IModel base]
    (-> this (.process base))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Variant this]
    (-> this (.toString))))

(defn get-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^Variant this]
    (-> this (.getState))))

(defn get-model-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^Variant this]
    (-> this (.getModelLocation))))

(defn get-rotation
  "Deprecated.

  returns: `net.minecraft.client.renderer.block.model.ModelRotation`"
  (^net.minecraft.client.renderer.block.model.ModelRotation [^Variant this]
    (-> this (.getRotation))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Variant this]
    (-> this (.hashCode))))

(defn uv-lock?
  "returns: `boolean`"
  (^Boolean [^Variant this]
    (-> this (.isUvLock))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Variant this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

