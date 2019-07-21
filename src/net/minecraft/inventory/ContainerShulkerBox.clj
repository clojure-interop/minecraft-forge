(ns net.minecraft.inventory.ContainerShulkerBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerShulkerBox]))

(defn ->container-shulker-box
  "Constructor.

  p-i-47266-1 - `net.minecraft.entity.player.InventoryPlayer`
  p-i-47266-2 - `net.minecraft.inventory.IInventory`
  p-i-47266-3 - `net.minecraft.entity.player.EntityPlayer`"
  (^ContainerShulkerBox [^net.minecraft.entity.player.InventoryPlayer p-i-47266-1 ^net.minecraft.inventory.IInventory p-i-47266-2 ^net.minecraft.entity.player.EntityPlayer p-i-47266-3]
    (new ContainerShulkerBox p-i-47266-1 p-i-47266-2 p-i-47266-3)))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerShulkerBox this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerShulkerBox this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerShulkerBox this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

