(ns net.minecraft.client.renderer.tileentity.TileEntityStructureRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityStructureRenderer]))

(defn ->tile-entity-structure-renderer
  "Constructor."
  (^TileEntityStructureRenderer []
    (new TileEntityStructureRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityStructure`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityStructureRenderer this ^net.minecraft.tileentity.TileEntityStructure te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

(defn global-renderer?
  "te - `net.minecraft.tileentity.TileEntityStructure`

  returns: `boolean`"
  (^Boolean [^TileEntityStructureRenderer this ^net.minecraft.tileentity.TileEntityStructure te]
    (-> this (.isGlobalRenderer te))))

