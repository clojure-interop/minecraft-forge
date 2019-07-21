(ns net.minecraft.client.renderer.entity.RenderBiped
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderBiped]))

(defn ->render-biped
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  model-biped-in - `net.minecraft.client.model.ModelBiped`
  shadow-size - `float`"
  (^RenderBiped [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^net.minecraft.client.model.ModelBiped model-biped-in ^Float shadow-size]
    (new RenderBiped render-manager-in model-biped-in shadow-size)))

(defn transform-held-full-3-d-item-layer
  ""
  ([^RenderBiped this]
    (-> this (.transformHeldFull3DItemLayer))))

