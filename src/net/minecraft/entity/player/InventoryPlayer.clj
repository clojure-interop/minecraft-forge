(ns net.minecraft.entity.player.InventoryPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.player InventoryPlayer]))

(defn ->inventory-player
  "Constructor.

  player-in - `net.minecraft.entity.player.EntityPlayer`"
  (^InventoryPlayer [^net.minecraft.entity.player.EntityPlayer player-in]
    (new InventoryPlayer player-in)))

(defn main-inventory
  "Instance Constant.

  type: net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>"
  (^net.minecraft.util.NonNullList [^InventoryPlayer this]
    (-> this .-mainInventory)))

(defn armor-inventory
  "Instance Constant.

  type: net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>"
  (^net.minecraft.util.NonNullList [^InventoryPlayer this]
    (-> this .-armorInventory)))

(defn off-hand-inventory
  "Instance Constant.

  type: net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>"
  (^net.minecraft.util.NonNullList [^InventoryPlayer this]
    (-> this .-offHandInventory)))

(defn current-item
  "Instance Field.

  type: int"
  (^Integer [^InventoryPlayer this]
    (-> this .-currentItem)))

(defn player
  "Instance Field.

  type: net.minecraft.entity.player.EntityPlayer"
  (^net.minecraft.entity.player.EntityPlayer [^InventoryPlayer this]
    (-> this .-player)))

(defn inventory-changed
  "Instance Field.

  type: boolean"
  (^Boolean [^InventoryPlayer this]
    (-> this .-inventoryChanged)))

(defn *get-hotbar-size
  "returns: `int`"
  (^Integer []
    (InventoryPlayer/getHotbarSize )))

(defn *hotbar?
  "index - `int`

  returns: `boolean`"
  (^Boolean [^Integer index]
    (InventoryPlayer/isHotbar index)))

(defn get-first-empty-stack
  "returns: `int`"
  (^Integer [^InventoryPlayer this]
    (-> this (.getFirstEmptyStack))))

(defn decrement-animations
  ""
  ([^InventoryPlayer this]
    (-> this (.decrementAnimations))))

(defn write-to-nbt
  "nbt-tag-list-in - `net.minecraft.nbt.NBTTagList`

  returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^InventoryPlayer this ^net.minecraft.nbt.NBTTagList nbt-tag-list-in]
    (-> this (.writeToNBT nbt-tag-list-in))))

(defn get-field-count
  "returns: `int`"
  (^Integer [^InventoryPlayer this]
    (-> this (.getFieldCount))))

(defn read-from-nbt
  "nbt-tag-list-in - `net.minecraft.nbt.NBTTagList`"
  ([^InventoryPlayer this ^net.minecraft.nbt.NBTTagList nbt-tag-list-in]
    (-> this (.readFromNBT nbt-tag-list-in))))

(defn has-item-stack?
  "item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryPlayer this ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.hasItemStack item-stack-in))))

(defn change-current-item
  "direction - `int`"
  ([^InventoryPlayer this ^Integer direction]
    (-> this (.changeCurrentItem direction))))

(defn get-slot-for
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^InventoryPlayer this ^net.minecraft.item.ItemStack stack]
    (-> this (.getSlotFor stack))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryPlayer this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn can-harvest-block?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^InventoryPlayer this ^net.minecraft.block.state.IBlockState state]
    (-> this (.canHarvestBlock state))))

(defn clear-matching-items
  "item-in - `net.minecraft.item.Item`
  metadata-in - `int`
  remove-count - `int`
  item-nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `int`"
  (^Integer [^InventoryPlayer this ^net.minecraft.item.Item item-in ^Integer metadata-in ^Integer remove-count ^net.minecraft.nbt.NBTTagCompound item-nbt]
    (-> this (.clearMatchingItems item-in metadata-in remove-count item-nbt))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryPlayer this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^InventoryPlayer this]
    (-> this (.getInventoryStackLimit))))

(defn damage-armor
  "damage - `float`"
  ([^InventoryPlayer this ^Float damage]
    (-> this (.damageArmor damage))))

(defn pick-item
  "index - `int`"
  ([^InventoryPlayer this ^Integer index]
    (-> this (.pickItem index))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^InventoryPlayer this]
    (-> this (.getDisplayName))))

(defn get-current-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryPlayer this]
    (-> this (.getCurrentItem))))

(defn get-best-hotbar-slot
  "returns: `int`"
  (^Integer [^InventoryPlayer this]
    (-> this (.getBestHotbarSlot))))

(defn get-str-vs-block
  "state - `net.minecraft.block.state.IBlockState`

  returns: `float`"
  (^Float [^InventoryPlayer this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getStrVsBlock state))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryPlayer this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^InventoryPlayer this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn drop-all-items
  ""
  ([^InventoryPlayer this]
    (-> this (.dropAllItems))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^InventoryPlayer this ^Integer id]
    (-> this (.getField id))))

(defn delete-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^InventoryPlayer this ^net.minecraft.item.ItemStack stack]
    (-> this (.deleteStack stack))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^InventoryPlayer this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^InventoryPlayer this]
    (-> this (.getSizeInventory))))

(defn set-item-stack
  "item-stack-in - `net.minecraft.item.ItemStack`"
  ([^InventoryPlayer this ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.setItemStack item-stack-in))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^InventoryPlayer this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn set-picked-item-stack
  "stack - `net.minecraft.item.ItemStack`"
  ([^InventoryPlayer this ^net.minecraft.item.ItemStack stack]
    (-> this (.setPickedItemStack stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryPlayer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn copy-inventory
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`"
  ([^InventoryPlayer this ^net.minecraft.entity.player.InventoryPlayer player-inventory]
    (-> this (.copyInventory player-inventory))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^InventoryPlayer this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryPlayer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^InventoryPlayer this]
    (-> this (.clear))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryPlayer this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn mark-dirty
  ""
  ([^InventoryPlayer this]
    (-> this (.markDirty))))

(defn add-item-stack-to-inventory
  "item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryPlayer this ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.addItemStackToInventory item-stack-in))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryPlayer this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryPlayer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

(defn get-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryPlayer this]
    (-> this (.getItemStack))))

(defn armor-item-in-slot
  "slot-in - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryPlayer this ^Integer slot-in]
    (-> this (.armorItemInSlot slot-in))))

