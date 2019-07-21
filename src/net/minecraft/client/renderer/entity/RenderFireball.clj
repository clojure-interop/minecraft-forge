(ns net.minecraft.client.renderer.entity.RenderFireball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderFireball]))

(defn ->render-fireball
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  scale-in - `float`"
  (^RenderFireball [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^Float scale-in]
    (new RenderFireball render-manager-in scale-in)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityFireball`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderFireball this ^net.minecraft.entity.projectile.EntityFireball entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

