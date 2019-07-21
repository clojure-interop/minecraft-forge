(ns net.minecraftforge.fluids.FluidEvent$FluidSpilledEvent
  "Mods should fire this event when a fluid \"spills\", for example, if a block containing fluid
  is broken."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidEvent$FluidSpilledEvent]))

(defn ->fluid-spilled-event
  "Constructor.

  fluid - `net.minecraftforge.fluids.FluidStack`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^FluidEvent$FluidSpilledEvent [^net.minecraftforge.fluids.FluidStack fluid ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (new FluidEvent$FluidSpilledEvent fluid world pos)))

