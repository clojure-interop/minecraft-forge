(ns net.minecraft.client.model.ModelPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelPlayer]))

(defn ->model-player
  "Constructor.

  model-size - `float`
  small-arms-in - `boolean`"
  (^ModelPlayer [^Float model-size ^Boolean small-arms-in]
    (new ModelPlayer model-size small-arms-in)))

(defn biped-left-armwear
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelPlayer this]
    (-> this .-bipedLeftArmwear)))

(defn biped-right-armwear
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelPlayer this]
    (-> this .-bipedRightArmwear)))

(defn biped-left-legwear
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelPlayer this]
    (-> this .-bipedLeftLegwear)))

(defn biped-right-legwear
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelPlayer this]
    (-> this .-bipedRightLegwear)))

(defn biped-body-wear
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelPlayer this]
    (-> this .-bipedBodyWear)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelPlayer this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn render-deadmau-5-head
  "scale - `float`"
  ([^ModelPlayer this ^Float scale]
    (-> this (.renderDeadmau5Head scale))))

(defn render-cape
  "scale - `float`"
  ([^ModelPlayer this ^Float scale]
    (-> this (.renderCape scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelPlayer this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn set-invisible
  "invisible - `boolean`"
  ([^ModelPlayer this ^Boolean invisible]
    (-> this (.setInvisible invisible))))

(defn post-render-arm
  "scale - `float`
  side - `net.minecraft.util.EnumHandSide`"
  ([^ModelPlayer this ^Float scale ^net.minecraft.util.EnumHandSide side]
    (-> this (.postRenderArm scale side))))

