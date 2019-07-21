(ns net.minecraft.entity.ai.EntityAIWander
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIWander]))

(defn ->entity-ai-wander
  "Constructor.

  creature-in - `net.minecraft.entity.EntityCreature`
  speed-in - `double`
  chance - `int`"
  (^EntityAIWander [^net.minecraft.entity.EntityCreature creature-in ^Double speed-in ^Integer chance]
    (new EntityAIWander creature-in speed-in chance))
  (^EntityAIWander [^net.minecraft.entity.EntityCreature creature-in ^Double speed-in]
    (new EntityAIWander creature-in speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIWander this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIWander this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIWander this]
    (-> this (.startExecuting))))

(defn make-update
  ""
  ([^EntityAIWander this]
    (-> this (.makeUpdate))))

(defn set-execution-chance
  "newchance - `int`"
  ([^EntityAIWander this ^Integer newchance]
    (-> this (.setExecutionChance newchance))))

