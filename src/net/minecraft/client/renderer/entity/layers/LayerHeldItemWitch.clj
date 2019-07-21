(ns net.minecraft.client.renderer.entity.layers.LayerHeldItemWitch
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerHeldItemWitch]))

(defn ->layer-held-item-witch
  "Constructor.

  witch-renderer-in - `net.minecraft.client.renderer.entity.RenderWitch`"
  (^LayerHeldItemWitch [^net.minecraft.client.renderer.entity.RenderWitch witch-renderer-in]
    (new LayerHeldItemWitch witch-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntityWitch`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerHeldItemWitch this ^net.minecraft.entity.monster.EntityWitch entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerHeldItemWitch this]
    (-> this (.shouldCombineTextures))))

