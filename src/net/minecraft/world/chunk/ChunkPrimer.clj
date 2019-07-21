(ns net.minecraft.world.chunk.ChunkPrimer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk ChunkPrimer]))

(defn ->chunk-primer
  "Constructor."
  (^ChunkPrimer []
    (new ChunkPrimer )))

(defn get-block-state
  "x - `int`
  y - `int`
  z - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^ChunkPrimer this ^Integer x ^Integer y ^Integer z]
    (-> this (.getBlockState x y z))))

(defn set-block-state
  "x - `int`
  y - `int`
  z - `int`
  state - `net.minecraft.block.state.IBlockState`"
  ([^ChunkPrimer this ^Integer x ^Integer y ^Integer z ^net.minecraft.block.state.IBlockState state]
    (-> this (.setBlockState x y z state))))

(defn find-ground-block-idx
  "x - `int`
  z - `int`

  returns: `int`"
  (^Integer [^ChunkPrimer this ^Integer x ^Integer z]
    (-> this (.findGroundBlockIdx x z))))

