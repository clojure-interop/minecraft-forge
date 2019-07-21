(ns net.minecraft.client.model.ModelBiped
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBiped]))

(defn ->model-biped
  "Constructor.

  model-size - `float`
  p-i-1149-2 - `float`
  texture-width-in - `int`
  texture-height-in - `int`"
  (^ModelBiped [^Float model-size ^Float p-i-1149-2 ^Integer texture-width-in ^Integer texture-height-in]
    (new ModelBiped model-size p-i-1149-2 texture-width-in texture-height-in))
  (^ModelBiped [^Float model-size]
    (new ModelBiped model-size))
  (^ModelBiped []
    (new ModelBiped )))

(defn biped-head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedHead)))

(defn biped-headwear
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedHeadwear)))

(defn biped-body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedBody)))

(defn biped-right-arm
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedRightArm)))

(defn biped-left-arm
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedLeftArm)))

(defn biped-right-leg
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedRightLeg)))

(defn biped-left-leg
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBiped this]
    (-> this .-bipedLeftLeg)))

(defn left-arm-pose
  "Instance Field.

  type: net.minecraft.client.model.ModelBiped$ArmPose"
  (^net.minecraft.client.model.ModelBiped$ArmPose [^ModelBiped this]
    (-> this .-leftArmPose)))

(defn right-arm-pose
  "Instance Field.

  type: net.minecraft.client.model.ModelBiped$ArmPose"
  (^net.minecraft.client.model.ModelBiped$ArmPose [^ModelBiped this]
    (-> this .-rightArmPose)))

(defn is-sneak
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelBiped this]
    (-> this .-isSneak)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelBiped this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelBiped this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn set-model-attributes
  "model - `net.minecraft.client.model.ModelBase`"
  ([^ModelBiped this ^net.minecraft.client.model.ModelBase model]
    (-> this (.setModelAttributes model))))

(defn set-invisible
  "invisible - `boolean`"
  ([^ModelBiped this ^Boolean invisible]
    (-> this (.setInvisible invisible))))

(defn post-render-arm
  "scale - `float`
  side - `net.minecraft.util.EnumHandSide`"
  ([^ModelBiped this ^Float scale ^net.minecraft.util.EnumHandSide side]
    (-> this (.postRenderArm scale side))))

