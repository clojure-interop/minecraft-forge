(ns net.minecraft.entity.ai.EntityAIBreakDoor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIBreakDoor]))

(defn ->entity-ai-break-door
  "Constructor.

  entity-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAIBreakDoor [^net.minecraft.entity.EntityLiving entity-in]
    (new EntityAIBreakDoor entity-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIBreakDoor this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIBreakDoor this]
    (-> this (.startExecuting))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIBreakDoor this]
    (-> this (.continueExecuting))))

(defn reset-task
  ""
  ([^EntityAIBreakDoor this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIBreakDoor this]
    (-> this (.updateTask))))

