(ns net.minecraft.world.biome.BiomeStoneBeach
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeStoneBeach]))

(defn ->biome-stone-beach
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeStoneBeach [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeStoneBeach properties)))

