(ns net.minecraft.client.renderer.entity.RenderTNTPrimed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderTNTPrimed]))

(defn ->render-tnt-primed
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderTNTPrimed [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderTNTPrimed render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityTNTPrimed`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderTNTPrimed this ^net.minecraft.entity.item.EntityTNTPrimed entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

