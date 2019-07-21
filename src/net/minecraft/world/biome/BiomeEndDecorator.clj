(ns net.minecraft.world.biome.BiomeEndDecorator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeEndDecorator]))

(defn ->biome-end-decorator
  "Constructor."
  (^BiomeEndDecorator []
    (new BiomeEndDecorator )))

(defn *get-spikes-for-world
  "p-185426-0 - `net.minecraft.world.World`

  returns: `net.minecraft.world.gen.feature.WorldGenSpikes$EndSpike[]`"
  ([^net.minecraft.world.World p-185426-0]
    (BiomeEndDecorator/getSpikesForWorld p-185426-0)))

