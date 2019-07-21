(ns net.minecraft.entity.ai.EntityAIMoveTowardsTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIMoveTowardsTarget]))

(defn ->entity-ai-move-towards-target
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`
  speed-in - `double`
  target-max-distance - `float`"
  (^EntityAIMoveTowardsTarget [^net.minecraft.entity.EntityCreature creature ^Double speed-in ^Float target-max-distance]
    (new EntityAIMoveTowardsTarget creature speed-in target-max-distance)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveTowardsTarget this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveTowardsTarget this]
    (-> this (.continueExecuting))))

(defn reset-task
  ""
  ([^EntityAIMoveTowardsTarget this]
    (-> this (.resetTask))))

(defn start-executing
  ""
  ([^EntityAIMoveTowardsTarget this]
    (-> this (.startExecuting))))

