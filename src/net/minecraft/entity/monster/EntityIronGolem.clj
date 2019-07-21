(ns net.minecraft.entity.monster.EntityIronGolem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityIronGolem]))

(defn ->entity-iron-golem
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityIronGolem [^net.minecraft.world.World world-in]
    (new EntityIronGolem world-in)))

(defn *register-fixes-iron-golem
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityIronGolem/registerFixesIronGolem fixer)))

(defn get-hold-rose-tick
  "returns: `int`"
  (^Integer [^EntityIronGolem this]
    (-> this (.getHoldRoseTick))))

(defn set-holding-rose
  "p-70851-1 - `boolean`"
  ([^EntityIronGolem this ^Boolean p-70851-1]
    (-> this (.setHoldingRose p-70851-1))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityIronGolem this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityIronGolem this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityIronGolem this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-player-created
  "player-created - `boolean`"
  ([^EntityIronGolem this ^Boolean player-created]
    (-> this (.setPlayerCreated player-created))))

(defn can-attack-class?
  "cls - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^EntityIronGolem this ^java.lang.Class cls]
    (-> this (.canAttackClass cls))))

(defn get-attack-timer
  "returns: `int`"
  (^Integer [^EntityIronGolem this]
    (-> this (.getAttackTimer))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityIronGolem this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn get-village
  "returns: `net.minecraft.village.Village`"
  (^net.minecraft.village.Village [^EntityIronGolem this]
    (-> this (.getVillage))))

(defn player-created?
  "returns: `boolean`"
  (^Boolean [^EntityIronGolem this]
    (-> this (.isPlayerCreated))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityIronGolem this ^Byte id]
    (-> this (.handleStatusUpdate id))))

(defn on-living-update
  ""
  ([^EntityIronGolem this]
    (-> this (.onLivingUpdate))))

