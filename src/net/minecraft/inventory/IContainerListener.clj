(ns net.minecraft.inventory.IContainerListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory IContainerListener]))

(defn update-crafting-inventory
  "container-to-send - `net.minecraft.inventory.Container`
  items-list - `net.minecraft.util.NonNullList`"
  ([^IContainerListener this ^net.minecraft.inventory.Container container-to-send ^net.minecraft.util.NonNullList items-list]
    (-> this (.updateCraftingInventory container-to-send items-list))))

(defn send-slot-contents
  "container-to-send - `net.minecraft.inventory.Container`
  slot-ind - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^IContainerListener this ^net.minecraft.inventory.Container container-to-send ^Integer slot-ind ^net.minecraft.item.ItemStack stack]
    (-> this (.sendSlotContents container-to-send slot-ind stack))))

(defn send-progress-bar-update
  "container-in - `net.minecraft.inventory.Container`
  var-to-update - `int`
  new-value - `int`"
  ([^IContainerListener this ^net.minecraft.inventory.Container container-in ^Integer var-to-update ^Integer new-value]
    (-> this (.sendProgressBarUpdate container-in var-to-update new-value))))

(defn send-all-window-properties
  "container-in - `net.minecraft.inventory.Container`
  inventory - `net.minecraft.inventory.IInventory`"
  ([^IContainerListener this ^net.minecraft.inventory.Container container-in ^net.minecraft.inventory.IInventory inventory]
    (-> this (.sendAllWindowProperties container-in inventory))))

