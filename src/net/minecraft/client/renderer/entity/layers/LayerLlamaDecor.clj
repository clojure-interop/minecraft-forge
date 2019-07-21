(ns net.minecraft.client.renderer.entity.layers.LayerLlamaDecor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerLlamaDecor]))

(defn ->layer-llama-decor
  "Constructor.

  p-i-47184-1 - `net.minecraft.client.renderer.entity.RenderLlama`"
  (^LayerLlamaDecor [^net.minecraft.client.renderer.entity.RenderLlama p-i-47184-1]
    (new LayerLlamaDecor p-i-47184-1)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.passive.EntityLlama`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerLlamaDecor this ^net.minecraft.entity.passive.EntityLlama entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerLlamaDecor this]
    (-> this (.shouldCombineTextures))))

