(ns net.minecraft.entity.ai.EntityAIOcelotSit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIOcelotSit]))

(defn ->entity-ai-ocelot-sit
  "Constructor.

  ocelot-in - `net.minecraft.entity.passive.EntityOcelot`
  p-i-45315-2 - `double`"
  (^EntityAIOcelotSit [^net.minecraft.entity.passive.EntityOcelot ocelot-in ^Double p-i-45315-2]
    (new EntityAIOcelotSit ocelot-in p-i-45315-2)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIOcelotSit this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIOcelotSit this]
    (-> this (.startExecuting))))

(defn reset-task
  ""
  ([^EntityAIOcelotSit this]
    (-> this (.resetTask))))

(defn update-task
  ""
  ([^EntityAIOcelotSit this]
    (-> this (.updateTask))))

