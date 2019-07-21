(ns net.minecraft.world.gen.layer.GenLayerShore
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerShore]))

(defn ->gen-layer-shore
  "Constructor.

  p-i-2130-1 - `long`
  p-i-2130-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerShore [^Long p-i-2130-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2130-3]
    (new GenLayerShore p-i-2130-1 p-i-2130-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerShore this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

