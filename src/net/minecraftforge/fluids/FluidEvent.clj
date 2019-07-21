(ns net.minecraftforge.fluids.FluidEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidEvent]))

(defn ->fluid-event
  "Constructor.

  fluid - `net.minecraftforge.fluids.FluidStack`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^FluidEvent [^net.minecraftforge.fluids.FluidStack fluid ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (new FluidEvent fluid world pos)))

(defn *fire-event
  "A handy shortcut for firing the various fluid events.

  event - `net.minecraftforge.fluids.FluidEvent`"
  ([^net.minecraftforge.fluids.FluidEvent event]
    (FluidEvent/fireEvent event)))

(defn get-fluid
  "returns: `net.minecraftforge.fluids.FluidStack`"
  (^net.minecraftforge.fluids.FluidStack [^FluidEvent this]
    (-> this (.getFluid))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^FluidEvent this]
    (-> this (.getWorld))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^FluidEvent this]
    (-> this (.getPos))))

