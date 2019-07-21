(ns net.minecraft.client.renderer.entity.RenderSlime
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSlime]))

(defn ->render-slime
  "Constructor.

  p-i-47193-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderSlime [^net.minecraft.client.renderer.entity.RenderManager p-i-47193-1]
    (new RenderSlime p-i-47193-1)))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntitySlime`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderSlime this ^net.minecraft.entity.monster.EntitySlime entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

