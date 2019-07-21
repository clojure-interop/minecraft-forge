(ns net.minecraftforge.common.chunkio.ChunkIOExecutor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.chunkio ChunkIOExecutor]))

(defn ->chunk-io-executor
  "Constructor."
  (^ChunkIOExecutor []
    (new ChunkIOExecutor )))

(defn *sync-chunk-load
  "world - `net.minecraft.world.World`
  loader - `net.minecraft.world.chunk.storage.AnvilChunkLoader`
  provider - `net.minecraft.world.gen.ChunkProviderServer`
  x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^net.minecraft.world.World world ^net.minecraft.world.chunk.storage.AnvilChunkLoader loader ^net.minecraft.world.gen.ChunkProviderServer provider ^Integer x ^Integer z]
    (ChunkIOExecutor/syncChunkLoad world loader provider x z)))

(defn *queue-chunk-load
  "world - `net.minecraft.world.World`
  loader - `net.minecraft.world.chunk.storage.AnvilChunkLoader`
  provider - `net.minecraft.world.gen.ChunkProviderServer`
  x - `int`
  z - `int`
  runnable - `java.lang.Runnable`"
  ([^net.minecraft.world.World world ^net.minecraft.world.chunk.storage.AnvilChunkLoader loader ^net.minecraft.world.gen.ChunkProviderServer provider ^Integer x ^Integer z ^java.lang.Runnable runnable]
    (ChunkIOExecutor/queueChunkLoad world loader provider x z runnable)))

(defn *drop-queued-chunk-load
  "world - `net.minecraft.world.World`
  x - `int`
  z - `int`
  runnable - `java.lang.Runnable`"
  ([^net.minecraft.world.World world ^Integer x ^Integer z ^java.lang.Runnable runnable]
    (ChunkIOExecutor/dropQueuedChunkLoad world x z runnable)))

(defn *adjust-pool-size
  "players - `int`"
  ([^Integer players]
    (ChunkIOExecutor/adjustPoolSize players)))

(defn *tick
  ""
  ([]
    (ChunkIOExecutor/tick )))

