(ns net.minecraft.world.gen.feature.WorldGenIcePath
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenIcePath]))

(defn ->world-gen-ice-path
  "Constructor.

  base-path-width-in - `int`"
  (^WorldGenIcePath [^Integer base-path-width-in]
    (new WorldGenIcePath base-path-width-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenIcePath this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

