(ns net.minecraft.entity.ai.EntityAIVillagerInteract
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIVillagerInteract]))

(defn ->entity-ai-villager-interact
  "Constructor.

  villager-in - `net.minecraft.entity.passive.EntityVillager`"
  (^EntityAIVillagerInteract [^net.minecraft.entity.passive.EntityVillager villager-in]
    (new EntityAIVillagerInteract villager-in)))

(defn start-executing
  ""
  ([^EntityAIVillagerInteract this]
    (-> this (.startExecuting))))

(defn update-task
  ""
  ([^EntityAIVillagerInteract this]
    (-> this (.updateTask))))

