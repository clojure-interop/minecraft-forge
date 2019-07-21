(ns net.minecraft.client.renderer.color.IBlockColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.color IBlockColor]))

(defn color-multiplier
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  tint-index - `int`

  returns: `int`"
  (^Integer [^IBlockColor this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos ^Integer tint-index]
    (-> this (.colorMultiplier state world-in pos tint-index))))

