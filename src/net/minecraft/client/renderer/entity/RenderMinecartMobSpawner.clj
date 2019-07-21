(ns net.minecraft.client.renderer.entity.RenderMinecartMobSpawner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderMinecartMobSpawner]))

(defn ->render-minecart-mob-spawner
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderMinecartMobSpawner [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderMinecartMobSpawner render-manager-in)))

