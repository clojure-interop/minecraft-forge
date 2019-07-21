(ns net.minecraft.client.renderer.entity.RenderSilverfish
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSilverfish]))

(defn ->render-silverfish
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderSilverfish [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderSilverfish render-manager-in)))

