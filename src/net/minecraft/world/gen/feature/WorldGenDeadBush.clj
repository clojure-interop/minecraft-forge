(ns net.minecraft.world.gen.feature.WorldGenDeadBush
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenDeadBush]))

(defn ->world-gen-dead-bush
  "Constructor."
  (^WorldGenDeadBush []
    (new WorldGenDeadBush )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenDeadBush this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

