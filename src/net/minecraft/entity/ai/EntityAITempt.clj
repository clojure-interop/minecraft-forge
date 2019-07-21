(ns net.minecraft.entity.ai.EntityAITempt
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAITempt]))

(defn ->entity-ai-tempt
  "Constructor.

  tempted-entity-in - `net.minecraft.entity.EntityCreature`
  speed-in - `double`
  tempt-item-in - `net.minecraft.item.Item`
  scared-by-player-movement-in - `boolean`"
  (^EntityAITempt [^net.minecraft.entity.EntityCreature tempted-entity-in ^Double speed-in ^net.minecraft.item.Item tempt-item-in ^Boolean scared-by-player-movement-in]
    (new EntityAITempt tempted-entity-in speed-in tempt-item-in scared-by-player-movement-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAITempt this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAITempt this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAITempt this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAITempt this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAITempt this]
    (-> this (.updateTask))))

(defn running?
  "returns: `boolean`"
  (^Boolean [^EntityAITempt this]
    (-> this (.isRunning))))

