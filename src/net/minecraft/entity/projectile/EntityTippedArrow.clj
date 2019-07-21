(ns net.minecraft.entity.projectile.EntityTippedArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityTippedArrow]))

(defn ->entity-tipped-arrow
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityTippedArrow [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityTippedArrow world-in x y z))
  (^EntityTippedArrow [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter]
    (new EntityTippedArrow world-in shooter))
  (^EntityTippedArrow [^net.minecraft.world.World world-in]
    (new EntityTippedArrow world-in)))

(defn *func-191508-b
  "p-191508-0 - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack p-191508-0]
    (EntityTippedArrow/func_191508_b p-191508-0)))

(defn *register-fixes-tipped-arrow
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityTippedArrow/registerFixesTippedArrow fixer)))

(defn set-potion-effect
  "stack - `net.minecraft.item.ItemStack`"
  ([^EntityTippedArrow this ^net.minecraft.item.ItemStack stack]
    (-> this (.setPotionEffect stack))))

(defn add-effect
  "effect - `net.minecraft.potion.PotionEffect`"
  ([^EntityTippedArrow this ^net.minecraft.potion.PotionEffect effect]
    (-> this (.addEffect effect))))

(defn on-update
  ""
  ([^EntityTippedArrow this]
    (-> this (.onUpdate))))

(defn get-color
  "returns: `int`"
  (^Integer [^EntityTippedArrow this]
    (-> this (.getColor))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityTippedArrow this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityTippedArrow this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityTippedArrow this ^Byte id]
    (-> this (.handleStatusUpdate id))))

