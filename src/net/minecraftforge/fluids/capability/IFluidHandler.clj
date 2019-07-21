(ns net.minecraftforge.fluids.capability.IFluidHandler
  "Implement this interface as a capability which should handle fluids, generally storing them in
  one or more internal IFluidTank objects.

  A reference implementation is provided TileFluidHandler."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability IFluidHandler]))

(defn get-tank-properties
  "Returns an array of objects which represent the internal tanks.
   These objects cannot be used to manipulate the internal tanks.

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^IFluidHandler this]
    (-> this (.getTankProperties))))

(defn fill
  "Fills fluid into internal tanks, distribution is left entirely to the IFluidHandler.

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^IFluidHandler this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "Drains fluid out of internal tanks, distribution is left entirely to the IFluidHandler.

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^IFluidHandler this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

