(ns net.minecraft.client.multiplayer.ChunkProviderClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer ChunkProviderClient]))

(defn ->chunk-provider-client
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^ChunkProviderClient [^net.minecraft.world.World world-in]
    (new ChunkProviderClient world-in)))

(defn unload-chunk
  "x - `int`
  z - `int`"
  ([^ChunkProviderClient this ^Integer x ^Integer z]
    (-> this (.unloadChunk x z))))

(defn get-loaded-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderClient this ^Integer x ^Integer z]
    (-> this (.getLoadedChunk x z))))

(defn load-chunk
  "chunk-x - `int`
  chunk-z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderClient this ^Integer chunk-x ^Integer chunk-z]
    (-> this (.loadChunk chunk-x chunk-z))))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderClient this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn tick
  "returns: `boolean`"
  (^Boolean [^ChunkProviderClient this]
    (-> this (.tick))))

(defn make-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChunkProviderClient this]
    (-> this (.makeString))))

(defn chunk-generated-at?
  "p-191062-1 - `int`
  p-191062-2 - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderClient this ^Integer p-191062-1 ^Integer p-191062-2]
    (-> this (.isChunkGeneratedAt p-191062-1 p-191062-2))))

