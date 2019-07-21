(ns net.minecraft.client.renderer.block.model.WeightedBakedModel$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model WeightedBakedModel$Builder]))

(defn ->builder
  "Constructor."
  (^WeightedBakedModel$Builder []
    (new WeightedBakedModel$Builder )))

(defn add
  "model - `net.minecraft.client.renderer.block.model.IBakedModel`
  weight - `int`

  returns: `net.minecraft.client.renderer.block.model.WeightedBakedModel$Builder`"
  (^net.minecraft.client.renderer.block.model.WeightedBakedModel$Builder [^WeightedBakedModel$Builder this ^net.minecraft.client.renderer.block.model.IBakedModel model ^Integer weight]
    (-> this (.add model weight))))

(defn build
  "returns: `net.minecraft.client.renderer.block.model.WeightedBakedModel`"
  (^net.minecraft.client.renderer.block.model.WeightedBakedModel [^WeightedBakedModel$Builder this]
    (-> this (.build))))

(defn first
  "returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^WeightedBakedModel$Builder this]
    (-> this (.first))))

