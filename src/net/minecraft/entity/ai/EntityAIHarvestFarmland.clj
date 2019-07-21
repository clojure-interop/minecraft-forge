(ns net.minecraft.entity.ai.EntityAIHarvestFarmland
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIHarvestFarmland]))

(defn ->entity-ai-harvest-farmland
  "Constructor.

  the-villager-in - `net.minecraft.entity.passive.EntityVillager`
  speed-in - `double`"
  (^EntityAIHarvestFarmland [^net.minecraft.entity.passive.EntityVillager the-villager-in ^Double speed-in]
    (new EntityAIHarvestFarmland the-villager-in speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIHarvestFarmland this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIHarvestFarmland this]
    (-> this (.continueExecuting))))

(defn update-task
  ""
  ([^EntityAIHarvestFarmland this]
    (-> this (.updateTask))))

