(ns net.minecraft.entity.ai.EntityAIBeg
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIBeg]))

(defn ->entity-ai-beg
  "Constructor.

  wolf - `net.minecraft.entity.passive.EntityWolf`
  min-distance - `float`"
  (^EntityAIBeg [^net.minecraft.entity.passive.EntityWolf wolf ^Float min-distance]
    (new EntityAIBeg wolf min-distance)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIBeg this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIBeg this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIBeg this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIBeg this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIBeg this]
    (-> this (.updateTask))))

