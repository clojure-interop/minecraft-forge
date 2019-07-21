(ns net.minecraft.client.renderer.entity.layers.LayerSnowmanHead
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerSnowmanHead]))

(defn ->layer-snowman-head
  "Constructor.

  snow-man-renderer-in - `net.minecraft.client.renderer.entity.RenderSnowMan`"
  (^LayerSnowmanHead [^net.minecraft.client.renderer.entity.RenderSnowMan snow-man-renderer-in]
    (new LayerSnowmanHead snow-man-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntitySnowman`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerSnowmanHead this ^net.minecraft.entity.monster.EntitySnowman entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerSnowmanHead this]
    (-> this (.shouldCombineTextures))))

