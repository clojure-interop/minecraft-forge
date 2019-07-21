(ns net.minecraft.client.model.ModelSheep1
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSheep1]))

(defn ->model-sheep-1
  "Constructor."
  (^ModelSheep1 []
    (new ModelSheep1 )))

(defn set-living-animations
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-tick-time - `float`"
  ([^ModelSheep1 this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-tick-time]
    (-> this (.setLivingAnimations entitylivingbase-in limb-swing limb-swing-amount partial-tick-time))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelSheep1 this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

