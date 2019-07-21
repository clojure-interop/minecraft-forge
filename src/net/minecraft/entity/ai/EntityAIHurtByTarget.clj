(ns net.minecraft.entity.ai.EntityAIHurtByTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIHurtByTarget]))

(defn ->entity-ai-hurt-by-target
  "Constructor.

  creature-in - `net.minecraft.entity.EntityCreature`
  entity-calls-for-help-in - `boolean`
  target-classes-in - `java.lang.Class`"
  (^EntityAIHurtByTarget [^net.minecraft.entity.EntityCreature creature-in ^Boolean entity-calls-for-help-in ^java.lang.Class target-classes-in]
    (new EntityAIHurtByTarget creature-in entity-calls-for-help-in target-classes-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIHurtByTarget this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIHurtByTarget this]
    (-> this (.startExecuting))))

