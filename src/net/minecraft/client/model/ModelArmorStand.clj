(ns net.minecraft.client.model.ModelArmorStand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelArmorStand]))

(defn ->model-armor-stand
  "Constructor.

  model-size - `float`"
  (^ModelArmorStand [^Float model-size]
    (new ModelArmorStand model-size))
  (^ModelArmorStand []
    (new ModelArmorStand )))

(defn stand-right-side
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelArmorStand this]
    (-> this .-standRightSide)))

(defn stand-left-side
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelArmorStand this]
    (-> this .-standLeftSide)))

(defn stand-waist
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelArmorStand this]
    (-> this .-standWaist)))

(defn stand-base
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelArmorStand this]
    (-> this .-standBase)))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelArmorStand this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelArmorStand this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn post-render-arm
  "scale - `float`
  side - `net.minecraft.util.EnumHandSide`"
  ([^ModelArmorStand this ^Float scale ^net.minecraft.util.EnumHandSide side]
    (-> this (.postRenderArm scale side))))

