(ns net.minecraft.entity.monster.EntityMob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityMob]))

(defn ->entity-mob
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityMob [^net.minecraft.world.World world-in]
    (new EntityMob world-in)))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityMob this]
    (-> this (.getSoundCategory))))

(defn on-living-update
  ""
  ([^EntityMob this]
    (-> this (.onLivingUpdate))))

(defn on-update
  ""
  ([^EntityMob this]
    (-> this (.onUpdate))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityMob this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityMob this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn get-block-path-weight
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^EntityMob this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockPathWeight pos))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityMob this]
    (-> this (.getCanSpawnHere))))

