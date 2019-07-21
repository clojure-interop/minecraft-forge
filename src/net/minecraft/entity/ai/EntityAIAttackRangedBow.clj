(ns net.minecraft.entity.ai.EntityAIAttackRangedBow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIAttackRangedBow]))

(defn ->entity-ai-attack-ranged-bow
  "Constructor.

  skeleton - `net.minecraft.entity.monster.AbstractSkeleton`
  speed-amplifier - `double`
  delay - `int`
  max-distance - `float`"
  (^EntityAIAttackRangedBow [^net.minecraft.entity.monster.AbstractSkeleton skeleton ^Double speed-amplifier ^Integer delay ^Float max-distance]
    (new EntityAIAttackRangedBow skeleton speed-amplifier delay max-distance)))

(defn set-attack-cooldown
  "p-189428-1 - `int`"
  ([^EntityAIAttackRangedBow this ^Integer p-189428-1]
    (-> this (.setAttackCooldown p-189428-1))))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIAttackRangedBow this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIAttackRangedBow this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIAttackRangedBow this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIAttackRangedBow this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIAttackRangedBow this]
    (-> this (.updateTask))))

