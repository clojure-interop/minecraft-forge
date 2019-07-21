(ns net.minecraft.world.gen.layer.GenLayerRiverInit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerRiverInit]))

(defn ->gen-layer-river-init
  "Constructor.

  p-i-2127-1 - `long`
  p-i-2127-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerRiverInit [^Long p-i-2127-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2127-3]
    (new GenLayerRiverInit p-i-2127-1 p-i-2127-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerRiverInit this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

