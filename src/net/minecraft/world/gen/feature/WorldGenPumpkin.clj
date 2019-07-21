(ns net.minecraft.world.gen.feature.WorldGenPumpkin
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenPumpkin]))

(defn ->world-gen-pumpkin
  "Constructor."
  (^WorldGenPumpkin []
    (new WorldGenPumpkin )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenPumpkin this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

