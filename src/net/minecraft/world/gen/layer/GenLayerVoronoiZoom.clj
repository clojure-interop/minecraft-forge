(ns net.minecraft.world.gen.layer.GenLayerVoronoiZoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerVoronoiZoom]))

(defn ->gen-layer-voronoi-zoom
  "Constructor.

  p-i-2133-1 - `long`
  p-i-2133-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerVoronoiZoom [^Long p-i-2133-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2133-3]
    (new GenLayerVoronoiZoom p-i-2133-1 p-i-2133-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerVoronoiZoom this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

