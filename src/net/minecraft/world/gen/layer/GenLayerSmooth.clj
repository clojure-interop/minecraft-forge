(ns net.minecraft.world.gen.layer.GenLayerSmooth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerSmooth]))

(defn ->gen-layer-smooth
  "Constructor.

  p-i-2131-1 - `long`
  p-i-2131-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerSmooth [^Long p-i-2131-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2131-3]
    (new GenLayerSmooth p-i-2131-1 p-i-2131-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerSmooth this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

