(ns net.minecraft.world.gen.feature.WorldGenGlowStone1
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenGlowStone1]))

(defn ->world-gen-glow-stone-1
  "Constructor."
  (^WorldGenGlowStone1 []
    (new WorldGenGlowStone1 )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenGlowStone1 this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

