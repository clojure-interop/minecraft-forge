(ns net.minecraft.client.renderer.ChunkRenderContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ChunkRenderContainer]))

(defn ->chunk-render-container
  "Constructor."
  (^ChunkRenderContainer []
    (new ChunkRenderContainer )))

(defn initialize
  "view-entity-x-in - `double`
  view-entity-y-in - `double`
  view-entity-z-in - `double`"
  ([^ChunkRenderContainer this ^Double view-entity-x-in ^Double view-entity-y-in ^Double view-entity-z-in]
    (-> this (.initialize view-entity-x-in view-entity-y-in view-entity-z-in))))

(defn pre-render-chunk
  "render-chunk-in - `net.minecraft.client.renderer.chunk.RenderChunk`"
  ([^ChunkRenderContainer this ^net.minecraft.client.renderer.chunk.RenderChunk render-chunk-in]
    (-> this (.preRenderChunk render-chunk-in))))

(defn add-render-chunk
  "render-chunk-in - `net.minecraft.client.renderer.chunk.RenderChunk`
  layer - `net.minecraft.util.BlockRenderLayer`"
  ([^ChunkRenderContainer this ^net.minecraft.client.renderer.chunk.RenderChunk render-chunk-in ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.addRenderChunk render-chunk-in layer))))

(defn render-chunk-layer
  "layer - `net.minecraft.util.BlockRenderLayer`"
  ([^ChunkRenderContainer this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.renderChunkLayer layer))))

