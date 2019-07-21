(ns net.minecraft.inventory.ContainerPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerPlayer]))

(defn ->container-player
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  local-world - `boolean`
  player-in - `net.minecraft.entity.player.EntityPlayer`"
  (^ContainerPlayer [^net.minecraft.entity.player.InventoryPlayer player-inventory ^Boolean local-world ^net.minecraft.entity.player.EntityPlayer player-in]
    (new ContainerPlayer player-inventory local-world player-in)))

(defn craft-matrix
  "Instance Field.

  type: net.minecraft.inventory.InventoryCrafting"
  (^net.minecraft.inventory.InventoryCrafting [^ContainerPlayer this]
    (-> this .-craftMatrix)))

(defn craft-result
  "Instance Field.

  type: net.minecraft.inventory.IInventory"
  (^net.minecraft.inventory.IInventory [^ContainerPlayer this]
    (-> this .-craftResult)))

(defn is-local-world
  "Instance Field.

  type: boolean"
  (^Boolean [^ContainerPlayer this]
    (-> this .-isLocalWorld)))

(defn on-craft-matrix-changed
  "inventory-in - `net.minecraft.inventory.IInventory`"
  ([^ContainerPlayer this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.onCraftMatrixChanged inventory-in))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerPlayer this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerPlayer this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerPlayer this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn can-merge-slot?
  "stack - `net.minecraft.item.ItemStack`
  slot-in - `net.minecraft.inventory.Slot`

  returns: `boolean`"
  (^Boolean [^ContainerPlayer this ^net.minecraft.item.ItemStack stack ^net.minecraft.inventory.Slot slot-in]
    (-> this (.canMergeSlot stack slot-in))))

