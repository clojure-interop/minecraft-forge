(ns net.minecraft.entity.ai.EntityAIRestrictSun
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIRestrictSun]))

(defn ->entity-ai-restrict-sun
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`"
  (^EntityAIRestrictSun [^net.minecraft.entity.EntityCreature creature]
    (new EntityAIRestrictSun creature)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIRestrictSun this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIRestrictSun this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIRestrictSun this]
    (-> this (.resetTask))))

