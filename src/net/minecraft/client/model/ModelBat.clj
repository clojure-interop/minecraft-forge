(ns net.minecraft.client.model.ModelBat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBat]))

(defn ->model-bat
  "Constructor."
  (^ModelBat []
    (new ModelBat )))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelBat this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelBat this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

