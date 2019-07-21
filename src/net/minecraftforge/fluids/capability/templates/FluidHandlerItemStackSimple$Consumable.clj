(ns net.minecraftforge.fluids.capability.templates.FluidHandlerItemStackSimple$Consumable
  "Destroys the container item when it's emptied."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates FluidHandlerItemStackSimple$Consumable]))

(defn ->consumable
  "Constructor.

  container - `net.minecraft.item.ItemStack`
  capacity - `int`"
  (^FluidHandlerItemStackSimple$Consumable [^net.minecraft.item.ItemStack container ^Integer capacity]
    (new FluidHandlerItemStackSimple$Consumable container capacity)))

