(ns net.minecraft.entity.ai.EntityAIMoveIndoors
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIMoveIndoors]))

(defn ->entity-ai-move-indoors
  "Constructor.

  entity-obj-in - `net.minecraft.entity.EntityCreature`"
  (^EntityAIMoveIndoors [^net.minecraft.entity.EntityCreature entity-obj-in]
    (new EntityAIMoveIndoors entity-obj-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveIndoors this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveIndoors this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIMoveIndoors this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIMoveIndoors this]
    (-> this (.resetTask))))

