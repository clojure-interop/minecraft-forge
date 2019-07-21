(ns net.minecraftforge.fluids.capability.templates.VoidFluidHandler
  "VoidFluidHandler is a template fluid handler that can be filled indefinitely without ever getting full.
  It does not store fluid that gets filled into it, but \"destroys\" it upon receiving it."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates VoidFluidHandler]))

(defn ->void-fluid-handler
  "Constructor."
  (^VoidFluidHandler []
    (new VoidFluidHandler )))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.fluids.capability.templates.EmptyFluidHandler"
  VoidFluidHandler/INSTANCE)

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^VoidFluidHandler this]
    (-> this (.getTankProperties))))

(defn get-fluid
  "returns: FluidStack representing the fluid in the tank, null if the tank is empty. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^VoidFluidHandler this]
    (-> this (.getFluid))))

(defn get-fluid-amount
  "returns: Current amount of fluid in the tank. - `int`"
  (^Integer [^VoidFluidHandler this]
    (-> this (.getFluidAmount))))

(defn get-capacity
  "returns: Capacity of this fluid tank. - `int`"
  (^Integer [^VoidFluidHandler this]
    (-> this (.getCapacity))))

(defn get-info
  "Description copied from interface: IFluidTank

  returns: State information for the IFluidTank. - `net.minecraftforge.fluids.FluidTankInfo`"
  (^net.minecraftforge.fluids.FluidTankInfo [^VoidFluidHandler this]
    (-> this (.getInfo))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^VoidFluidHandler this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^VoidFluidHandler this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

