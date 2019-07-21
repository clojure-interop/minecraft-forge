(ns net.minecraft.entity.ai.EntityAIDefendVillage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIDefendVillage]))

(defn ->entity-ai-defend-village
  "Constructor.

  iron-golem-in - `net.minecraft.entity.monster.EntityIronGolem`"
  (^EntityAIDefendVillage [^net.minecraft.entity.monster.EntityIronGolem iron-golem-in]
    (new EntityAIDefendVillage iron-golem-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIDefendVillage this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIDefendVillage this]
    (-> this (.startExecuting))))

