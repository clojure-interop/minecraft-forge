(ns net.minecraft.world.gen.layer.GenLayerHills
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerHills]))

(defn ->gen-layer-hills
  "Constructor.

  p-i-45479-1 - `long`
  p-i-45479-3 - `net.minecraft.world.gen.layer.GenLayer`
  p-i-45479-4 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerHills [^Long p-i-45479-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45479-3 ^net.minecraft.world.gen.layer.GenLayer p-i-45479-4]
    (new GenLayerHills p-i-45479-1 p-i-45479-3 p-i-45479-4)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerHills this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

