(ns net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityBannerRenderer]))

(defn ->tile-entity-banner-renderer
  "Constructor."
  (^TileEntityBannerRenderer []
    (new TileEntityBannerRenderer )))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityBanner`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityBannerRenderer this ^net.minecraft.tileentity.TileEntityBanner te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

