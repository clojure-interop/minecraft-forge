(ns net.minecraft.client.renderer.entity.RenderArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderArrow]))

(defn ->render-arrow
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderArrow [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderArrow render-manager-in)))

(defn do-render
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderArrow this entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

