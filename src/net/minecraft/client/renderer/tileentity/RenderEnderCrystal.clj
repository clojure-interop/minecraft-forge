(ns net.minecraft.client.renderer.tileentity.RenderEnderCrystal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity RenderEnderCrystal]))

(defn ->render-ender-crystal
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderEnderCrystal [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderEnderCrystal render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityEnderCrystal`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderEnderCrystal this ^net.minecraft.entity.item.EntityEnderCrystal entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn should-render?
  "living-entity - `net.minecraft.entity.item.EntityEnderCrystal`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  cam-x - `double`
  cam-y - `double`
  cam-z - `double`

  returns: `boolean`"
  (^Boolean [^RenderEnderCrystal this ^net.minecraft.entity.item.EntityEnderCrystal living-entity ^net.minecraft.client.renderer.culling.ICamera camera ^Double cam-x ^Double cam-y ^Double cam-z]
    (-> this (.shouldRender living-entity camera cam-x cam-y cam-z))))

