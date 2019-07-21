(ns net.minecraft.world.gen.layer.GenLayerIsland
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerIsland]))

(defn ->gen-layer-island
  "Constructor.

  p-i-2124-1 - `long`"
  (^GenLayerIsland [^Long p-i-2124-1]
    (new GenLayerIsland p-i-2124-1)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerIsland this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

