(ns net.minecraft.client.renderer.chunk.IRenderChunkFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk IRenderChunkFactory]))

(defn create
  "world-in - `net.minecraft.world.World`
  render-global-in - `net.minecraft.client.renderer.RenderGlobal`
  index - `int`

  returns: `net.minecraft.client.renderer.chunk.RenderChunk`"
  (^net.minecraft.client.renderer.chunk.RenderChunk [^IRenderChunkFactory this ^net.minecraft.world.World world-in ^net.minecraft.client.renderer.RenderGlobal render-global-in ^Integer index]
    (-> this (.create world-in render-global-in index))))

