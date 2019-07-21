(ns net.minecraft.entity.ai.EntityAIPlay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIPlay]))

(defn ->entity-ai-play
  "Constructor.

  villager-obj-in - `net.minecraft.entity.passive.EntityVillager`
  speed-in - `double`"
  (^EntityAIPlay [^net.minecraft.entity.passive.EntityVillager villager-obj-in ^Double speed-in]
    (new EntityAIPlay villager-obj-in speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIPlay this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIPlay this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIPlay this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIPlay this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIPlay this]
    (-> this (.updateTask))))

