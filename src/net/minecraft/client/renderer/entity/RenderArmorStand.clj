(ns net.minecraft.client.renderer.entity.RenderArmorStand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderArmorStand]))

(defn ->render-armor-stand
  "Constructor.

  manager - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderArmorStand [^net.minecraft.client.renderer.entity.RenderManager manager]
    (new RenderArmorStand manager)))

(def *-texture-armor-stand
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  RenderArmorStand/TEXTURE_ARMOR_STAND)

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelArmorStand`"
  (^net.minecraft.client.model.ModelArmorStand [^RenderArmorStand this]
    (-> this (.getMainModel))))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityArmorStand`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderArmorStand this ^net.minecraft.entity.item.EntityArmorStand entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

