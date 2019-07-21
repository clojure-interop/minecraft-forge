(ns net.minecraft.client.renderer.entity.RenderEvokerFangs
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderEvokerFangs]))

(defn ->render-evoker-fangs
  "Constructor.

  p-i-47208-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderEvokerFangs [^net.minecraft.client.renderer.entity.RenderManager p-i-47208-1]
    (new RenderEvokerFangs p-i-47208-1)))

(defn do-render
  "entity - `net.minecraft.entity.projectile.EntityEvokerFangs`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderEvokerFangs this ^net.minecraft.entity.projectile.EntityEvokerFangs entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

