(ns net.minecraft.client.renderer.entity.RenderLiving
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderLiving]))

(defn ->render-living
  "Constructor.

  rendermanager-in - `net.minecraft.client.renderer.entity.RenderManager`
  modelbase-in - `net.minecraft.client.model.ModelBase`
  shadowsize-in - `float`"
  (^RenderLiving [^net.minecraft.client.renderer.entity.RenderManager rendermanager-in ^net.minecraft.client.model.ModelBase modelbase-in ^Float shadowsize-in]
    (new RenderLiving rendermanager-in modelbase-in shadowsize-in)))

(defn should-render?
  "living-entity - `T`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  cam-x - `double`
  cam-y - `double`
  cam-z - `double`

  returns: `boolean`"
  (^Boolean [^RenderLiving this living-entity ^net.minecraft.client.renderer.culling.ICamera camera ^Double cam-x ^Double cam-y ^Double cam-z]
    (-> this (.shouldRender living-entity camera cam-x cam-y cam-z))))

(defn do-render
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderLiving this entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn set-lightmap
  "entity-living-in - `T`
  partial-ticks - `float`"
  ([^RenderLiving this entity-living-in ^Float partial-ticks]
    (-> this (.setLightmap entity-living-in partial-ticks))))

