(ns net.minecraft.inventory.ContainerFurnace
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerFurnace]))

(defn ->container-furnace
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  furnace-inventory - `net.minecraft.inventory.IInventory`"
  (^ContainerFurnace [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.inventory.IInventory furnace-inventory]
    (new ContainerFurnace player-inventory furnace-inventory)))

(defn add-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^ContainerFurnace this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.addListener listener))))

(defn detect-and-send-changes
  ""
  ([^ContainerFurnace this]
    (-> this (.detectAndSendChanges))))

(defn update-progress-bar
  "id - `int`
  data - `int`"
  ([^ContainerFurnace this ^Integer id ^Integer data]
    (-> this (.updateProgressBar id data))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerFurnace this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerFurnace this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

