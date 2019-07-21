(ns net.minecraft.entity.monster.EntityPigZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityPigZombie]))

(defn ->entity-pig-zombie
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityPigZombie [^net.minecraft.world.World world-in]
    (new EntityPigZombie world-in)))

(defn *register-fixes-pig-zombie
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityPigZombie/registerFixesPigZombie fixer)))

(defn set-revenge-target
  "living-base - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityPigZombie this ^net.minecraft.entity.EntityLivingBase living-base]
    (-> this (.setRevengeTarget living-base))))

(defn get-can-spawn-here?
  "returns: `boolean`"
  (^Boolean [^EntityPigZombie this]
    (-> this (.getCanSpawnHere))))

(defn not-colliding?
  "returns: `boolean`"
  (^Boolean [^EntityPigZombie this]
    (-> this (.isNotColliding))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPigZombie this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPigZombie this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityPigZombie this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn angry?
  "returns: `boolean`"
  (^Boolean [^EntityPigZombie this]
    (-> this (.isAngry))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityPigZombie this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

