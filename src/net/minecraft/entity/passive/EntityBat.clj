(ns net.minecraft.entity.passive.EntityBat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityBat]))

(defn ->entity-bat
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityBat [^net.minecraft.world.World world-in]
    (new EntityBat world-in)))

(defn *register-fixes-bat
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityBat/registerFixesBat fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityBat this]
    (-> this (.getEyeHeight))))

(defn on-update
  ""
  ([^EntityBat this]
    (-> this (.onUpdate))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityBat this]
    (-> this (.getCanSpawnHere))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityBat this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn fall
  "distance - `float`
  damage-multiplier - `float`"
  ([^EntityBat this ^Float distance ^Float damage-multiplier]
    (-> this (.fall distance damage-multiplier))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityBat this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityBat this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn does-entity-not-trigger-pressure-plate
  "returns: `boolean`"
  (^Boolean [^EntityBat this]
    (-> this (.doesEntityNotTriggerPressurePlate))))

(defn get-is-bat-hanging?
  "returns: `boolean`"
  (^Boolean [^EntityBat this]
    (-> this (.getIsBatHanging))))

(defn set-is-bat-hanging
  "is-hanging - `boolean`"
  ([^EntityBat this ^Boolean is-hanging]
    (-> this (.setIsBatHanging is-hanging))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^EntityBat this]
    (-> this (.canBePushed))))

