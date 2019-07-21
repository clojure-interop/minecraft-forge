(ns net.minecraftforge.fluids.FluidEvent$FluidMotionEvent
  "Mods should fire this event when they move fluids around."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidEvent$FluidMotionEvent]))

(defn ->fluid-motion-event
  "Constructor.

  fluid - `net.minecraftforge.fluids.FluidStack`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^FluidEvent$FluidMotionEvent [^net.minecraftforge.fluids.FluidStack fluid ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (new FluidEvent$FluidMotionEvent fluid world pos)))

