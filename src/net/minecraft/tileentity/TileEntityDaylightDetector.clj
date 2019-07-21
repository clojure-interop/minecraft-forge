(ns net.minecraft.tileentity.TileEntityDaylightDetector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityDaylightDetector]))

(defn ->tile-entity-daylight-detector
  "Constructor."
  (^TileEntityDaylightDetector []
    (new TileEntityDaylightDetector )))

(defn update
  ""
  ([^TileEntityDaylightDetector this]
    (-> this (.update))))

