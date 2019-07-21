(ns net.minecraft.inventory.ContainerWorkbench
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerWorkbench]))

(defn ->container-workbench
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`"
  (^ContainerWorkbench [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in]
    (new ContainerWorkbench player-inventory world-in pos-in)))

(defn craft-matrix
  "Instance Field.

  type: net.minecraft.inventory.InventoryCrafting"
  (^net.minecraft.inventory.InventoryCrafting [^ContainerWorkbench this]
    (-> this .-craftMatrix)))

(defn craft-result
  "Instance Field.

  type: net.minecraft.inventory.IInventory"
  (^net.minecraft.inventory.IInventory [^ContainerWorkbench this]
    (-> this .-craftResult)))

(defn on-craft-matrix-changed
  "inventory-in - `net.minecraft.inventory.IInventory`"
  ([^ContainerWorkbench this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.onCraftMatrixChanged inventory-in))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerWorkbench this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerWorkbench this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerWorkbench this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn can-merge-slot?
  "stack - `net.minecraft.item.ItemStack`
  slot-in - `net.minecraft.inventory.Slot`

  returns: `boolean`"
  (^Boolean [^ContainerWorkbench this ^net.minecraft.item.ItemStack stack ^net.minecraft.inventory.Slot slot-in]
    (-> this (.canMergeSlot stack slot-in))))

