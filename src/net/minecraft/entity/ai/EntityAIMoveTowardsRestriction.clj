(ns net.minecraft.entity.ai.EntityAIMoveTowardsRestriction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIMoveTowardsRestriction]))

(defn ->entity-ai-move-towards-restriction
  "Constructor.

  creature-in - `net.minecraft.entity.EntityCreature`
  speed-in - `double`"
  (^EntityAIMoveTowardsRestriction [^net.minecraft.entity.EntityCreature creature-in ^Double speed-in]
    (new EntityAIMoveTowardsRestriction creature-in speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveTowardsRestriction this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveTowardsRestriction this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIMoveTowardsRestriction this]
    (-> this (.startExecuting))))

