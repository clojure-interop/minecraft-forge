(ns net.minecraft.entity.passive.AbstractChestHorse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive AbstractChestHorse]))

(defn ->abstract-chest-horse
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^AbstractChestHorse [^net.minecraft.world.World world-in]
    (new AbstractChestHorse world-in)))

(defn *register-fixes-abstract-chest-horse
  "fixer - `net.minecraft.util.datafix.DataFixer`
  entity-class - `java.lang.Class`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.Class entity-class]
    (AbstractChestHorse/registerFixesAbstractChestHorse fixer entity-class)))

(defn set-chested
  "chested - `boolean`"
  ([^AbstractChestHorse this ^Boolean chested]
    (-> this (.setChested chested))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^AbstractChestHorse this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^AbstractChestHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^AbstractChestHorse this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^AbstractChestHorse this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-inventory-columns
  "returns: `int`"
  (^Integer [^AbstractChestHorse this]
    (-> this (.getInventoryColumns))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^AbstractChestHorse this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn has-chest?
  "returns: `boolean`"
  (^Boolean [^AbstractChestHorse this]
    (-> this (.hasChest))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^AbstractChestHorse this]
    (-> this (.getMountedYOffset))))

