(ns net.minecraft.entity.monster.EntitySnowman
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntitySnowman]))

(defn ->entity-snowman
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntitySnowman [^net.minecraft.world.World world-in]
    (new EntitySnowman world-in)))

(defn *register-fixes-snowman
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySnowman/registerFixesSnowman fixer)))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySnowman this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySnowman this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-living-update
  ""
  ([^EntitySnowman this]
    (-> this (.onLivingUpdate))))

(defn attack-entity-with-ranged-attack
  "target - `net.minecraft.entity.EntityLivingBase`
  distance-factor - `float`"
  ([^EntitySnowman this ^net.minecraft.entity.EntityLivingBase target ^Float distance-factor]
    (-> this (.attackEntityWithRangedAttack target distance-factor))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntitySnowman this]
    (-> this (.getEyeHeight))))

(defn pumpkin-equipped?
  "returns: `boolean`"
  (^Boolean [^EntitySnowman this]
    (-> this (.isPumpkinEquipped))))

(defn set-pumpkin-equipped
  "pumpkin-equipped - `boolean`"
  ([^EntitySnowman this ^Boolean pumpkin-equipped]
    (-> this (.setPumpkinEquipped pumpkin-equipped))))

