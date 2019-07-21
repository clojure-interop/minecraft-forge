(ns net.minecraft.client.renderer.entity.layers.LayerCape
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerCape]))

(defn ->layer-cape
  "Constructor.

  player-renderer-in - `net.minecraft.client.renderer.entity.RenderPlayer`"
  (^LayerCape [^net.minecraft.client.renderer.entity.RenderPlayer player-renderer-in]
    (new LayerCape player-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.client.entity.AbstractClientPlayer`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerCape this ^net.minecraft.client.entity.AbstractClientPlayer entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerCape this]
    (-> this (.shouldCombineTextures))))

