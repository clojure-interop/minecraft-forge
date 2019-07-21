(ns net.minecraft.entity.ai.EntityAIAttackRanged
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIAttackRanged]))

(defn ->entity-ai-attack-ranged
  "Constructor.

  attacker - `net.minecraft.entity.IRangedAttackMob`
  movespeed - `double`
  p-i-1650-4 - `int`
  max-attack-time - `int`
  max-attack-distance-in - `float`"
  (^EntityAIAttackRanged [^net.minecraft.entity.IRangedAttackMob attacker ^Double movespeed ^Integer p-i-1650-4 ^Integer max-attack-time ^Float max-attack-distance-in]
    (new EntityAIAttackRanged attacker movespeed p-i-1650-4 max-attack-time max-attack-distance-in))
  (^EntityAIAttackRanged [^net.minecraft.entity.IRangedAttackMob attacker ^Double movespeed ^Integer max-attack-time ^Float max-attack-distance-in]
    (new EntityAIAttackRanged attacker movespeed max-attack-time max-attack-distance-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIAttackRanged this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIAttackRanged this]
    (-> this (.continueExecuting))))

(defn reset-task
  ""
  ([^EntityAIAttackRanged this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIAttackRanged this]
    (-> this (.updateTask))))

