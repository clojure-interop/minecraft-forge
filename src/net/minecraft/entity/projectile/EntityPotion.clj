(ns net.minecraft.entity.projectile.EntityPotion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityPotion]))

(defn ->entity-potion
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  potion-damage-in - `net.minecraft.item.ItemStack`"
  (^EntityPotion [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.item.ItemStack potion-damage-in]
    (new EntityPotion world-in x y z potion-damage-in))
  (^EntityPotion [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase thrower-in ^net.minecraft.item.ItemStack potion-damage-in]
    (new EntityPotion world-in thrower-in potion-damage-in))
  (^EntityPotion [^net.minecraft.world.World world-in]
    (new EntityPotion world-in)))

(def *-water-sensitive
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.entity.EntityLivingBase>"
  EntityPotion/WATER_SENSITIVE)

(defn *register-fixes-potion
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityPotion/registerFixesPotion fixer)))

(defn get-potion
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityPotion this]
    (-> this (.getPotion))))

(defn set-item
  "stack - `net.minecraft.item.ItemStack`"
  ([^EntityPotion this ^net.minecraft.item.ItemStack stack]
    (-> this (.setItem stack))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPotion this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityPotion this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

