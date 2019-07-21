(ns net.minecraft.entity.monster.EntityElderGuardian
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityElderGuardian]))

(defn ->entity-elder-guardian
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityElderGuardian [^net.minecraft.world.World world-in]
    (new EntityElderGuardian world-in)))

(defn *register-fixes-elder-guardian
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityElderGuardian/registerFixesElderGuardian fixer)))

(defn get-attack-duration
  "returns: `int`"
  (^Integer [^EntityElderGuardian this]
    (-> this (.getAttackDuration))))

(defn set-ghost
  ""
  ([^EntityElderGuardian this]
    (-> this (.setGhost))))

