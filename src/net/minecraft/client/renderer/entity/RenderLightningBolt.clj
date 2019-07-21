(ns net.minecraft.client.renderer.entity.RenderLightningBolt
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderLightningBolt]))

(defn ->render-lightning-bolt
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderLightningBolt [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderLightningBolt render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.effect.EntityLightningBolt`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderLightningBolt this ^net.minecraft.entity.effect.EntityLightningBolt entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

