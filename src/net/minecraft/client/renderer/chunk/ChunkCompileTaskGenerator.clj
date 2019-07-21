(ns net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk ChunkCompileTaskGenerator]))

(defn ->chunk-compile-task-generator
  "Constructor.

  render-chunk-in - `net.minecraft.client.renderer.chunk.RenderChunk`
  type-in - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type`
  distance-sq-in - `double`"
  (^ChunkCompileTaskGenerator [^net.minecraft.client.renderer.chunk.RenderChunk render-chunk-in ^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type type-in ^Double distance-sq-in]
    (new ChunkCompileTaskGenerator render-chunk-in type-in distance-sq-in)))

(defn set-compiled-chunk
  "compiled-chunk-in - `net.minecraft.client.renderer.chunk.CompiledChunk`"
  ([^ChunkCompileTaskGenerator this ^net.minecraft.client.renderer.chunk.CompiledChunk compiled-chunk-in]
    (-> this (.setCompiledChunk compiled-chunk-in))))

(defn set-region-render-cache-builder
  "region-render-cache-builder-in - `net.minecraft.client.renderer.RegionRenderCacheBuilder`"
  ([^ChunkCompileTaskGenerator this ^net.minecraft.client.renderer.RegionRenderCacheBuilder region-render-cache-builder-in]
    (-> this (.setRegionRenderCacheBuilder region-render-cache-builder-in))))

(defn get-type
  "returns: `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type`"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type [^ChunkCompileTaskGenerator this]
    (-> this (.getType))))

(defn get-status
  "returns: `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status`"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status [^ChunkCompileTaskGenerator this]
    (-> this (.getStatus))))

(defn get-region-render-cache-builder
  "returns: `net.minecraft.client.renderer.RegionRenderCacheBuilder`"
  (^net.minecraft.client.renderer.RegionRenderCacheBuilder [^ChunkCompileTaskGenerator this]
    (-> this (.getRegionRenderCacheBuilder))))

(defn finish
  ""
  ([^ChunkCompileTaskGenerator this]
    (-> this (.finish))))

(defn get-distance-sq
  "returns: `double`"
  (^Double [^ChunkCompileTaskGenerator this]
    (-> this (.getDistanceSq))))

(defn get-render-chunk
  "returns: `net.minecraft.client.renderer.chunk.RenderChunk`"
  (^net.minecraft.client.renderer.chunk.RenderChunk [^ChunkCompileTaskGenerator this]
    (-> this (.getRenderChunk))))

(defn get-compiled-chunk
  "returns: `net.minecraft.client.renderer.chunk.CompiledChunk`"
  (^net.minecraft.client.renderer.chunk.CompiledChunk [^ChunkCompileTaskGenerator this]
    (-> this (.getCompiledChunk))))

(defn add-finish-runnable
  "runnable - `java.lang.Runnable`"
  ([^ChunkCompileTaskGenerator this ^java.lang.Runnable runnable]
    (-> this (.addFinishRunnable runnable))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator`

  returns: `int`"
  (^Integer [^ChunkCompileTaskGenerator this ^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn get-lock
  "returns: `java.util.concurrent.locks.ReentrantLock`"
  (^java.util.concurrent.locks.ReentrantLock [^ChunkCompileTaskGenerator this]
    (-> this (.getLock))))

(defn set-status
  "status-in - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status`"
  ([^ChunkCompileTaskGenerator this ^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status status-in]
    (-> this (.setStatus status-in))))

(defn finished?
  "returns: `boolean`"
  (^Boolean [^ChunkCompileTaskGenerator this]
    (-> this (.isFinished))))

