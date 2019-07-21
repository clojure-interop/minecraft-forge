(ns net.minecraftforge.items.IItemHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items IItemHandler]))

(defn get-slots
  "Returns the number of slots available

  returns: The number of slots available - `int`"
  (^Integer [^IItemHandler this]
    (-> this (.getSlots))))

(defn get-stack-in-slot
  "Returns the ItemStack in a given slot.

   The result's stack size may be greater than the itemstacks max size.

   If the result is null, then the slot is empty.
   If the result is not null but the stack size is zero, then it represents
   an empty slot that will only accept* a specific itemstack.


   IMPORTANT: This ItemStack MUST NOT be modified. This method is not for
   altering an inventories contents. Any implementers who are able to detect
   modification through this method should throw an exception.

   SERIOUSLY: DO NOT MODIFY THE RETURNED ITEMSTACK

  slot - Slot to query - `int`

  returns: ItemStack in given slot. May be null. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^IItemHandler this ^Integer slot]
    (-> this (.getStackInSlot slot))))

(defn insert-item
  "Inserts an ItemStack into the given slot and return the remainder.
   The ItemStack should not be modified in this function!
   Note: This behaviour is subtly different from IFluidHandlers.fill()

  slot - Slot to insert into. - `int`
  stack - ItemStack to insert. - `net.minecraft.item.ItemStack`
  simulate - If true, the insertion is only simulated - `boolean`

  returns: The remaining ItemStack that was not inserted (if the entire stack is accepted, then return null).
           May be the same as the input ItemStack if unchanged, otherwise a new ItemStack. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^IItemHandler this ^Integer slot ^net.minecraft.item.ItemStack stack ^Boolean simulate]
    (-> this (.insertItem slot stack simulate))))

(defn extract-item
  "Extracts an ItemStack from the given slot. The returned value must be null
   if nothing is extracted, otherwise it's stack size must not be greater than amount or the
   itemstacks getMaxStackSize().

  slot - Slot to extract from. - `int`
  amount - Amount to extract (may be greater than the current stacks max limit) - `int`
  simulate - If true, the extraction is only simulated - `boolean`

  returns: ItemStack extracted from the slot, must be null, if nothing can be extracted - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^IItemHandler this ^Integer slot ^Integer amount ^Boolean simulate]
    (-> this (.extractItem slot amount simulate))))

(defn get-slot-limit
  "Retrieves the maximum stack size allowed to exist in the given slot.

  slot - Slot to query. - `int`

  returns: The maximum stack size allowed in the slot. - `int`"
  (^Integer [^IItemHandler this ^Integer slot]
    (-> this (.getSlotLimit slot))))

