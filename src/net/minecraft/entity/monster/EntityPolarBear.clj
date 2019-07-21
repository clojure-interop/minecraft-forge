(ns net.minecraft.entity.monster.EntityPolarBear
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityPolarBear]))

(defn ->entity-polar-bear
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityPolarBear [^net.minecraft.world.World world-in]
    (new EntityPolarBear world-in)))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.EntityAgeable`"
  (^net.minecraft.entity.EntityAgeable [^EntityPolarBear this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn breeding-item?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityPolarBear this ^net.minecraft.item.ItemStack stack]
    (-> this (.isBreedingItem stack))))

(defn on-update
  ""
  ([^EntityPolarBear this]
    (-> this (.onUpdate))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityPolarBear this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn standing?
  "returns: `boolean`"
  (^Boolean [^EntityPolarBear this]
    (-> this (.isStanding))))

(defn set-standing
  "standing - `boolean`"
  ([^EntityPolarBear this ^Boolean standing]
    (-> this (.setStanding standing))))

(defn get-standing-animation-scale
  "p-189795-1 - `float`

  returns: `float`"
  (^Float [^EntityPolarBear this ^Float p-189795-1]
    (-> this (.getStandingAnimationScale p-189795-1))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityPolarBear this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

