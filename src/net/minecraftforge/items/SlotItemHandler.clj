(ns net.minecraftforge.items.SlotItemHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items SlotItemHandler]))

(defn ->slot-item-handler
  "Constructor.

  item-handler - `net.minecraftforge.items.IItemHandler`
  index - `int`
  x-position - `int`
  y-position - `int`"
  (^SlotItemHandler [^net.minecraftforge.items.IItemHandler item-handler ^Integer index ^Integer x-position ^Integer y-position]
    (new SlotItemHandler item-handler index x-position y-position)))

(defn get-item-stack-limit
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^SlotItemHandler this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackLimit stack))))

(defn put-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^SlotItemHandler this ^net.minecraft.item.ItemStack stack]
    (-> this (.putStack stack))))

(defn decr-stack-size
  "amount - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SlotItemHandler this ^Integer amount]
    (-> this (.decrStackSize amount))))

(defn item-valid?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^SlotItemHandler this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValid stack))))

(defn on-slot-change
  "p-75220-1 - `net.minecraft.item.ItemStack`
  p-75220-2 - `net.minecraft.item.ItemStack`"
  ([^SlotItemHandler this ^net.minecraft.item.ItemStack p-75220-1 ^net.minecraft.item.ItemStack p-75220-2]
    (-> this (.onSlotChange p-75220-1 p-75220-2))))

(defn same-inventory?
  "Description copied from class: Slot

  other - `net.minecraft.inventory.Slot`

  returns: true if the other slot is in the same inventory - `boolean`"
  (^Boolean [^SlotItemHandler this ^net.minecraft.inventory.Slot other]
    (-> this (.isSameInventory other))))

(defn get-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SlotItemHandler this]
    (-> this (.getStack))))

(defn can-take-stack?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^SlotItemHandler this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canTakeStack player-in))))

(defn get-slot-stack-limit
  "returns: `int`"
  (^Integer [^SlotItemHandler this]
    (-> this (.getSlotStackLimit))))

(defn get-item-handler
  "returns: `net.minecraftforge.items.IItemHandler`"
  (^net.minecraftforge.items.IItemHandler [^SlotItemHandler this]
    (-> this (.getItemHandler))))

