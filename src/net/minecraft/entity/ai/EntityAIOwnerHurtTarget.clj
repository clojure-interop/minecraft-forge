(ns net.minecraft.entity.ai.EntityAIOwnerHurtTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIOwnerHurtTarget]))

(defn ->entity-ai-owner-hurt-target
  "Constructor.

  the-entity-tameable-in - `net.minecraft.entity.passive.EntityTameable`"
  (^EntityAIOwnerHurtTarget [^net.minecraft.entity.passive.EntityTameable the-entity-tameable-in]
    (new EntityAIOwnerHurtTarget the-entity-tameable-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIOwnerHurtTarget this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIOwnerHurtTarget this]
    (-> this (.startExecuting))))

