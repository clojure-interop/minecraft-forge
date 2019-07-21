(ns net.minecraft.client.renderer.entity.RenderSnowMan
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSnowMan]))

(defn ->render-snow-man
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderSnowMan [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderSnowMan render-manager-in)))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelSnowMan`"
  (^net.minecraft.client.model.ModelSnowMan [^RenderSnowMan this]
    (-> this (.getMainModel))))

