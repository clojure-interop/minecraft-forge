(ns net.minecraft.world.gen.feature.WorldGenTrees
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenTrees]))

(defn ->world-gen-trees
  "Constructor.

  p-i-46446-1 - `boolean`
  p-i-46446-2 - `int`
  p-i-46446-3 - `net.minecraft.block.state.IBlockState`
  p-i-46446-4 - `net.minecraft.block.state.IBlockState`
  p-i-46446-5 - `boolean`"
  (^WorldGenTrees [^Boolean p-i-46446-1 ^Integer p-i-46446-2 ^net.minecraft.block.state.IBlockState p-i-46446-3 ^net.minecraft.block.state.IBlockState p-i-46446-4 ^Boolean p-i-46446-5]
    (new WorldGenTrees p-i-46446-1 p-i-46446-2 p-i-46446-3 p-i-46446-4 p-i-46446-5))
  (^WorldGenTrees [^Boolean p-i-2027-1]
    (new WorldGenTrees p-i-2027-1)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenTrees this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

