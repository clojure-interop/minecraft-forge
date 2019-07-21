(ns net.minecraft.entity.monster.EntityHusk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityHusk]))

(defn ->entity-husk
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityHusk [^net.minecraft.world.World world-in]
    (new EntityHusk world-in)))

(defn *register-fixes-husk
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityHusk/registerFixesHusk fixer)))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityHusk this]
    (-> this (.getCanSpawnHere))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityHusk this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

