(ns net.minecraft.entity.ai.EntityAIFindEntityNearest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIFindEntityNearest]))

(defn ->entity-ai-find-entity-nearest
  "Constructor.

  mob-in - `net.minecraft.entity.EntityLiving`
  p-i-45884-2 - `java.lang.Class`"
  (^EntityAIFindEntityNearest [^net.minecraft.entity.EntityLiving mob-in ^java.lang.Class p-i-45884-2]
    (new EntityAIFindEntityNearest mob-in p-i-45884-2)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIFindEntityNearest this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIFindEntityNearest this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIFindEntityNearest this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIFindEntityNearest this]
    (-> this (.resetTask))))

