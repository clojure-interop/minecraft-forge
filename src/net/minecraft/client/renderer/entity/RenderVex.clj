(ns net.minecraft.client.renderer.entity.RenderVex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderVex]))

(defn ->render-vex
  "Constructor.

  p-i-47190-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderVex [^net.minecraft.client.renderer.entity.RenderManager p-i-47190-1]
    (new RenderVex p-i-47190-1)))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityVex`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderVex this ^net.minecraft.entity.monster.EntityVex entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

