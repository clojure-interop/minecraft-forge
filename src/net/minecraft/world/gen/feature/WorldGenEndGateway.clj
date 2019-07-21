(ns net.minecraft.world.gen.feature.WorldGenEndGateway
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenEndGateway]))

(defn ->world-gen-end-gateway
  "Constructor."
  (^WorldGenEndGateway []
    (new WorldGenEndGateway )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenEndGateway this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

