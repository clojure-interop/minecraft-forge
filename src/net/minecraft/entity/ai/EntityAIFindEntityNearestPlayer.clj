(ns net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIFindEntityNearestPlayer]))

(defn ->entity-ai-find-entity-nearest-player
  "Constructor.

  entity-living-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAIFindEntityNearestPlayer [^net.minecraft.entity.EntityLiving entity-living-in]
    (new EntityAIFindEntityNearestPlayer entity-living-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIFindEntityNearestPlayer this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIFindEntityNearestPlayer this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIFindEntityNearestPlayer this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIFindEntityNearestPlayer this]
    (-> this (.resetTask))))

