(ns net.minecraft.client.renderer.VertexBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer VertexBuffer]))

(defn ->vertex-buffer
  "Constructor.

  buffer-size-in - `int`"
  (^VertexBuffer [^Integer buffer-size-in]
    (new VertexBuffer buffer-size-in)))

(defn get-vertex-count
  "returns: `int`"
  (^Integer [^VertexBuffer this]
    (-> this (.getVertexCount))))

(defn set-vertex-state
  "state - `net.minecraft.client.renderer.VertexBuffer$State`"
  ([^VertexBuffer this ^net.minecraft.client.renderer.VertexBuffer$State state]
    (-> this (.setVertexState state))))

(defn begin
  "gl-mode - `int`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`"
  ([^VertexBuffer this ^Integer gl-mode ^net.minecraft.client.renderer.vertex.VertexFormat format]
    (-> this (.begin gl-mode format))))

(defn pos
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^VertexBuffer this ^Double x ^Double y ^Double z]
    (-> this (.pos x y z))))

(defn get-vertex-state
  "returns: `net.minecraft.client.renderer.VertexBuffer$State`"
  (^net.minecraft.client.renderer.VertexBuffer$State [^VertexBuffer this]
    (-> this (.getVertexState))))

(defn put-position
  "x - `double`
  y - `double`
  z - `double`"
  ([^VertexBuffer this ^Double x ^Double y ^Double z]
    (-> this (.putPosition x y z))))

(defn put-color-multiplier
  "red - `float`
  green - `float`
  blue - `float`
  vertex-index - `int`"
  ([^VertexBuffer this ^Float red ^Float green ^Float blue ^Integer vertex-index]
    (-> this (.putColorMultiplier red green blue vertex-index))))

(defn put-color-4
  "argb - `int`"
  ([^VertexBuffer this ^Integer argb]
    (-> this (.putColor4 argb))))

(defn put-color-rgba
  "index - `int`
  red - `int`
  green - `int`
  blue - `int`
  alpha - `int`"
  ([^VertexBuffer this ^Integer index ^Integer red ^Integer green ^Integer blue ^Integer alpha]
    (-> this (.putColorRGBA index red green blue alpha))))

(defn put-color-rgb-f
  "red - `float`
  green - `float`
  blue - `float`
  vertex-index - `int`"
  ([^VertexBuffer this ^Float red ^Float green ^Float blue ^Integer vertex-index]
    (-> this (.putColorRGB_F red green blue vertex-index))))

(defn set-translation
  "x - `double`
  y - `double`
  z - `double`"
  ([^VertexBuffer this ^Double x ^Double y ^Double z]
    (-> this (.setTranslation x y z))))

(defn reset
  ""
  ([^VertexBuffer this]
    (-> this (.reset))))

(defn normal
  "x - `float`
  y - `float`
  z - `float`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^VertexBuffer this ^Float x ^Float y ^Float z]
    (-> this (.normal x y z))))

(defn no-color
  ""
  ([^VertexBuffer this]
    (-> this (.noColor))))

(defn add-vertex-data
  "vertex-data - `int[]`"
  ([^VertexBuffer this vertex-data]
    (-> this (.addVertexData vertex-data))))

(defn get-color-index
  "vertex-index - `int`

  returns: `int`"
  (^Integer [^VertexBuffer this ^Integer vertex-index]
    (-> this (.getColorIndex vertex-index))))

(defn put-color-rgb-f-4
  "red - `float`
  green - `float`
  blue - `float`"
  ([^VertexBuffer this ^Float red ^Float green ^Float blue]
    (-> this (.putColorRGB_F4 red green blue))))

(defn put-brightness-4
  "p-178962-1 - `int`
  p-178962-2 - `int`
  p-178962-3 - `int`
  p-178962-4 - `int`"
  ([^VertexBuffer this ^Integer p-178962-1 ^Integer p-178962-2 ^Integer p-178962-3 ^Integer p-178962-4]
    (-> this (.putBrightness4 p-178962-1 p-178962-2 p-178962-3 p-178962-4))))

(defn end-vertex
  ""
  ([^VertexBuffer this]
    (-> this (.endVertex))))

(defn put-normal
  "x - `float`
  y - `float`
  z - `float`"
  ([^VertexBuffer this ^Float x ^Float y ^Float z]
    (-> this (.putNormal x y z))))

(defn sort-vertex-data
  "p-181674-1 - `float`
  p-181674-2 - `float`
  p-181674-3 - `float`"
  ([^VertexBuffer this ^Float p-181674-1 ^Float p-181674-2 ^Float p-181674-3]
    (-> this (.sortVertexData p-181674-1 p-181674-2 p-181674-3))))

(defn get-vertex-format
  "returns: `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^VertexBuffer this]
    (-> this (.getVertexFormat))))

(defn get-byte-buffer
  "returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^VertexBuffer this]
    (-> this (.getByteBuffer))))

(defn color-disabled?
  "returns: `boolean`"
  (^Boolean [^VertexBuffer this]
    (-> this (.isColorDisabled))))

(defn lightmap
  "p-187314-1 - `int`
  p-187314-2 - `int`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^VertexBuffer this ^Integer p-187314-1 ^Integer p-187314-2]
    (-> this (.lightmap p-187314-1 p-187314-2))))

(defn color
  "red - `float`
  green - `float`
  blue - `float`
  alpha - `float`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^VertexBuffer this ^Float red ^Float green ^Float blue ^Float alpha]
    (-> this (.color red green blue alpha))))

(defn tex
  "u - `double`
  v - `double`

  returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^VertexBuffer this ^Double u ^Double v]
    (-> this (.tex u v))))

(defn finish-drawing
  ""
  ([^VertexBuffer this]
    (-> this (.finishDrawing))))

(defn get-draw-mode
  "returns: `int`"
  (^Integer [^VertexBuffer this]
    (-> this (.getDrawMode))))

