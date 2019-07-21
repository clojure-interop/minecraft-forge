(ns net.minecraft.entity.ai.EntityAIWatchClosest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIWatchClosest]))

(defn ->entity-ai-watch-closest
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`
  watch-target-class - `java.lang.Class`
  max-distance - `float`
  chance-in - `float`"
  (^EntityAIWatchClosest [^net.minecraft.entity.EntityLiving entityliving-in ^java.lang.Class watch-target-class ^Float max-distance ^Float chance-in]
    (new EntityAIWatchClosest entityliving-in watch-target-class max-distance chance-in))
  (^EntityAIWatchClosest [^net.minecraft.entity.EntityLiving entityliving-in ^java.lang.Class watch-target-class ^Float max-distance]
    (new EntityAIWatchClosest entityliving-in watch-target-class max-distance)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIWatchClosest this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIWatchClosest this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIWatchClosest this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIWatchClosest this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIWatchClosest this]
    (-> this (.updateTask))))

