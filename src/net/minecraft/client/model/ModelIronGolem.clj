(ns net.minecraft.client.model.ModelIronGolem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelIronGolem]))

(defn ->model-iron-golem
  "Constructor.

  p-i-46362-1 - `float`
  p-i-46362-2 - `float`"
  (^ModelIronGolem [^Float p-i-46362-1 ^Float p-i-46362-2]
    (new ModelIronGolem p-i-46362-1 p-i-46362-2))
  (^ModelIronGolem [^Float p-i-1161-1]
    (new ModelIronGolem p-i-1161-1))
  (^ModelIronGolem []
    (new ModelIronGolem )))

(defn iron-golem-head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIronGolem this]
    (-> this .-ironGolemHead)))

(defn iron-golem-body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIronGolem this]
    (-> this .-ironGolemBody)))

(defn iron-golem-right-arm
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIronGolem this]
    (-> this .-ironGolemRightArm)))

(defn iron-golem-left-arm
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIronGolem this]
    (-> this .-ironGolemLeftArm)))

(defn iron-golem-left-leg
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIronGolem this]
    (-> this .-ironGolemLeftLeg)))

(defn iron-golem-right-leg
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIronGolem this]
    (-> this .-ironGolemRightLeg)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelIronGolem this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelIronGolem this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn set-living-animations
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-tick-time - `float`"
  ([^ModelIronGolem this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-tick-time]
    (-> this (.setLivingAnimations entitylivingbase-in limb-swing limb-swing-amount partial-tick-time))))

