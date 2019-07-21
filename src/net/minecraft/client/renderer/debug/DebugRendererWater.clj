(ns net.minecraft.client.renderer.debug.DebugRendererWater
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRendererWater]))

(defn ->debug-renderer-water
  "Constructor.

  minecraft-in - `net.minecraft.client.Minecraft`"
  (^DebugRendererWater [^net.minecraft.client.Minecraft minecraft-in]
    (new DebugRendererWater minecraft-in)))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRendererWater this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

