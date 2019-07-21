(ns net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityBeaconRenderer]))

(defn ->tile-entity-beacon-renderer
  "Constructor."
  (^TileEntityBeaconRenderer []
    (new TileEntityBeaconRenderer )))

(def *-texture-beacon-beam
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  TileEntityBeaconRenderer/TEXTURE_BEACON_BEAM)

(defn *render-beam-segment
  "x - `double`
  y - `double`
  z - `double`
  partial-ticks - `double`
  texture-scale - `double`
  total-world-time - `double`
  y-offset - `int`
  height - `int`
  colors - `float[]`
  beam-radius - `double`
  glow-radius - `double`"
  ([^Double x ^Double y ^Double z ^Double partial-ticks ^Double texture-scale ^Double total-world-time ^Integer y-offset ^Integer height colors ^Double beam-radius ^Double glow-radius]
    (TileEntityBeaconRenderer/renderBeamSegment x y z partial-ticks texture-scale total-world-time y-offset height colors beam-radius glow-radius))
  ([^Double x ^Double y ^Double z ^Double partial-ticks ^Double texture-scale ^Double total-world-time ^Integer y-offset ^Integer height colors]
    (TileEntityBeaconRenderer/renderBeamSegment x y z partial-ticks texture-scale total-world-time y-offset height colors)))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityBeacon`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityBeaconRenderer this ^net.minecraft.tileentity.TileEntityBeacon te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

(defn render-beacon
  "x - `double`
  y - `double`
  z - `double`
  partial-ticks - `double`
  texture-scale - `double`
  beam-segments - `java.util.List`
  total-world-time - `double`"
  ([^TileEntityBeaconRenderer this ^Double x ^Double y ^Double z ^Double partial-ticks ^Double texture-scale ^java.util.List beam-segments ^Double total-world-time]
    (-> this (.renderBeacon x y z partial-ticks texture-scale beam-segments total-world-time))))

(defn global-renderer?
  "te - `net.minecraft.tileentity.TileEntityBeacon`

  returns: `boolean`"
  (^Boolean [^TileEntityBeaconRenderer this ^net.minecraft.tileentity.TileEntityBeacon te]
    (-> this (.isGlobalRenderer te))))

