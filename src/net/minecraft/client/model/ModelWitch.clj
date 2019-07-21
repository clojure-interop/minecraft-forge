(ns net.minecraft.client.model.ModelWitch
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelWitch]))

(defn ->model-witch
  "Constructor.

  scale - `float`"
  (^ModelWitch [^Float scale]
    (new ModelWitch scale)))

(defn holding-item
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelWitch this]
    (-> this .-holdingItem)))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelWitch this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

