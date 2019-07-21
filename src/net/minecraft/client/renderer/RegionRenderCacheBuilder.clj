(ns net.minecraft.client.renderer.RegionRenderCacheBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer RegionRenderCacheBuilder]))

(defn ->region-render-cache-builder
  "Constructor."
  (^RegionRenderCacheBuilder []
    (new RegionRenderCacheBuilder )))

(defn get-world-renderer-by-layer
  "layer - `net.minecraft.util.BlockRenderLayer`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^RegionRenderCacheBuilder this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.getWorldRendererByLayer layer))))

(defn get-world-renderer-by-layer-id
  "id - `int`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^RegionRenderCacheBuilder this ^Integer id]
    (-> this (.getWorldRendererByLayerId id))))

