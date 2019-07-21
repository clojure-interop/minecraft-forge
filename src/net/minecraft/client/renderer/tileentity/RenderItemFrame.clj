(ns net.minecraft.client.renderer.tileentity.RenderItemFrame
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity RenderItemFrame]))

(defn ->render-item-frame
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  item-renderer-in - `net.minecraft.client.renderer.RenderItem`"
  (^RenderItemFrame [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^net.minecraft.client.renderer.RenderItem item-renderer-in]
    (new RenderItemFrame render-manager-in item-renderer-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityItemFrame`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderItemFrame this ^net.minecraft.entity.item.EntityItemFrame entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

