(ns net.minecraft.client.renderer.entity.RenderEntityItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderEntityItem]))

(defn ->render-entity-item
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  p-i-46167-2 - `net.minecraft.client.renderer.RenderItem`"
  (^RenderEntityItem [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^net.minecraft.client.renderer.RenderItem p-i-46167-2]
    (new RenderEntityItem render-manager-in p-i-46167-2)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityItem`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderEntityItem this ^net.minecraft.entity.item.EntityItem entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn should-spread-items?
  "Items should spread out when rendered in 3d?

  returns: `boolean`"
  (^Boolean [^RenderEntityItem this]
    (-> this (.shouldSpreadItems))))

(defn should-bob?
  "Items should have a bob effect

  returns: `boolean`"
  (^Boolean [^RenderEntityItem this]
    (-> this (.shouldBob))))

