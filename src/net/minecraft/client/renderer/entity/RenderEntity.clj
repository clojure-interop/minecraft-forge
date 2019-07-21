(ns net.minecraft.client.renderer.entity.RenderEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderEntity]))

(defn ->render-entity
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderEntity [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderEntity render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderEntity this ^net.minecraft.entity.Entity entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

