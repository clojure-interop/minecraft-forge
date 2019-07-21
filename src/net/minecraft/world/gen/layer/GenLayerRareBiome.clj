(ns net.minecraft.world.gen.layer.GenLayerRareBiome
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerRareBiome]))

(defn ->gen-layer-rare-biome
  "Constructor.

  p-i-45478-1 - `long`
  p-i-45478-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerRareBiome [^Long p-i-45478-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45478-3]
    (new GenLayerRareBiome p-i-45478-1 p-i-45478-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerRareBiome this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

