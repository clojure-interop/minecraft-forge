(ns net.minecraft.client.renderer.chunk.ListedRenderChunk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk ListedRenderChunk]))

(defn ->listed-render-chunk
  "Constructor.

  world-in - `net.minecraft.world.World`
  render-global-in - `net.minecraft.client.renderer.RenderGlobal`
  index - `int`"
  (^ListedRenderChunk [^net.minecraft.world.World world-in ^net.minecraft.client.renderer.RenderGlobal render-global-in ^Integer index]
    (new ListedRenderChunk world-in render-global-in index)))

(defn get-display-list
  "layer - `net.minecraft.util.BlockRenderLayer`
  p-178600-2 - `net.minecraft.client.renderer.chunk.CompiledChunk`

  returns: `int`"
  (^Integer [^ListedRenderChunk this ^net.minecraft.util.BlockRenderLayer layer ^net.minecraft.client.renderer.chunk.CompiledChunk p-178600-2]
    (-> this (.getDisplayList layer p-178600-2))))

(defn delete-gl-resources
  ""
  ([^ListedRenderChunk this]
    (-> this (.deleteGlResources))))

