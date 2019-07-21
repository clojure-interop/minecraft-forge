(ns net.minecraft.client.renderer.entity.RenderPainting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderPainting]))

(defn ->render-painting
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderPainting [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderPainting render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityPainting`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderPainting this ^net.minecraft.entity.item.EntityPainting entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

