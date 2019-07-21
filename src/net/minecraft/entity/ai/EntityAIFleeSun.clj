(ns net.minecraft.entity.ai.EntityAIFleeSun
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIFleeSun]))

(defn ->entity-ai-flee-sun
  "Constructor.

  the-creature-in - `net.minecraft.entity.EntityCreature`
  movement-speed-in - `double`"
  (^EntityAIFleeSun [^net.minecraft.entity.EntityCreature the-creature-in ^Double movement-speed-in]
    (new EntityAIFleeSun the-creature-in movement-speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIFleeSun this]
    (-> this (.shouldExecute))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIFleeSun this]
    (-> this (.continueExecuting))))

(defn start-executing
  ""
  ([^EntityAIFleeSun this]
    (-> this (.startExecuting))))

