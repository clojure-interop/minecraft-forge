(ns net.minecraft.entity.ai.EntityAIVillagerMate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIVillagerMate]))

(defn ->entity-ai-villager-mate
  "Constructor.

  villager-in - `net.minecraft.entity.passive.EntityVillager`"
  (^EntityAIVillagerMate [^net.minecraft.entity.passive.EntityVillager villager-in]
    (new EntityAIVillagerMate villager-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIVillagerMate this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIVillagerMate this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIVillagerMate this]
    (-> this (.resetTask))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIVillagerMate this]
    (-> this (.continueExecuting))))

(defn update-task
  ""
  ([^EntityAIVillagerMate this]
    (-> this (.updateTask))))

