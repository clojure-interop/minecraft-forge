(ns net.minecraft.client.renderer.entity.layers.LayerSheepWool
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerSheepWool]))

(defn ->layer-sheep-wool
  "Constructor.

  sheep-renderer-in - `net.minecraft.client.renderer.entity.RenderSheep`"
  (^LayerSheepWool [^net.minecraft.client.renderer.entity.RenderSheep sheep-renderer-in]
    (new LayerSheepWool sheep-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.passive.EntitySheep`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerSheepWool this ^net.minecraft.entity.passive.EntitySheep entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerSheepWool this]
    (-> this (.shouldCombineTextures))))

