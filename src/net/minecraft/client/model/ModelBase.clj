(ns net.minecraft.client.model.ModelBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBase]))

(defn ->model-base
  "Constructor."
  (^ModelBase []
    (new ModelBase )))

(defn swing-progress
  "Instance Field.

  type: float"
  (^Float [^ModelBase this]
    (-> this .-swingProgress)))

(defn is-riding
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelBase this]
    (-> this .-isRiding)))

(defn is-child
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelBase this]
    (-> this .-isChild)))

(defn box-list
  "Instance Field.

  type: java.util.List<net.minecraft.client.model.ModelRenderer>"
  (^java.util.List [^ModelBase this]
    (-> this .-boxList)))

(defn texture-width
  "Instance Field.

  type: int"
  (^Integer [^ModelBase this]
    (-> this .-textureWidth)))

(defn texture-height
  "Instance Field.

  type: int"
  (^Integer [^ModelBase this]
    (-> this .-textureHeight)))

(defn *copy-model-angles
  "source - `net.minecraft.client.model.ModelRenderer`
  dest - `net.minecraft.client.model.ModelRenderer`"
  ([^net.minecraft.client.model.ModelRenderer source ^net.minecraft.client.model.ModelRenderer dest]
    (ModelBase/copyModelAngles source dest)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelBase this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelBase this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

(defn set-living-animations
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`
  limb-swing - `float`
  limb-swing-amount - `float`
  partial-tick-time - `float`"
  ([^ModelBase this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in ^Float limb-swing ^Float limb-swing-amount ^Float partial-tick-time]
    (-> this (.setLivingAnimations entitylivingbase-in limb-swing limb-swing-amount partial-tick-time))))

(defn get-random-model-box
  "rand - `java.util.Random`

  returns: `net.minecraft.client.model.ModelRenderer`"
  (^net.minecraft.client.model.ModelRenderer [^ModelBase this ^java.util.Random rand]
    (-> this (.getRandomModelBox rand))))

(defn get-texture-offset
  "part-name - `java.lang.String`

  returns: `net.minecraft.client.model.TextureOffset`"
  (^net.minecraft.client.model.TextureOffset [^ModelBase this ^java.lang.String part-name]
    (-> this (.getTextureOffset part-name))))

(defn set-model-attributes
  "model - `net.minecraft.client.model.ModelBase`"
  ([^ModelBase this ^net.minecraft.client.model.ModelBase model]
    (-> this (.setModelAttributes model))))

