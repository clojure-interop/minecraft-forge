(ns net.minecraft.client.renderer.tileentity.TileEntityEndGatewayRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityEndGatewayRenderer]))

(defn ->tile-entity-end-gateway-renderer
  "Constructor."
  (^TileEntityEndGatewayRenderer []
    (new TileEntityEndGatewayRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityEndPortal`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityEndGatewayRenderer this ^net.minecraft.tileentity.TileEntityEndPortal te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

