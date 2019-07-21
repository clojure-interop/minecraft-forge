(ns net.minecraftforge.fluids.FluidEvent$FluidFillingEvent
  "Mods should fire this event when a fluid is IFluidTank.fill(FluidStack, boolean)
  their tank implementation. FluidTank does."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidEvent$FluidFillingEvent]))

(defn ->fluid-filling-event
  "Constructor.

  fluid - `net.minecraftforge.fluids.FluidStack`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  tank - `net.minecraftforge.fluids.IFluidTank`
  amount - `int`"
  (^FluidEvent$FluidFillingEvent [^net.minecraftforge.fluids.FluidStack fluid ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraftforge.fluids.IFluidTank tank ^Integer amount]
    (new FluidEvent$FluidFillingEvent fluid world pos tank amount)))

(defn get-tank
  "returns: `net.minecraftforge.fluids.IFluidTank`"
  (^net.minecraftforge.fluids.IFluidTank [^FluidEvent$FluidFillingEvent this]
    (-> this (.getTank))))

(defn get-amount
  "returns: `int`"
  (^Integer [^FluidEvent$FluidFillingEvent this]
    (-> this (.getAmount))))

