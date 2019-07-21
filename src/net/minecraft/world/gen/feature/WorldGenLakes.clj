(ns net.minecraft.world.gen.feature.WorldGenLakes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenLakes]))

(defn ->world-gen-lakes
  "Constructor.

  block-in - `net.minecraft.block.Block`"
  (^WorldGenLakes [^net.minecraft.block.Block block-in]
    (new WorldGenLakes block-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenLakes this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

