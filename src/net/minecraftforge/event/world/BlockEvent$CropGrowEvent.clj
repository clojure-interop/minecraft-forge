(ns net.minecraftforge.event.world.BlockEvent$CropGrowEvent
  "Fired when a crop block grows.  See subevents."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$CropGrowEvent]))

(defn ->crop-grow-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  (^BlockEvent$CropGrowEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (new BlockEvent$CropGrowEvent world pos state)))

