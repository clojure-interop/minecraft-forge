(ns net.minecraft.inventory.ContainerHorseInventory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerHorseInventory]))

(defn ->container-horse-inventory
  "Constructor.

  player-inventory - `net.minecraft.inventory.IInventory`
  horse-inventory-in - `net.minecraft.inventory.IInventory`
  horse - `net.minecraft.entity.passive.AbstractHorse`
  player - `net.minecraft.entity.player.EntityPlayer`"
  (^ContainerHorseInventory [^net.minecraft.inventory.IInventory player-inventory ^net.minecraft.inventory.IInventory horse-inventory-in ^net.minecraft.entity.passive.AbstractHorse horse ^net.minecraft.entity.player.EntityPlayer player]
    (new ContainerHorseInventory player-inventory horse-inventory-in horse player)))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerHorseInventory this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerHorseInventory this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerHorseInventory this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

