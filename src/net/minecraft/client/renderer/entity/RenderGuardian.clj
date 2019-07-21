(ns net.minecraft.client.renderer.entity.RenderGuardian
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderGuardian]))

(defn ->render-guardian
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderGuardian [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderGuardian render-manager-in)))

(defn should-render?
  "living-entity - `net.minecraft.entity.monster.EntityGuardian`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  cam-x - `double`
  cam-y - `double`
  cam-z - `double`

  returns: `boolean`"
  (^Boolean [^RenderGuardian this ^net.minecraft.entity.monster.EntityGuardian living-entity ^net.minecraft.client.renderer.culling.ICamera camera ^Double cam-x ^Double cam-y ^Double cam-z]
    (-> this (.shouldRender living-entity camera cam-x cam-y cam-z))))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityGuardian`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderGuardian this ^net.minecraft.entity.monster.EntityGuardian entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

