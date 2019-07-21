(ns net.minecraft.inventory.ContainerBeacon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerBeacon]))

(defn ->container-beacon
  "Constructor.

  player-inventory - `net.minecraft.inventory.IInventory`
  tile-beacon-in - `net.minecraft.inventory.IInventory`"
  (^ContainerBeacon [^net.minecraft.inventory.IInventory player-inventory ^net.minecraft.inventory.IInventory tile-beacon-in]
    (new ContainerBeacon player-inventory tile-beacon-in)))

(defn add-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^ContainerBeacon this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.addListener listener))))

(defn update-progress-bar
  "id - `int`
  data - `int`"
  ([^ContainerBeacon this ^Integer id ^Integer data]
    (-> this (.updateProgressBar id data))))

(defn get-tile-entity
  "returns: `net.minecraft.inventory.IInventory`"
  (^net.minecraft.inventory.IInventory [^ContainerBeacon this]
    (-> this (.getTileEntity))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerBeacon this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerBeacon this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerBeacon this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

