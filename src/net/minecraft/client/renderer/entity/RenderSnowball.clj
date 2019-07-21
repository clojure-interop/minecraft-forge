(ns net.minecraft.client.renderer.entity.RenderSnowball
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSnowball]))

(defn ->render-snowball
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  item-in - `net.minecraft.item.Item`
  item-renderer-in - `net.minecraft.client.renderer.RenderItem`"
  (^RenderSnowball [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^net.minecraft.item.Item item-in ^net.minecraft.client.renderer.RenderItem item-renderer-in]
    (new RenderSnowball render-manager-in item-in item-renderer-in)))

(defn do-render
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderSnowball this entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn get-stack-to-render
  "entity-in - `T`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RenderSnowball this entity-in]
    (-> this (.getStackToRender entity-in))))

