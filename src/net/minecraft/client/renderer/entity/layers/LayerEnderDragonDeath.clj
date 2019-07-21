(ns net.minecraft.client.renderer.entity.layers.LayerEnderDragonDeath
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerEnderDragonDeath]))

(defn ->layer-ender-dragon-death
  "Constructor."
  (^LayerEnderDragonDeath []
    (new LayerEnderDragonDeath )))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.boss.EntityDragon`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerEnderDragonDeath this ^net.minecraft.entity.boss.EntityDragon entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerEnderDragonDeath this]
    (-> this (.shouldCombineTextures))))

