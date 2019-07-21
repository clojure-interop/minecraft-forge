(ns net.minecraft.client.renderer.entity.RenderXPOrb
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderXPOrb]))

(defn ->render-xp-orb
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderXPOrb [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderXPOrb render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityXPOrb`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderXPOrb this ^net.minecraft.entity.item.EntityXPOrb entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

