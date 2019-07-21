(ns net.minecraft.client.renderer.debug.DebugRendererChunkBorder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRendererChunkBorder]))

(defn ->debug-renderer-chunk-border
  "Constructor.

  minecraft-in - `net.minecraft.client.Minecraft`"
  (^DebugRendererChunkBorder [^net.minecraft.client.Minecraft minecraft-in]
    (new DebugRendererChunkBorder minecraft-in)))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRendererChunkBorder this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

