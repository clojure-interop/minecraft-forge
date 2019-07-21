(ns net.minecraft.client.renderer.tileentity.TileEntityPistonRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityPistonRenderer]))

(defn ->tile-entity-piston-renderer
  "Constructor."
  (^TileEntityPistonRenderer []
    (new TileEntityPistonRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityPiston`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityPistonRenderer this ^net.minecraft.tileentity.TileEntityPiston te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

