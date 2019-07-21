(ns net.minecraftforge.items.wrapper.SidedInvWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items.wrapper SidedInvWrapper]))

(defn ->sided-inv-wrapper
  "Constructor.

  inv - `net.minecraft.inventory.ISidedInventory`
  side - `net.minecraft.util.EnumFacing`"
  (^SidedInvWrapper [^net.minecraft.inventory.ISidedInventory inv ^net.minecraft.util.EnumFacing side]
    (new SidedInvWrapper inv side)))

(defn *get-slot
  "inv - `net.minecraft.inventory.ISidedInventory`
  slot - `int`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^net.minecraft.inventory.ISidedInventory inv ^Integer slot ^net.minecraft.util.EnumFacing side]
    (SidedInvWrapper/getSlot inv slot side)))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SidedInvWrapper this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SidedInvWrapper this]
    (-> this (.hashCode))))

(defn get-slots
  "Description copied from interface: IItemHandler

  returns: The number of slots available - `int`"
  (^Integer [^SidedInvWrapper this]
    (-> this (.getSlots))))

(defn get-stack-in-slot
  "Description copied from interface: IItemHandler

  slot - Slot to query - `int`

  returns: ItemStack in given slot. May be null. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SidedInvWrapper this ^Integer slot]
    (-> this (.getStackInSlot slot))))

(defn insert-item
  "Description copied from interface: IItemHandler

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SidedInvWrapper this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

(defn set-stack-in-slot
  "Description copied from interface: IItemHandlerModifiable

  slot - Slot to modify - `int`
  stack - ItemStack to set slot to (may be null) - `net.minecraft.item.ItemStack`"
  ([^SidedInvWrapper this ^Integer slot ^net.minecraft.item.ItemStack stack]
    (-> this (.setStackInSlot slot stack))))

(defn extract-item
  "Description copied from interface: IItemHandler

  slot - Slot to extract from. - `int`
  amount - Amount to extract (may be greater than the current stacks max limit) - `int`
  simulate - If true, the extraction is only simulated - `boolean`

  returns: ItemStack extracted from the slot, must be null, if nothing can be extracted - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SidedInvWrapper this ^Integer slot ^Integer amount ^Boolean simulate]
    (-> this (.extractItem slot amount simulate))))

(defn get-slot-limit
  "Description copied from interface: IItemHandler

  slot - Slot to query. - `int`

  returns: The maximum stack size allowed in the slot. - `int`"
  (^Integer [^SidedInvWrapper this ^Integer slot]
    (-> this (.getSlotLimit slot))))

