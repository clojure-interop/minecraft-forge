(ns net.minecraft.world.gen.feature.WorldGenShrub
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenShrub]))

(defn ->world-gen-shrub
  "Constructor.

  p-i-46450-1 - `net.minecraft.block.state.IBlockState`
  p-i-46450-2 - `net.minecraft.block.state.IBlockState`"
  (^WorldGenShrub [^net.minecraft.block.state.IBlockState p-i-46450-1 ^net.minecraft.block.state.IBlockState p-i-46450-2]
    (new WorldGenShrub p-i-46450-1 p-i-46450-2)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenShrub this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

