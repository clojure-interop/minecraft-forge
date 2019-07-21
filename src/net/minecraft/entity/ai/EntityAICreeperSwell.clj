(ns net.minecraft.entity.ai.EntityAICreeperSwell
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAICreeperSwell]))

(defn ->entity-ai-creeper-swell
  "Constructor.

  entitycreeper-in - `net.minecraft.entity.monster.EntityCreeper`"
  (^EntityAICreeperSwell [^net.minecraft.entity.monster.EntityCreeper entitycreeper-in]
    (new EntityAICreeperSwell entitycreeper-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAICreeperSwell this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAICreeperSwell this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAICreeperSwell this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAICreeperSwell this]
    (-> this (.updateTask))))

