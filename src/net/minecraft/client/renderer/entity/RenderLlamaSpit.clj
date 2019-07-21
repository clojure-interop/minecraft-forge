(ns net.minecraft.client.renderer.entity.RenderLlamaSpit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderLlamaSpit]))

(defn ->render-llama-spit
  "Constructor.

  p-i-47202-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderLlamaSpit [^net.minecraft.client.renderer.entity.RenderManager p-i-47202-1]
    (new RenderLlamaSpit p-i-47202-1)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityLlamaSpit`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderLlamaSpit this ^net.minecraft.entity.projectile.EntityLlamaSpit entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

