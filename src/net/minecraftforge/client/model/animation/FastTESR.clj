(ns net.minecraftforge.client.model.animation.FastTESR
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation FastTESR]))

(defn ->fast-tesr
  "Constructor."
  (^FastTESR []
    (new FastTESR )))

(defn render-tile-entity-at
  "te - `T`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^FastTESR this te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

(defn render-tile-entity-fast
  "te - `T`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`
  vertex-buffer - `net.minecraft.client.renderer.VertexBuffer`"
  ([^FastTESR this te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage ^net.minecraft.client.renderer.VertexBuffer vertex-buffer]
    (-> this (.renderTileEntityFast te x y z partial-ticks destroy-stage vertex-buffer))))

