(ns net.minecraft.world.chunk.storage.IChunkLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage IChunkLoader]))

(defn load-chunk
  "world-in - `net.minecraft.world.World`
  x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`

  throws: java.io.IOException"
  (^net.minecraft.world.chunk.Chunk [^IChunkLoader this ^net.minecraft.world.World world-in ^Integer x ^Integer z]
    (-> this (.loadChunk world-in x z))))

(defn save-chunk
  "world-in - `net.minecraft.world.World`
  chunk-in - `net.minecraft.world.chunk.Chunk`

  throws: net.minecraft.world.MinecraftException"
  ([^IChunkLoader this ^net.minecraft.world.World world-in ^net.minecraft.world.chunk.Chunk chunk-in]
    (-> this (.saveChunk world-in chunk-in))))

(defn save-extra-chunk-data
  "world-in - `net.minecraft.world.World`
  chunk-in - `net.minecraft.world.chunk.Chunk`

  throws: java.io.IOException"
  ([^IChunkLoader this ^net.minecraft.world.World world-in ^net.minecraft.world.chunk.Chunk chunk-in]
    (-> this (.saveExtraChunkData world-in chunk-in))))

(defn chunk-tick
  ""
  ([^IChunkLoader this]
    (-> this (.chunkTick))))

(defn save-extra-data
  ""
  ([^IChunkLoader this]
    (-> this (.saveExtraData))))

(defn chunk-generated-at?
  "p-191063-1 - `int`
  p-191063-2 - `int`

  returns: `boolean`"
  (^Boolean [^IChunkLoader this ^Integer p-191063-1 ^Integer p-191063-2]
    (-> this (.isChunkGeneratedAt p-191063-1 p-191063-2))))

