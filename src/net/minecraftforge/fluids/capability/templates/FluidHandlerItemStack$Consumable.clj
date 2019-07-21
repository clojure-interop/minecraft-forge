(ns net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack$Consumable
  "Destroys the container item when it's emptied."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates FluidHandlerItemStack$Consumable]))

(defn ->consumable
  "Constructor.

  container - `net.minecraft.item.ItemStack`
  capacity - `int`"
  (^FluidHandlerItemStack$Consumable [^net.minecraft.item.ItemStack container ^Integer capacity]
    (new FluidHandlerItemStack$Consumable container capacity)))

