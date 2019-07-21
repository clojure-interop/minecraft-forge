(ns net.minecraft.client.renderer.tileentity.TileEntitySignRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntitySignRenderer]))

(defn ->tile-entity-sign-renderer
  "Constructor."
  (^TileEntitySignRenderer []
    (new TileEntitySignRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntitySign`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntitySignRenderer this ^net.minecraft.tileentity.TileEntitySign te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

