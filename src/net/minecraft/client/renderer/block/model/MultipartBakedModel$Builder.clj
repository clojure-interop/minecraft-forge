(ns net.minecraft.client.renderer.block.model.MultipartBakedModel$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model MultipartBakedModel$Builder]))

(defn ->builder
  "Constructor."
  (^MultipartBakedModel$Builder []
    (new MultipartBakedModel$Builder )))

(defn put-model
  "predicate - `com.google.common.base.Predicate`
  model - `net.minecraft.client.renderer.block.model.IBakedModel`"
  ([^MultipartBakedModel$Builder this ^com.google.common.base.Predicate predicate ^net.minecraft.client.renderer.block.model.IBakedModel model]
    (-> this (.putModel predicate model))))

(defn make-multipart-model
  "returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^MultipartBakedModel$Builder this]
    (-> this (.makeMultipartModel))))

