(ns net.minecraft.client.renderer.entity.RenderAreaEffectCloud
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderAreaEffectCloud]))

(defn ->render-area-effect-cloud
  "Constructor.

  manager - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderAreaEffectCloud [^net.minecraft.client.renderer.entity.RenderManager manager]
    (new RenderAreaEffectCloud manager)))

