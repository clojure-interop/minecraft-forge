(ns net.minecraft.entity.monster.EntityGhast
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityGhast]))

(defn ->entity-ghast
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityGhast [^net.minecraft.world.World world-in]
    (new EntityGhast world-in)))

(defn *register-fixes-ghast
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityGhast/registerFixesGhast fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityGhast this]
    (-> this (.getEyeHeight))))

(defn attacking?
  "returns: `boolean`"
  (^Boolean [^EntityGhast this]
    (-> this (.isAttacking))))

(defn on-update
  ""
  ([^EntityGhast this]
    (-> this (.onUpdate))))

(defn set-attacking
  "attacking - `boolean`"
  ([^EntityGhast this ^Boolean attacking]
    (-> this (.setAttacking attacking))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityGhast this]
    (-> this (.getCanSpawnHere))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityGhast this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityGhast this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityGhast this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityGhast this]
    (-> this (.getSoundCategory))))

(defn get-max-spawned-in-chunk
  "returns: `int`"
  (^Integer [^EntityGhast this]
    (-> this (.getMaxSpawnedInChunk))))

(defn get-fireball-strength
  "returns: `int`"
  (^Integer [^EntityGhast this]
    (-> this (.getFireballStrength))))

