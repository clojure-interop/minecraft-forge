(ns net.minecraft.world.gen.layer.GenLayerRiver
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerRiver]))

(defn ->gen-layer-river
  "Constructor.

  p-i-2128-1 - `long`
  p-i-2128-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerRiver [^Long p-i-2128-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2128-3]
    (new GenLayerRiver p-i-2128-1 p-i-2128-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerRiver this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

