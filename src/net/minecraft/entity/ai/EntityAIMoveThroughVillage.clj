(ns net.minecraft.entity.ai.EntityAIMoveThroughVillage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIMoveThroughVillage]))

(defn ->entity-ai-move-through-village
  "Constructor.

  the-entity-in - `net.minecraft.entity.EntityCreature`
  movement-speed-in - `double`
  is-nocturnal-in - `boolean`"
  (^EntityAIMoveThroughVillage [^net.minecraft.entity.EntityCreature the-entity-in ^Double movement-speed-in ^Boolean is-nocturnal-in]
    (new EntityAIMoveThroughVillage the-entity-in movement-speed-in is-nocturnal-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveThroughVillage this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveThroughVillage this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIMoveThroughVillage this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIMoveThroughVillage this]
    (-> this (.resetTask))))

