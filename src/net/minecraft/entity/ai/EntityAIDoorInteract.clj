(ns net.minecraft.entity.ai.EntityAIDoorInteract
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIDoorInteract]))

(defn ->entity-ai-door-interact
  "Constructor.

  entity-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAIDoorInteract [^net.minecraft.entity.EntityLiving entity-in]
    (new EntityAIDoorInteract entity-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIDoorInteract this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIDoorInteract this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIDoorInteract this]
    (-> this (.startExecuting))))

(defn update-task
  ""
  ([^EntityAIDoorInteract this]
    (-> this (.updateTask))))

