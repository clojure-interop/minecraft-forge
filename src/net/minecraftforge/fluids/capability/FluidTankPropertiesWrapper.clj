(ns net.minecraftforge.fluids.capability.FluidTankPropertiesWrapper
  "Basic IFluidTankProperties wrapper for FluidTank."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability FluidTankPropertiesWrapper]))

(defn ->fluid-tank-properties-wrapper
  "Constructor.

  tank - `net.minecraftforge.fluids.FluidTank`"
  (^FluidTankPropertiesWrapper [^net.minecraftforge.fluids.FluidTank tank]
    (new FluidTankPropertiesWrapper tank)))

(defn get-contents
  "returns: A copy of the fluid contents of this tank. May be null.
   To modify the contents, use IFluidHandler. - `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidTankPropertiesWrapper this]
    (-> this (.getContents))))

(defn get-capacity
  "returns: The maximum amount of fluid this tank can hold, in millibuckets. - `int`"
  (^Integer [^FluidTankPropertiesWrapper this]
    (-> this (.getCapacity))))

(defn can-fill?
  "Description copied from interface: IFluidTankProperties

  returns: `boolean`"
  (^Boolean [^FluidTankPropertiesWrapper this]
    (-> this (.canFill))))

(defn can-drain?
  "Description copied from interface: IFluidTankProperties

  returns: `boolean`"
  (^Boolean [^FluidTankPropertiesWrapper this]
    (-> this (.canDrain))))

(defn can-fill-fluid-type?
  "Description copied from interface: IFluidTankProperties

  fluid-stack - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidTankPropertiesWrapper this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.canFillFluidType fluid-stack))))

(defn can-drain-fluid-type?
  "Description copied from interface: IFluidTankProperties

  fluid-stack - `net.minecraftforge.fluids.FluidStack`

  returns: `boolean`"
  (^Boolean [^FluidTankPropertiesWrapper this ^net.minecraftforge.fluids.FluidStack fluid-stack]
    (-> this (.canDrainFluidType fluid-stack))))

