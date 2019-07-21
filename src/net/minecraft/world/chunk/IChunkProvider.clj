(ns net.minecraft.world.chunk.IChunkProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk IChunkProvider]))

(defn get-loaded-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^IChunkProvider this ^Integer x ^Integer z]
    (-> this (.getLoadedChunk x z))))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^IChunkProvider this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn tick
  "returns: `boolean`"
  (^Boolean [^IChunkProvider this]
    (-> this (.tick))))

(defn make-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IChunkProvider this]
    (-> this (.makeString))))

(defn chunk-generated-at?
  "p-191062-1 - `int`
  p-191062-2 - `int`

  returns: `boolean`"
  (^Boolean [^IChunkProvider this ^Integer p-191062-1 ^Integer p-191062-2]
    (-> this (.isChunkGeneratedAt p-191062-1 p-191062-2))))

