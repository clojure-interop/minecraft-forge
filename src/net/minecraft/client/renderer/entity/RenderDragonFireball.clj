(ns net.minecraft.client.renderer.entity.RenderDragonFireball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderDragonFireball]))

(defn ->render-dragon-fireball
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderDragonFireball [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderDragonFireball render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityDragonFireball`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderDragonFireball this ^net.minecraft.entity.projectile.EntityDragonFireball entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

