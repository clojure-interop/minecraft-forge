(ns net.minecraft.world.gen.layer.GenLayerDeepOcean
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerDeepOcean]))

(defn ->gen-layer-deep-ocean
  "Constructor.

  p-i-45472-1 - `long`
  p-i-45472-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerDeepOcean [^Long p-i-45472-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45472-3]
    (new GenLayerDeepOcean p-i-45472-1 p-i-45472-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerDeepOcean this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

