(ns net.minecraft.client.renderer.debug.DebugRendererCollisionBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRendererCollisionBox]))

(defn ->debug-renderer-collision-box
  "Constructor.

  p-i-47215-1 - `net.minecraft.client.Minecraft`"
  (^DebugRendererCollisionBox [^net.minecraft.client.Minecraft p-i-47215-1]
    (new DebugRendererCollisionBox p-i-47215-1)))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRendererCollisionBox this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

