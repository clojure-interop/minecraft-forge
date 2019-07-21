(ns net.minecraft.client.renderer.entity.layers.LayerSpiderEyes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerSpiderEyes]))

(defn ->layer-spider-eyes
  "Constructor.

  spider-renderer-in - `net.minecraft.client.renderer.entity.RenderSpider`"
  (^LayerSpiderEyes [^net.minecraft.client.renderer.entity.RenderSpider spider-renderer-in]
    (new LayerSpiderEyes spider-renderer-in)))

(defn do-render-layer
  "entitylivingbase-in - `T`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerSpiderEyes this entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerSpiderEyes this]
    (-> this (.shouldCombineTextures))))

