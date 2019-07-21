(ns net.minecraft.client.renderer.entity.RenderWitch
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderWitch]))

(defn ->render-witch
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderWitch [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderWitch render-manager-in)))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelWitch`"
  (^net.minecraft.client.model.ModelWitch [^RenderWitch this]
    (-> this (.getMainModel))))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityWitch`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderWitch this ^net.minecraft.entity.monster.EntityWitch entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn transform-held-full-3-d-item-layer
  ""
  ([^RenderWitch this]
    (-> this (.transformHeldFull3DItemLayer))))

