(ns net.minecraftforge.fluids.FluidTankInfo
  "Wrapper class used to encapsulate information about an IFluidTank."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidTankInfo]))

(defn ->fluid-tank-info
  "Constructor.

  fluid - `net.minecraftforge.fluids.FluidStack`
  capacity - `int`"
  (^FluidTankInfo [^net.minecraftforge.fluids.FluidStack fluid ^Integer capacity]
    (new FluidTankInfo fluid capacity))
  (^FluidTankInfo [^net.minecraftforge.fluids.IFluidTank tank]
    (new FluidTankInfo tank)))

(defn fluid
  "Instance Constant.

  type: net.minecraftforge.fluids.FluidStack"
  (^net.minecraftforge.fluids.FluidStack [^FluidTankInfo this]
    (-> this .-fluid)))

(defn capacity
  "Instance Constant.

  type: int"
  (^Integer [^FluidTankInfo this]
    (-> this .-capacity)))

