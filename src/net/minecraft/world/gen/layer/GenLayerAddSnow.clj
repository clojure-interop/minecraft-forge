(ns net.minecraft.world.gen.layer.GenLayerAddSnow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerAddSnow]))

(defn ->gen-layer-add-snow
  "Constructor.

  p-i-2121-1 - `long`
  p-i-2121-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerAddSnow [^Long p-i-2121-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2121-3]
    (new GenLayerAddSnow p-i-2121-1 p-i-2121-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerAddSnow this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

