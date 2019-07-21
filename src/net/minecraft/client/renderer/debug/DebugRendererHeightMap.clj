(ns net.minecraft.client.renderer.debug.DebugRendererHeightMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRendererHeightMap]))

(defn ->debug-renderer-height-map
  "Constructor.

  minecraft-in - `net.minecraft.client.Minecraft`"
  (^DebugRendererHeightMap [^net.minecraft.client.Minecraft minecraft-in]
    (new DebugRendererHeightMap minecraft-in)))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRendererHeightMap this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

