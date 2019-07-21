(ns net.minecraft.entity.EntityTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityTracker]))

(defn ->entity-tracker
  "Constructor.

  the-world-in - `net.minecraft.world.WorldServer`"
  (^EntityTracker [^net.minecraft.world.WorldServer the-world-in]
    (new EntityTracker the-world-in)))

(defn *get-position-long
  "value - `double`

  returns: `long`"
  (^Long [^Double value]
    (EntityTracker/getPositionLong value)))

(defn *update-server-position
  "entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`"
  ([^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z]
    (EntityTracker/updateServerPosition entity-in x y z)))

(defn track
  "entity-in - `net.minecraft.entity.Entity`
  tracking-range - `int`
  update-frequency - `int`
  send-velocity-updates - `boolean`"
  ([^EntityTracker this ^net.minecraft.entity.Entity entity-in ^Integer tracking-range ^Integer update-frequency ^Boolean send-velocity-updates]
    (-> this (.track entity-in tracking-range update-frequency send-velocity-updates)))
  ([^EntityTracker this ^net.minecraft.entity.Entity entity-in ^Integer tracking-range ^Integer update-frequency]
    (-> this (.track entity-in tracking-range update-frequency)))
  ([^EntityTracker this ^net.minecraft.entity.Entity entity-in]
    (-> this (.track entity-in))))

(defn tick
  ""
  ([^EntityTracker this]
    (-> this (.tick))))

(defn set-view-distance
  "p-187252-1 - `int`"
  ([^EntityTracker this ^Integer p-187252-1]
    (-> this (.setViewDistance p-187252-1))))

(defn get-tracking-players
  "Get all players tracking the given Entity. The Entity must be part of the World that this Tracker belongs to.

  entity - the Entity - `net.minecraft.entity.Entity`

  returns: all players tracking the Entity - `java.util.Set<? extends net.minecraft.entity.player.EntityPlayer>`"
  ([^EntityTracker this ^net.minecraft.entity.Entity entity]
    (-> this (.getTrackingPlayers entity))))

(defn remove-player-from-trackers
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityTracker this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.removePlayerFromTrackers player))))

(defn update-visibility
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^EntityTracker this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.updateVisibility player))))

(defn send-to-tracking-and-self
  "entity-in - `net.minecraft.entity.Entity`
  packet-in - `net.minecraft.network.Packet`"
  ([^EntityTracker this ^net.minecraft.entity.Entity entity-in ^net.minecraft.network.Packet packet-in]
    (-> this (.sendToTrackingAndSelf entity-in packet-in))))

(defn send-to-tracking
  "entity-in - `net.minecraft.entity.Entity`
  packet-in - `net.minecraft.network.Packet`"
  ([^EntityTracker this ^net.minecraft.entity.Entity entity-in ^net.minecraft.network.Packet packet-in]
    (-> this (.sendToTracking entity-in packet-in))))

(defn untrack
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityTracker this ^net.minecraft.entity.Entity entity-in]
    (-> this (.untrack entity-in))))

(defn send-leashed-entities-in-chunk
  "player - `net.minecraft.entity.player.EntityPlayerMP`
  chunk-in - `net.minecraft.world.chunk.Chunk`"
  ([^EntityTracker this ^net.minecraft.entity.player.EntityPlayerMP player ^net.minecraft.world.chunk.Chunk chunk-in]
    (-> this (.sendLeashedEntitiesInChunk player chunk-in))))

