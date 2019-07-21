(ns net.minecraft.client.renderer.entity.RenderVillager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderVillager]))

(defn ->render-villager
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderVillager [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderVillager render-manager-in)))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelVillager`"
  (^net.minecraft.client.model.ModelVillager [^RenderVillager this]
    (-> this (.getMainModel))))

