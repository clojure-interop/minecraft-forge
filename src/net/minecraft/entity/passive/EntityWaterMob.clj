(ns net.minecraft.entity.passive.EntityWaterMob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityWaterMob]))

(defn ->entity-water-mob
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityWaterMob [^net.minecraft.world.World world-in]
    (new EntityWaterMob world-in)))

(defn can-breathe-underwater?
  "returns: `boolean`"
  (^Boolean [^EntityWaterMob this]
    (-> this (.canBreatheUnderwater))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityWaterMob this]
    (-> this (.getCanSpawnHere))))

(defn not-colliding?
  "returns: `boolean`"
  (^Boolean [^EntityWaterMob this]
    (-> this (.isNotColliding))))

(defn get-talk-interval
  "returns: `int`"
  (^Integer [^EntityWaterMob this]
    (-> this (.getTalkInterval))))

(defn on-entity-update
  ""
  ([^EntityWaterMob this]
    (-> this (.onEntityUpdate))))

(defn pushed-by-water?
  "returns: `boolean`"
  (^Boolean [^EntityWaterMob this]
    (-> this (.isPushedByWater))))

