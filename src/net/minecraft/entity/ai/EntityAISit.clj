(ns net.minecraft.entity.ai.EntityAISit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAISit]))

(defn ->entity-ai-sit
  "Constructor.

  entity-in - `net.minecraft.entity.passive.EntityTameable`"
  (^EntityAISit [^net.minecraft.entity.passive.EntityTameable entity-in]
    (new EntityAISit entity-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAISit this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAISit this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAISit this]
    (-> this (.resetTask))))

(defn set-sitting
  "sitting - `boolean`"
  ([^EntityAISit this ^Boolean sitting]
    (-> this (.setSitting sitting))))

