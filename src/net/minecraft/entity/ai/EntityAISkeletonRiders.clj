(ns net.minecraft.entity.ai.EntityAISkeletonRiders
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAISkeletonRiders]))

(defn ->entity-ai-skeleton-riders
  "Constructor.

  horse-in - `net.minecraft.entity.passive.EntitySkeletonHorse`"
  (^EntityAISkeletonRiders [^net.minecraft.entity.passive.EntitySkeletonHorse horse-in]
    (new EntityAISkeletonRiders horse-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAISkeletonRiders this]
    (-> this (.shouldExecute))))

(defn update-task
  ""
  ([^EntityAISkeletonRiders this]
    (-> this (.updateTask))))

