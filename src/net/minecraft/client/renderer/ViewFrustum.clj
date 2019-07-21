(ns net.minecraft.client.renderer.ViewFrustum
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ViewFrustum]))

(defn ->view-frustum
  "Constructor.

  world-in - `net.minecraft.world.World`
  render-distance-chunks - `int`
  render-global-in - `net.minecraft.client.renderer.RenderGlobal`
  render-chunk-factory - `net.minecraft.client.renderer.chunk.IRenderChunkFactory`"
  (^ViewFrustum [^net.minecraft.world.World world-in ^Integer render-distance-chunks ^net.minecraft.client.renderer.RenderGlobal render-global-in ^net.minecraft.client.renderer.chunk.IRenderChunkFactory render-chunk-factory]
    (new ViewFrustum world-in render-distance-chunks render-global-in render-chunk-factory)))

(defn render-chunks
  "Instance Field.

  type: net.minecraft.client.renderer.chunk.RenderChunk[]"
  ([^ViewFrustum this]
    (-> this .-renderChunks)))

(defn delete-gl-resources
  ""
  ([^ViewFrustum this]
    (-> this (.deleteGlResources))))

(defn update-chunk-positions
  "view-entity-x - `double`
  view-entity-z - `double`"
  ([^ViewFrustum this ^Double view-entity-x ^Double view-entity-z]
    (-> this (.updateChunkPositions view-entity-x view-entity-z))))

(defn mark-blocks-for-update
  "p-187474-1 - `int`
  p-187474-2 - `int`
  p-187474-3 - `int`
  p-187474-4 - `int`
  p-187474-5 - `int`
  p-187474-6 - `int`
  p-187474-7 - `boolean`"
  ([^ViewFrustum this ^Integer p-187474-1 ^Integer p-187474-2 ^Integer p-187474-3 ^Integer p-187474-4 ^Integer p-187474-5 ^Integer p-187474-6 ^Boolean p-187474-7]
    (-> this (.markBlocksForUpdate p-187474-1 p-187474-2 p-187474-3 p-187474-4 p-187474-5 p-187474-6 p-187474-7))))

