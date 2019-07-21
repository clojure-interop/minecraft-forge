(ns net.minecraft.entity.ai.EntityAILeapAtTarget
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAILeapAtTarget]))

(defn ->entity-ai-leap-at-target
  "Constructor.

  leaping-entity - `net.minecraft.entity.EntityLiving`
  leap-motion-y-in - `float`"
  (^EntityAILeapAtTarget [^net.minecraft.entity.EntityLiving leaping-entity ^Float leap-motion-y-in]
    (new EntityAILeapAtTarget leaping-entity leap-motion-y-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAILeapAtTarget this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAILeapAtTarget this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAILeapAtTarget this]
    (-> this (.startExecuting))))

