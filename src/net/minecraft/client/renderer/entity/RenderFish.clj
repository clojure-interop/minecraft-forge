(ns net.minecraft.client.renderer.entity.RenderFish
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderFish]))

(defn ->render-fish
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderFish [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderFish render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityFishHook`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderFish this ^net.minecraft.entity.projectile.EntityFishHook entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

