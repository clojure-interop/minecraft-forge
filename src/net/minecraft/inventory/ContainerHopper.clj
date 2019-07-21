(ns net.minecraft.inventory.ContainerHopper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerHopper]))

(defn ->container-hopper
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  hopper-inventory-in - `net.minecraft.inventory.IInventory`
  player - `net.minecraft.entity.player.EntityPlayer`"
  (^ContainerHopper [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.inventory.IInventory hopper-inventory-in ^net.minecraft.entity.player.EntityPlayer player]
    (new ContainerHopper player-inventory hopper-inventory-in player)))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerHopper this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerHopper this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerHopper this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

