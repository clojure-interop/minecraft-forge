(ns net.minecraft.entity.monster.EntityStray
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityStray]))

(defn ->entity-stray
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityStray [^net.minecraft.world.World world-in]
    (new EntityStray world-in)))

(defn *register-fixes-stray
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityStray/registerFixesStray fixer)))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityStray this]
    (-> this (.getCanSpawnHere))))

