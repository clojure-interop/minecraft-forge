(ns net.minecraft.client.renderer.entity.RenderTippedArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderTippedArrow]))

(defn ->render-tipped-arrow
  "Constructor.

  manager - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderTippedArrow [^net.minecraft.client.renderer.entity.RenderManager manager]
    (new RenderTippedArrow manager)))

(def *-res-arrow
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  RenderTippedArrow/RES_ARROW)

(def *-res-tipped-arrow
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  RenderTippedArrow/RES_TIPPED_ARROW)

