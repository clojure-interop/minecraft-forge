(ns net.minecraft.entity.monster.EntityVindicator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityVindicator]))

(defn ->entity-vindicator
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityVindicator [^net.minecraft.world.World world-in]
    (new EntityVindicator world-in)))

(defn *register-fixes-vindicator
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityVindicator/registerFixesVindicator fixer)))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityVindicator this]
    (-> this (.getCreatureAttribute))))

(defn set-aggressive
  "p-190636-1 - `boolean`"
  ([^EntityVindicator this ^Boolean p-190636-1]
    (-> this (.setAggressive p-190636-1))))

(defn aggressive?
  "returns: `boolean`"
  (^Boolean [^EntityVindicator this]
    (-> this (.isAggressive))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityVindicator this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityVindicator this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityVindicator this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn on-same-team?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityVindicator this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isOnSameTeam entity-in))))

(defn set-custom-name-tag
  "name - `java.lang.String`"
  ([^EntityVindicator this ^java.lang.String name]
    (-> this (.setCustomNameTag name))))

