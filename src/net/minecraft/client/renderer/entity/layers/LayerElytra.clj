(ns net.minecraft.client.renderer.entity.layers.LayerElytra
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerElytra]))

(defn ->layer-elytra
  "Constructor.

  p-i-47185-1 - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerElytra [^net.minecraft.client.renderer.entity.RenderLivingBase p-i-47185-1]
    (new LayerElytra p-i-47185-1)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerElytra this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerElytra this]
    (-> this (.shouldCombineTextures))))

