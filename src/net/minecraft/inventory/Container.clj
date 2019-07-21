(ns net.minecraft.inventory.Container
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory Container]))

(defn ->container
  "Constructor."
  (^Container []
    (new Container )))

(defn inventory-item-stacks
  "Instance Field.

  type: net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>"
  (^net.minecraft.util.NonNullList [^Container this]
    (-> this .-inventoryItemStacks)))

(defn inventory-slots
  "Instance Field.

  type: java.util.List<net.minecraft.inventory.Slot>"
  (^java.util.List [^Container this]
    (-> this .-inventorySlots)))

(defn window-id
  "Instance Field.

  type: int"
  (^Integer [^Container this]
    (-> this .-windowId)))

(defn *extract-drag-mode
  "event-button - `int`

  returns: `int`"
  (^Integer [^Integer event-button]
    (Container/extractDragMode event-button)))

(defn *get-drag-event
  "clicked-button - `int`

  returns: `int`"
  (^Integer [^Integer clicked-button]
    (Container/getDragEvent clicked-button)))

(defn *get-quickcraft-mask
  "p-94534-0 - `int`
  p-94534-1 - `int`

  returns: `int`"
  (^Integer [^Integer p-94534-0 ^Integer p-94534-1]
    (Container/getQuickcraftMask p-94534-0 p-94534-1)))

(defn *valid-drag-mode?
  "drag-mode-in - `int`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Integer drag-mode-in ^net.minecraft.entity.player.EntityPlayer player]
    (Container/isValidDragMode drag-mode-in player)))

(defn *can-add-item-to-slot?
  "slot-in - `net.minecraft.inventory.Slot`
  stack - `net.minecraft.item.ItemStack`
  stack-size-matters - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.inventory.Slot slot-in ^net.minecraft.item.ItemStack stack ^Boolean stack-size-matters]
    (Container/canAddItemToSlot slot-in stack stack-size-matters)))

(defn *compute-stack-size
  "drag-slots-in - `java.util.Set`
  drag-mode-in - `int`
  stack - `net.minecraft.item.ItemStack`
  slot-stack-size - `int`"
  ([^java.util.Set drag-slots-in ^Integer drag-mode-in ^net.minecraft.item.ItemStack stack ^Integer slot-stack-size]
    (Container/computeStackSize drag-slots-in drag-mode-in stack slot-stack-size)))

(defn *calc-redstone
  "te - `net.minecraft.tileentity.TileEntity`

  returns: `int`"
  (^Integer [^net.minecraft.tileentity.TileEntity te]
    (Container/calcRedstone te)))

(defn *calc-redstone-from-inventory
  "inv - `net.minecraft.inventory.IInventory`

  returns: `int`"
  (^Integer [^net.minecraft.inventory.IInventory inv]
    (Container/calcRedstoneFromInventory inv)))

(defn can-drag-into-slot?
  "slot-in - `net.minecraft.inventory.Slot`

  returns: `boolean`"
  (^Boolean [^Container this ^net.minecraft.inventory.Slot slot-in]
    (-> this (.canDragIntoSlot slot-in))))

(defn enchant-item
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  id - `int`

  returns: `boolean`"
  (^Boolean [^Container this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer id]
    (-> this (.enchantItem player-in id))))

(defn detect-and-send-changes
  ""
  ([^Container this]
    (-> this (.detectAndSendChanges))))

(defn set-all
  "p-190896-1 - `java.util.List`"
  ([^Container this ^java.util.List p-190896-1]
    (-> this (.setAll p-190896-1))))

(defn on-craft-matrix-changed
  "inventory-in - `net.minecraft.inventory.IInventory`"
  ([^Container this ^net.minecraft.inventory.IInventory inventory-in]
    (-> this (.onCraftMatrixChanged inventory-in))))

(defn update-progress-bar
  "id - `int`
  data - `int`"
  ([^Container this ^Integer id ^Integer data]
    (-> this (.updateProgressBar id data))))

(defn slot-click
  "slot-id - `int`
  drag-type - `int`
  click-type-in - `net.minecraft.inventory.ClickType`
  player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Container this ^Integer slot-id ^Integer drag-type ^net.minecraft.inventory.ClickType click-type-in ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.slotClick slot-id drag-type click-type-in player))))

(defn on-container-closed
  "player-in - `net.minecraft.entity.player.EntityPlayer`"
  ([^Container this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.onContainerClosed player-in))))

(defn remove-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^Container this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.removeListener listener))))

(defn add-listener
  "listener - `net.minecraft.inventory.IContainerListener`"
  ([^Container this ^net.minecraft.inventory.IContainerListener listener]
    (-> this (.addListener listener))))

(defn set-can-craft
  "player - `net.minecraft.entity.player.EntityPlayer`
  can-craft - `boolean`"
  ([^Container this ^net.minecraft.entity.player.EntityPlayer player ^Boolean can-craft]
    (-> this (.setCanCraft player can-craft))))

(defn can-interact-with?
  "player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Container this ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.canInteractWith player-in))))

(defn get-next-transaction-id
  "inv-player - `net.minecraft.entity.player.InventoryPlayer`

  returns: `short`"
  (^Short [^Container this ^net.minecraft.entity.player.InventoryPlayer inv-player]
    (-> this (.getNextTransactionID inv-player))))

(defn get-inventory
  "returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^Container this]
    (-> this (.getInventory))))

(defn can-merge-slot?
  "stack - `net.minecraft.item.ItemStack`
  slot-in - `net.minecraft.inventory.Slot`

  returns: `boolean`"
  (^Boolean [^Container this ^net.minecraft.item.ItemStack stack ^net.minecraft.inventory.Slot slot-in]
    (-> this (.canMergeSlot stack slot-in))))

(defn put-stack-in-slot
  "slot-id - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^Container this ^Integer slot-id ^net.minecraft.item.ItemStack stack]
    (-> this (.putStackInSlot slot-id stack))))

(defn get-can-craft?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^Container this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getCanCraft player))))

(defn get-slot-from-inventory
  "inv - `net.minecraft.inventory.IInventory`
  slot-in - `int`

  returns: `net.minecraft.inventory.Slot`"
  (^net.minecraft.inventory.Slot [^Container this ^net.minecraft.inventory.IInventory inv ^Integer slot-in]
    (-> this (.getSlotFromInventory inv slot-in))))

(defn get-slot
  "slot-id - `int`

  returns: `net.minecraft.inventory.Slot`"
  (^net.minecraft.inventory.Slot [^Container this ^Integer slot-id]
    (-> this (.getSlot slot-id))))

(defn transfer-stack-in-slot
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Container this ^net.minecraft.entity.player.EntityPlayer player-in ^Integer index]
    (-> this (.transferStackInSlot player-in index))))

