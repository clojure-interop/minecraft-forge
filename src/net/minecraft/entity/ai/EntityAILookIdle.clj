(ns net.minecraft.entity.ai.EntityAILookIdle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAILookIdle]))

(defn ->entity-ai-look-idle
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAILookIdle [^net.minecraft.entity.EntityLiving entityliving-in]
    (new EntityAILookIdle entityliving-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAILookIdle this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAILookIdle this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAILookIdle this]
    (-> this (.startExecuting))))

(defn update-task
  ""
  ([^EntityAILookIdle this]
    (-> this (.updateTask))))

