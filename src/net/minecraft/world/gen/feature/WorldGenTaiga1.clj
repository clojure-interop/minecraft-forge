(ns net.minecraft.world.gen.feature.WorldGenTaiga1
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenTaiga1]))

(defn ->world-gen-taiga-1
  "Constructor."
  (^WorldGenTaiga1 []
    (new WorldGenTaiga1 )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenTaiga1 this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

