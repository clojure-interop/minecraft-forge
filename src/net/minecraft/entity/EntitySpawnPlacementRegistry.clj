(ns net.minecraft.entity.EntitySpawnPlacementRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntitySpawnPlacementRegistry]))

(defn ->entity-spawn-placement-registry
  "Constructor."
  (^EntitySpawnPlacementRegistry []
    (new EntitySpawnPlacementRegistry )))

(defn *get-placement-for-entity
  "entity-class - `java.lang.Class`

  returns: `net.minecraft.entity.EntityLiving$SpawnPlacementType`"
  (^net.minecraft.entity.EntityLiving$SpawnPlacementType [^java.lang.Class entity-class]
    (EntitySpawnPlacementRegistry/getPlacementForEntity entity-class)))

(defn *set-placement-type
  "entity-class - `java.lang.Class`
  placement-type - `net.minecraft.entity.EntityLiving$SpawnPlacementType`"
  ([^java.lang.Class entity-class ^net.minecraft.entity.EntityLiving$SpawnPlacementType placement-type]
    (EntitySpawnPlacementRegistry/setPlacementType entity-class placement-type)))

