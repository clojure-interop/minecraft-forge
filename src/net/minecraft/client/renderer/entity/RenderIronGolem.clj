(ns net.minecraft.client.renderer.entity.RenderIronGolem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderIronGolem]))

(defn ->render-iron-golem
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderIronGolem [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderIronGolem render-manager-in)))

