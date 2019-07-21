(ns net.minecraft.world.gen.feature.WorldGenSwamp
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenSwamp]))

(defn ->world-gen-swamp
  "Constructor."
  (^WorldGenSwamp []
    (new WorldGenSwamp )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenSwamp this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

