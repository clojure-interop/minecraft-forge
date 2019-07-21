(ns net.minecraft.client.renderer.entity.RenderCreeper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderCreeper]))

(defn ->render-creeper
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderCreeper [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderCreeper render-manager-in)))

