(ns net.minecraftforge.items.ItemStackHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items ItemStackHandler]))

(defn ->item-stack-handler
  "Constructor.

  size - `int`"
  (^ItemStackHandler [^Integer size]
    (new ItemStackHandler size))
  (^ItemStackHandler []
    (new ItemStackHandler )))

(defn insert-item
  "Description copied from interface: IItemHandler

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStackHandler this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

(defn extract-item
  "Description copied from interface: IItemHandler

  slot - Slot to extract from. - `int`
  amount - Amount to extract (may be greater than the current stacks max limit) - `int`
  simulate - If true, the extraction is only simulated - `boolean`

  returns: ItemStack extracted from the slot, must be null, if nothing can be extracted - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStackHandler this ^Integer slot ^Integer amount ^Boolean simulate]
    (-> this (.extractItem slot amount simulate))))

(defn serialize-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ItemStackHandler this]
    (-> this (.serializeNBT))))

(defn get-slot-limit
  "Description copied from interface: IItemHandler

  slot - Slot to query. - `int`

  returns: The maximum stack size allowed in the slot. - `int`"
  (^Integer [^ItemStackHandler this ^Integer slot]
    (-> this (.getSlotLimit slot))))

(defn set-stack-in-slot
  "Description copied from interface: IItemHandlerModifiable

  slot - Slot to modify - `int`
  stack - ItemStack to set slot to (may be null) - `net.minecraft.item.ItemStack`"
  ([^ItemStackHandler this ^Integer slot ^net.minecraft.item.ItemStack stack]
    (-> this (.setStackInSlot slot stack))))

(defn set-size
  "size - `int`"
  ([^ItemStackHandler this ^Integer size]
    (-> this (.setSize size))))

(defn get-slots
  "Description copied from interface: IItemHandler

  returns: The number of slots available - `int`"
  (^Integer [^ItemStackHandler this]
    (-> this (.getSlots))))

(defn deserialize-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^ItemStackHandler this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.deserializeNBT nbt))))

(defn get-stack-in-slot
  "Description copied from interface: IItemHandler

  slot - Slot to query - `int`

  returns: ItemStack in given slot. May be null. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemStackHandler this ^Integer slot]
    (-> this (.getStackInSlot slot))))

