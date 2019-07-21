(ns net.minecraft.client.model.ModelShulker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelShulker]))

(defn ->model-shulker
  "Constructor."
  (^ModelShulker []
    (new ModelShulker )))

(defn base
  "Instance Constant.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelShulker this]
    (-> this .-base)))

(defn lid
  "Instance Constant.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelShulker this]
    (-> this .-lid)))

(defn head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelShulker this]
    (-> this .-head)))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelShulker this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelShulker this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

