(ns net.minecraft.client.renderer.debug.DebugRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRenderer]))

(defn ->debug-renderer
  "Constructor.

  client-in - `net.minecraft.client.Minecraft`"
  (^DebugRenderer [^net.minecraft.client.Minecraft client-in]
    (new DebugRenderer client-in)))

(defn debug-renderer-pathfinding
  "Instance Constant.

  type: net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer [^DebugRenderer this]
    (-> this .-debugRendererPathfinding)))

(defn debug-renderer-water
  "Instance Constant.

  type: net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer [^DebugRenderer this]
    (-> this .-debugRendererWater)))

(defn debug-renderer-chunk-border
  "Instance Constant.

  type: net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer [^DebugRenderer this]
    (-> this .-debugRendererChunkBorder)))

(defn debug-renderer-height-map
  "Instance Constant.

  type: net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer [^DebugRenderer this]
    (-> this .-debugRendererHeightMap)))

(defn collision-box-renderer
  "Instance Constant.

  type: net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer [^DebugRenderer this]
    (-> this .-collisionBoxRenderer)))

(defn field-191557-f
  "Instance Constant.

  type: net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer [^DebugRenderer this]
    (-> this .-field_191557_f)))

(defn *func-191556-a
  "p-191556-0 - `java.lang.String`
  p-191556-1 - `int`
  p-191556-2 - `int`
  p-191556-3 - `int`
  p-191556-4 - `float`
  p-191556-5 - `int`"
  ([^java.lang.String p-191556-0 ^Integer p-191556-1 ^Integer p-191556-2 ^Integer p-191556-3 ^Float p-191556-4 ^Integer p-191556-5]
    (DebugRenderer/func_191556_a p-191556-0 p-191556-1 p-191556-2 p-191556-3 p-191556-4 p-191556-5)))

(defn *render-debug-text
  "str - `java.lang.String`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  color - `int`"
  ([^java.lang.String str ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer color]
    (DebugRenderer/renderDebugText str x y z partial-ticks color)))

(defn should-render?
  "returns: `boolean`"
  (^Boolean [^DebugRenderer this]
    (-> this (.shouldRender))))

(defn toggle-debug-screen
  "returns: `boolean`"
  (^Boolean [^DebugRenderer this]
    (-> this (.toggleDebugScreen))))

(defn render-debug
  "partial-ticks - `float`
  finish-time-nano - `long`"
  ([^DebugRenderer this ^Float partial-ticks ^Long finish-time-nano]
    (-> this (.renderDebug partial-ticks finish-time-nano))))

