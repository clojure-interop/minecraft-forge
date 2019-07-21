(ns net.minecraft.inventory.ContainerRepair
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerRepair]))

(defn ->container-repair
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  world-in - `net.minecraft.world.World`
  block-pos-in - `net.minecraft.util.math.BlockPos`
  player - `net.minecraft.entity.player.EntityPlayer`"
  (^ContainerRepair [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos block-pos-in ^net.minecraft.entity.player.EntityPlayer player]
    (new ContainerRepair player-inventory world-in block-pos-in player))
  (^ContainerRepair [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player]
    (new ContainerRepair player-inventory world-in player)))

(defn maximum-cost
  "Instance Field.

  type: int"
  (^Integer [^ContainerRepair this]
    (-> this .-maximumCost)))

(defn material-cost
  "Instance Field.

  type: int"
  (^Integer [^ContainerRepair this]
    (-> this .-materialCost)))

(defn on-craft-matrix-changed
  "inventory-in - `net.minecraft.inventory.IInventory`"
  ([^ContainerRepair this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.onCraftMatrixChanged inventory-in))))

(defn update-repair-output
  ""
  ([^ContainerRepair this]
    (-> this (.updateRepairOutput))))

(defn add-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^ContainerRepair this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.addListener listener))))

(defn update-progress-bar
  "id - `int`
  data - `int`"
  ([^ContainerRepair this ^Integer id ^Integer data]
    (-> this (.updateProgressBar id data))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerRepair this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerRepair this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerRepair this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn update-item-name
  "new-name - `java.lang.String`"
  ([^ContainerRepair this ^java.lang.String new-name]
    (-> this (.updateItemName new-name))))

