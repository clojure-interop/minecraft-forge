(ns net.minecraft.client.renderer.entity.RenderEnderman
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderEnderman]))

(defn ->render-enderman
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderEnderman [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderEnderman render-manager-in)))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelEnderman`"
  (^net.minecraft.client.model.ModelEnderman [^RenderEnderman this]
    (-> this (.getMainModel))))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityEnderman`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderEnderman this ^net.minecraft.entity.monster.EntityEnderman entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

