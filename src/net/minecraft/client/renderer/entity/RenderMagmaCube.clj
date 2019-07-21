(ns net.minecraft.client.renderer.entity.RenderMagmaCube
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderMagmaCube]))

(defn ->render-magma-cube
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderMagmaCube [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderMagmaCube render-manager-in)))

