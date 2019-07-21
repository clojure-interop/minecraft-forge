(ns net.minecraft.client.renderer.entity.RenderBlaze
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderBlaze]))

(defn ->render-blaze
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderBlaze [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderBlaze render-manager-in)))

