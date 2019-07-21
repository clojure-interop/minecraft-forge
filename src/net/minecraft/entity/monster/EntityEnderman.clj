(ns net.minecraft.entity.monster.EntityEnderman
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityEnderman]))

(defn ->entity-enderman
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityEnderman [^net.minecraft.world.World world-in]
    (new EntityEnderman world-in)))

(defn *register-fixes-enderman
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityEnderman/registerFixesEnderman fixer)))

(defn *set-carriable
  "block - `net.minecraft.block.Block`
  can-carry - `boolean`"
  ([^net.minecraft.block.Block block ^Boolean can-carry]
    (EntityEnderman/setCarriable block can-carry)))

(defn *get-carriable?
  "block - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^net.minecraft.block.Block block]
    (EntityEnderman/getCarriable block)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityEnderman this]
    (-> this (.getEyeHeight))))

(defn set-held-block-state
  "state - `net.minecraft.block.state.IBlockState`"
  ([^EntityEnderman this ^net.minecraft.block.state.IBlockState state]
    (-> this (.setHeldBlockState state))))

(defn play-enderman-sound
  ""
  ([^EntityEnderman this]
    (-> this (.playEndermanSound))))

(defn screaming?
  "returns: `boolean`"
  (^Boolean [^EntityEnderman this]
    (-> this (.isScreaming))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEnderman this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEnderman this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityEnderman this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn set-attack-target
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityEnderman this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in]
    (-> this (.setAttackTarget entitylivingbase-in))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityEnderman this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn on-living-update
  ""
  ([^EntityEnderman this]
    (-> this (.onLivingUpdate))))

(defn get-held-block-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityEnderman this]
    (-> this (.getHeldBlockState))))

