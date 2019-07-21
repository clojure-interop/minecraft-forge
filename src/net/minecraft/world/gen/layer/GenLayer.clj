(ns net.minecraft.world.gen.layer.GenLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayer]))

(defn ->gen-layer
  "Constructor.

  p-i-2125-1 - `long`"
  (^GenLayer [^Long p-i-2125-1]
    (new GenLayer p-i-2125-1)))

(defn *initialize-all-biome-generators
  "seed - `long`
  p-180781-2 - `net.minecraft.world.WorldType`
  p-180781-3 - `net.minecraft.world.gen.ChunkProviderSettings`

  returns: `net.minecraft.world.gen.layer.GenLayer[]`"
  ([^Long seed ^net.minecraft.world.WorldType p-180781-2 ^net.minecraft.world.gen.ChunkProviderSettings p-180781-3]
    (GenLayer/initializeAllBiomeGenerators seed p-180781-2 p-180781-3)))

(defn *get-modded-biome-size
  "world-type - `net.minecraft.world.WorldType`
  original - `int`

  returns: `int`"
  (^Integer [^net.minecraft.world.WorldType world-type ^Integer original]
    (GenLayer/getModdedBiomeSize world-type original)))

(defn init-world-gen-seed
  "seed - `long`"
  ([^GenLayer this ^Long seed]
    (-> this (.initWorldGenSeed seed))))

(defn init-chunk-seed
  "p-75903-1 - `long`
  p-75903-3 - `long`"
  ([^GenLayer this ^Long p-75903-1 ^Long p-75903-3]
    (-> this (.initChunkSeed p-75903-1 p-75903-3))))

(defn get-ints
  "area-x - `int`
  area-y - `int`
  area-width - `int`
  area-height - `int`

  returns: `int[]`"
  ([^GenLayer this ^Integer area-x ^Integer area-y ^Integer area-width ^Integer area-height]
    (-> this (.getInts area-x area-y area-width area-height))))

