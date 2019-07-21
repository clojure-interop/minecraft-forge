(ns net.minecraft.world.gen.feature.WorldGenGlowStone2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenGlowStone2]))

(defn ->world-gen-glow-stone-2
  "Constructor."
  (^WorldGenGlowStone2 []
    (new WorldGenGlowStone2 )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenGlowStone2 this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

