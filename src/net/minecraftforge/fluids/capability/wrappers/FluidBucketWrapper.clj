(ns net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper
  "Wrapper for vanilla and forge buckets.
  Swaps between empty bucket and filled bucket of the correct type."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.wrappers FluidBucketWrapper]))

(defn ->fluid-bucket-wrapper
  "Constructor.

  container - `net.minecraft.item.ItemStack`"
  (^FluidBucketWrapper [^net.minecraft.item.ItemStack container]
    (new FluidBucketWrapper container)))

(defn get-container
  "Description copied from interface: IFluidHandlerItem

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^FluidBucketWrapper this]
    (-> this (.getContainer))))

(defn can-fill-fluid-type?
  "fluid - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidBucketWrapper this ^net.minecraftforge.fluids.FluidStack fluid]
    (-> this (.canFillFluidType fluid))))

(defn get-fluid
  "returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidBucketWrapper this]
    (-> this (.getFluid))))

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^FluidBucketWrapper this]
    (-> this (.getTankProperties))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^FluidBucketWrapper this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidBucketWrapper this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^FluidBucketWrapper this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^FluidBucketWrapper this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

