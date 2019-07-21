(ns net.minecraft.client.renderer.entity.layers.LayerSaddle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerSaddle]))

(defn ->layer-saddle
  "Constructor.

  pig-renderer-in - `net.minecraft.client.renderer.entity.RenderPig`"
  (^LayerSaddle [^net.minecraft.client.renderer.entity.RenderPig pig-renderer-in]
    (new LayerSaddle pig-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.passive.EntityPig`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerSaddle this ^net.minecraft.entity.passive.EntityPig entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerSaddle this]
    (-> this (.shouldCombineTextures))))

