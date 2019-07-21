(ns net.minecraft.world.gen.feature.WorldGenMegaJungle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenMegaJungle]))

(defn ->world-gen-mega-jungle
  "Constructor.

  p-i-46448-1 - `boolean`
  p-i-46448-2 - `int`
  p-i-46448-3 - `int`
  p-i-46448-4 - `net.minecraft.block.state.IBlockState`
  p-i-46448-5 - `net.minecraft.block.state.IBlockState`"
  (^WorldGenMegaJungle [^Boolean p-i-46448-1 ^Integer p-i-46448-2 ^Integer p-i-46448-3 ^net.minecraft.block.state.IBlockState p-i-46448-4 ^net.minecraft.block.state.IBlockState p-i-46448-5]
    (new WorldGenMegaJungle p-i-46448-1 p-i-46448-2 p-i-46448-3 p-i-46448-4 p-i-46448-5)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenMegaJungle this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

