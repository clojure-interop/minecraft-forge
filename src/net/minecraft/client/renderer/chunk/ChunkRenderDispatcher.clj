(ns net.minecraft.client.renderer.chunk.ChunkRenderDispatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk ChunkRenderDispatcher]))

(defn ->chunk-render-dispatcher
  "Constructor.

  count-render-builders - `int`"
  (^ChunkRenderDispatcher [^Integer count-render-builders]
    (new ChunkRenderDispatcher count-render-builders))
  (^ChunkRenderDispatcher []
    (new ChunkRenderDispatcher )))

(defn update-chunk-now
  "chunk-renderer - `net.minecraft.client.renderer.chunk.RenderChunk`

  returns: `boolean`"
  (^Boolean [^ChunkRenderDispatcher this ^net.minecraft.client.renderer.chunk.RenderChunk chunk-renderer]
    (-> this (.updateChunkNow chunk-renderer))))

(defn allocate-render-builder
  "returns: `net.minecraft.client.renderer.RegionRenderCacheBuilder`

  throws: java.lang.InterruptedException"
  (^net.minecraft.client.renderer.RegionRenderCacheBuilder [^ChunkRenderDispatcher this]
    (-> this (.allocateRenderBuilder))))

(defn stop-chunk-updates
  ""
  ([^ChunkRenderDispatcher this]
    (-> this (.stopChunkUpdates))))

(defn get-next-chunk-update
  "returns: `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator`

  throws: java.lang.InterruptedException"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator [^ChunkRenderDispatcher this]
    (-> this (.getNextChunkUpdate))))

(defn has-no-free-render-builders?
  "returns: `boolean`"
  (^Boolean [^ChunkRenderDispatcher this]
    (-> this (.hasNoFreeRenderBuilders))))

(defn clear-chunk-updates
  ""
  ([^ChunkRenderDispatcher this]
    (-> this (.clearChunkUpdates))))

(defn upload-chunk
  "p-188245-1 - `net.minecraft.util.BlockRenderLayer`
  p-188245-2 - `net.minecraft.client.renderer.VertexBuffer`
  p-188245-3 - `net.minecraft.client.renderer.chunk.RenderChunk`
  p-188245-4 - `net.minecraft.client.renderer.chunk.CompiledChunk`
  p-188245-5 - `double`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^ChunkRenderDispatcher this ^net.minecraft.util.BlockRenderLayer p-188245-1 ^net.minecraft.client.renderer.VertexBuffer p-188245-2 ^net.minecraft.client.renderer.chunk.RenderChunk p-188245-3 ^net.minecraft.client.renderer.chunk.CompiledChunk p-188245-4 ^Double p-188245-5]
    (-> this (.uploadChunk p-188245-1 p-188245-2 p-188245-3 p-188245-4 p-188245-5))))

(defn has-chunk-updates?
  "returns: `boolean`"
  (^Boolean [^ChunkRenderDispatcher this]
    (-> this (.hasChunkUpdates))))

(defn stop-worker-threads
  ""
  ([^ChunkRenderDispatcher this]
    (-> this (.stopWorkerThreads))))

(defn free-render-builder
  "p-178512-1 - `net.minecraft.client.renderer.RegionRenderCacheBuilder`"
  ([^ChunkRenderDispatcher this ^net.minecraft.client.renderer.RegionRenderCacheBuilder p-178512-1]
    (-> this (.freeRenderBuilder p-178512-1))))

(defn run-chunk-uploads
  "p-178516-1 - `long`

  returns: `boolean`"
  (^Boolean [^ChunkRenderDispatcher this ^Long p-178516-1]
    (-> this (.runChunkUploads p-178516-1))))

(defn update-chunk-later
  "chunk-renderer - `net.minecraft.client.renderer.chunk.RenderChunk`

  returns: `boolean`"
  (^Boolean [^ChunkRenderDispatcher this ^net.minecraft.client.renderer.chunk.RenderChunk chunk-renderer]
    (-> this (.updateChunkLater chunk-renderer))))

(defn get-debug-info
  "returns: `java.lang.String`"
  (^java.lang.String [^ChunkRenderDispatcher this]
    (-> this (.getDebugInfo))))

(defn update-transparency-later
  "chunk-renderer - `net.minecraft.client.renderer.chunk.RenderChunk`

  returns: `boolean`"
  (^Boolean [^ChunkRenderDispatcher this ^net.minecraft.client.renderer.chunk.RenderChunk chunk-renderer]
    (-> this (.updateTransparencyLater chunk-renderer))))

