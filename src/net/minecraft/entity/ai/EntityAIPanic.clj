(ns net.minecraft.entity.ai.EntityAIPanic
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAIPanic]))

(defn ->entity-ai-panic
  "Constructor.

  creature - `net.minecraft.entity.EntityCreature`
  speed-in - `double`"
  (^EntityAIPanic [^net.minecraft.entity.EntityCreature creature ^Double speed-in]
    (new EntityAIPanic creature speed-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAIPanic this]
    (-> this (.shouldExecute))))

(defn start-executing
  ""
  ([^EntityAIPanic this]
    (-> this (.startExecuting))))

(defn continue-executing
  "returns: `boolean`"
  (^Boolean [^EntityAIPanic this]
    (-> this (.continueExecuting))))

