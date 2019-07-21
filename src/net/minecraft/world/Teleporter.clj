(ns net.minecraft.world.Teleporter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world Teleporter]))

(defn ->teleporter
  "Constructor.

  world-in - `net.minecraft.world.WorldServer`"
  (^Teleporter [^net.minecraft.world.WorldServer world-in]
    (new Teleporter world-in)))

(defn place-in-portal
  "entity-in - `net.minecraft.entity.Entity`
  rotation-yaw - `float`"
  ([^Teleporter this ^net.minecraft.entity.Entity entity-in ^Float rotation-yaw]
    (-> this (.placeInPortal entity-in rotation-yaw))))

(defn place-in-existing-portal
  "entity-in - `net.minecraft.entity.Entity`
  rotation-yaw - `float`

  returns: `boolean`"
  (^Boolean [^Teleporter this ^net.minecraft.entity.Entity entity-in ^Float rotation-yaw]
    (-> this (.placeInExistingPortal entity-in rotation-yaw))))

(defn make-portal
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^Teleporter this ^net.minecraft.entity.Entity entity-in]
    (-> this (.makePortal entity-in))))

(defn remove-stale-portal-locations
  "world-time - `long`"
  ([^Teleporter this ^Long world-time]
    (-> this (.removeStalePortalLocations world-time))))

