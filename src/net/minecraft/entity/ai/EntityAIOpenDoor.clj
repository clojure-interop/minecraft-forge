(ns net.minecraft.entity.ai.EntityAIOpenDoor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIOpenDoor]))

(defn ->entity-ai-open-door
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`
  should-close - `boolean`"
  (^EntityAIOpenDoor [^net.minecraft.entity.EntityLiving entityliving-in ^Boolean should-close]
    (new EntityAIOpenDoor entityliving-in should-close)))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIOpenDoor this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIOpenDoor this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIOpenDoor this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIOpenDoor this]
    (-> this (.updateTask))))

