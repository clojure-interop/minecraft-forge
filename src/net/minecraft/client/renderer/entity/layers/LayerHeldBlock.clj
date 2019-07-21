(ns net.minecraft.client.renderer.entity.layers.LayerHeldBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerHeldBlock]))

(defn ->layer-held-block
  "Constructor.

  enderman-renderer-in - `net.minecraft.client.renderer.entity.RenderEnderman`"
  (^LayerHeldBlock [^net.minecraft.client.renderer.entity.RenderEnderman enderman-renderer-in]
    (new LayerHeldBlock enderman-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntityEnderman`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerHeldBlock this ^net.minecraft.entity.monster.EntityEnderman entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerHeldBlock this]
    (-> this (.shouldCombineTextures))))

