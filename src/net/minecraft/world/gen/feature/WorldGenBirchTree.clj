(ns net.minecraft.world.gen.feature.WorldGenBirchTree
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenBirchTree]))

(defn ->world-gen-birch-tree
  "Constructor.

  notify - `boolean`
  use-extra-random-height-in - `boolean`"
  (^WorldGenBirchTree [^Boolean notify ^Boolean use-extra-random-height-in]
    (new WorldGenBirchTree notify use-extra-random-height-in)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenBirchTree this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

