(ns net.minecraft.world.gen.feature.WorldGenSavannaTree
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenSavannaTree]))

(defn ->world-gen-savanna-tree
  "Constructor.

  do-block-notify - `boolean`"
  (^WorldGenSavannaTree [^Boolean do-block-notify]
    (new WorldGenSavannaTree do-block-notify)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenSavannaTree this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

