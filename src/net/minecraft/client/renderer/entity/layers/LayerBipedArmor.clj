(ns net.minecraft.client.renderer.entity.layers.LayerBipedArmor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerBipedArmor]))

(defn ->layer-biped-armor
  "Constructor.

  renderer-in - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerBipedArmor [^net.minecraft.client.renderer.entity.RenderLivingBase renderer-in]
    (new LayerBipedArmor renderer-in)))

