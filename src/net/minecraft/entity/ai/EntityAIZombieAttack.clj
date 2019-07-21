(ns net.minecraft.entity.ai.EntityAIZombieAttack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIZombieAttack]))

(defn ->entity-ai-zombie-attack
  "Constructor.

  zombie-in - `net.minecraft.entity.monster.EntityZombie`
  speed-in - `double`
  long-memory-in - `boolean`"
  (^EntityAIZombieAttack [^net.minecraft.entity.monster.EntityZombie zombie-in ^Double speed-in ^Boolean long-memory-in]
    (new EntityAIZombieAttack zombie-in speed-in long-memory-in)))

(defn start-executing
  ""
  ([^EntityAIZombieAttack this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIZombieAttack this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIZombieAttack this]
    (-> this (.updateTask))))

