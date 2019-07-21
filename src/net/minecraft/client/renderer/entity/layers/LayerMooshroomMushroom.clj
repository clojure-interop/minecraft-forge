(ns net.minecraft.client.renderer.entity.layers.LayerMooshroomMushroom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerMooshroomMushroom]))

(defn ->layer-mooshroom-mushroom
  "Constructor.

  mooshroom-renderer-in - `net.minecraft.client.renderer.entity.RenderMooshroom`"
  (^LayerMooshroomMushroom [^net.minecraft.client.renderer.entity.RenderMooshroom mooshroom-renderer-in]
    (new LayerMooshroomMushroom mooshroom-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.passive.EntityMooshroom`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerMooshroomMushroom this ^net.minecraft.entity.passive.EntityMooshroom entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerMooshroomMushroom this]
    (-> this (.shouldCombineTextures))))

