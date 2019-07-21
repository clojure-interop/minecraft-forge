(ns net.minecraft.world.gen.feature.WorldGenBigMushroom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenBigMushroom]))

(defn ->world-gen-big-mushroom
  "Constructor.

  p-i-46449-1 - `net.minecraft.block.Block`"
  (^WorldGenBigMushroom [^net.minecraft.block.Block p-i-46449-1]
    (new WorldGenBigMushroom p-i-46449-1))
  (^WorldGenBigMushroom []
    (new WorldGenBigMushroom )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenBigMushroom this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

