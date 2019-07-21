(ns net.minecraft.world.gen.feature.WorldGenDesertWells
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenDesertWells]))

(defn ->world-gen-desert-wells
  "Constructor."
  (^WorldGenDesertWells []
    (new WorldGenDesertWells )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenDesertWells this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

