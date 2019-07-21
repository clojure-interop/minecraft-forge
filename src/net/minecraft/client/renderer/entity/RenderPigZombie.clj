(ns net.minecraft.client.renderer.entity.RenderPigZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderPigZombie]))

(defn ->render-pig-zombie
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderPigZombie [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderPigZombie render-manager-in)))

