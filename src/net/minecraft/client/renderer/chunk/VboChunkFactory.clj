(ns net.minecraft.client.renderer.chunk.VboChunkFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk VboChunkFactory]))

(defn ->vbo-chunk-factory
  "Constructor."
  (^VboChunkFactory []
    (new VboChunkFactory )))

(defn create
  "world-in - `net.minecraft.world.World`
  render-global-in - `net.minecraft.client.renderer.RenderGlobal`
  index - `int`

  returns: `net.minecraft.client.renderer.chunk.RenderChunk`"
  (^net.minecraft.client.renderer.chunk.RenderChunk [^VboChunkFactory this ^net.minecraft.world.World world-in ^net.minecraft.client.renderer.RenderGlobal render-global-in ^Integer index]
    (-> this (.create world-in render-global-in index))))

