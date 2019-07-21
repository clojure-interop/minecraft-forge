(ns net.minecraft.world.biome.BiomeHell
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeHell]))

(defn ->biome-hell
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeHell [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeHell properties)))

