(ns net.minecraft.inventory.SlotShulkerBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory SlotShulkerBox]))

(defn ->slot-shulker-box
  "Constructor.

  p-i-47265-1 - `net.minecraft.inventory.IInventory`
  slot-index-in - `int`
  x-position - `int`
  y-position - `int`"
  (^SlotShulkerBox [^net.minecraft.inventory.IInventory p-i-47265-1 ^Integer slot-index-in ^Integer x-position ^Integer y-position]
    (new SlotShulkerBox p-i-47265-1 slot-index-in x-position y-position)))

(defn item-valid?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^SlotShulkerBox this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValid stack))))

