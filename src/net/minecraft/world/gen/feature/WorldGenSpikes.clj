(ns net.minecraft.world.gen.feature.WorldGenSpikes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenSpikes]))

(defn ->world-gen-spikes
  "Constructor."
  (^WorldGenSpikes []
    (new WorldGenSpikes )))

(defn set-spike
  "p-186143-1 - `net.minecraft.world.gen.feature.WorldGenSpikes$EndSpike`"
  ([^WorldGenSpikes this ^net.minecraft.world.gen.feature.WorldGenSpikes$EndSpike p-186143-1]
    (-> this (.setSpike p-186143-1))))

(defn set-crystal-invulnerable
  "p-186144-1 - `boolean`"
  ([^WorldGenSpikes this ^Boolean p-186144-1]
    (-> this (.setCrystalInvulnerable p-186144-1))))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGenSpikes this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))

(defn set-beam-target
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^WorldGenSpikes this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setBeamTarget pos))))

