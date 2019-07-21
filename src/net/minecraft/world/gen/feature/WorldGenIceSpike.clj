(ns net.minecraft.world.gen.feature.WorldGenIceSpike
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenIceSpike]))

(defn ->world-gen-ice-spike
  "Constructor."
  (^WorldGenIceSpike []
    (new WorldGenIceSpike )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenIceSpike this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

