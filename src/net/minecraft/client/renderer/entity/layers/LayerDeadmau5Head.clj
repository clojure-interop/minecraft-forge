(ns net.minecraft.client.renderer.entity.layers.LayerDeadmau5Head
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerDeadmau5Head]))

(defn ->layer-deadmau-5-head
  "Constructor.

  player-renderer-in - `net.minecraft.client.renderer.entity.RenderPlayer`"
  (^LayerDeadmau5Head [^net.minecraft.client.renderer.entity.RenderPlayer player-renderer-in]
    (new LayerDeadmau5Head player-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.client.entity.AbstractClientPlayer`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerDeadmau5Head this ^net.minecraft.client.entity.AbstractClientPlayer entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerDeadmau5Head this]
    (-> this (.shouldCombineTextures))))

