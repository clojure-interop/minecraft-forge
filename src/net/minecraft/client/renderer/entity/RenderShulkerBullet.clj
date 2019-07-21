(ns net.minecraft.client.renderer.entity.RenderShulkerBullet
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderShulkerBullet]))

(defn ->render-shulker-bullet
  "Constructor.

  manager - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderShulkerBullet [^net.minecraft.client.renderer.entity.RenderManager manager]
    (new RenderShulkerBullet manager)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityShulkerBullet`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderShulkerBullet this ^net.minecraft.entity.projectile.EntityShulkerBullet entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

