(ns net.minecraft.entity.ai.EntityAIFollowParent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIFollowParent]))

(defn ->entity-ai-follow-parent
  "Constructor.

  animal - `net.minecraft.entity.passive.EntityAnimal`
  speed - `double`"
  (^EntityAIFollowParent [^net.minecraft.entity.passive.EntityAnimal animal ^Double speed]
    (new EntityAIFollowParent animal speed)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIFollowParent this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIFollowParent this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIFollowParent this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIFollowParent this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIFollowParent this]
    (-> this (.updateTask))))

