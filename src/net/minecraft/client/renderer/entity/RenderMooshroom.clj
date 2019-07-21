(ns net.minecraft.client.renderer.entity.RenderMooshroom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderMooshroom]))

(defn ->render-mooshroom
  "Constructor.

  p-i-47200-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderMooshroom [^net.minecraft.client.renderer.entity.RenderManager p-i-47200-1]
    (new RenderMooshroom p-i-47200-1)))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelCow`"
  (^net.minecraft.client.model.ModelCow [^RenderMooshroom this]
    (-> this (.getMainModel))))

