(ns net.minecraft.server.management.PlayerChunkMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management PlayerChunkMap]))

(defn ->player-chunk-map
  "Constructor.

  server-world - `net.minecraft.world.WorldServer`"
  (^PlayerChunkMap [^net.minecraft.world.WorldServer server-world]
    (new PlayerChunkMap server-world)))

(defn *get-furthest-viewable-block
  "distance - `int`

  returns: `int`"
  (^Integer [^Integer distance]
    (PlayerChunkMap/getFurthestViewableBlock distance)))

(defn tick
  ""
  ([^PlayerChunkMap this]
    (-> this (.tick))))

(defn update-moving-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerChunkMap this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.updateMovingPlayer player))))

(defn remove-entry
  "entry - `net.minecraft.server.management.PlayerChunkMapEntry`"
  ([^PlayerChunkMap this ^net.minecraft.server.management.PlayerChunkMapEntry entry]
    (-> this (.removeEntry entry))))

(defn get-entry
  "x - `int`
  z - `int`

  returns: `net.minecraft.server.management.PlayerChunkMapEntry`"
  (^net.minecraft.server.management.PlayerChunkMapEntry [^PlayerChunkMap this ^Integer x ^Integer z]
    (-> this (.getEntry x z))))

(defn get-chunk-iterator
  "returns: `java.util.Iterator<net.minecraft.world.chunk.Chunk>`"
  (^java.util.Iterator [^PlayerChunkMap this]
    (-> this (.getChunkIterator))))

(defn contains
  "chunk-x - `int`
  chunk-z - `int`

  returns: `boolean`"
  (^Boolean [^PlayerChunkMap this ^Integer chunk-x ^Integer chunk-z]
    (-> this (.contains chunk-x chunk-z))))

(defn remove-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerChunkMap this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.removePlayer player))))

(defn mark-block-for-update
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^PlayerChunkMap this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.markBlockForUpdate pos))))

(defn set-player-view-radius
  "radius - `int`"
  ([^PlayerChunkMap this ^Integer radius]
    (-> this (.setPlayerViewRadius radius))))

(defn get-world-server
  "returns: `net.minecraft.world.WorldServer`"
  (^net.minecraft.world.WorldServer [^PlayerChunkMap this]
    (-> this (.getWorldServer))))

(defn entry-changed
  "entry - `net.minecraft.server.management.PlayerChunkMapEntry`"
  ([^PlayerChunkMap this ^net.minecraft.server.management.PlayerChunkMapEntry entry]
    (-> this (.entryChanged entry))))

(defn player-watching-chunk?
  "player - `net.minecraft.entity.player.EntityPlayerMP`
  chunk-x - `int`
  chunk-z - `int`

  returns: `boolean`"
  (^Boolean [^PlayerChunkMap this ^net.minecraft.entity.player.EntityPlayerMP player ^Integer chunk-x ^Integer chunk-z]
    (-> this (.isPlayerWatchingChunk player chunk-x chunk-z))))

(defn add-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^PlayerChunkMap this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.addPlayer player))))

