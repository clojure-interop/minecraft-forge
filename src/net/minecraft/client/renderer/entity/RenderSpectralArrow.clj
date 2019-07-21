(ns net.minecraft.client.renderer.entity.RenderSpectralArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderSpectralArrow]))

(defn ->render-spectral-arrow
  "Constructor.

  manager - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderSpectralArrow [^net.minecraft.client.renderer.entity.RenderManager manager]
    (new RenderSpectralArrow manager)))

(def *-res-spectral-arrow
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  RenderSpectralArrow/RES_SPECTRAL_ARROW)

