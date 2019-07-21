(ns net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack$SwapEmpty
  "Swaps the container item for a different one when it's emptied."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates FluidHandlerItemStack$SwapEmpty]))

(defn ->swap-empty
  "Constructor.

  container - `net.minecraft.item.ItemStack`
  empty-container - `net.minecraft.item.ItemStack`
  capacity - `int`"
  (^FluidHandlerItemStack$SwapEmpty [^net.minecraft.item.ItemStack container ^net.minecraft.item.ItemStack empty-container ^Integer capacity]
    (new FluidHandlerItemStack$SwapEmpty container empty-container capacity)))

