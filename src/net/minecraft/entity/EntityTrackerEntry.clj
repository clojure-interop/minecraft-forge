(ns net.minecraft.entity.EntityTrackerEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityTrackerEntry]))

(defn ->entity-tracker-entry
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  range-in - `int`
  max-range-in - `int`
  update-frequency-in - `int`
  send-velocity-updates-in - `boolean`"
  (^EntityTrackerEntry [^net.minecraft.entity.Entity entity-in ^Integer range-in ^Integer max-range-in ^Integer update-frequency-in ^Boolean send-velocity-updates-in]
    (new EntityTrackerEntry entity-in range-in max-range-in update-frequency-in send-velocity-updates-in)))

(defn update-counter
  "Instance Field.

  type: int"
  (^Integer [^EntityTrackerEntry this]
    (-> this .-updateCounter)))

(defn player-entities-updated
  "Instance Field.

  type: boolean"
  (^Boolean [^EntityTrackerEntry this]
    (-> this .-playerEntitiesUpdated)))

(defn tracking-players
  "Instance Constant.

  type: java.util.Set<net.minecraft.entity.player.EntityPlayerMP>"
  (^java.util.Set [^EntityTrackerEntry this]
    (-> this .-trackingPlayers)))

(defn update-player-entity
  "player-mp - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityTrackerEntry this ^net.minecraft.entity.player.EntityPlayerMP player-mp]
    (-> this (.updatePlayerEntity player-mp))))

(defn update-player-list
  "players - `java.util.List`"
  ([^EntityTrackerEntry this ^java.util.List players]
    (-> this (.updatePlayerList players))))

(defn send-to-tracking-and-self
  "packet-in - `net.minecraft.network.Packet`"
  ([^EntityTrackerEntry this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendToTrackingAndSelf packet-in))))

(defn set-max-range
  "max-range-in - `int`"
  ([^EntityTrackerEntry this ^Integer max-range-in]
    (-> this (.setMaxRange max-range-in))))

(defn get-tracked-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^EntityTrackerEntry this]
    (-> this (.getTrackedEntity))))

(defn send-destroy-entity-packet-to-tracked-players
  ""
  ([^EntityTrackerEntry this]
    (-> this (.sendDestroyEntityPacketToTrackedPlayers))))

(defn update-player-entities
  "players - `java.util.List`"
  ([^EntityTrackerEntry this ^java.util.List players]
    (-> this (.updatePlayerEntities players))))

(defn remove-tracked-player-symmetric
  "player-mp - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityTrackerEntry this ^net.minecraft.entity.player.EntityPlayerMP player-mp]
    (-> this (.removeTrackedPlayerSymmetric player-mp))))

(defn remove-from-tracked-players
  "player-mp - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityTrackerEntry this ^net.minecraft.entity.player.EntityPlayerMP player-mp]
    (-> this (.removeFromTrackedPlayers player-mp))))

(defn hash-code
  "returns: `int`"
  (^Integer [^EntityTrackerEntry this]
    (-> this (.hashCode))))

(defn reset-player-visibility
  ""
  ([^EntityTrackerEntry this]
    (-> this (.resetPlayerVisibility))))

(defn send-packet-to-tracked-players
  "packet-in - `net.minecraft.network.Packet`"
  ([^EntityTrackerEntry this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacketToTrackedPlayers packet-in))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^EntityTrackerEntry this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn visible-to?
  "player-mp - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `boolean`"
  (^Boolean [^EntityTrackerEntry this ^net.minecraft.entity.player.EntityPlayerMP player-mp]
    (-> this (.isVisibleTo player-mp))))

