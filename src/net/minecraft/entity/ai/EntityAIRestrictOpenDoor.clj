(ns net.minecraft.entity.ai.EntityAIRestrictOpenDoor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIRestrictOpenDoor]))

(defn ->entity-ai-restrict-open-door
  "Constructor.

  creature-in - `net.minecraft.entity.EntityCreature`"
  (^EntityAIRestrictOpenDoor [^net.minecraft.entity.EntityCreature creature-in]
    (new EntityAIRestrictOpenDoor creature-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIRestrictOpenDoor this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIRestrictOpenDoor this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIRestrictOpenDoor this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIRestrictOpenDoor this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIRestrictOpenDoor this]
    (-> this (.updateTask))))

