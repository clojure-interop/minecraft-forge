(ns net.minecraft.world.gen.feature.WorldGenClay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenClay]))

(defn ->world-gen-clay
  "Constructor.

  p-i-2011-1 - `int`"
  (^WorldGenClay [^Integer p-i-2011-1]
    (new WorldGenClay p-i-2011-1)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenClay this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

