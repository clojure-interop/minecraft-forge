(ns net.minecraft.inventory.InventoryMerchant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory InventoryMerchant]))

(defn ->inventory-merchant
  "Constructor.

  the-player-in - `net.minecraft.entity.player.EntityPlayer`
  the-merchant-in - `net.minecraft.entity.IMerchant`"
  (^InventoryMerchant [^net.minecraft.entity.player.EntityPlayer the-player-in ^net.minecraft.entity.IMerchant the-merchant-in]
    (new InventoryMerchant the-player-in the-merchant-in)))

(defn get-field-count
  "returns: `int`"
  (^Integer [^InventoryMerchant this]
    (-> this (.getFieldCount))))

(defn decr-stack-size
  "index - `int`
  count - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryMerchant this ^Integer index ^Integer count]
    (-> this (.decrStackSize index count))))

(defn remove-stack-from-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryMerchant this ^Integer index]
    (-> this (.removeStackFromSlot index))))

(defn get-inventory-stack-limit
  "returns: `int`"
  (^Integer [^InventoryMerchant this]
    (-> this (.getInventoryStackLimit))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^InventoryMerchant this]
    (-> this (.getDisplayName))))

(defn reset-recipe-and-slots
  ""
  ([^InventoryMerchant this]
    (-> this (.resetRecipeAndSlots))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InventoryMerchant this]
    (-> this (.getName))))

(defn set-field
  "id - `int`
  value - `int`"
  ([^InventoryMerchant this ^Integer id ^Integer value]
    (-> this (.setField id value))))

(defn get-field
  "id - `int`

  returns: `int`"
  (^Integer [^InventoryMerchant this ^Integer id]
    (-> this (.getField id))))

(defn has-custom-name?
  "returns: `boolean`"
  (^Boolean [^InventoryMerchant this]
    (-> this (.hasCustomName))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^InventoryMerchant this]
    (-> this (.getSizeInventory))))

(defn set-inventory-slot-contents
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^InventoryMerchant this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setInventorySlotContents index stack))))

(defn open-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.openInventory player))))

(defn get-current-recipe
  "returns: `net.minecraft.village.MerchantRecipe`"
  (^net.minecraft.village.MerchantRecipe [^InventoryMerchant this]
    (-> this (.getCurrentRecipe))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^InventoryMerchant this]
    (-> this (.isEmpty))))

(defn usable-by-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^InventoryMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.isUsableByPlayer player))))

(defn clear
  ""
  ([^InventoryMerchant this]
    (-> this (.clear))))

(defn set-current-recipe-index
  "current-recipe-index-in - `int`"
  ([^InventoryMerchant this ^Integer current-recipe-index-in]
    (-> this (.setCurrentRecipeIndex current-recipe-index-in))))

(defn item-valid-for-slot?
  "index - `int`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^InventoryMerchant this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.isItemValidForSlot index stack))))

(defn mark-dirty
  ""
  ([^InventoryMerchant this]
    (-> this (.markDirty))))

(defn get-stack-in-slot
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^InventoryMerchant this ^Integer index]
    (-> this (.getStackInSlot index))))

(defn close-inventory
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^InventoryMerchant this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.closeInventory player))))

