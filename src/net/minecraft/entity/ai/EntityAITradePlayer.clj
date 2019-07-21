(ns net.minecraft.entity.ai.EntityAITradePlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAITradePlayer]))

(defn ->entity-ai-trade-player
  "Constructor.

  villager-in - `net.minecraft.entity.passive.EntityVillager`"
  (^EntityAITradePlayer [^net.minecraft.entity.passive.EntityVillager villager-in]
    (new EntityAITradePlayer villager-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAITradePlayer this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAITradePlayer this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAITradePlayer this]
    (-> this (.resetTask))))

