(ns net.minecraft.inventory.InventoryBasic
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryBasic]))

(defn ->inventory-basic
  "Constructor.

  title - `java.lang.String`
  custom-name - `boolean`
  slot-count - `int`"
  (^InventoryBasic [^java.lang.String title ^Boolean custom-name ^Integer slot-count]
    (new InventoryBasic title custom-name slot-count))
  (^InventoryBasic [^net.minecraft.util.text.ITextComponent title ^Integer slot-count]
    (new InventoryBasic title slot-count)))

(defn get-field-count
  "returns: `int`"
  (^Integer [^InventoryBasic this]
    (-> this (.getFieldCount))))

(defn add-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryBasic this ^net.minecraft.item.ItemStack stack]
    (-> this (.addItem stack))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryBasic this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryBasic this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^InventoryBasic this]
    (-> this (.getInventoryStackLimit))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^InventoryBasic this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryBasic this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^InventoryBasic this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn set-custom-name
  "inventory-title-in - `java.lang.String`"
  ([^InventoryBasic this ^java.lang.String inventory-title-in]
    (-> this (.setCustomName inventory-title-in))))

(defn add-inventory-change-listener
  "listener - `net.minecraft.inventory.IInventoryChangedListener`"
  ([^InventoryBasic this ^net.minecraft.inventory.IInventoryChangedListener listener]
    (-> this (.addInventoryChangeListener listener))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^InventoryBasic this ^Integer id]
    (-> this (.getField id))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^InventoryBasic this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^InventoryBasic this]
    (-> this (.getSizeInventory))))

(defn remove-inventory-change-listener
  "listener - `net.minecraft.inventory.IInventoryChangedListener`"
  ([^InventoryBasic this ^net.minecraft.inventory.IInventoryChangedListener listener]
    (-> this (.removeInventoryChangeListener listener))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^InventoryBasic this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryBasic this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^InventoryBasic this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryBasic this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^InventoryBasic this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryBasic this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn mark-dirty
  ""
  ([^InventoryBasic this]
    (-> this (.markDirty))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryBasic this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryBasic this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

