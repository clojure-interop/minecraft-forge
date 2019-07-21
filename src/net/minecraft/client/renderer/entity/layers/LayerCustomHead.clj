(ns net.minecraft.client.renderer.entity.layers.LayerCustomHead
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity.layers LayerCustomHead]))

(defn ->layer-custom-head
  "Constructor.

  p-i-46120-1 - `net.minecraft.client.model.ModelRenderer`"
  (^LayerCustomHead [^net.minecraft.client.model.ModelRenderer p-i-46120-1]
    (new LayerCustomHead p-i-46120-1)))

(defn do-render-layer
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-ticks - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^LayerCustomHead this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-ticks ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.doRenderLayer entitylivingbase-in limb-swing limb-swing-amount partial-ticks age-in-ticks net-head-yaw head-pitch scale))))

(defn should-combine-textures?
  "returns: `boolean`"
  (^Boolean [^LayerCustomHead this]
    (-> this (.shouldCombineTextures))))

