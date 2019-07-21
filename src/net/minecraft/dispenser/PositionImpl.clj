(ns net.minecraft.dispenser.PositionImpl
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser PositionImpl]))

(defn ->position-impl
  "Constructor.

  x-coord - `double`
  y-coord - `double`
  z-coord - `double`"
  (^PositionImpl [^Double x-coord ^Double y-coord ^Double z-coord]
    (new PositionImpl x-coord y-coord z-coord)))

(defn get-x
  "returns: `double`"
  (^Double [^PositionImpl this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^PositionImpl this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^PositionImpl this]
    (-> this (.getZ))))

