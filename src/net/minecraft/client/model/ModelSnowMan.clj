(ns net.minecraft.client.model.ModelSnowMan
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSnowMan]))

(defn ->model-snow-man
  "Constructor."
  (^ModelSnowMan []
    (new ModelSnowMan )))

(defn body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSnowMan this]
    (-> this .-body)))

(defn bottom-body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSnowMan this]
    (-> this .-bottomBody)))

(defn head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSnowMan this]
    (-> this .-head)))

(defn right-hand
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSnowMan this]
    (-> this .-rightHand)))

(defn left-hand
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSnowMan this]
    (-> this .-leftHand)))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelSnowMan this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelSnowMan this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

