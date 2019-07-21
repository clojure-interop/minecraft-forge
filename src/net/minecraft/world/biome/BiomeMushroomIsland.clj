(ns net.minecraft.world.biome.BiomeMushroomIsland
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeMushroomIsland]))

(defn ->biome-mushroom-island
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeMushroomIsland [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeMushroomIsland properties)))

