(ns net.minecraft.world.gen.layer.GenLayerBiomeEdge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerBiomeEdge]))

(defn ->gen-layer-biome-edge
  "Constructor.

  p-i-45475-1 - `long`
  p-i-45475-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerBiomeEdge [^Long p-i-45475-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45475-3]
    (new GenLayerBiomeEdge p-i-45475-1 p-i-45475-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerBiomeEdge this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

