(ns net.minecraft.entity.ai.EntityAIFollowOwner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIFollowOwner]))

(defn ->entity-ai-follow-owner
  "Constructor.

  the-pet-in - `net.minecraft.entity.passive.EntityTameable`
  follow-speed-in - `double`
  min-dist-in - `float`
  max-dist-in - `float`"
  (^EntityAIFollowOwner [^net.minecraft.entity.passive.EntityTameable the-pet-in ^Double follow-speed-in ^Float min-dist-in ^Float max-dist-in]
    (new EntityAIFollowOwner the-pet-in follow-speed-in min-dist-in max-dist-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIFollowOwner this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIFollowOwner this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIFollowOwner this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIFollowOwner this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIFollowOwner this]
    (-> this (.updateTask))))

