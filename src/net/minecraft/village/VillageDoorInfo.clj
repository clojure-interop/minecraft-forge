(ns net.minecraft.village.VillageDoorInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.village VillageDoorInfo]))

(defn ->village-door-info
  "Constructor.

  pos - `net.minecraft.util.math.BlockPos`
  delta-x - `int`
  delta-z - `int`
  timestamp - `int`"
  (^VillageDoorInfo [^net.minecraft.util.math.BlockPos pos ^Integer delta-x ^Integer delta-z ^Integer timestamp]
    (new VillageDoorInfo pos delta-x delta-z timestamp))
  (^VillageDoorInfo [^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Integer timestamp]
    (new VillageDoorInfo pos facing timestamp)))

(defn increment-door-opening-restriction-counter
  ""
  ([^VillageDoorInfo this]
    (-> this (.incrementDoorOpeningRestrictionCounter))))

(defn get-is-detached-from-village-flag?
  "returns: `boolean`"
  (^Boolean [^VillageDoorInfo this]
    (-> this (.getIsDetachedFromVillageFlag))))

(defn get-inside-offset-x
  "returns: `int`"
  (^Integer [^VillageDoorInfo this]
    (-> this (.getInsideOffsetX))))

(defn get-inside-offset-z
  "returns: `int`"
  (^Integer [^VillageDoorInfo this]
    (-> this (.getInsideOffsetZ))))

(defn set-is-detached-from-village-flag
  "detached - `boolean`"
  ([^VillageDoorInfo this ^Boolean detached]
    (-> this (.setIsDetachedFromVillageFlag detached))))

(defn get-door-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^VillageDoorInfo this]
    (-> this (.getDoorBlockPos))))

(defn get-inside-pos-y
  "returns: `int`"
  (^Integer [^VillageDoorInfo this]
    (-> this (.getInsidePosY))))

(defn get-distance-squared
  "x - `int`
  y - `int`
  z - `int`

  returns: `int`"
  (^Integer [^VillageDoorInfo this ^Integer x ^Integer y ^Integer z]
    (-> this (.getDistanceSquared x y z))))

(defn reset-door-opening-restriction-counter
  ""
  ([^VillageDoorInfo this]
    (-> this (.resetDoorOpeningRestrictionCounter))))

(defn get-door-opening-restriction-counter
  "returns: `int`"
  (^Integer [^VillageDoorInfo this]
    (-> this (.getDoorOpeningRestrictionCounter))))

(defn get-distance-to-inside-block-sq
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^VillageDoorInfo this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDistanceToInsideBlockSq pos))))

(defn get-inside-direction
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^VillageDoorInfo this]
    (-> this (.getInsideDirection))))

(defn set-last-activity-timestamp
  "timestamp - `int`"
  ([^VillageDoorInfo this ^Integer timestamp]
    (-> this (.setLastActivityTimestamp timestamp))))

(defn inside-side?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^VillageDoorInfo this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isInsideSide pos))))

(defn get-inside-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^VillageDoorInfo this]
    (-> this (.getInsideBlockPos))))

(defn get-distance-to-door-block-sq
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^VillageDoorInfo this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDistanceToDoorBlockSq pos))))

