(ns net.minecraft.server.management.PlayerChunkMapEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management PlayerChunkMapEntry]))

(defn ->player-chunk-map-entry
  "Constructor.

  map-in - `net.minecraft.server.management.PlayerChunkMap`
  chunk-x - `int`
  chunk-z - `int`"
  (^PlayerChunkMapEntry [^net.minecraft.server.management.PlayerChunkMap map-in ^Integer chunk-x ^Integer chunk-z]
    (new PlayerChunkMapEntry map-in chunk-x chunk-z)))

(defn has-player-matching-in-range?
  "range - `double`
  predicate - `com.google.common.base.Predicate`

  returns: `boolean`"
  (^Boolean [^PlayerChunkMapEntry this ^Double range ^com.google.common.base.Predicate predicate]
    (-> this (.hasPlayerMatchingInRange range predicate))))

(defn send-packet
  "packet-in - `net.minecraft.network.Packet`"
  ([^PlayerChunkMapEntry this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacket packet-in))))

(defn update-chunk-inhabited-time
  ""
  ([^PlayerChunkMapEntry this]
    (-> this (.updateChunkInhabitedTime))))

(defn has-player-matching?
  "predicate - `com.google.common.base.Predicate`

  returns: `boolean`"
  (^Boolean [^PlayerChunkMapEntry this ^com.google.common.base.Predicate predicate]
    (-> this (.hasPlayerMatching predicate))))

(defn update
  ""
  ([^PlayerChunkMapEntry this]
    (-> this (.update))))

(defn provide-player-chunk
  "can-generate - `boolean`

  returns: `boolean`"
  (^Boolean [^PlayerChunkMapEntry this ^Boolean can-generate]
    (-> this (.providePlayerChunk can-generate))))

(defn remove-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerChunkMapEntry this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.removePlayer player))))

(defn sent-to-players?
  "returns: `boolean`"
  (^Boolean [^PlayerChunkMapEntry this]
    (-> this (.isSentToPlayers))))

(defn block-changed
  "x - `int`
  y - `int`
  z - `int`"
  ([^PlayerChunkMapEntry this ^Integer x ^Integer y ^Integer z]
    (-> this (.blockChanged x y z))))

(defn get-pos
  "returns: `net.minecraft.util.math.ChunkPos`"
  (^net.minecraft.util.math.ChunkPos [^PlayerChunkMapEntry this]
    (-> this (.getPos))))

(defn send-nearby-special-entities
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerChunkMapEntry this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.sendNearbySpecialEntities player))))

(defn get-chunk
  "returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^PlayerChunkMapEntry this]
    (-> this (.getChunk))))

(defn get-closest-player-distance
  "returns: `double`"
  (^Double [^PlayerChunkMapEntry this]
    (-> this (.getClosestPlayerDistance))))

(defn send-to-players
  "returns: `boolean`"
  (^Boolean [^PlayerChunkMapEntry this]
    (-> this (.sendToPlayers))))

(defn contains-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `boolean`"
  (^Boolean [^PlayerChunkMapEntry this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.containsPlayer player))))

(defn add-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerChunkMapEntry this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.addPlayer player))))

