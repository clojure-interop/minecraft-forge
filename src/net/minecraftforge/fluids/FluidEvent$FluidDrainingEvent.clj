(ns net.minecraftforge.fluids.FluidEvent$FluidDrainingEvent
  "Mods should fire this event when a fluid is IFluidTank.drain(int, boolean) from their
  tank."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidEvent$FluidDrainingEvent]))

(defn ->fluid-draining-event
  "Constructor.

  fluid - `net.minecraftforge.fluids.FluidStack`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  tank - `net.minecraftforge.fluids.IFluidTank`
  amount - `int`"
  (^FluidEvent$FluidDrainingEvent [^net.minecraftforge.fluids.FluidStack fluid ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.fluids.IFluidTank tank ^Integer amount]
    (new FluidEvent$FluidDrainingEvent fluid world pos tank amount)))

(defn get-tank
  "returns: `net.minecraftforge.fluids.IFluidTank`"
  (^net.minecraftforge.fluids.IFluidTank [^FluidEvent$FluidDrainingEvent this]
    (-> this (.getTank))))

(defn get-amount
  "returns: `int`"
  (^Integer [^FluidEvent$FluidDrainingEvent this]
    (-> this (.getAmount))))

