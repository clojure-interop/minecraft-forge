(ns net.minecraft.client.renderer.entity.layers.LayerArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerArrow]))

(defn ->layer-arrow
  "Constructor.

  renderer-in - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerArrow [^net.minecraft.client.renderer.entity.RenderLivingBase renderer-in]
    (new LayerArrow renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerArrow this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerArrow this]
    (-> this (.shouldCombineTextures))))

