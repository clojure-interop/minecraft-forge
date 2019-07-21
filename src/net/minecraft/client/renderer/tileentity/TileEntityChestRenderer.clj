(ns net.minecraft.client.renderer.tileentity.TileEntityChestRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityChestRenderer]))

(defn ->tile-entity-chest-renderer
  "Constructor."
  (^TileEntityChestRenderer []
    (new TileEntityChestRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityChest`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityChestRenderer this ^net.minecraft.tileentity.TileEntityChest te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

