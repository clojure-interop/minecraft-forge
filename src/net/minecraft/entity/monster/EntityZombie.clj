(ns net.minecraft.entity.monster.EntityZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityZombie]))

(defn ->entity-zombie
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityZombie [^net.minecraft.world.World world-in]
    (new EntityZombie world-in)))

(defn *register-fixes-zombie
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityZombie/registerFixesZombie fixer)))

(defn on-kill-entity
  "entity-living-in - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityZombie this ^net.minecraft.entity.EntityLivingBase entity-living-in]
    (-> this (.onKillEntity entity-living-in))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityZombie this]
    (-> this (.getEyeHeight))))

(defn set-break-doors-a-itask
  "enabled - `boolean`"
  ([^EntityZombie this ^Boolean enabled]
    (-> this (.setBreakDoorsAItask enabled))))

(defn set-arms-raised
  "arms-raised - `boolean`"
  ([^EntityZombie this ^Boolean arms-raised]
    (-> this (.setArmsRaised arms-raised))))

(defn arms-raised?
  "returns: `boolean`"
  (^Boolean [^EntityZombie this]
    (-> this (.isArmsRaised))))

(defn break-doors-task-set?
  "returns: `boolean`"
  (^Boolean [^EntityZombie this]
    (-> this (.isBreakDoorsTaskSet))))

(defn set-child
  "child-zombie - `boolean`"
  ([^EntityZombie this ^Boolean child-zombie]
    (-> this (.setChild child-zombie))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityZombie this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityZombie this]
    (-> this (.getCreatureAttribute))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityZombie this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityZombie this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn child?
  "returns: `boolean`"
  (^Boolean [^EntityZombie this]
    (-> this (.isChild))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityZombie this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^EntityZombie this]
    (-> this (.getYOffset))))

(defn set-child-size
  "is-child - `boolean`"
  ([^EntityZombie this ^Boolean is-child]
    (-> this (.setChildSize is-child))))

(defn attack-entity-as-mob
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityZombie this ^net.minecraft.entity.Entity entity-in]
    (-> this (.attackEntityAsMob entity-in))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityZombie this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityZombie this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn on-living-update
  ""
  ([^EntityZombie this]
    (-> this (.onLivingUpdate))))

