(ns net.minecraft.realms.RealmsBufferBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsBufferBuilder]))

(defn ->realms-buffer-builder
  "Constructor.

  p-i-46442-1 - `net.minecraft.client.renderer.VertexBuffer`"
  (^RealmsBufferBuilder [^net.minecraft.client.renderer.VertexBuffer p-i-46442-1]
    (new RealmsBufferBuilder p-i-46442-1)))

(defn get-vertex-count
  "returns: `int`"
  (^Integer [^RealmsBufferBuilder this]
    (-> this (.getVertexCount))))

(defn tex-2
  "p-tex-2-1 - `int`
  p-tex-2-2 - `int`

  returns: `net.minecraft.realms.RealmsBufferBuilder`"
  (^net.minecraft.realms.RealmsBufferBuilder [^RealmsBufferBuilder this ^Integer p-tex-2-1 ^Integer p-tex-2-2]
    (-> this (.tex2 p-tex-2-1 p-tex-2-2))))

(defn sort-quads
  "p-sort-quads-1 - `float`
  p-sort-quads-2 - `float`
  p-sort-quads-3 - `float`"
  ([^RealmsBufferBuilder this ^Float p-sort-quads-1 ^Float p-sort-quads-2 ^Float p-sort-quads-3]
    (-> this (.sortQuads p-sort-quads-1 p-sort-quads-2 p-sort-quads-3))))

(defn begin
  "p-begin-1 - `int`
  p-begin-2 - `net.minecraft.client.renderer.vertex.VertexFormat`"
  ([^RealmsBufferBuilder this ^Integer p-begin-1 ^net.minecraft.client.renderer.vertex.VertexFormat p-begin-2]
    (-> this (.begin p-begin-1 p-begin-2))))

(defn get-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^RealmsBufferBuilder this]
    (-> this (.getBuffer))))

(defn offset
  "p-offset-1 - `double`
  p-offset-3 - `double`
  p-offset-5 - `double`"
  ([^RealmsBufferBuilder this ^Double p-offset-1 ^Double p-offset-3 ^Double p-offset-5]
    (-> this (.offset p-offset-1 p-offset-3 p-offset-5))))

(defn fixup-vertex-color
  "p-fixup-vertex-color-1 - `float`
  p-fixup-vertex-color-2 - `float`
  p-fixup-vertex-color-3 - `float`
  p-fixup-vertex-color-4 - `int`"
  ([^RealmsBufferBuilder this ^Float p-fixup-vertex-color-1 ^Float p-fixup-vertex-color-2 ^Float p-fixup-vertex-color-3 ^Integer p-fixup-vertex-color-4]
    (-> this (.fixupVertexColor p-fixup-vertex-color-1 p-fixup-vertex-color-2 p-fixup-vertex-color-3 p-fixup-vertex-color-4))))

(defn normal
  "p-normal-1 - `float`
  p-normal-2 - `float`
  p-normal-3 - `float`

  returns: `net.minecraft.realms.RealmsBufferBuilder`"
  (^net.minecraft.realms.RealmsBufferBuilder [^RealmsBufferBuilder this ^Float p-normal-1 ^Float p-normal-2 ^Float p-normal-3]
    (-> this (.normal p-normal-1 p-normal-2 p-normal-3))))

(defn no-color
  ""
  ([^RealmsBufferBuilder this]
    (-> this (.noColor))))

(defn face-tex-2
  "p-face-tex-2-1 - `int`
  p-face-tex-2-2 - `int`
  p-face-tex-2-3 - `int`
  p-face-tex-2-4 - `int`"
  ([^RealmsBufferBuilder this ^Integer p-face-tex-2-1 ^Integer p-face-tex-2-2 ^Integer p-face-tex-2-3 ^Integer p-face-tex-2-4]
    (-> this (.faceTex2 p-face-tex-2-1 p-face-tex-2-2 p-face-tex-2-3 p-face-tex-2-4))))

(defn end-vertex
  ""
  ([^RealmsBufferBuilder this]
    (-> this (.endVertex))))

(defn fixup-quad-color
  "p-fixup-quad-color-1 - `float`
  p-fixup-quad-color-2 - `float`
  p-fixup-quad-color-3 - `float`"
  ([^RealmsBufferBuilder this ^Float p-fixup-quad-color-1 ^Float p-fixup-quad-color-2 ^Float p-fixup-quad-color-3]
    (-> this (.fixupQuadColor p-fixup-quad-color-1 p-fixup-quad-color-2 p-fixup-quad-color-3)))
  ([^RealmsBufferBuilder this ^Integer p-fixup-quad-color-1]
    (-> this (.fixupQuadColor p-fixup-quad-color-1))))

