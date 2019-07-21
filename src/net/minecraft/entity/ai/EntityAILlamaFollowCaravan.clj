(ns net.minecraft.entity.ai.EntityAILlamaFollowCaravan
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAILlamaFollowCaravan]))

(defn ->entity-ai-llama-follow-caravan
  "Constructor.

  llama-in - `net.minecraft.entity.passive.EntityLlama`
  speed-modifier-in - `double`"
  (^EntityAILlamaFollowCaravan [^net.minecraft.entity.passive.EntityLlama llama-in ^Double speed-modifier-in]
    (new EntityAILlamaFollowCaravan llama-in speed-modifier-in)))

(defn llama
  "Instance Field.

  type: net.minecraft.entity.passive.EntityLlama"
  (^net.minecraft.entity.passive.EntityLlama [^EntityAILlamaFollowCaravan this]
    (-> this .-llama)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAILlamaFollowCaravan this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAILlamaFollowCaravan this]
    (-> this (.continueExecuting))))

(defn reset-task
  ""
  ([^EntityAILlamaFollowCaravan this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAILlamaFollowCaravan this]
    (-> this (.updateTask))))

