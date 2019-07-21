(ns net.minecraft.client.model.ModelSkeleton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSkeleton]))

(defn ->model-skeleton
  "Constructor.

  model-size - `float`
  p-i-46303-2 - `boolean`"
  (^ModelSkeleton [^Float model-size ^Boolean p-i-46303-2]
    (new ModelSkeleton model-size p-i-46303-2))
  (^ModelSkeleton []
    (new ModelSkeleton )))

(defn set-living-animations
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-tick-time - `float`"
  ([^ModelSkeleton this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-tick-time]
    (-> this (.setLivingAnimations entitylivingbase-in limb-swing limb-swing-amount partial-tick-time))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelSkeleton this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn post-render-arm
  "scale - `float`
  side - `net.minecraft.util.EnumHandSide`"
  ([^ModelSkeleton this ^Float scale ^net.minecraft.util.EnumHandSide side]
    (-> this (.postRenderArm scale side))))

