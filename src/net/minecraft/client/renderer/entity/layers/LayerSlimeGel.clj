(ns net.minecraft.client.renderer.entity.layers.LayerSlimeGel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerSlimeGel]))

(defn ->layer-slime-gel
  "Constructor.

  slime-renderer-in - `net.minecraft.client.renderer.entity.RenderSlime`"
  (^LayerSlimeGel [^net.minecraft.client.renderer.entity.RenderSlime slime-renderer-in]
    (new LayerSlimeGel slime-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntitySlime`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerSlimeGel this ^net.minecraft.entity.monster.EntitySlime entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerSlimeGel this]
    (-> this (.shouldCombineTextures))))

