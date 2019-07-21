(ns net.minecraft.world.gen.feature.WorldGenEndIsland
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenEndIsland]))

(defn ->world-gen-end-island
  "Constructor."
  (^WorldGenEndIsland []
    (new WorldGenEndIsland )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenEndIsland this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

