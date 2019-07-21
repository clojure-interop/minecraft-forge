(ns net.minecraft.inventory.InventoryCraftResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryCraftResult]))

(defn ->inventory-craft-result
  "Constructor."
  (^InventoryCraftResult []
    (new InventoryCraftResult )))

(defn get-field-count
  "returns: `int`"
  (^Integer [^InventoryCraftResult this]
    (-> this (.getFieldCount))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCraftResult this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCraftResult this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^InventoryCraftResult this]
    (-> this (.getInventoryStackLimit))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^InventoryCraftResult this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryCraftResult this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^InventoryCraftResult this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^InventoryCraftResult this ^Integer id]
    (-> this (.getField id))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^InventoryCraftResult this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^InventoryCraftResult this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^InventoryCraftResult this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryCraftResult this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^InventoryCraftResult this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryCraftResult this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^InventoryCraftResult this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryCraftResult this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn mark-dirty
  ""
  ([^InventoryCraftResult this]
    (-> this (.markDirty))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCraftResult this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryCraftResult this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

