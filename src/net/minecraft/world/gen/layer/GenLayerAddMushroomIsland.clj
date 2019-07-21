(ns net.minecraft.world.gen.layer.GenLayerAddMushroomIsland
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerAddMushroomIsland]))

(defn ->gen-layer-add-mushroom-island
  "Constructor.

  p-i-2120-1 - `long`
  p-i-2120-3 - `net.minecraft.world.gen.layer.GenLayer`"
  (^GenLayerAddMushroomIsland [^Long p-i-2120-1 ^net.minecraft.world.gen.layer.GenLayer p-i-2120-3]
    (new GenLayerAddMushroomIsland p-i-2120-1 p-i-2120-3)))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayerAddMushroomIsland this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

