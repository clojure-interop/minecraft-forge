(ns net.minecraft.world.gen.layer.GenLayerRemoveTooMuchOcean
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerRemoveTooMuchOcean]))

(defn ->gen-layer-remove-too-much-ocean
  "Constructor.

  p-i-45480-1 - `long`
  p-i-45480-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerRemoveTooMuchOcean [^Long p-i-45480-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45480-3]
    (new GenLayerRemoveTooMuchOcean p-i-45480-1 p-i-45480-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerRemoveTooMuchOcean this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

