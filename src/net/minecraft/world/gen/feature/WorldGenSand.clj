(ns net.minecraft.world.gen.feature.WorldGenSand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenSand]))

(defn ->world-gen-sand
  "Constructor.

  p-i-45462-1 - `net.minecraft.block.Block`
  p-i-45462-2 - `int`"
  (^WorldGenSand [^net.minecraft.block.Block p-i-45462-1 ^Integer p-i-45462-2]
    (new WorldGenSand p-i-45462-1 p-i-45462-2)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenSand this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

