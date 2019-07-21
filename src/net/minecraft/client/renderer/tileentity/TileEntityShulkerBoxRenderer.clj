(ns net.minecraft.client.renderer.tileentity.TileEntityShulkerBoxRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityShulkerBoxRenderer]))

(defn ->tile-entity-shulker-box-renderer
  "Constructor.

  model-in - `net.minecraft.client.model.ModelShulker`"
  (^TileEntityShulkerBoxRenderer [^net.minecraft.client.model.ModelShulker model-in]
    (new TileEntityShulkerBoxRenderer model-in)))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityShulkerBox`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityShulkerBoxRenderer this ^net.minecraft.tileentity.TileEntityShulkerBox te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

