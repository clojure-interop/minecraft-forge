(ns net.minecraftforge.event.entity.living.EnderTeleportEvent
  "Event for when an Enderman/Shulker teleports or an ender pearl is used.  Can be used to either modify the target position, or cancel the teleport outright."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living EnderTeleportEvent]))

(defn ->ender-teleport-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  target-x - `double`
  target-y - `double`
  target-z - `double`
  attack-damage - `float`"
  (^EnderTeleportEvent [^net.minecraft.entity.EntityLivingBase entity ^Double target-x ^Double target-y ^Double target-z ^Float attack-damage]
    (new EnderTeleportEvent entity target-x target-y target-z attack-damage)))

(defn get-target-x
  "returns: `double`"
  (^Double [^EnderTeleportEvent this]
    (-> this (.getTargetX))))

(defn set-target-x
  "target-x - `double`"
  ([^EnderTeleportEvent this ^Double target-x]
    (-> this (.setTargetX target-x))))

(defn get-target-y
  "returns: `double`"
  (^Double [^EnderTeleportEvent this]
    (-> this (.getTargetY))))

(defn set-target-y
  "target-y - `double`"
  ([^EnderTeleportEvent this ^Double target-y]
    (-> this (.setTargetY target-y))))

(defn get-target-z
  "returns: `double`"
  (^Double [^EnderTeleportEvent this]
    (-> this (.getTargetZ))))

(defn set-target-z
  "target-z - `double`"
  ([^EnderTeleportEvent this ^Double target-z]
    (-> this (.setTargetZ target-z))))

(defn get-attack-damage
  "returns: `float`"
  (^Float [^EnderTeleportEvent this]
    (-> this (.getAttackDamage))))

(defn set-attack-damage
  "attack-damage - `float`"
  ([^EnderTeleportEvent this ^Float attack-damage]
    (-> this (.setAttackDamage attack-damage))))

