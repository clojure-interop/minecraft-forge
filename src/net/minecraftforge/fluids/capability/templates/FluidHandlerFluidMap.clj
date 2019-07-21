(ns net.minecraftforge.fluids.capability.templates.FluidHandlerFluidMap
  "FluidHandlerFluidMap is a template class for concatenating multiple handlers into one,
  where each handler is associated with a different fluid."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.templates FluidHandlerFluidMap]))

(defn ->fluid-handler-fluid-map
  "Constructor.

  handlers - `java.util.Map`"
  (^FluidHandlerFluidMap [^java.util.Map handlers]
    (new FluidHandlerFluidMap handlers))
  (^FluidHandlerFluidMap []
    (new FluidHandlerFluidMap )))

(defn add-handler
  "fluid - `net.minecraftforge.fluids.Fluid`
  handler - `net.minecraftforge.fluids.capability.IFluidHandler`

  returns: `net.minecraftforge.fluids.capability.templates.FluidHandlerFluidMap`"
  (^net.minecraftforge.fluids.capability.templates.FluidHandlerFluidMap [^FluidHandlerFluidMap this ^net.minecraftforge.fluids.Fluid fluid ^net.minecraftforge.fluids.capability.IFluidHandler handler]
    (-> this (.addHandler fluid handler))))

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^FluidHandlerFluidMap this]
    (-> this (.getTankProperties))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^FluidHandlerFluidMap this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidHandlerFluidMap this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

