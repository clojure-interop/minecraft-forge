(ns net.minecraftforge.fluids.capability.templates.FluidHandlerItemStackSimple
  "FluidHandlerItemStackSimple is a template capability provider for ItemStacks.
  Data is stored directly in the vanilla NBT, in the same way as the old ItemFluidContainer.

  This implementation only allows item containers to be fully filled or emptied, similar to vanilla buckets."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates FluidHandlerItemStackSimple]))

(defn ->fluid-handler-item-stack-simple
  "Constructor.

  container - The container itemStack, data is stored on it directly as NBT. - `net.minecraft.item.ItemStack`
  capacity - The maximum capacity of this fluid tank. - `int`"
  (^FluidHandlerItemStackSimple [^net.minecraft.item.ItemStack container ^Integer capacity]
    (new FluidHandlerItemStackSimple container capacity)))

(def *-fluid-nbt-key
  "Static Constant.

  type: java.lang.String"
  FluidHandlerItemStackSimple/FLUID_NBT_KEY)

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidHandlerItemStackSimple this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^FluidHandlerItemStackSimple this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn can-drain-fluid-type?
  "fluid - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidHandlerItemStackSimple this ^net.minecraftforge.fluids.FluidStack fluid]
    (-> this (.canDrainFluidType fluid))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^FluidHandlerItemStackSimple this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn get-container
  "Description copied from interface: IFluidHandlerItem

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^FluidHandlerItemStackSimple this]
    (-> this (.getContainer))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^FluidHandlerItemStackSimple this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-fluid
  "returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidHandlerItemStackSimple this]
    (-> this (.getFluid))))

(defn can-fill-fluid-type?
  "fluid - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidHandlerItemStackSimple this ^net.minecraftforge.fluids.FluidStack fluid]
    (-> this (.canFillFluidType fluid))))

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^FluidHandlerItemStackSimple this]
    (-> this (.getTankProperties))))

