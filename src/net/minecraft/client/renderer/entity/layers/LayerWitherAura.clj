(ns net.minecraft.client.renderer.entity.layers.LayerWitherAura
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerWitherAura]))

(defn ->layer-wither-aura
  "Constructor.

  wither-renderer-in - `net.minecraft.client.renderer.entity.RenderWither`"
  (^LayerWitherAura [^net.minecraft.client.renderer.entity.RenderWither wither-renderer-in]
    (new LayerWitherAura wither-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.boss.EntityWither`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerWitherAura this ^net.minecraft.entity.boss.EntityWither entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerWitherAura this]
    (-> this (.shouldCombineTextures))))

