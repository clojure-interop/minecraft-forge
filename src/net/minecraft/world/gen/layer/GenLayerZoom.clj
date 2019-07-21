(ns net.minecraft.world.gen.layer.GenLayerZoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerZoom]))

(defn ->gen-layer-zoom
  "Constructor.

  p-i-2134-1 - `long`
  p-i-2134-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerZoom [^Long p-i-2134-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2134-3]
    (new GenLayerZoom p-i-2134-1 p-i-2134-3)))

(defn *magnify
  "p-75915-0 - `long`
  p-75915-2 - `net.minecraft.world.gen.layer.GenLayer`
  p-75915-3 - `int`

  returns: `net.minecraft.world.gen.layer.GenLayer`"
  (^net.minecraft.world.gen.layer.GenLayer [^Long p-75915-0 ^net.minecraft.world.gen.layer.GenLayer p-75915-2 ^Integer p-75915-3]
    (GenLayerZoom/magnify p-75915-0 p-75915-2 p-75915-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerZoom this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

