(ns net.minecraft.world.gen.feature.WorldGenCanopyTree
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenCanopyTree]))

(defn ->world-gen-canopy-tree
  "Constructor.

  notify - `boolean`"
  (^WorldGenCanopyTree [^Boolean notify]
    (new WorldGenCanopyTree notify)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenCanopyTree this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

