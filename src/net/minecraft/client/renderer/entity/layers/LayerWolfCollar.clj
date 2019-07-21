(ns net.minecraft.client.renderer.entity.layers.LayerWolfCollar
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerWolfCollar]))

(defn ->layer-wolf-collar
  "Constructor.

  wolf-renderer-in - `net.minecraft.client.renderer.entity.RenderWolf`"
  (^LayerWolfCollar [^net.minecraft.client.renderer.entity.RenderWolf wolf-renderer-in]
    (new LayerWolfCollar wolf-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.passive.EntityWolf`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerWolfCollar this ^net.minecraft.entity.passive.EntityWolf entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerWolfCollar this]
    (-> this (.shouldCombineTextures))))

