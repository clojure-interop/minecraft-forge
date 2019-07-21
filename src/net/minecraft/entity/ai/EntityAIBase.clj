(ns net.minecraft.entity.ai.EntityAIBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIBase]))

(defn ->entity-ai-base
  "Constructor."
  (^EntityAIBase []
    (new EntityAIBase )))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIBase this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIBase this]
    (-> this (.continueExecuting))))

(defn interruptible?
  "returns: `boolean`"
  (^Boolean [^EntityAIBase this]
    (-> this (.isInterruptible))))

(defn start-executing
  ""
  ([^EntityAIBase this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIBase this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIBase this]
    (-> this (.updateTask))))

(defn set-mutex-bits
  "mutex-bits-in - `int`"
  ([^EntityAIBase this ^Integer mutex-bits-in]
    (-> this (.setMutexBits mutex-bits-in))))

(defn get-mutex-bits
  "returns: `int`"
  (^Integer [^EntityAIBase this]
    (-> this (.getMutexBits))))

