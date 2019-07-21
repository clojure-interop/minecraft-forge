(ns net.minecraftforge.fluids.capability.wrappers.BlockWrapper
  "Wrapper around any block, only accounts for fluid placement, otherwise the block acts a void.
  If the block in question inherits from the default Vanilla or Forge implementations,
  consider using BlockLiquidWrapper or FluidBlockWrapper respectively."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids.capability.wrappers BlockWrapper]))

(defn ->block-wrapper
  "Constructor.

  block - `net.minecraft.block.Block`
  world - `net.minecraft.world.World`
  block-pos - `net.minecraft.util.math.BlockPos`"
  (^BlockWrapper [^net.minecraft.block.Block block ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos block-pos]
    (new BlockWrapper block world block-pos)))

(defn fill
  "Description copied from interface: IFluidHandler

  resource - FluidStack representing the Fluid and maximum amount of fluid to be filled. - `net.minecraftforge.fluids.FluidStack`
  do-fill - If false, fill will only be simulated. - `boolean`

  returns: Amount of resource that was (or would have been, if simulated) filled. - `int`"
  (^Integer [^BlockWrapper this ^net.minecraftforge.fluids.FluidStack resource ^Boolean do-fill]
    (-> this (.fill resource do-fill))))

