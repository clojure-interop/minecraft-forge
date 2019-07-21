(ns net.minecraft.client.renderer.chunk.ChunkRenderWorker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk ChunkRenderWorker]))

(defn ->chunk-render-worker
  "Constructor.

  chunk-render-dispatcher-in - `net.minecraft.client.renderer.chunk.ChunkRenderDispatcher`
  region-render-cache-builder-in - `net.minecraft.client.renderer.RegionRenderCacheBuilder`"
  (^ChunkRenderWorker [^net.minecraft.client.renderer.chunk.ChunkRenderDispatcher chunk-render-dispatcher-in ^net.minecraft.client.renderer.RegionRenderCacheBuilder region-render-cache-builder-in]
    (new ChunkRenderWorker chunk-render-dispatcher-in region-render-cache-builder-in))
  (^ChunkRenderWorker [^net.minecraft.client.renderer.chunk.ChunkRenderDispatcher chunk-render-dispatcher-in]
    (new ChunkRenderWorker chunk-render-dispatcher-in)))

(defn run
  ""
  ([^ChunkRenderWorker this]
    (-> this (.run))))

(defn notify-to-stop
  ""
  ([^ChunkRenderWorker this]
    (-> this (.notifyToStop))))

