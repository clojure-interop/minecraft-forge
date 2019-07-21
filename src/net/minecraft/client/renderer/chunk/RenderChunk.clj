(ns net.minecraft.client.renderer.chunk.RenderChunk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk RenderChunk]))

(defn ->render-chunk
  "Constructor.

  world-in - `net.minecraft.world.World`
  render-global-in - `net.minecraft.client.renderer.RenderGlobal`
  index-in - `int`"
  (^RenderChunk [^net.minecraft.world.World world-in ^net.minecraft.client.renderer.RenderGlobal render-global-in ^Integer index-in]
    (new RenderChunk world-in render-global-in index-in)))

(defn *-render-chunks-updated
  "Static Field.

  type: int"
  []
  RenderChunk/renderChunksUpdated)

(defn compiled-chunk
  "Instance Field.

  type: net.minecraft.client.renderer.chunk.CompiledChunk"
  (^net.minecraft.client.renderer.chunk.CompiledChunk [^RenderChunk this]
    (-> this .-compiledChunk)))

(defn bounding-box
  "Instance Field.

  type: net.minecraft.util.math.AxisAlignedBB"
  (^net.minecraft.util.math.AxisAlignedBB [^RenderChunk this]
    (-> this .-boundingBox)))

(defn set-compiled-chunk
  "compiled-chunk-in - `net.minecraft.client.renderer.chunk.CompiledChunk`"
  ([^RenderChunk this ^net.minecraft.client.renderer.chunk.CompiledChunk compiled-chunk-in]
    (-> this (.setCompiledChunk compiled-chunk-in))))

(defn clear-needs-update
  ""
  ([^RenderChunk this]
    (-> this (.clearNeedsUpdate))))

(defn set-position
  "x - `int`
  y - `int`
  z - `int`"
  ([^RenderChunk this ^Integer x ^Integer y ^Integer z]
    (-> this (.setPosition x y z))))

(defn needs-update?
  "returns: `boolean`"
  (^Boolean [^RenderChunk this]
    (-> this (.isNeedsUpdate))))

(defn get-lock-compile-task
  "returns: `java.util.concurrent.locks.ReentrantLock`"
  (^java.util.concurrent.locks.ReentrantLock [^RenderChunk this]
    (-> this (.getLockCompileTask))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^RenderChunk this]
    (-> this (.getPosition))))

(defn get-block-pos-offset-16
  "facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^RenderChunk this ^net.minecraft.util.EnumFacing facing]
    (-> this (.getBlockPosOffset16 facing))))

(defn set-needs-update
  "needs-update-in - `boolean`"
  ([^RenderChunk this ^Boolean needs-update-in]
    (-> this (.setNeedsUpdate needs-update-in))))

(defn make-compile-task-chunk
  "returns: `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator`"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator [^RenderChunk this]
    (-> this (.makeCompileTaskChunk))))

(defn make-compile-task-transparency
  "returns: `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator`"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator [^RenderChunk this]
    (-> this (.makeCompileTaskTransparency))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^RenderChunk this]
    (-> this (.getWorld))))

(defn needs-update-custom?
  "returns: `boolean`"
  (^Boolean [^RenderChunk this]
    (-> this (.isNeedsUpdateCustom))))

(defn get-compiled-chunk
  "returns: `net.minecraft.client.renderer.chunk.CompiledChunk`"
  (^net.minecraft.client.renderer.chunk.CompiledChunk [^RenderChunk this]
    (-> this (.getCompiledChunk))))

(defn set-frame-index
  "frame-index-in - `int`

  returns: `boolean`"
  (^Boolean [^RenderChunk this ^Integer frame-index-in]
    (-> this (.setFrameIndex frame-index-in))))

(defn rebuild-chunk
  "x - `float`
  y - `float`
  z - `float`
  generator - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator`"
  ([^RenderChunk this ^Float x ^Float y ^Float z ^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator generator]
    (-> this (.rebuildChunk x y z generator))))

(defn mult-modelview-matrix
  ""
  ([^RenderChunk this]
    (-> this (.multModelviewMatrix))))

(defn get-vertex-buffer-by-layer
  "layer - `int`

  returns: `net.minecraft.client.renderer.vertex.VertexBuffer`"
  (^net.minecraft.client.renderer.vertex.VertexBuffer [^RenderChunk this ^Integer layer]
    (-> this (.getVertexBufferByLayer layer))))

(defn resort-transparency
  "x - `float`
  y - `float`
  z - `float`
  generator - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator`"
  ([^RenderChunk this ^Float x ^Float y ^Float z ^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator generator]
    (-> this (.resortTransparency x y z generator))))

(defn delete-gl-resources
  ""
  ([^RenderChunk this]
    (-> this (.deleteGlResources))))

(defn stop-compile-task
  ""
  ([^RenderChunk this]
    (-> this (.stopCompileTask))))

