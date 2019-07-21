(ns net.minecraft.tileentity.MobSpawnerBaseLogic
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity MobSpawnerBaseLogic]))

(defn ->mob-spawner-base-logic
  "Constructor."
  (^MobSpawnerBaseLogic []
    (new MobSpawnerBaseLogic )))

(defn write-to-nbt
  "p-189530-1 - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MobSpawnerBaseLogic this ^net.minecraft.nbt.NBTTagCompound p-189530-1]
    (-> this (.writeToNBT p-189530-1))))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^MobSpawnerBaseLogic this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn broadcast-event
  "id - `int`"
  ([^MobSpawnerBaseLogic this ^Integer id]
    (-> this (.broadcastEvent id))))

(defn get-cached-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^MobSpawnerBaseLogic this]
    (-> this (.getCachedEntity))))

(defn update-spawner
  ""
  ([^MobSpawnerBaseLogic this]
    (-> this (.updateSpawner))))

(defn set-next-spawn-data
  "p-184993-1 - `net.minecraft.util.WeightedSpawnerEntity`"
  ([^MobSpawnerBaseLogic this ^net.minecraft.util.WeightedSpawnerEntity p-184993-1]
    (-> this (.setNextSpawnData p-184993-1))))

(defn set-entity-id
  "id - `net.minecraft.util.ResourceLocation`"
  ([^MobSpawnerBaseLogic this ^net.minecraft.util.ResourceLocation id]
    (-> this (.setEntityId id))))

(defn get-mob-rotation
  "returns: `double`"
  (^Double [^MobSpawnerBaseLogic this]
    (-> this (.getMobRotation))))

(defn set-delay-to-min
  "delay - `int`

  returns: `boolean`"
  (^Boolean [^MobSpawnerBaseLogic this ^Integer delay]
    (-> this (.setDelayToMin delay))))

(defn get-spawner-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^MobSpawnerBaseLogic this]
    (-> this (.getSpawnerPosition))))

(defn get-spawner-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^MobSpawnerBaseLogic this]
    (-> this (.getSpawnerWorld))))

(defn get-prev-mob-rotation
  "returns: `double`"
  (^Double [^MobSpawnerBaseLogic this]
    (-> this (.getPrevMobRotation))))

