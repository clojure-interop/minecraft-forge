(ns net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntitySkullRenderer]))

(defn ->tile-entity-skull-renderer
  "Constructor."
  (^TileEntitySkullRenderer []
    (new TileEntitySkullRenderer )))

(defn *-instance
  "Static Field.

  type: net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer"
  []
  TileEntitySkullRenderer/instance)

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntitySkull`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntitySkullRenderer this ^net.minecraft.tileentity.TileEntitySkull te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

(defn set-renderer-dispatcher
  "renderer-dispatcher-in - `net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher`"
  ([^TileEntitySkullRenderer this ^net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher renderer-dispatcher-in]
    (-> this (.setRendererDispatcher renderer-dispatcher-in))))

(defn render-skull
  "x - `float`
  y - `float`
  z - `float`
  facing - `net.minecraft.util.EnumFacing`
  p-188190-5 - `float`
  skull-type - `int`
  profile - `com.mojang.authlib.GameProfile`
  destroy-stage - `int`
  animate-ticks - `float`"
  ([^TileEntitySkullRenderer this ^Float x ^Float y ^Float z ^net.minecraft.util.EnumFacing facing ^Float p-188190-5 ^Integer skull-type ^com.mojang.authlib.GameProfile profile ^Integer destroy-stage ^Float animate-ticks]
    (-> this (.renderSkull x y z facing p-188190-5 skull-type profile destroy-stage animate-ticks))))

