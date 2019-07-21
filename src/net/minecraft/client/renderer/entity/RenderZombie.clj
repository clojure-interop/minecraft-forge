(ns net.minecraft.client.renderer.entity.RenderZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderZombie]))

(defn ->render-zombie
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderZombie [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderZombie render-manager-in)))

