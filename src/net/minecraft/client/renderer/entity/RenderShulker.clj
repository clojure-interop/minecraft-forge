(ns net.minecraft.client.renderer.entity.RenderShulker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderShulker]))

(defn ->render-shulker
  "Constructor.

  p-i-47194-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderShulker [^net.minecraft.client.renderer.entity.RenderManager p-i-47194-1]
    (new RenderShulker p-i-47194-1)))

(def *-shulker-endergolem-texture
  "Static Constant.

  type: net.minecraft.util.ResourceLocation[]"
  RenderShulker/SHULKER_ENDERGOLEM_TEXTURE)

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelShulker`"
  (^net.minecraft.client.model.ModelShulker [^RenderShulker this]
    (-> this (.getMainModel))))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityShulker`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderShulker this ^net.minecraft.entity.monster.EntityShulker entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn should-render?
  "living-entity - `net.minecraft.entity.monster.EntityShulker`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  cam-x - `double`
  cam-y - `double`
  cam-z - `double`

  returns: `boolean`"
  (^Boolean [^RenderShulker this ^net.minecraft.entity.monster.EntityShulker living-entity ^net.minecraft.client.renderer.culling.ICamera camera ^Double cam-x ^Double cam-y ^Double cam-z]
    (-> this (.shouldRender living-entity camera cam-x cam-y cam-z))))

