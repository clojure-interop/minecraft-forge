(ns net.minecraft.world.gen.MapGenBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen MapGenBase]))

(defn ->map-gen-base
  "Constructor."
  (^MapGenBase []
    (new MapGenBase )))

(defn *setup-chunk-seed
  "p-191068-0 - `long`
  p-191068-2 - `java.util.Random`
  p-191068-3 - `int`
  p-191068-4 - `int`"
  ([^Long p-191068-0 ^java.util.Random p-191068-2 ^Integer p-191068-3 ^Integer p-191068-4]
    (MapGenBase/setupChunkSeed p-191068-0 p-191068-2 p-191068-3 p-191068-4)))

(defn generate
  "world-in - `net.minecraft.world.World`
  x - `int`
  z - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`"
  ([^MapGenBase this ^net.minecraft.world.World world-in ^Integer x ^Integer z ^net.minecraft.world.chunk.ChunkPrimer primer]
    (-> this (.generate world-in x z primer))))

