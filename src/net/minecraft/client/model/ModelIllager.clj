(ns net.minecraft.client.model.ModelIllager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelIllager]))

(defn ->model-illager
  "Constructor.

  scale-factor - `float`
  p-i-47227-2 - `float`
  texture-width-in - `int`
  texture-height-in - `int`"
  (^ModelIllager [^Float scale-factor ^Float p-i-47227-2 ^Integer texture-width-in ^Integer texture-height-in]
    (new ModelIllager scale-factor p-i-47227-2 texture-width-in texture-height-in)))

(defn head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-head)))

(defn body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-body)))

(defn arms
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-arms)))

(defn leg-0
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-leg0)))

(defn leg-1
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-leg1)))

(defn nose
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-nose)))

(defn right-arm
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-rightArm)))

(defn left-arm
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this]
    (-> this .-leftArm)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelIllager this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelIllager this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn get-arm
  "p-191216-1 - `net.minecraft.util.EnumHandSide`

  returns: `net.minecraft.client.model.ModelRenderer`"
  (^net.minecraft.client.model.ModelRenderer [^ModelIllager this ^net.minecraft.util.EnumHandSide p-191216-1]
    (-> this (.getArm p-191216-1))))

