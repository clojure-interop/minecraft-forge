(ns net.minecraft.inventory.SlotFurnaceFuel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory SlotFurnaceFuel]))

(defn ->slot-furnace-fuel
  "Constructor.

  inventory-in - `net.minecraft.inventory.IInventory`
  slot-index - `int`
  x-position - `int`
  y-position - `int`"
  (^SlotFurnaceFuel [^net.minecraft.inventory.IInventory inventory-in ^Integer slot-index ^Integer x-position ^Integer y-position]
    (new SlotFurnaceFuel inventory-in slot-index x-position y-position)))

(defn *bucket?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack]
    (SlotFurnaceFuel/isBucket stack)))

(defn item-valid?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^SlotFurnaceFuel this ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValid stack))))

(defn get-item-stack-limit
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^SlotFurnaceFuel this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackLimit stack))))

