(ns net.minecraft.client.renderer.entity.RenderLeashKnot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderLeashKnot]))

(defn ->render-leash-knot
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderLeashKnot [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderLeashKnot render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.EntityLeashKnot`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderLeashKnot this ^net.minecraft.entity.EntityLeashKnot entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

