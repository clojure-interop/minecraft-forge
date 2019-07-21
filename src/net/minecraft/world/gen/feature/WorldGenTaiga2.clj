(ns net.minecraft.world.gen.feature.WorldGenTaiga2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenTaiga2]))

(defn ->world-gen-taiga-2
  "Constructor.

  p-i-2025-1 - `boolean`"
  (^WorldGenTaiga2 [^Boolean p-i-2025-1]
    (new WorldGenTaiga2 p-i-2025-1)))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenTaiga2 this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

