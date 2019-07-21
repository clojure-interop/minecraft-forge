(ns net.minecraft.client.renderer.debug.DebugRendererNeighborsUpdate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.debug DebugRendererNeighborsUpdate]))

(defn func-191553-a
  "p-191553-1 - `long`
  p-191553-3 - `net.minecraft.util.math.BlockPos`"
  ([^DebugRendererNeighborsUpdate this ^Long p-191553-1 ^net.minecraft.util.math.BlockPos p-191553-3]
    (-> this (.func_191553_a p-191553-1 p-191553-3))))

(defn render
  "partial-ticks - `float`
  p-190060-2 - `long`"
  ([^DebugRendererNeighborsUpdate this ^Float partial-ticks ^Long p-190060-2]
    (-> this (.render partial-ticks p-190060-2))))

