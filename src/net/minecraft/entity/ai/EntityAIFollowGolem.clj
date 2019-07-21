(ns net.minecraft.entity.ai.EntityAIFollowGolem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIFollowGolem]))

(defn ->entity-ai-follow-golem
  "Constructor.

  the-villager-in - `net.minecraft.entity.passive.EntityVillager`"
  (^EntityAIFollowGolem [^net.minecraft.entity.passive.EntityVillager the-villager-in]
    (new EntityAIFollowGolem the-villager-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIFollowGolem this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIFollowGolem this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIFollowGolem this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIFollowGolem this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIFollowGolem this]
    (-> this (.updateTask))))

