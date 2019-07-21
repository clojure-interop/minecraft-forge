(ns net.minecraft.client.renderer.entity.layers.LayerHeldItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerHeldItem]))

(defn ->layer-held-item
  "Constructor.

  living-entity-renderer-in - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerHeldItem [^net.minecraft.client.renderer.entity.RenderLivingBase living-entity-renderer-in]
    (new LayerHeldItem living-entity-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerHeldItem this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerHeldItem this]
    (-> this (.shouldCombineTextures))))

