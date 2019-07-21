(ns net.minecraftforge.fluids.capability.wrappers.FluidBlockWrapper
  "Wrapper to handle IFluidBlock as an IFluidHandler"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.wrappers FluidBlockWrapper]))

(defn ->fluid-block-wrapper
  "Constructor.

  fluid-block - `net.minecraftforge.fluids.IFluidBlock`
  world - `net.minecraft.world.World`
  block-pos - `net.minecraft.util.math.BlockPos`"
  (^FluidBlockWrapper [^net.minecraftforge.fluids.IFluidBlock fluid-block ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos block-pos]
    (new FluidBlockWrapper fluid-block world block-pos)))

(defn get-tank-properties
  "Description copied from interface: IFluidHandler

  returns: Properties for the relevant internal tanks. - `net.minecraftforge.fluids.capability.IFluidTankProperties[]`"
  ([^FluidBlockWrapper this]
    (-> this (.getTankProperties))))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^FluidBlockWrapper this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

(defn drain
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be drained. - `net.minecraftforge.fluids.FluidStack`
  do-drain - If false, drain will only be simulated. - `boolean`

  returns: FluidStack representing the Fluid and amount that was (or would have been, if
   simulated) drained. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidBlockWrapper this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-drain]
    (-> this (.drain resource do-drain))))

