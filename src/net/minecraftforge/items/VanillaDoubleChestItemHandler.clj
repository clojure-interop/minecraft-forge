(ns net.minecraftforge.items.VanillaDoubleChestItemHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items VanillaDoubleChestItemHandler]))

(defn ->vanilla-double-chest-item-handler
  "Constructor.

  main-chest - `net.minecraft.tileentity.TileEntityChest`
  other - `net.minecraft.tileentity.TileEntityChest`
  main-chest-is-upper - `boolean`"
  (^VanillaDoubleChestItemHandler [^net.minecraft.tileentity.TileEntityChest main-chest ^net.minecraft.tileentity.TileEntityChest other ^Boolean main-chest-is-upper]
    (new VanillaDoubleChestItemHandler main-chest other main-chest-is-upper)))

(def *-no-adjacent-chests-instance
  "Static Constant.

  type: net.minecraftforge.items.VanillaDoubleChestItemHandler"
  VanillaDoubleChestItemHandler/NO_ADJACENT_CHESTS_INSTANCE)

(defn *get
  "chest - `net.minecraft.tileentity.TileEntityChest`

  returns: `net.minecraftforge.items.VanillaDoubleChestItemHandler`"
  (^net.minecraftforge.items.VanillaDoubleChestItemHandler [^net.minecraft.tileentity.TileEntityChest chest]
    (VanillaDoubleChestItemHandler/get chest)))

(defn get-chest
  "accessing-upper - `boolean`

  returns: `net.minecraft.tileentity.TileEntityChest`"
  (^net.minecraft.tileentity.TileEntityChest [^VanillaDoubleChestItemHandler this ^Boolean accessing-upper]
    (-> this (.getChest accessing-upper))))

(defn insert-item
  "Description copied from interface: IItemHandler

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^VanillaDoubleChestItemHandler this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

(defn extract-item
  "Description copied from interface: IItemHandler

  slot - Slot to extract from. - `int`
  amount - Amount to extract (may be greater than the current stacks max limit) - `int`
  simulate - If true, the extraction is only simulated - `boolean`

  returns: ItemStack extracted from the slot, must be null, if nothing can be extracted - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^VanillaDoubleChestItemHandler this ^Integer slot ^Integer amount ^Boolean simulate]
    (-> this (.extractItem slot amount simulate))))

(defn get-slot-limit
  "Description copied from interface: IItemHandler

  slot - Slot to query. - `int`

  returns: The maximum stack size allowed in the slot. - `int`"
  (^Integer [^VanillaDoubleChestItemHandler this ^Integer slot]
    (-> this (.getSlotLimit slot))))

(defn set-stack-in-slot
  "Description copied from interface: IItemHandlerModifiable

  slot - Slot to modify - `int`
  stack - ItemStack to set slot to (may be null) - `net.minecraft.item.ItemStack`"
  ([^VanillaDoubleChestItemHandler this ^Integer slot ^net.minecraft.item.ItemStack stack]
    (-> this (.setStackInSlot slot stack))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VanillaDoubleChestItemHandler this]
    (-> this (.hashCode))))

(defn get-slots
  "Description copied from interface: IItemHandler

  returns: The number of slots available - `int`"
  (^Integer [^VanillaDoubleChestItemHandler this]
    (-> this (.getSlots))))

(defn needs-refresh
  "returns: `boolean`"
  (^Boolean [^VanillaDoubleChestItemHandler this]
    (-> this (.needsRefresh))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VanillaDoubleChestItemHandler this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-stack-in-slot
  "Description copied from interface: IItemHandler

  slot - Slot to query - `int`

  returns: ItemStack in given slot. May be null. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^VanillaDoubleChestItemHandler this ^Integer slot]
    (-> this (.getStackInSlot slot))))

