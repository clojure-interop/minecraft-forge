(ns net.minecraft.client.renderer.entity.layers.LayerStrayClothing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerStrayClothing]))

(defn ->layer-stray-clothing
  "Constructor.

  p-i-47183-1 - `net.minecraft.client.renderer.entity.RenderLivingBase`"
  (^LayerStrayClothing [^net.minecraft.client.renderer.entity.RenderLivingBase p-i-47183-1]
    (new LayerStrayClothing p-i-47183-1)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntityStray`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerStrayClothing this ^net.minecraft.entity.monster.EntityStray entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerStrayClothing this]
    (-> this (.shouldCombineTextures))))

