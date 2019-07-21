(ns net.minecraftforge.items.IItemHandlerModifiable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items IItemHandlerModifiable]))

(defn set-stack-in-slot
  "Overrides the stack in the given slot. This method is used by the
   standard Forge helper methods and classes. It is not intended for
   general use by other mods, and the handler may throw an error if it
   is called unexpectedly.

  slot - Slot to modify - `int`
  stack - ItemStack to set slot to (may be null) - `net.minecraft.item.ItemStack`

  throws: java.lang.RuntimeException - if the handler is called in a way that the handler was not expecting."
  ([^IItemHandlerModifiable this ^Integer slot ^net.minecraft.item.ItemStack stack]
    (-> this (.setStackInSlot slot stack))))

