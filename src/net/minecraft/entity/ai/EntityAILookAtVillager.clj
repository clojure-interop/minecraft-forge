(ns net.minecraft.entity.ai.EntityAILookAtVillager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAILookAtVillager]))

(defn ->entity-ai-look-at-villager
  "Constructor.

  the-golem-in - `net.minecraft.entity.monster.EntityIronGolem`"
  (^EntityAILookAtVillager [^net.minecraft.entity.monster.EntityIronGolem the-golem-in]
    (new EntityAILookAtVillager the-golem-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAILookAtVillager this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAILookAtVillager this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAILookAtVillager this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAILookAtVillager this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAILookAtVillager this]
    (-> this (.updateTask))))

