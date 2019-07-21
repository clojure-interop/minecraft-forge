(ns net.minecraftforge.fluids.capability.ItemFluidContainer
  "A simple fluid container, to replace the functionality of the old FluidContainerRegistry and IFluidContainerItem.
  This fluid container may be set so that is can only completely filled or empty. (binary)
  It may also be set so that it gets consumed when it is drained. (consumable)"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability ItemFluidContainer]))

(defn ->item-fluid-container
  "Constructor.

  capacity - The maximum capacity of this fluid container. - `int`"
  (^ItemFluidContainer [^Integer capacity]
    (new ItemFluidContainer capacity)))

(defn init-capabilities
  "Description copied from class: Item

  stack - The ItemStack - `net.minecraft.item.ItemStack`
  nbt - NBT of this item serialized, or null. - `net.minecraft.nbt.NBTTagCompound`

  returns: A holder instance associated with this ItemStack where you can hold capabilities for the life of this item. - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^net.minecraftforge.common.capabilities.ICapabilityProvider [^ItemFluidContainer this ^net.minecraft.item.ItemStack stack ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.initCapabilities stack nbt))))

