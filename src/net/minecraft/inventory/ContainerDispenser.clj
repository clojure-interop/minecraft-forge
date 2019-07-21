(ns net.minecraft.inventory.ContainerDispenser
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerDispenser]))

(defn ->container-dispenser
  "Constructor.

  player-inventory - `net.minecraft.inventory.IInventory`
  dispenser-inventory-in - `net.minecraft.inventory.IInventory`"
  (^ContainerDispenser [^net.minecraft.inventory.IInventory player-inventory ^net.minecraft.inventory.IInventory dispenser-inventory-in]
    (new ContainerDispenser player-inventory dispenser-inventory-in)))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerDispenser this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerDispenser this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

