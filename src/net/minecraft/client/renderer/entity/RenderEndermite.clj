(ns net.minecraft.client.renderer.entity.RenderEndermite
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderEndermite]))

(defn ->render-endermite
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderEndermite [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderEndermite render-manager-in)))

