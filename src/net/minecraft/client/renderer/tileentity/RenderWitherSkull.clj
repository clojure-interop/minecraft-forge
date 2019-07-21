(ns net.minecraft.client.renderer.tileentity.RenderWitherSkull
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity RenderWitherSkull]))

(defn ->render-wither-skull
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderWitherSkull [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderWitherSkull render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityWitherSkull`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderWitherSkull this ^net.minecraft.entity.projectile.EntityWitherSkull entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

