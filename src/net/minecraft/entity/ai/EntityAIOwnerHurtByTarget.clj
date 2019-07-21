(ns net.minecraft.entity.ai.EntityAIOwnerHurtByTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIOwnerHurtByTarget]))

(defn ->entity-ai-owner-hurt-by-target
  "Constructor.

  the-defending-tameable-in - `net.minecraft.entity.passive.EntityTameable`"
  (^EntityAIOwnerHurtByTarget [^net.minecraft.entity.passive.EntityTameable the-defending-tameable-in]
    (new EntityAIOwnerHurtByTarget the-defending-tameable-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIOwnerHurtByTarget this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIOwnerHurtByTarget this]
    (-> this (.startExecuting))))

