(ns net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityEnderChestRenderer]))

(defn ->tile-entity-ender-chest-renderer
  "Constructor."
  (^TileEntityEnderChestRenderer []
    (new TileEntityEnderChestRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityEnderChest`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityEnderChestRenderer this ^net.minecraft.tileentity.TileEntityEnderChest te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

