(ns net.minecraft.client.renderer.entity.layers.LayerVillagerArmor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerVillagerArmor]))

(defn ->layer-villager-armor
  "Constructor.

  renderer-in - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerVillagerArmor [^net.minecraft.client.renderer.entity.RenderLivingBase renderer-in]
    (new LayerVillagerArmor renderer-in)))

