(ns net.minecraft.client.renderer.entity.layers.LayerEnderDragonEyes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerEnderDragonEyes]))

(defn ->layer-ender-dragon-eyes
  "Constructor.

  dragon-renderer-in - `net.minecraft.client.renderer.entity.RenderDragon`"
  (^LayerEnderDragonEyes [^net.minecraft.client.renderer.entity.RenderDragon dragon-renderer-in]
    (new LayerEnderDragonEyes dragon-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.boss.EntityDragon`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerEnderDragonEyes this ^net.minecraft.entity.boss.EntityDragon entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerEnderDragonEyes this]
    (-> this (.shouldCombineTextures))))

