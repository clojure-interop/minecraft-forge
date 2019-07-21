(ns net.minecraft.entity.ai.EntityAIOcelotAttack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIOcelotAttack]))

(defn ->entity-ai-ocelot-attack
  "Constructor.

  the-entity-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAIOcelotAttack [^net.minecraft.entity.EntityLiving the-entity-in]
    (new EntityAIOcelotAttack the-entity-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIOcelotAttack this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIOcelotAttack this]
    (-> this (.continueExecuting))))

(defn reset-task
  ""
  ([^EntityAIOcelotAttack this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIOcelotAttack this]
    (-> this (.updateTask))))

