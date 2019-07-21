(ns net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityEnchantmentTableRenderer]))

(defn ->tile-entity-enchantment-table-renderer
  "Constructor."
  (^TileEntityEnchantmentTableRenderer []
    (new TileEntityEnchantmentTableRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityEnchantmentTable`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityEnchantmentTableRenderer this ^net.minecraft.tileentity.TileEntityEnchantmentTable te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

