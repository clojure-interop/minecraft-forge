(ns net.minecraft.world.gen.feature.WorldGenHellLava
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenHellLava]))

(defn ->world-gen-hell-lava
  "Constructor.

  block-in - `net.minecraft.block.Block`
  inside-rock-in - `boolean`"
  (^WorldGenHellLava [^net.minecraft.block.Block block-in ^Boolean inside-rock-in]
    (new WorldGenHellLava block-in inside-rock-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenHellLava this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

