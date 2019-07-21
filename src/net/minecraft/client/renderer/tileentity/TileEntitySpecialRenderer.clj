(ns net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntitySpecialRenderer]))

(defn ->tile-entity-special-renderer
  "Constructor."
  (^TileEntitySpecialRenderer []
    (new TileEntitySpecialRenderer )))

(defn render-tile-entity-at
  "te - `T`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntitySpecialRenderer this te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

(defn set-renderer-dispatcher
  "renderer-dispatcher-in - `net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher`"
  ([^TileEntitySpecialRenderer this ^net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher renderer-dispatcher-in]
    (-> this (.setRendererDispatcher renderer-dispatcher-in))))

(defn get-font-renderer
  "returns: `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^TileEntitySpecialRenderer this]
    (-> this (.getFontRenderer))))

(defn global-renderer?
  "te - `T`

  returns: `boolean`"
  (^Boolean [^TileEntitySpecialRenderer this te]
    (-> this (.isGlobalRenderer te))))

(defn render-tile-entity-fast
  "te - `T`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`
  buffer - `net.minecraft.client.renderer.VertexBuffer`"
  ([^TileEntitySpecialRenderer this te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage ^net.minecraft.client.renderer.VertexBuffer buffer]
    (-> this (.renderTileEntityFast te x y z partial-ticks destroy-stage buffer))))

