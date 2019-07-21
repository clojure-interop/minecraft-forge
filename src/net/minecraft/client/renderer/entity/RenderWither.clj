(ns net.minecraft.client.renderer.entity.RenderWither
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderWither]))

(defn ->render-wither
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderWither [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderWither render-manager-in)))

