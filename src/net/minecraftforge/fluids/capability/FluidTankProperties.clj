(ns net.minecraftforge.fluids.capability.FluidTankProperties
  "Basic implementation of IFluidTankProperties."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability FluidTankProperties]))

(defn ->fluid-tank-properties
  "Constructor.

  contents - `net.minecraftforge.fluids.FluidStack`
  capacity - `int`
  can-fill - `boolean`
  can-drain - `boolean`"
  (^FluidTankProperties [^net.minecraftforge.fluids.FluidStack contents ^Integer capacity ^Boolean can-fill ^Boolean can-drain]
    (new FluidTankProperties contents capacity can-fill can-drain))
  (^FluidTankProperties [^net.minecraftforge.fluids.FluidStack contents ^Integer capacity]
    (new FluidTankProperties contents capacity)))

(defn *convert
  "fluid-tank-infos - `net.minecraftforge.fluids.FluidTankInfo[]`

  returns: `net.minecraftforge.fluids.capability.FluidTankProperties[]`"
  ([fluid-tank-infos]
    (FluidTankProperties/convert fluid-tank-infos)))

(defn get-contents
  "returns: A copy of the fluid contents of this tank. May be null.
   To modify the contents, use IFluidHandler. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidTankProperties this]
    (-> this (.getContents))))

(defn get-capacity
  "returns: The maximum amount of fluid this tank can hold, in millibuckets. - `int`"
  (^Integer [^FluidTankProperties this]
    (-> this (.getCapacity))))

(defn can-fill?
  "Description copied from interface: IFluidTankProperties

  returns: `boolean`"
  (^Boolean [^FluidTankProperties this]
    (-> this (.canFill))))

(defn can-drain?
  "Description copied from interface: IFluidTankProperties

  returns: `boolean`"
  (^Boolean [^FluidTankProperties this]
    (-> this (.canDrain))))

(defn can-fill-fluid-type?
  "Description copied from interface: IFluidTankProperties

  fluid-stack - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidTankProperties this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.canFillFluidType fluid-stack))))

(defn can-drain-fluid-type?
  "Description copied from interface: IFluidTankProperties

  fluid-stack - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidTankProperties this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.canDrainFluidType fluid-stack))))

