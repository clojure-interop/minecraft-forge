(ns net.minecraft.client.renderer.entity.RenderFallingBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderFallingBlock]))

(defn ->render-falling-block
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderFallingBlock [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderFallingBlock render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityFallingBlock`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderFallingBlock this ^net.minecraft.entity.item.EntityFallingBlock entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

