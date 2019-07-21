(ns net.minecraft.entity.ai.EntityLookHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityLookHelper]))

(defn ->entity-look-helper
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`"
  (^EntityLookHelper [^net.minecraft.entity.EntityLiving entityliving-in]
    (new EntityLookHelper entityliving-in)))

(defn set-look-position-with-entity
  "entity-in - `net.minecraft.entity.Entity`
  delta-yaw - `float`
  delta-pitch - `float`"
  ([^EntityLookHelper this ^net.minecraft.entity.Entity entity-in ^Float delta-yaw ^Float delta-pitch]
    (-> this (.setLookPositionWithEntity entity-in delta-yaw delta-pitch))))

(defn set-look-position
  "x - `double`
  y - `double`
  z - `double`
  delta-yaw - `float`
  delta-pitch - `float`"
  ([^EntityLookHelper this ^Double x ^Double y ^Double z ^Float delta-yaw ^Float delta-pitch]
    (-> this (.setLookPosition x y z delta-yaw delta-pitch))))

(defn on-update-look
  ""
  ([^EntityLookHelper this]
    (-> this (.onUpdateLook))))

(defn get-is-looking?
  "returns: `boolean`"
  (^Boolean [^EntityLookHelper this]
    (-> this (.getIsLooking))))

(defn get-look-pos-x
  "returns: `double`"
  (^Double [^EntityLookHelper this]
    (-> this (.getLookPosX))))

(defn get-look-pos-y
  "returns: `double`"
  (^Double [^EntityLookHelper this]
    (-> this (.getLookPosY))))

(defn get-look-pos-z
  "returns: `double`"
  (^Double [^EntityLookHelper this]
    (-> this (.getLookPosZ))))

