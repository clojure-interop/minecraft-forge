(ns net.minecraft.client.renderer.entity.layers.LayerIronGolemFlower
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerIronGolemFlower]))

(defn ->layer-iron-golem-flower
  "Constructor.

  iron-golem-renderer-in - `net.minecraft.client.renderer.entity.RenderIronGolem`"
  (^LayerIronGolemFlower [^net.minecraft.client.renderer.entity.RenderIronGolem iron-golem-renderer-in]
    (new LayerIronGolemFlower iron-golem-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntityIronGolem`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerIronGolemFlower this ^net.minecraft.entity.monster.EntityIronGolem entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerIronGolemFlower this]
    (-> this (.shouldCombineTextures))))

