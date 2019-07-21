(ns net.minecraft.client.model.ModelMagmaCube
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelMagmaCube]))

(defn ->model-magma-cube
  "Constructor."
  (^ModelMagmaCube []
    (new ModelMagmaCube )))

(defn set-living-animations
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-tick-time - `float`"
  ([^ModelMagmaCube this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-tick-time]
    (-> this (.setLivingAnimations entitylivingbase-in limb-swing limb-swing-amount partial-tick-time))))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelMagmaCube this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

