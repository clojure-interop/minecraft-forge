(ns net.minecraft.world.gen.feature.WorldGenMinable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenMinable]))

(defn ->world-gen-minable
  "Constructor.

  state - `net.minecraft.block.state.IBlockState`
  block-count - `int`
  p-i-45631-3 - `com.google.common.base.Predicate`"
  (^WorldGenMinable [^net.minecraft.block.state.IBlockState state ^Integer block-count ^com.google.common.base.Predicate p-i-45631-3]
    (new WorldGenMinable state block-count p-i-45631-3))
  (^WorldGenMinable [^net.minecraft.block.state.IBlockState state ^Integer block-count]
    (new WorldGenMinable state block-count)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenMinable this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

