(ns net.minecraft.entity.monster.EntityVex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityVex]))

(defn ->entity-vex
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityVex [^net.minecraft.world.World world-in]
    (new EntityVex world-in)))

(defn *register-fixes-vex
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityVex/registerFixesVex fixer)))

(defn get-bound-origin
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityVex this]
    (-> this (.getBoundOrigin))))

(defn set-owner
  "owner-in - `net.minecraft.entity.EntityLiving`"
  ([^EntityVex this ^net.minecraft.entity.EntityLiving owner-in]
    (-> this (.setOwner owner-in))))

(defn on-update
  ""
  ([^EntityVex this]
    (-> this (.onUpdate))))

(defn charging?
  "returns: `boolean`"
  (^Boolean [^EntityVex this]
    (-> this (.isCharging))))

(defn set-limited-life
  "limited-life-ticks-in - `int`"
  ([^EntityVex this ^Integer limited-life-ticks-in]
    (-> this (.setLimitedLife limited-life-ticks-in))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityVex this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn set-bound-origin
  "bound-origin-in - `net.minecraft.util.math.BlockPos`"
  ([^EntityVex this ^net.minecraft.util.math.BlockPos bound-origin-in]
    (-> this (.setBoundOrigin bound-origin-in))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityVex this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^EntityVex this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityVex this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-owner
  "returns: `net.minecraft.entity.EntityLiving`"
  (^net.minecraft.entity.EntityLiving [^EntityVex this]
    (-> this (.getOwner))))

(defn move
  "type - `net.minecraft.entity.MoverType`
  x - `double`
  y - `double`
  z - `double`"
  ([^EntityVex this ^net.minecraft.entity.MoverType type ^Double x ^Double y ^Double z]
    (-> this (.move type x y z))))

(defn set-is-charging
  "p-190648-1 - `boolean`"
  ([^EntityVex this ^Boolean p-190648-1]
    (-> this (.setIsCharging p-190648-1))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityVex this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

