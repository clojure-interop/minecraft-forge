(ns net.minecraft.entity.ai.EntityAISwimming
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAISwimming]))

(defn ->entity-ai-swimming
  "Constructor.

  entityliving-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAISwimming [^net.minecraft.entity.EntityLiving entityliving-in]
    (new EntityAISwimming entityliving-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAISwimming this]
    (-> this (.shouldExecute))))

(defn update-task
  ""
  ([^EntityAISwimming this]
    (-> this (.updateTask))))

