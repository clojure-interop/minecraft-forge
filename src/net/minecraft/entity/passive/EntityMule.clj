(ns net.minecraft.entity.passive.EntityMule
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityMule]))

(defn ->entity-mule
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityMule [^net.minecraft.world.World world-in]
    (new EntityMule world-in)))

(defn *register-fixes-mule
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMule/registerFixesMule fixer)))

