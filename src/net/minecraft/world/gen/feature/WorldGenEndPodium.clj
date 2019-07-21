(ns net.minecraft.world.gen.feature.WorldGenEndPodium
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenEndPodium]))

(defn ->world-gen-end-podium
  "Constructor.

  active-portal-in - `boolean`"
  (^WorldGenEndPodium [^Boolean active-portal-in]
    (new WorldGenEndPodium active-portal-in)))

(def *-end-podium-location
  "Static Constant.

  type: net.minecraft.util.math.BlockPos"
  WorldGenEndPodium/END_PODIUM_LOCATION)

(def *-end-podium-chunk-pos
  "Static Constant.

  type: net.minecraft.util.math.BlockPos"
  WorldGenEndPodium/END_PODIUM_CHUNK_POS)

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenEndPodium this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

