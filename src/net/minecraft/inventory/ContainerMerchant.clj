(ns net.minecraft.inventory.ContainerMerchant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerMerchant]))

(defn ->container-merchant
  "Constructor.

  player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  merchant - `net.minecraft.entity.IMerchant`
  world-in - `net.minecraft.world.World`"
  (^ContainerMerchant [^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.IMerchant merchant ^net.minecraft.world.World world-in]
    (new ContainerMerchant player-inventory merchant world-in)))

(defn get-merchant-inventory
  "returns: `net.minecraft.inventory.InventoryMerchant`"
  (^net.minecraft.inventory.InventoryMerchant [^ContainerMerchant this]
    (-> this (.getMerchantInventory))))

(defn on-craft-matrix-changed
  "inventory-in - `net.minecraft.inventory.IInventory`"
  ([^ContainerMerchant this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.onCraftMatrixChanged inventory-in))))

(defn set-current-recipe-index
  "current-recipe-index - `int`"
  ([^ContainerMerchant this ^Integer current-recipe-index]
    (-> this (.setCurrentRecipeIndex current-recipe-index))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerMerchant this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerMerchant this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerMerchant this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

