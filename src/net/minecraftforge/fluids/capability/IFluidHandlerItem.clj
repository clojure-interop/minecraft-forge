(ns net.minecraftforge.fluids.capability.IFluidHandlerItem
  "ItemStacks handled by an IFluidHandler may change, so this class allows
  users of the fluid handler to get the container after it has been used."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability IFluidHandlerItem]))

(defn get-container
  "Get the container currently acted on by this fluid handler.
   The ItemStack may be different from its initial state, in the case of fluid containers that have different items
   for their filled and empty states.
   May be an empty item if the container was drained and is consumable.

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^IFluidHandlerItem this]
    (-> this (.getContainer))))

