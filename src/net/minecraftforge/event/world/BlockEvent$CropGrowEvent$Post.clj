(ns net.minecraftforge.event.world.BlockEvent$CropGrowEvent$Post
  "Fired when \"growing age\" blocks (for example cacti, chorus plants, or crops
  in vanilla) have successfully grown. The block's original state is available,
  in addition to its new state.

  This event is not Cancelable.

  This event does not have a result. Event.HasResult"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$CropGrowEvent$Post]))

(defn ->post
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  original - `net.minecraft.block.state.IBlockState`
  state - `net.minecraft.block.state.IBlockState`"
  (^BlockEvent$CropGrowEvent$Post [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState original ^net.minecraft.block.state.IBlockState state]
    (new BlockEvent$CropGrowEvent$Post world pos original state)))

(defn get-original-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockEvent$CropGrowEvent$Post this]
    (-> this (.getOriginalState))))

