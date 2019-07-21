(ns net.minecraft.tileentity.TileEntityBeacon$BeamSegment
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityBeacon$BeamSegment]))

(defn ->beam-segment
  "Constructor.

  colors-in - `float[]`"
  (^TileEntityBeacon$BeamSegment [colors-in]
    (new TileEntityBeacon$BeamSegment colors-in)))

(defn get-colors
  "returns: `float[]`"
  ([^TileEntityBeacon$BeamSegment this]
    (-> this (.getColors))))

(defn get-height
  "returns: `int`"
  (^Integer [^TileEntityBeacon$BeamSegment this]
    (-> this (.getHeight))))

