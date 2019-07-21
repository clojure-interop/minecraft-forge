(ns net.minecraft.client.renderer.entity.RenderGhast
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderGhast]))

(defn ->render-ghast
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderGhast [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderGhast render-manager-in)))

