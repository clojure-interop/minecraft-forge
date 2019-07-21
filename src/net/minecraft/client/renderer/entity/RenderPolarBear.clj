(ns net.minecraft.client.renderer.entity.RenderPolarBear
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderPolarBear]))

(defn ->render-polar-bear
  "Constructor.

  p-i-47197-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderPolarBear [^net.minecraft.client.renderer.entity.RenderManager p-i-47197-1]
    (new RenderPolarBear p-i-47197-1)))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityPolarBear`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderPolarBear this ^net.minecraft.entity.monster.EntityPolarBear entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