(defn restore-state
  "p-restore-state-1 - `net.minecraft.client.renderer.VertexBuffer$State`"
  ([^RealmsBufferBuilder this ^net.minecraft.client.renderer.VertexBuffer$State p-restore-state-1]
    (-> this (.restoreState p-restore-state-1))))

(defn from
  "p-from-1 - `net.minecraft.client.renderer.VertexBuffer`

  returns: `net.minecraft.realms.RealmsBufferBuilder`"
  (^net.minecraft.realms.RealmsBufferBuilder [^RealmsBufferBuilder this ^net.minecraft.client.renderer.VertexBuffer p-from-1]
    (-> this (.from p-from-1))))

(defn get-vertex-format
  "returns: `net.minecraft.realms.RealmsVertexFormat`"
  (^net.minecraft.realms.RealmsVertexFormat [^RealmsBufferBuilder this]
    (-> this (.getVertexFormat))))

(defn vertex
  "p-vertex-1 - `double`
  p-vertex-3 - `double`
  p-vertex-5 - `double`

  returns: `net.minecraft.realms.RealmsBufferBuilder`"
  (^net.minecraft.realms.RealmsBufferBuilder [^RealmsBufferBuilder this ^Double p-vertex-1 ^Double p-vertex-3 ^Double p-vertex-5]
    (-> this (.vertex p-vertex-1 p-vertex-3 p-vertex-5))))

(defn put-bulk-data
  "p-put-bulk-data-1 - `int[]`"
  ([^RealmsBufferBuilder this p-put-bulk-data-1]
    (-> this (.putBulkData p-put-bulk-data-1))))

(defn clear
  ""
  ([^RealmsBufferBuilder this]
    (-> this (.clear))))

(defn face-tint
  "p-face-tint-1 - `float`
  p-face-tint-2 - `float`
  p-face-tint-3 - `float`
  p-face-tint-4 - `int`"
  ([^RealmsBufferBuilder this ^Float p-face-tint-1 ^Float p-face-tint-2 ^Float p-face-tint-3 ^Integer p-face-tint-4]
    (-> this (.faceTint p-face-tint-1 p-face-tint-2 p-face-tint-3 p-face-tint-4))))

(defn post-normal
  "p-post-normal-1 - `float`
  p-post-normal-2 - `float`
  p-post-normal-3 - `float`"
  ([^RealmsBufferBuilder this ^Float p-post-normal-1 ^Float p-post-normal-2 ^Float p-post-normal-3]
    (-> this (.postNormal p-post-normal-1 p-post-normal-2 p-post-normal-3))))

(defn color
  "p-color-1 - `int`
  p-color-2 - `int`
  p-color-3 - `int`
  p-color-4 - `int`

  returns: `net.minecraft.realms.RealmsBufferBuilder`"
  (^net.minecraft.realms.RealmsBufferBuilder [^RealmsBufferBuilder this ^Integer p-color-1 ^Integer p-color-2 ^Integer p-color-3 ^Integer p-color-4]
    (-> this (.color p-color-1 p-color-2 p-color-3 p-color-4))))

(defn end
  ""
  ([^RealmsBufferBuilder this]
    (-> this (.end))))

(defn tex
  "p-tex-1 - `double`
  p-tex-3 - `double`

  returns: `net.minecraft.realms.RealmsBufferBuilder`"
  (^net.minecraft.realms.RealmsBufferBuilder [^RealmsBufferBuilder this ^Double p-tex-1 ^Double p-tex-3]
    (-> this (.tex p-tex-1 p-tex-3))))

(defn post-process-face-position
  "p-post-process-face-position-1 - `double`
  p-post-process-face-position-3 - `double`
  p-post-process-face-position-5 - `double`"
  ([^RealmsBufferBuilder this ^Double p-post-process-face-position-1 ^Double p-post-process-face-position-3 ^Double p-post-process-face-position-5]
    (-> this (.postProcessFacePosition p-post-process-face-position-1 p-post-process-face-position-3 p-post-process-face-position-5))))

(defn get-draw-mode
  "returns: `int`"
  (^Integer [^RealmsBufferBuilder this]
    (-> this (.getDrawMode))))

