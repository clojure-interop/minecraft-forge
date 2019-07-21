(ns net.minecraftforge.event.world.BlockEvent$CropGrowEvent$Pre
  "Fired when any \"growing age\" blocks (for example cacti, chorus plants, or crops
  in vanilla) attempt to advance to the next growth age state during a random tick.

  Event.Result.DEFAULT will pass on to the vanilla growth mechanics.
  Event.Result.ALLOW will force the plant to advance a growth stage.
  Event.Result.DENY will prevent the plant from advancing a growth stage.

  This event is not Cancelable."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$CropGrowEvent$Pre]))

(defn ->pre
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  (^BlockEvent$CropGrowEvent$Pre [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (new BlockEvent$CropGrowEvent$Pre world pos state)))

