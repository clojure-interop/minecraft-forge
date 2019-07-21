(ns net.minecraft.entity.monster.EntitySlime
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntitySlime]))

(defn ->entity-slime
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySlime [^net.minecraft.world.World world-in]
    (new EntitySlime world-in)))

(defn squish-amount
  "Instance Field.

  type: float"
  (^Float [^EntitySlime this]
    (-> this .-squishAmount)))

(defn squish-factor
  "Instance Field.

  type: float"
  (^Float [^EntitySlime this]
    (-> this .-squishFactor)))

(defn prev-squish-factor
  "Instance Field.

  type: float"
  (^Float [^EntitySlime this]
    (-> this .-prevSquishFactor)))

(defn *register-fixes-slime
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySlime/registerFixesSlime fixer)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntitySlime this]
    (-> this (.getEyeHeight))))

(defn on-update
  ""
  ([^EntitySlime this]
    (-> this (.onUpdate))))

(defn apply-entity-collision
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntitySlime this ^net.minecraft.entity.Entity entity-in]
    (-> this (.applyEntityCollision entity-in))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntitySlime this]
    (-> this (.getCanSpawnHere))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySlime this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySlime this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-vertical-face-speed
  "returns: `int`"
  (^Integer [^EntitySlime this]
    (-> this (.getVerticalFaceSpeed))))

(defn get-slime-size
  "returns: `int`"
  (^Integer [^EntitySlime this]
    (-> this (.getSlimeSize))))

(defn on-collide-with-player
  "entity-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntitySlime this ^net.minecraft.entity.player.EntityPlayer entity-in]
    (-> this (.onCollideWithPlayer entity-in))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntitySlime this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn small-slime?
  "returns: `boolean`"
  (^Boolean [^EntitySlime this]
    (-> this (.isSmallSlime))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntitySlime this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn set-dead
  ""
  ([^EntitySlime this]
    (-> this (.setDead))))

