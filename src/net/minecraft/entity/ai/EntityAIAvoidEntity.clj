(ns net.minecraft.entity.ai.EntityAIAvoidEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIAvoidEntity]))

(defn ->entity-ai-avoid-entity
  "Constructor.

  the-entity-in - `net.minecraft.entity.EntityCreature`
  class-to-avoid-in - `java.lang.Class`
  avoid-target-selector-in - `com.google.common.base.Predicate`
  avoid-distance-in - `float`
  far-speed-in - `double`
  near-speed-in - `double`"
  (^EntityAIAvoidEntity [^net.minecraft.entity.EntityCreature the-entity-in ^java.lang.Class class-to-avoid-in ^com.google.common.base.Predicate avoid-target-selector-in ^Float avoid-distance-in ^Double far-speed-in ^Double near-speed-in]
    (new EntityAIAvoidEntity the-entity-in class-to-avoid-in avoid-target-selector-in avoid-distance-in far-speed-in near-speed-in))
  (^EntityAIAvoidEntity [^net.minecraft.entity.EntityCreature the-entity-in ^java.lang.Class class-to-avoid-in ^Float avoid-distance-in ^Double far-speed-in ^Double near-speed-in]
    (new EntityAIAvoidEntity the-entity-in class-to-avoid-in avoid-distance-in far-speed-in near-speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIAvoidEntity this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIAvoidEntity this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIAvoidEntity this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIAvoidEntity this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIAvoidEntity this]
    (-> this (.updateTask))))

