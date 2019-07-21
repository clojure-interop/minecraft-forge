(ns net.minecraft.client.renderer.entity.RenderVindicator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderVindicator]))

(defn ->render-vindicator
  "Constructor.

  p-i-47189-1 - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderVindicator [^net.minecraft.client.renderer.entity.RenderManager p-i-47189-1]
    (new RenderVindicator p-i-47189-1)))

(defn do-render
  "entity - `net.minecraft.entity.monster.EntityMob`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderVindicator this ^net.minecraft.entity.monster.EntityMob entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

