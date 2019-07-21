(ns net.minecraftforge.client.model.animation.AnimationTESR
  "Generic TileEntitySpecialRenderer that works with the Forge model system and animations."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation AnimationTESR]))

(defn ->animation-tesr
  "Constructor."
  (^AnimationTESR []
    (new AnimationTESR )))

(defn render-tile-entity-fast
  "te - `T`
  x - `double`
  y - `double`
  z - `double`
  partial-tick - `float`
  break-stage - `int`
  renderer - `net.minecraft.client.renderer.VertexBuffer`"
  ([^AnimationTESR this te ^Double x ^Double y ^Double z ^Float partial-tick ^Integer break-stage ^net.minecraft.client.renderer.VertexBuffer renderer]
    (-> this (.renderTileEntityFast te x y z partial-tick break-stage renderer))))

(defn handle-events
  "te - `T`
  time - `float`
  past-events - `java.lang.Iterable`"
  ([^AnimationTESR this te ^Float time ^java.lang.Iterable past-events]
    (-> this (.handleEvents te time past-events))))

