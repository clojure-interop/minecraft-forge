(ns net.minecraft.world.gen.feature.WorldGenBlockBlob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenBlockBlob]))

(defn ->world-gen-block-blob
  "Constructor.

  block-in - `net.minecraft.block.Block`
  start-radius-in - `int`"
  (^WorldGenBlockBlob [^net.minecraft.block.Block block-in ^Integer start-radius-in]
    (new WorldGenBlockBlob block-in start-radius-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenBlockBlob this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

