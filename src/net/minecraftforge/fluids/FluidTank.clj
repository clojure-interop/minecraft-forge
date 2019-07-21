(ns net.minecraftforge.fluids.FluidTank
  "Reference implementation of IFluidTank. Use/extend this or implement your own."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidTank]))

(defn ->fluid-tank
  "Constructor.

  fluid - `net.minecraftforge.fluids.Fluid`
  amount - `int`
  capacity - `int`"
  (^FluidTank [^net.minecraftforge.fluids.Fluid fluid ^Integer amount ^Integer capacity]
    (new FluidTank fluid amount capacity))
  (^FluidTank [^net.minecraftforge.fluids.FluidStack fluid-stack ^Integer capacity]
    (new FluidTank fluid-stack capacity))
  (^FluidTank [^Integer capacity]
    (new FluidTank capacity)))

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidTank this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

(defn write-to-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^FluidTank this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.writeToNBT nbt))))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraftforge.fluids.FluidTank`"
  (^net.minecraftforge.fluids.FluidTank [^FluidTank this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn drain-internal
  "Use this method to bypass the restrictions from canDrainFluidType(FluidStack)
   Meant for use by the owner of the tank when they have canDrain() set to false}.

  resource - `net.minecraftforge.fluids.FluidStack`
  do-drain - `boolean`

  returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidTank this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drainInternal resource do-drain))))

(defn set-can-fill
  "Set whether this tank can be filled with IFluidHandler

  can-fill - `boolean`"
  ([^FluidTank this ^Boolean can-fill]
    (-> this (.setCanFill can-fill))))

(defn set-can-drain
  "Set whether this tank can be drained with IFluidHandler

  can-drain - `boolean`"
  ([^FluidTank this ^Boolean can-drain]
    (-> this (.setCanDrain can-drain))))

(defn can-fill?
  "Whether this tank can be filled with IFluidHandler

  returns: `boolean`"
  (^Boolean [^FluidTank this]
    (-> this (.canFill))))

(defn get-capacity
  "returns: Capacity of this fluid tank. - `int`"
  (^Integer [^FluidTank this]
    (-> this (.getCapacity))))

(defn can-drain-fluid-type?
  "Returns true if the tank can drain out this type of fluid.
   Used as a filter for fluid types.
   Does not consider the current contents or capacity of the tank,
   only whether it could ever drain out this type of fluid.

  fluid - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidTank this ^net.minecraftforge.fluids.FluidStack fluid]
    (-> this (.canDrainFluidType fluid))))

(defn get-info
  "Description copied from interface: IFluidTank

  returns: State information for the IFluidTank. - `net.minecraftforge.fluids.FluidTankInfo`"
  (^net.minecraftforge.fluids.FluidTankInfo [^FluidTank this]
    (-> this (.getInfo))))

(defn get-fluid-amount
  "returns: Current amount of fluid in the tank. - `int`"
  (^Integer [^FluidTank this]
    (-> this (.getFluidAmount))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack attempting to fill the tank. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, the fill will only be simulated. - `boolean`

  returns: Amount of fluid that was accepted by the tank. - `int`"
  (^Integer [^FluidTank this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn set-capacity
  "capacity - `int`"
  ([^FluidTank this ^Integer capacity]
    (-> this (.setCapacity capacity))))

(defn get-fluid
  "returns: FluidStack representing the fluid in the tank, null if the tank is empty. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidTank this]
    (-> this (.getFluid))))

(defn can-drain?
  "Whether this tank can be drained with IFluidHandler

  returns: `boolean`"
  (^Boolean [^FluidTank this]
    (-> this (.canDrain))))

(defn set-tile-entity
  "tile - `net.minecraft.tileentity.TileEntity`"
  ([^FluidTank this ^net.minecraft.tileentity.TileEntity tile]
    (-> this (.setTileEntity tile))))

(defn can-fill-fluid-type?
  "Returns true if the tank can be filled with this type of fluid.
   Used as a filter for fluid types.
   Does not consider the current contents or capacity of the tank,
   only whether it could ever fill with this type of fluid.

  fluid - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidTank this ^net.minecraftforge.fluids.FluidStack fluid]
    (-> this (.canFillFluidType fluid))))

(defn set-fluid
  "fluid - `net.minecraftforge.fluids.FluidStack`"
  ([^FluidTank this ^net.minecraftforge.fluids.FluidStack fluid]
    (-> this (.setFluid fluid))))

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^FluidTank this]
    (-> this (.getTankProperties))))

(defn fill-internal
  "Use this method to bypass the restrictions from canFillFluidType(FluidStack)
   Meant for use by the owner of the tank when they have set to false.

  resource - `net.minecraftforge.fluids.FluidStack`
  do-fill - `boolean`

  returns: `int`"
  (^Integer [^FluidTank this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fillInternal resource do-fill))))

