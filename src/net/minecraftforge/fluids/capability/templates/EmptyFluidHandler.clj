(ns net.minecraftforge.fluids.capability.templates.EmptyFluidHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates EmptyFluidHandler]))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.fluids.capability.templates.EmptyFluidHandler"
  EmptyFluidHandler/INSTANCE)

(def *-empty-tank-info
  "Static Constant.

  type: net.minecraftforge.fluids.FluidTankInfo"
  EmptyFluidHandler/EMPTY_TANK_INFO)

(def *-empty-tank-properties
  "Static Constant.

  type: net.minecraftforge.fluids.capability.IFluidTankProperties"
  EmptyFluidHandler/EMPTY_TANK_PROPERTIES)

(def *-empty-tank-properties-array
  "Static Constant.

  type: net.minecraftforge.fluids.capability.IFluidTankProperties[]"
  EmptyFluidHandler/EMPTY_TANK_PROPERTIES_ARRAY)

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^EmptyFluidHandler this]
    (-> this (.getTankProperties))))

(defn get-fluid
  "returns: FluidStack representing the fluid in the tank, null if the tank is empty. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^EmptyFluidHandler this]
    (-> this (.getFluid))))

(defn get-fluid-amount
  "returns: Current amount of fluid in the tank. - `int`"
  (^Integer [^EmptyFluidHandler this]
    (-> this (.getFluidAmount))))

(defn get-capacity
  "returns: Capacity of this fluid tank. - `int`"
  (^Integer [^EmptyFluidHandler this]
    (-> this (.getCapacity))))

(defn get-info
  "Description copied from interface: IFluidTank

  returns: State information for the IFluidTank. - `net.minecraftforge.fluids.FluidTankInfo`"
  (^net.minecraftforge.fluids.FluidTankInfo [^EmptyFluidHandler this]
    (-> this (.getInfo))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^EmptyFluidHandler this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^EmptyFluidHandler this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

