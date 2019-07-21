(ns net.minecraft.inventory.ContainerChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerChest]))

(defn ->container-chest
  "Constructor.

  player-inventory - `net.minecraft.inventory.IInventory`
  chest-inventory - `net.minecraft.inventory.IInventory`
  player - `net.minecraft.entity.player.EntityPlayer`"
  (^ContainerChest [^net.minecraft.inventory.IInventory player-inventory ^net.minecraft.inventory.IInventory chest-inventory ^net.minecraft.entity.player.EntityPlayer player]
    (new ContainerChest player-inventory chest-inventory player)))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerChest this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerChest this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerChest this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn get-lower-chest-inventory
  "returns: `net.minecraft.inventory.IInventory`"
  (^net.minecraft.inventory.IInventory [^ContainerChest this]
    (-> this (.getLowerChestInventory))))

