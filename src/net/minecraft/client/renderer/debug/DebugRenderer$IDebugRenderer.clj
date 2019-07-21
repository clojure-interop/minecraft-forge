(ns net.minecraft.client.renderer.debug.DebugRenderer$IDebugRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRenderer$IDebugRenderer]))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRenderer$IDebugRenderer this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

