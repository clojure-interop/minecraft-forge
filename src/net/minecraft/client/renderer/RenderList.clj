(ns net.minecraft.client.renderer.RenderList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer RenderList]))

(defn ->render-list
  "Constructor."
  (^RenderList []
    (new RenderList )))

(defn render-chunk-layer
  "layer - `net.minecraft.util.BlockRenderLayer`"
  ([^RenderList this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.renderChunkLayer layer))))

