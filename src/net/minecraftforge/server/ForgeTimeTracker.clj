(ns net.minecraftforge.server.ForgeTimeTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server ForgeTimeTracker]))

(defn *-tile-entity-tracking
  "Static Field.

  type: boolean"
  []
  ForgeTimeTracker/tileEntityTracking)

(defn *-tile-entity-tracking-duration
  "Static Field.

  type: int"
  []
  ForgeTimeTracker/tileEntityTrackingDuration)

(defn *-tile-entity-tracking-time
  "Static Field.

  type: long"
  []
  ForgeTimeTracker/tileEntityTrackingTime)

(defn *get-tile-timings
  "returns: `com.google.common.collect.ImmutableMap<net.minecraft.tileentity.TileEntity,int[]>`"
  ([]
    (ForgeTimeTracker/getTileTimings )))

(defn *track-start
  "tile-entity - `net.minecraft.tileentity.TileEntity`"
  ([^net.minecraft.tileentity.TileEntity tile-entity]
    (ForgeTimeTracker/trackStart tile-entity)))

(defn *track-end
  "tile-entity - `net.minecraft.tileentity.TileEntity`"
  ([^net.minecraft.tileentity.TileEntity tile-entity]
    (ForgeTimeTracker/trackEnd tile-entity)))

