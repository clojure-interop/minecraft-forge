(ns net.minecraft.world.gen.layer.GenLayerEdge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerEdge]))

(defn ->gen-layer-edge
  "Constructor.

  p-i-45474-1 - `long`
  p-i-45474-3 - `net.minecraft.world.gen.layer.GenLayer`
  p-i-45474-4 - `net.minecraft.world.gen.layer.GenLayerEdge$Mode`"
  (^GenLayerEdge [^Long p-i-45474-1 ^net.minecraft.world.gen.layer.GenLayer p-i-45474-3 ^net.minecraft.world.gen.layer.GenLayerEdge$Mode p-i-45474-4]
    (new GenLayerEdge p-i-45474-1 p-i-45474-3 p-i-45474-4)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerEdge this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

