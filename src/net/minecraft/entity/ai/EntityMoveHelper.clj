(ns net.minecraft.entity.ai.EntityMoveHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityMoveHelper]))

(defn ->entity-move-helper
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`"
  (^EntityMoveHelper [^net.minecraft.entity.EntityLiving entityliving-in]
    (new EntityMoveHelper entityliving-in)))

(defn action
  "Instance Field.

  type: net.minecraft.entity.ai.EntityMoveHelper$Action"
  (^net.minecraft.entity.ai.EntityMoveHelper$Action [^EntityMoveHelper this]
    (-> this .-action)))

(defn updating?
  "returns: `boolean`"
  (^Boolean [^EntityMoveHelper this]
    (-> this (.isUpdating))))

(defn get-z
  "returns: `double`"
  (^Double [^EntityMoveHelper this]
    (-> this (.getZ))))

(defn read
  "that - `net.minecraft.entity.ai.EntityMoveHelper`"
  ([^EntityMoveHelper this ^net.minecraft.entity.ai.EntityMoveHelper that]
    (-> this (.read that))))

(defn on-update-move-helper
  ""
  ([^EntityMoveHelper this]
    (-> this (.onUpdateMoveHelper))))

(defn get-speed
  "returns: `double`"
  (^Double [^EntityMoveHelper this]
    (-> this (.getSpeed))))

(defn get-y
  "returns: `double`"
  (^Double [^EntityMoveHelper this]
    (-> this (.getY))))

(defn set-move-to
  "x - `double`
  y - `double`
  z - `double`
  speed-in - `double`"
  ([^EntityMoveHelper this ^Double x ^Double y ^Double z ^Double speed-in]
    (-> this (.setMoveTo x y z speed-in))))

(defn get-x
  "returns: `double`"
  (^Double [^EntityMoveHelper this]
    (-> this (.getX))))

(defn strafe
  "forward - `float`
  strafe - `float`"
  ([^EntityMoveHelper this ^Float forward ^Float strafe]
    (-> this (.strafe forward strafe))))

