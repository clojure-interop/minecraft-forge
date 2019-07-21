(ns net.minecraft.client.renderer.debug.DebugRendererPathfinding
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRendererPathfinding]))

(defn ->debug-renderer-pathfinding
  "Constructor.

  minecraft-in - `net.minecraft.client.Minecraft`"
  (^DebugRendererPathfinding [^net.minecraft.client.Minecraft minecraft-in]
    (new DebugRendererPathfinding minecraft-in)))

(defn add-path
  "p-188289-1 - `int`
  p-188289-2 - `net.minecraft.pathfinding.Path`
  p-188289-3 - `float`"
  ([^DebugRendererPathfinding this ^Integer p-188289-1 ^net.minecraft.pathfinding.Path p-188289-2 ^Float p-188289-3]
    (-> this (.addPath p-188289-1 p-188289-2 p-188289-3))))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRendererPathfinding this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

(defn render-path-line
  "p-190067-1 - `float`
  p-190067-2 - `net.minecraft.pathfinding.Path`"
  ([^DebugRendererPathfinding this ^Float p-190067-1 ^net.minecraft.pathfinding.Path p-190067-2]
    (-> this (.renderPathLine p-190067-1 p-190067-2))))

