(ns net.minecraft.client.renderer.entity.RenderWolf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderWolf]))

(defn ->render-wolf
  "Constructor.

  p-i-47187-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderWolf [^net.minecraft.client.renderer.entity.RenderManager p-i-47187-1]
    (new RenderWolf p-i-47187-1)))

(defn do-render
  "entity - `net.minecraft.entity.passive.EntityWolf`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderWolf this ^net.minecraft.entity.passive.EntityWolf entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

