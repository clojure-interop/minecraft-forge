(ns net.minecraft.entity.ai.EntityAIMate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIMate]))

(defn ->entity-ai-mate
  "Constructor.

  p-i-47306-1 - `net.minecraft.entity.passive.EntityAnimal`
  p-i-47306-2 - `double`
  p-i-47306-4 - `java.lang.Class`"
  (^EntityAIMate [^net.minecraft.entity.passive.EntityAnimal p-i-47306-1 ^Double p-i-47306-2 ^java.lang.Class p-i-47306-4]
    (new EntityAIMate p-i-47306-1 p-i-47306-2 p-i-47306-4))
  (^EntityAIMate [^net.minecraft.entity.passive.EntityAnimal animal ^Double speed-in]
    (new EntityAIMate animal speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIMate this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIMate this]
    (-> this (.continueExecuting))))

(defn reset-task
  ""
  ([^EntityAIMate this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIMate this]
    (-> this (.updateTask))))

