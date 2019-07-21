(ns net.minecraft.world.biome.BiomeEnd
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome BiomeEnd]))

(defn ->biome-end
  "Constructor.

  properties - `net.minecraft.world.biome.Biome$BiomeProperties`"
  (^BiomeEnd [^net.minecraft.world.biome.Biome$BiomeProperties properties]
    (new BiomeEnd properties)))

(defn get-sky-color-by-temp
  "current-temperature - `float`

  returns: `int`"
  (^Integer [^BiomeEnd this ^Float current-temperature]
    (-> this (.getSkyColorByTemp current-temperature))))

