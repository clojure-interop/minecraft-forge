(ns net.minecraft.client.multiplayer.WorldClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer WorldClient]))

(defn ->world-client
  "Constructor.

  net-handler - `net.minecraft.client.network.NetHandlerPlayClient`
  settings - `net.minecraft.world.WorldSettings`
  dimension - `int`
  difficulty - `net.minecraft.world.EnumDifficulty`
  profiler-in - `net.minecraft.profiler.Profiler`"
  (^WorldClient [^net.minecraft.client.network.NetHandlerPlayClient net-handler ^net.minecraft.world.WorldSettings settings ^Integer dimension ^net.minecraft.world.EnumDifficulty difficulty ^net.minecraft.profiler.Profiler profiler-in]
    (new WorldClient net-handler settings dimension difficulty profiler-in)))

(defn add-entity-to-world
  "entity-id - `int`
  entity-to-spawn - `net.minecraft.entity.Entity`"
  ([^WorldClient this ^Integer entity-id ^net.minecraft.entity.Entity entity-to-spawn]
    (-> this (.addEntityToWorld entity-id entity-to-spawn))))

(defn tick
  ""
  ([^WorldClient this]
    (-> this (.tick))))

(defn do-pre-chunk
  "chunk-x - `int`
  chunk-z - `int`
  load-chunk - `boolean`"
  ([^WorldClient this ^Integer chunk-x ^Integer chunk-z ^Boolean load-chunk]
    (-> this (.doPreChunk chunk-x chunk-z load-chunk))))

(defn get-entity-by-id
  "id - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^WorldClient this ^Integer id]
    (-> this (.getEntityByID id))))

(defn on-entity-added
  "entity-in - `net.minecraft.entity.Entity`"
  ([^WorldClient this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityAdded entity-in))))

(defn make-fireworks
  "x - `double`
  y - `double`
  z - `double`
  motion-x - `double`
  motion-y - `double`
  motion-z - `double`
  compund - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldClient this ^Double x ^Double y ^Double z ^Double motion-x ^Double motion-y ^Double motion-z ^net.minecraft.nbt.NBTTagCompound compund]
    (-> this (.makeFireworks x y z motion-x motion-y motion-z compund))))

(defn spawn-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^WorldClient this ^net.minecraft.entity.Entity entity-in]
    (-> this (.spawnEntity entity-in))))

(defn invalidate-block-receive-region
  "x-1 - `int`
  y-1 - `int`
  z-1 - `int`
  x-2 - `int`
  y-2 - `int`
  z-2 - `int`"
  ([^WorldClient this ^Integer x-1 ^Integer y-1 ^Integer z-1 ^Integer x-2 ^Integer y-2 ^Integer z-2]
    (-> this (.invalidateBlockReceiveRegion x-1 y-1 z-1 x-2 y-2 z-2))))

(defn set-world-time
  "time - `long`"
  ([^WorldClient this ^Long time]
    (-> this (.setWorldTime time))))

(defn get-chunk-provider
  "returns: `net.minecraft.client.multiplayer.ChunkProviderClient`"
  (^net.minecraft.client.multiplayer.ChunkProviderClient [^WorldClient this]
    (-> this (.getChunkProvider))))

(defn remove-all-entities
  ""
  ([^WorldClient this]
    (-> this (.removeAllEntities))))

(defn do-void-fog-particles
  "pos-x - `int`
  pos-y - `int`
  pos-z - `int`"
  ([^WorldClient this ^Integer pos-x ^Integer pos-y ^Integer pos-z]
    (-> this (.doVoidFogParticles pos-x pos-y pos-z))))

(defn add-world-info-to-crash-report
  "report - `net.minecraft.crash.CrashReport`

  returns: `net.minecraft.crash.CrashReportCategory`"
  (^net.minecraft.crash.CrashReportCategory [^WorldClient this ^net.minecraft.crash.CrashReport report]
    (-> this (.addWorldInfoToCrashReport report))))

(defn show-barrier-particles
  "p-184153-1 - `int`
  p-184153-2 - `int`
  p-184153-3 - `int`
  p-184153-4 - `int`
  random - `java.util.Random`
  p-184153-6 - `boolean`
  pos - `net.minecraft.util.math.BlockPos$MutableBlockPos`"
  ([^WorldClient this ^Integer p-184153-1 ^Integer p-184153-2 ^Integer p-184153-3 ^Integer p-184153-4 ^java.util.Random random ^Boolean p-184153-6 ^net.minecraft.util.math.BlockPos$MutableBlockPos pos]
    (-> this (.showBarrierParticles p-184153-1 p-184153-2 p-184153-3 p-184153-4 random p-184153-6 pos))))

(defn send-quitting-disconnecting-packet
  ""
  ([^WorldClient this]
    (-> this (.sendQuittingDisconnectingPacket))))

(defn on-entity-removed
  "entity-in - `net.minecraft.entity.Entity`"
  ([^WorldClient this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityRemoved entity-in))))

(defn remove-entity-from-world
  "entity-id - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^WorldClient this ^Integer entity-id]
    (-> this (.removeEntityFromWorld entity-id))))

(defn invalidate-region-and-set-block
  "Deprecated.

  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^WorldClient this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.invalidateRegionAndSetBlock pos state))))

(defn remove-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^WorldClient this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntity entity-in))))

(defn set-world-scoreboard
  "scoreboard-in - `net.minecraft.scoreboard.Scoreboard`"
  ([^WorldClient this ^net.minecraft.scoreboard.Scoreboard scoreboard-in]
    (-> this (.setWorldScoreboard scoreboard-in))))

(defn play-sound
  "player - `net.minecraft.entity.player.EntityPlayer`
  x - `double`
  y - `double`
  z - `double`
  sound-in - `net.minecraft.util.SoundEvent`
  category - `net.minecraft.util.SoundCategory`
  volume - `float`
  pitch - `float`"
  ([^WorldClient this ^net.minecraft.entity.player.EntityPlayer player ^Double x ^Double y ^Double z ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category ^Float volume ^Float pitch]
    (-> this (.playSound player x y z sound-in category volume pitch)))
  ([^WorldClient this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category ^Float volume ^Float pitch ^Boolean distance-delay]
    (-> this (.playSound pos sound-in category volume pitch distance-delay))))

(defn send-packet-to-server
  "packet-in - `net.minecraft.network.Packet`"
  ([^WorldClient this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacketToServer packet-in))))

