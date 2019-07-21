(ns net.minecraft.world.gen.layer.GenLayerBiome
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerBiome]))

(defn ->gen-layer-biome
  "Constructor.

  p-i-45560-1 - `long`
  p-i-45560-3 - `net.minecraft.world.gen.layer.GenLayer`
  p-i-45560-4 - `net.minecraft.world.WorldType`
  p-i-45560-5 - `net.minecraft.world.gen.ChunkProviderSettings`"
  (^GenLayerBiome [^Long p-i-45560-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45560-3 ^net.minecraft.world.WorldType p-i-45560-4 ^net.minecraft.world.gen.ChunkProviderSettings p-i-45560-5]
    (new GenLayerBiome p-i-45560-1 p-i-45560-3 p-i-45560-4 p-i-45560-5)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerBiome this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

