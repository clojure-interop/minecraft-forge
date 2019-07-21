(ns net.minecraft.world.gen.feature.WorldGenWaterlily
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenWaterlily]))

(defn ->world-gen-waterlily
  "Constructor."
  (^WorldGenWaterlily []
    (new WorldGenWaterlily )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenWaterlily this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

