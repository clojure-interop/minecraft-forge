(ns net.minecraft.client.model.ModelEnderman
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelEnderman]))

(defn ->model-enderman
  "Constructor.

  scale - `float`"
  (^ModelEnderman [^Float scale]
    (new ModelEnderman scale)))

(defn is-carrying
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelEnderman this]
    (-> this .-isCarrying)))

(defn is-attacking
  "Instance Field.

  type: boolean"
  (^Boolean [^ModelEnderman this]
    (-> this .-isAttacking)))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelEnderman this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

