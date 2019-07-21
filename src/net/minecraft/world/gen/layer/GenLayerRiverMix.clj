(ns net.minecraft.world.gen.layer.GenLayerRiverMix
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerRiverMix]))

(defn ->gen-layer-river-mix
  "Constructor.

  p-i-2129-1 - `long`
  p-i-2129-3 - `net.minecraft.world.gen.layer.GenLayer`
  p-i-2129-4 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerRiverMix [^Long p-i-2129-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2129-3 ^net.minecraft.world.gen.layer.GenLayer p-i-2129-4]
    (new GenLayerRiverMix p-i-2129-1 p-i-2129-3 p-i-2129-4)))

(defn init-world-gen-seed
  "seed - `long`"
  ([^GenLayerRiverMix this ^Long seed]
    (-> this (.initWorldGenSeed seed))))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerRiverMix this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

