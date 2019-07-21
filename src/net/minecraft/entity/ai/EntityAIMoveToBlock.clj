(ns net.minecraft.entity.ai.EntityAIMoveToBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIMoveToBlock]))

(defn ->entity-ai-move-to-block
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`
  speed-in - `double`
  length - `int`"
  (^EntityAIMoveToBlock [^net.minecraft.entity.EntityCreature creature ^Double speed-in ^Integer length]
    (new EntityAIMoveToBlock creature speed-in length)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveToBlock this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIMoveToBlock this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIMoveToBlock this]
    (-> this (.startExecuting))))

(defn update-task
  ""
  ([^EntityAIMoveToBlock this]
    (-> this (.updateTask))))

