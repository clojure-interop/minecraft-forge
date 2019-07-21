(ns net.minecraft.entity.monster.EntityWitherSkeleton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityWitherSkeleton]))

(defn ->entity-wither-skeleton
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityWitherSkeleton [^net.minecraft.world.World world-in]
    (new EntityWitherSkeleton world-in)))

(defn *register-fixes-wither-skeleton
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityWitherSkeleton/registerFixesWitherSkeleton fixer)))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityWitherSkeleton this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityWitherSkeleton this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityWitherSkeleton this]
    (-> this (.getEyeHeight))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityWitherSkeleton this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

