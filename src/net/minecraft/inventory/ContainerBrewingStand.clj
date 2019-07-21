(ns net.minecraft.inventory.ContainerBrewingStand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerBrewingStand]))

(defn ->container-brewing-stand
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  tile-brewing-stand-in - `net.minecraft.inventory.IInventory`"
  (^ContainerBrewingStand [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.inventory.IInventory tile-brewing-stand-in]
    (new ContainerBrewingStand player-inventory tile-brewing-stand-in)))

(defn add-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^ContainerBrewingStand this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.addListener listener))))

(defn detect-and-send-changes
  ""
  ([^ContainerBrewingStand this]
    (-> this (.detectAndSendChanges))))

(defn update-progress-bar
  "id - `int`
  data - `int`"
  ([^ContainerBrewingStand this ^Integer id ^Integer data]
    (-> this (.updateProgressBar id data))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerBrewingStand this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerBrewingStand this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

