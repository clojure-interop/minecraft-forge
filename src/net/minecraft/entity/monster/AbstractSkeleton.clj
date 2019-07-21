(ns net.minecraft.entity.monster.AbstractSkeleton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster AbstractSkeleton]))

(defn ->abstract-skeleton
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^AbstractSkeleton [^net.minecraft.world.World world-in]
    (new AbstractSkeleton world-in)))

(defn get-eye-height
  "returns: `float`"
  (^Float [^AbstractSkeleton this]
    (-> this (.getEyeHeight))))

(defn set-combat-task
  ""
  ([^AbstractSkeleton this]
    (-> this (.setCombatTask))))

(defn set-swinging-arms
  "swinging-arms - `boolean`"
  ([^AbstractSkeleton this ^Boolean swinging-arms]
    (-> this (.setSwingingArms swinging-arms))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^AbstractSkeleton this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^AbstractSkeleton this]
    (-> this (.getCreatureAttribute))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^AbstractSkeleton this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn attack-entity-with-ranged-attack
  "target - `net.minecraft.entity.EntityLivingBase`
  distance-factor - `float`"
  ([^AbstractSkeleton this ^net.minecraft.entity.EntityLivingBase target ^Float distance-factor]
    (-> this (.attackEntityWithRangedAttack target distance-factor))))

(defn get-y-offset
  "returns: `double`"
  (^Double [^AbstractSkeleton this]
    (-> this (.getYOffset))))

(defn update-ridden
  ""
  ([^AbstractSkeleton this]
    (-> this (.updateRidden))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^AbstractSkeleton this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn swinging-arms?
  "returns: `boolean`"
  (^Boolean [^AbstractSkeleton this]
    (-> this (.isSwingingArms))))

(defn on-living-update
  ""
  ([^AbstractSkeleton this]
    (-> this (.onLivingUpdate))))

(defn set-item-stack-to-slot
  "slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  stack - `net.minecraft.item.ItemStack`"
  ([^AbstractSkeleton this ^net.minecraft.inventory.EntityEquipmentSlot slot-in ^net.minecraft.item.ItemStack stack]
    (-> this (.setItemStackToSlot slot-in stack))))

