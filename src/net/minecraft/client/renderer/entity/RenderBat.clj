(ns net.minecraft.client.renderer.entity.RenderBat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderBat]))

(defn ->render-bat
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderBat [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderBat render-manager-in)))

