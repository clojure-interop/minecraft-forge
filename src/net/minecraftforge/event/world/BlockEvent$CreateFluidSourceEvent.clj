(ns net.minecraftforge.event.world.BlockEvent$CreateFluidSourceEvent
  "Fired to check whether a non-source block can turn into a source block.
  A result of ALLOW causes a source block to be created even if the liquid
  usually doesn't do that (like lava), and a result of DENY prevents creation
  even if the liquid usually does do that (like water)."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$CreateFluidSourceEvent]))

(defn ->create-fluid-source-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  (^BlockEvent$CreateFluidSourceEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (new BlockEvent$CreateFluidSourceEvent world pos state)))

