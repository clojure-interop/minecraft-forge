(ns net.minecraft.entity.ai.EntityAITargetNonTamed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAITargetNonTamed]))

(defn ->entity-ai-target-non-tamed
  "Constructor.

  entity-in - `net.minecraft.entity.passive.EntityTameable`
  class-target - `java.lang.Class`
  check-sight - `boolean`
  target-selector - `com.google.common.base.Predicate`"
  (^EntityAITargetNonTamed [^net.minecraft.entity.passive.EntityTameable entity-in ^java.lang.Class class-target ^Boolean check-sight ^com.google.common.base.Predicate target-selector]
    (new EntityAITargetNonTamed entity-in class-target check-sight target-selector)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAITargetNonTamed this]
    (-> this (.shouldExecute))))

