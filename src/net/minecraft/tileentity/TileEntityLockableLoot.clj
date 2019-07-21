(ns net.minecraft.tileentity.TileEntityLockableLoot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityLockableLoot]))

(defn ->tile-entity-lockable-loot
  "Constructor."
  (^TileEntityLockableLoot []
    (new TileEntityLockableLoot )))

(defn set-loot-table
  "p-189404-1 - `net.minecraft.util.ResourceLocation`
  p-189404-2 - `long`"
  ([^TileEntityLockableLoot this ^net.minecraft.util.ResourceLocation p-189404-1 ^Long p-189404-2]
    (-> this (.setLootTable p-189404-1 p-189404-2))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^TileEntityLockableLoot this]
    (-> this (.getFieldCount))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityLockableLoot this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityLockableLoot this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn fill-with-loot
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityLockableLoot this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.fillWithLoot player))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^TileEntityLockableLoot this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn set-custom-name
  "p-190575-1 - `java.lang.String`"
  ([^TileEntityLockableLoot this ^java.lang.String p-190575-1]
    (-> this (.setCustomName p-190575-1))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^TileEntityLockableLoot this ^Integer id]
    (-> this (.getField id))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^TileEntityLockableLoot this]
    (-> this (.hasCustomName))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^TileEntityLockableLoot this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityLockableLoot this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn get-loot-table
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^TileEntityLockableLoot this]
    (-> this (.getLootTable))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^TileEntityLockableLoot this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^TileEntityLockableLoot this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^TileEntityLockableLoot this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^TileEntityLockableLoot this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^TileEntityLockableLoot this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

