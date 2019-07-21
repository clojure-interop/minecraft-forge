(ns net.minecraft.world.biome.BiomeBeach
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeBeach]))

(defn ->biome-beach
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeBeach [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeBeach properties)))

