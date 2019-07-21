(ns net.minecraftforge.fluids.IFluidTank
  "A tank is the unit of interaction with Fluid inventories.

  A reference implementation can be found at FluidTank."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids IFluidTank]))

(defn get-fluid
  "returns: FluidStack representing the fluid in the tank, null if the tank is empty. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^IFluidTank this]
    (-> this (.getFluid))))

(defn get-fluid-amount
  "returns: Current amount of fluid in the tank. - `int`"
  (^Integer [^IFluidTank this]
    (-> this (.getFluidAmount))))

(defn get-capacity
  "returns: Capacity of this fluid tank. - `int`"
  (^Integer [^IFluidTank this]
    (-> this (.getCapacity))))

(defn get-info
  "Returns a wrapper object FluidTankInfo containing the capacity of the tank and the
   FluidStack it holds.

   Should prevent manipulation of the IFluidTank. See FluidTank.

  returns: State information for the IFluidTank. - `net.minecraftforge.fluids.FluidTankInfo`"
  (^net.minecraftforge.fluids.FluidTankInfo [^IFluidTank this]
    (-> this (.getInfo))))

(defn fill
  "resource - FluidStack attempting to fill the tank. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, the fill will only be simulated. - `boolean`

  returns: Amount of fluid that was accepted by the tank. - `int`"
  (^Integer [^IFluidTank this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "max-drain - Maximum amount of fluid to be removed from the container. - `int`
  do-drain - If false, the drain will only be simulated. - `boolean`

  returns: Amount of fluid that was removed from the tank. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^IFluidTank this ^Integer max-drain ^Boolean do-drain]
    (-> this (.drain max-drain do-drain))))

