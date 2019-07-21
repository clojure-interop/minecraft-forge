(ns net.minecraft.entity.monster.EntityCaveSpider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityCaveSpider]))

(defn ->entity-cave-spider
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityCaveSpider [^net.minecraft.world.World world-in]
    (new EntityCaveSpider world-in)))

(defn *register-fixes-cave-spider
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityCaveSpider/registerFixesCaveSpider fixer)))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityCaveSpider this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityCaveSpider this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityCaveSpider this]
    (-> this (.getEyeHeight))))

