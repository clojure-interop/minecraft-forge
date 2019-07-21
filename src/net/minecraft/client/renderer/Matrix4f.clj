(ns net.minecraft.client.renderer.Matrix4f
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer Matrix4f]))

(defn ->matrix-4f
  "Constructor.

  matrix - `float[]`"
  (^Matrix4f [matrix]
    (new Matrix4f matrix))
  (^Matrix4f []
    (new Matrix4f )))

