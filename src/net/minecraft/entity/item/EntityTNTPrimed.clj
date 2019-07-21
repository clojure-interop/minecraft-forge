(ns net.minecraft.entity.item.EntityTNTPrimed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityTNTPrimed]))

(defn ->entity-tnt-primed
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  igniter - `net.minecraft.entity.EntityLivingBase`"
  (^EntityTNTPrimed [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.entity.EntityLivingBase igniter]
    (new EntityTNTPrimed world-in x y z igniter))
  (^EntityTNTPrimed [^net.minecraft.world.World world-in]
    (new EntityTNTPrimed world-in)))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityTNTPrimed this]
    (-> this (.canBeCollidedWith))))

(defn on-update
  ""
  ([^EntityTNTPrimed this]
    (-> this (.onUpdate))))

(defn get-tnt-placed-by
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityTNTPrimed this]
    (-> this (.getTntPlacedBy))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityTNTPrimed this]
    (-> this (.getEyeHeight))))

(defn set-fuse
  "fuse-in - `int`"
  ([^EntityTNTPrimed this ^Integer fuse-in]
    (-> this (.setFuse fuse-in))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityTNTPrimed this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn get-fuse-data-manager
  "returns: `int`"
  (^Integer [^EntityTNTPrimed this]
    (-> this (.getFuseDataManager))))

(defn get-fuse
  "returns: `int`"
  (^Integer [^EntityTNTPrimed this]
    (-> this (.getFuse))))

