(ns net.minecraft.inventory.InventoryCrafting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryCrafting]))

(defn ->inventory-crafting
  "Constructor.

  event-handler-in - `net.minecraft.inventory.Container`
  width - `int`
  height - `int`"
  (^InventoryCrafting [^net.minecraft.inventory.Container event-handler-in ^Integer width ^Integer height]
    (new InventoryCrafting event-handler-in width height)))

(defn get-field-count
  "returns: `int`"
  (^Integer [^InventoryCrafting this]
    (-> this (.getFieldCount))))

(defn get-width
  "returns: `int`"
  (^Integer [^InventoryCrafting this]
    (-> this (.getWidth))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCrafting this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCrafting this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^InventoryCrafting this]
    (-> this (.getInventoryStackLimit))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^InventoryCrafting this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryCrafting this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^InventoryCrafting this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^InventoryCrafting this ^Integer id]
    (-> this (.getField id))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^InventoryCrafting this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^InventoryCrafting this]
    (-> this (.getSizeInventory))))

(defn get-height
  "returns: `int`"
  (^Integer [^InventoryCrafting this]
    (-> this (.getHeight))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^InventoryCrafting this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryCrafting this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn get-stack-in-row-and-column
  "row - `int`
  column - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCrafting this ^Integer row ^Integer column]
    (-> this (.getStackInRowAndColumn row column))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^InventoryCrafting this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryCrafting this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^InventoryCrafting this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryCrafting this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn mark-dirty
  ""
  ([^InventoryCrafting this]
    (-> this (.markDirty))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryCrafting this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryCrafting this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

