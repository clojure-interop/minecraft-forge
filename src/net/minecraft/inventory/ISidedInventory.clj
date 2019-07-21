(ns net.minecraft.inventory.ISidedInventory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ISidedInventory]))

(defn get-slots-for-face
  "side - `net.minecraft.util.EnumFacing`

  returns: `int[]`"
  ([^ISidedInventory this ^net.minecraft.util.EnumFacing side]
    (-> this (.getSlotsForFace side))))

(defn can-insert-item?
  "index - `int`
  item-stack-in - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^ISidedInventory this ^Integer index ^net.minecraft.item.ItemStack item-stack-in ^net.minecraft.util.EnumFacing direction]
    (-> this (.canInsertItem index item-stack-in direction))))

(defn can-extract-item?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`
  direction - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^ISidedInventory this ^Integer index ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumFacing direction]
    (-> this (.canExtractItem index stack direction))))

