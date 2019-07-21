(ns net.minecraft.client.renderer.entity.layers.LayerCreeperCharge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerCreeperCharge]))

(defn ->layer-creeper-charge
  "Constructor.

  creeper-renderer-in - `net.minecraft.client.renderer.entity.RenderCreeper`"
  (^LayerCreeperCharge [^net.minecraft.client.renderer.entity.RenderCreeper creeper-renderer-in]
    (new LayerCreeperCharge creeper-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.monster.EntityCreeper`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerCreeperCharge this ^net.minecraft.entity.monster.EntityCreeper entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerCreeperCharge this]
    (-> this (.shouldCombineTextures))))

