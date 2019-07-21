(ns net.minecraft.client.renderer.entity.RenderPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderPlayer]))

(defn ->render-player
  "Constructor.

  render-manager - `net.minecraft.client.renderer.entity.RenderManager`
  use-small-arms - `boolean`"
  (^RenderPlayer [^net.minecraft.client.renderer.entity.RenderManager render-manager ^Boolean use-small-arms]
    (new RenderPlayer render-manager use-small-arms))
  (^RenderPlayer [^net.minecraft.client.renderer.entity.RenderManager render-manager]
    (new RenderPlayer render-manager)))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelPlayer`"
  (^net.minecraft.client.model.ModelPlayer [^RenderPlayer this]
    (-> this (.getMainModel))))

(defn do-render
  "entity - `net.minecraft.client.entity.AbstractClientPlayer`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderPlayer this ^net.minecraft.client.entity.AbstractClientPlayer entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn transform-held-full-3-d-item-layer
  ""
  ([^RenderPlayer this]
    (-> this (.transformHeldFull3DItemLayer))))

(defn render-right-arm
  "client-player - `net.minecraft.client.entity.AbstractClientPlayer`"
  ([^RenderPlayer this ^net.minecraft.client.entity.AbstractClientPlayer client-player]
    (-> this (.renderRightArm client-player))))

(defn render-left-arm
  "client-player - `net.minecraft.client.entity.AbstractClientPlayer`"
  ([^RenderPlayer this ^net.minecraft.client.entity.AbstractClientPlayer client-player]
    (-> this (.renderLeftArm client-player))))

