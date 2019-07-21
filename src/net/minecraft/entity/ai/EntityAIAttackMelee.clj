(ns net.minecraft.entity.ai.EntityAIAttackMelee
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIAttackMelee]))

(defn ->entity-ai-attack-melee
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`
  speed-in - `double`
  use-long-memory - `boolean`"
  (^EntityAIAttackMelee [^net.minecraft.entity.EntityCreature creature ^Double speed-in ^Boolean use-long-memory]
    (new EntityAIAttackMelee creature speed-in use-long-memory)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIAttackMelee this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIAttackMelee this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIAttackMelee this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIAttackMelee this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIAttackMelee this]
    (-> this (.updateTask))))

