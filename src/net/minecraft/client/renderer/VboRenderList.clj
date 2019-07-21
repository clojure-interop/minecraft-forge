(ns net.minecraft.client.renderer.VboRenderList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer VboRenderList]))

(defn ->vbo-render-list
  "Constructor."
  (^VboRenderList []
    (new VboRenderList )))

(defn render-chunk-layer
  "layer - `net.minecraft.util.BlockRenderLayer`"
  ([^VboRenderList this ^net.minecraft.util.BlockRenderLayer layer]
    (-> this (.renderChunkLayer layer))))

