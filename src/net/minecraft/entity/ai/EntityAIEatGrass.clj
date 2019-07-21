(ns net.minecraft.entity.ai.EntityAIEatGrass
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIEatGrass]))

(defn ->entity-ai-eat-grass
  "Constructor.

  grass-eater-entity-in - `net.minecraft.entity.EntityLiving`"
  (^EntityAIEatGrass [^net.minecraft.entity.EntityLiving grass-eater-entity-in]
    (new EntityAIEatGrass grass-eater-entity-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIEatGrass this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIEatGrass this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIEatGrass this]
    (-> this (.resetTask))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIEatGrass this]
    (-> this (.continueExecuting))))

(defn get-eating-grass-timer
  "returns: `int`"
  (^Integer [^EntityAIEatGrass this]
    (-> this (.getEatingGrassTimer))))

(defn update-task
  ""
  ([^EntityAIEatGrass this]
    (-> this (.updateTask))))

