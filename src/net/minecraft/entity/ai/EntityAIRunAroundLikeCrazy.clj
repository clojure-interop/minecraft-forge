(ns net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIRunAroundLikeCrazy]))

(defn ->entity-ai-run-around-like-crazy
  "Constructor.

  horse - `net.minecraft.entity.passive.AbstractHorse`
  speed-in - `double`"
  (^EntityAIRunAroundLikeCrazy [^net.minecraft.entity.passive.AbstractHorse horse ^Double speed-in]
    (new EntityAIRunAroundLikeCrazy horse speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIRunAroundLikeCrazy this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIRunAroundLikeCrazy this]
    (-> this (.startExecuting))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIRunAroundLikeCrazy this]
    (-> this (.continueExecuting))))

(defn update-task
  ""
  ([^EntityAIRunAroundLikeCrazy this]
    (-> this (.updateTask))))

