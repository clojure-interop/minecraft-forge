(ns net.minecraft.client.renderer.entity.RenderMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderMinecart]))

(defn ->render-minecart
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderMinecart [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderMinecart render-manager-in)))

(defn do-render
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderMinecart this entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

