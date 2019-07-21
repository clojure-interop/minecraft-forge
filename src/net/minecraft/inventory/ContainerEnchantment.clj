(ns net.minecraft.inventory.ContainerEnchantment
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerEnchantment]))

(defn ->container-enchantment
  "Constructor.

  player-inv - `net.minecraft.entity.player.InventoryPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^ContainerEnchantment [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (new ContainerEnchantment player-inv world-in pos))
  (^ContainerEnchantment [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.world.World world-in]
    (new ContainerEnchantment player-inv world-in)))

(defn table-inventory
  "Instance Field.

  type: net.minecraft.inventory.IInventory"
  (^net.minecraft.inventory.IInventory [^ContainerEnchantment this]
    (-> this .-tableInventory)))

(defn xp-seed
  "Instance Field.

  type: int"
  (^Integer [^ContainerEnchantment this]
    (-> this .-xpSeed)))

(defn enchant-levels
  "Instance Field.

  type: int[]"
  ([^ContainerEnchantment this]
    (-> this .-enchantLevels)))

(defn enchant-clue
  "Instance Field.

  type: int[]"
  ([^ContainerEnchantment this]
    (-> this .-enchantClue)))

(defn world-clue
  "Instance Field.

  type: int[]"
  ([^ContainerEnchantment this]
    (-> this .-worldClue)))

(defn enchant-item
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  id - `int`

  returns: `boolean`"
  (^Boolean [^ContainerEnchantment this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer id]
    (-> this (.enchantItem player-in id))))

(defn detect-and-send-changes
  ""
  ([^ContainerEnchantment this]
    (-> this (.detectAndSendChanges))))

(defn get-lapis-amount
  "returns: `int`"
  (^Integer [^ContainerEnchantment this]
    (-> this (.getLapisAmount))))

(defn on-craft-matrix-changed
  "inventory-in - `net.minecraft.inventory.IInventory`"
  ([^ContainerEnchantment this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.onCraftMatrixChanged inventory-in))))

(defn update-progress-bar
  "id - `int`
  data - `int`"
  ([^ContainerEnchantment this ^Integer id ^Integer data]
    (-> this (.updateProgressBar id data))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^ContainerEnchantment this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn add-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^ContainerEnchantment this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.addListener listener))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^ContainerEnchantment this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ContainerEnchantment this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

