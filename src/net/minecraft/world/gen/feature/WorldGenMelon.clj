(ns net.minecraft.world.gen.feature.WorldGenMelon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenMelon]))

(defn ->world-gen-melon
  "Constructor."
  (^WorldGenMelon []
    (new WorldGenMelon )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenMelon this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

