(ns net.minecraft.world.gen.feature.WorldGenLiquids
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenLiquids]))

(defn ->world-gen-liquids
  "Constructor.

  block-in - `net.minecraft.block.Block`"
  (^WorldGenLiquids [^net.minecraft.block.Block block-in]
    (new WorldGenLiquids block-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenLiquids this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

