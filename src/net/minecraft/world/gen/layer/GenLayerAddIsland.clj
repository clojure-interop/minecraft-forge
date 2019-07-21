(ns net.minecraft.world.gen.layer.GenLayerAddIsland
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerAddIsland]))

(defn ->gen-layer-add-island
  "Constructor.

  p-i-2119-1 - `long`
  p-i-2119-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerAddIsland [^Long p-i-2119-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2119-3]
    (new GenLayerAddIsland p-i-2119-1 p-i-2119-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerAddIsland this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

