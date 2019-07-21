(ns net.minecraft.world.biome.BiomeRiver
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeRiver]))

(defn ->biome-river
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeRiver [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeRiver properties)))

