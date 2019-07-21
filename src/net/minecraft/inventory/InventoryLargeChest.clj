(ns net.minecraft.inventory.InventoryLargeChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryLargeChest]))

(defn ->inventory-large-chest
  "Constructor.

  name-in - `java.lang.String`
  upper-chest-in - `net.minecraft.world.ILockableContainer`
  lower-chest-in - `net.minecraft.world.ILockableContainer`"
  (^InventoryLargeChest [^java.lang.String name-in ^net.minecraft.world.ILockableContainer upper-chest-in ^net.minecraft.world.ILockableContainer lower-chest-in]
    (new InventoryLargeChest name-in upper-chest-in lower-chest-in)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^InventoryLargeChest this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^InventoryLargeChest this]
    (-> this (.getFieldCount))))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^InventoryLargeChest this]
    (-> this (.isLocked))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryLargeChest this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryLargeChest this]
    (-> this (.getGuiID))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryLargeChest this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^InventoryLargeChest this]
    (-> this (.getInventoryStackLimit))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^InventoryLargeChest this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryLargeChest this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^InventoryLargeChest this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn part-of-large-chest?
  "inventory-in - `net.minecraft.inventory.IInventory`

  returns: `boolean`"
  (^Boolean [^InventoryLargeChest this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.isPartOfLargeChest inventory-in))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^InventoryLargeChest this ^Integer id]
    (-> this (.getField id))))

(defn set-lock-code
  "code - `net.minecraft.world.LockCode`"
  ([^InventoryLargeChest this ^net.minecraft.world.LockCode code]
    (-> this (.setLockCode code))))

(defn get-lock-code
  "returns: `net.minecraft.world.LockCode`"
  (^net.minecraft.world.LockCode [^InventoryLargeChest this]
    (-> this (.getLockCode))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^InventoryLargeChest this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^InventoryLargeChest this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^InventoryLargeChest this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryLargeChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^InventoryLargeChest this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryLargeChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^InventoryLargeChest this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryLargeChest this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn mark-dirty
  ""
  ([^InventoryLargeChest this]
    (-> this (.markDirty))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryLargeChest this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryLargeChest this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

