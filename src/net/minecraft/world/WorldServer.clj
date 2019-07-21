(ns net.minecraft.world.WorldServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldServer]))

(defn ->world-server
  "Constructor.

  server - `net.minecraft.server.MinecraftServer`
  save-handler-in - `net.minecraft.world.storage.ISaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`
  dimension-id - `int`
  profiler-in - `net.minecraft.profiler.Profiler`"
  (^WorldServer [^net.minecraft.server.MinecraftServer server ^net.minecraft.world.storage.ISaveHandler save-handler-in ^net.minecraft.world.storage.WorldInfo info ^Integer dimension-id ^net.minecraft.profiler.Profiler profiler-in]
    (new WorldServer server save-handler-in info dimension-id profiler-in)))

(defn disable-level-saving
  "Instance Field.

  type: boolean"
  (^Boolean [^WorldServer this]
    (-> this .-disableLevelSaving)))

(defn custom-teleporters
  "Instance Field.

  type: java.util.List<net.minecraft.world.Teleporter>"
  (^java.util.List [^WorldServer this]
    (-> this .-customTeleporters)))

(defn block-modifiable?
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockModifiable player pos))))

(defn set-initial-spawn-location
  ""
  ([^WorldServer this]
    (-> this (.setInitialSpawnLocation))))

(defn tick
  ""
  ([^WorldServer this]
    (-> this (.tick))))

(defn get-spawn-coordinate
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldServer this]
    (-> this (.getSpawnCoordinate))))

(defn tick-updates
  "p-72955-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^Boolean p-72955-1]
    (-> this (.tickUpdates p-72955-1))))

(defn on-entity-added
  "entity-in - `net.minecraft.entity.Entity`"
  ([^WorldServer this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityAdded entity-in))))

(defn set-entity-state
  "entity-in - `net.minecraft.entity.Entity`
  state - `byte`"
  ([^WorldServer this ^net.minecraft.entity.Entity entity-in ^Byte state]
    (-> this (.setEntityState entity-in state))))

(defn load-entities
  "entity-collection - `java.util.Collection`"
  ([^WorldServer this ^java.util.Collection entity-collection]
    (-> this (.loadEntities entity-collection))))

(defn update-entities
  ""
  ([^WorldServer this]
    (-> this (.updateEntities))))

(defn flush
  ""
  ([^WorldServer this]
    (-> this (.flush))))

(defn add-scheduled-task
  "runnable-to-schedule - `java.lang.Runnable`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^WorldServer this ^java.lang.Runnable runnable-to-schedule]
    (-> this (.addScheduledTask runnable-to-schedule))))

(defn are-all-players-asleep
  "returns: `boolean`"
  (^Boolean [^WorldServer this]
    (-> this (.areAllPlayersAsleep))))

(defn spawn-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.entity.Entity entity-in]
    (-> this (.spawnEntity entity-in))))

(defn save-chunk-data
  ""
  ([^WorldServer this]
    (-> this (.saveChunkData))))

(defn new-explosion
  "entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  strength - `float`
  is-flaming - `boolean`
  is-smoking - `boolean`

  returns: `net.minecraft.world.Explosion`"
  (^net.minecraft.world.Explosion [^WorldServer this ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float strength ^Boolean is-flaming ^Boolean is-smoking]
    (-> this (.newExplosion entity-in x y z strength is-flaming is-smoking))))

(defn get-pending-block-updates
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  p-72920-2 - `boolean`

  returns: `java.util.List<net.minecraft.world.NextTickListEntry>`"
  (^java.util.List [^WorldServer this ^net.minecraft.world.chunk.Chunk chunk-in ^Boolean p-72920-2]
    (-> this (.getPendingBlockUpdates chunk-in p-72920-2))))

(defn add-block-event
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  event-id - `int`
  event-param - `int`"
  ([^WorldServer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer event-id ^Integer event-param]
    (-> this (.addBlockEvent pos block-in event-id event-param))))

(defn can-creature-type-spawn-here?
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  spawn-list-entry - `net.minecraft.world.biome.Biome$SpawnListEntry`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.world.biome.Biome$SpawnListEntry spawn-list-entry ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canCreatureTypeSpawnHere creature-type spawn-list-entry pos))))

(defn get-chunk-provider
  "returns: `net.minecraft.world.gen.ChunkProviderServer`"
  (^net.minecraft.world.gen.ChunkProviderServer [^WorldServer this]
    (-> this (.getChunkProvider))))

(defn get-entity-from-uuid
  "uuid - `java.util.UUID`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^WorldServer this ^java.util.UUID uuid]
    (-> this (.getEntityFromUuid uuid))))

(defn block-tick-pending?
  "pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type]
    (-> this (.isBlockTickPending pos block-type))))

(defn get-entity-tracker
  "returns: `net.minecraft.entity.EntityTracker`"
  (^net.minecraft.entity.EntityTracker [^WorldServer this]
    (-> this (.getEntityTracker))))

(defn schedule-update
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  delay - `int`"
  ([^WorldServer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer delay]
    (-> this (.scheduleUpdate pos block-in delay))))

(defn add-weather-effect
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.entity.Entity entity-in]
    (-> this (.addWeatherEffect entity-in))))

(defn update-entity-with-optional-force
  "entity-in - `net.minecraft.entity.Entity`
  force-update - `boolean`"
  ([^WorldServer this ^net.minecraft.entity.Entity entity-in ^Boolean force-update]
    (-> this (.updateEntityWithOptionalForce entity-in force-update))))

(defn initialize
  "settings - `net.minecraft.world.WorldSettings`"
  ([^WorldServer this ^net.minecraft.world.WorldSettings settings]
    (-> this (.initialize settings))))

(defn update-scheduled?
  "pos - `net.minecraft.util.math.BlockPos`
  blk - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block blk]
    (-> this (.isUpdateScheduled pos blk))))

(defn on-entity-removed
  "entity-in - `net.minecraft.entity.Entity`"
  ([^WorldServer this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityRemoved entity-in))))

(defn find-nearest-structure
  "p-190528-1 - `java.lang.String`
  p-190528-2 - `net.minecraft.util.math.BlockPos`
  p-190528-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldServer this ^java.lang.String p-190528-1 ^net.minecraft.util.math.BlockPos p-190528-2 ^Boolean p-190528-3]
    (-> this (.findNearestStructure p-190528-1 p-190528-2 p-190528-3))))

(defn init
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^WorldServer this]
    (-> this (.init))))

(defn get-spawn-list-entry-for-type-at
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome$SpawnListEntry`"
  (^net.minecraft.world.biome.Biome$SpawnListEntry [^WorldServer this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getSpawnListEntryForTypeAt creature-type pos))))

(defn update-block-tick
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  delay - `int`
  priority - `int`"
  ([^WorldServer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer delay ^Integer priority]
    (-> this (.updateBlockTick pos block-in delay priority))))

(defn schedule-block-update
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  delay - `int`
  priority - `int`"
  ([^WorldServer this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer delay ^Integer priority]
    (-> this (.scheduleBlockUpdate pos block-in delay priority))))

(defn calling-from-minecraft-thread?
  "returns: `boolean`"
  (^Boolean [^WorldServer this]
    (-> this (.isCallingFromMinecraftThread))))

(defn spawn-particle
  "player - `net.minecraft.entity.player.EntityPlayerMP`
  particle - `net.minecraft.util.EnumParticleTypes`
  long-distance - `boolean`
  x - `double`
  y - `double`
  z - `double`
  count - `int`
  x-offset - `double`
  y-offset - `double`
  z-offset - `double`
  speed - `double`
  arguments - `int`"
  ([^WorldServer this ^net.minecraft.entity.player.EntityPlayerMP player ^net.minecraft.util.EnumParticleTypes particle ^Boolean long-distance ^Double x ^Double y ^Double z ^Integer count ^Double x-offset ^Double y-offset ^Double z-offset ^Double speed ^Integer arguments]
    (-> this (.spawnParticle player particle long-distance x y z count x-offset y-offset z-offset speed arguments)))
  ([^WorldServer this ^net.minecraft.util.EnumParticleTypes particle-type ^Boolean long-distance ^Double x-coord ^Double y-coord ^Double z-coord ^Integer number-of-particles ^Double x-offset ^Double y-offset ^Double z-offset ^Double particle-speed ^Integer particle-arguments]
    (-> this (.spawnParticle particle-type long-distance x-coord y-coord z-coord number-of-particles x-offset y-offset z-offset particle-speed particle-arguments)))
  ([^WorldServer this ^net.minecraft.util.EnumParticleTypes particle-type ^Double x-coord ^Double y-coord ^Double z-coord ^Integer number-of-particles ^Double x-offset ^Double y-offset ^Double z-offset ^Double particle-speed ^Integer particle-arguments]
    (-> this (.spawnParticle particle-type x-coord y-coord z-coord number-of-particles x-offset y-offset z-offset particle-speed particle-arguments))))

(defn get-structure-template-manager
  "returns: `net.minecraft.world.gen.structure.template.TemplateManager`"
  (^net.minecraft.world.gen.structure.template.TemplateManager [^WorldServer this]
    (-> this (.getStructureTemplateManager))))

(defn reset-update-entity-tick
  ""
  ([^WorldServer this]
    (-> this (.resetUpdateEntityTick))))

(defn get-minecraft-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^WorldServer this]
    (-> this (.getMinecraftServer))))

(defn get-chunk-save-location
  "returns: `java.io.File`"
  (^java.io.File [^WorldServer this]
    (-> this (.getChunkSaveLocation))))

(defn get-player-chunk-map
  "returns: `net.minecraft.server.management.PlayerChunkMap`"
  (^net.minecraft.server.management.PlayerChunkMap [^WorldServer this]
    (-> this (.getPlayerChunkMap))))

(defn can-mine-block-body?
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldServer this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canMineBlockBody player pos))))

(defn get-default-teleporter
  "returns: `net.minecraft.world.Teleporter`"
  (^net.minecraft.world.Teleporter [^WorldServer this]
    (-> this (.getDefaultTeleporter))))

(defn save-all-chunks
  "p-73044-1 - `boolean`
  progress-callback - `net.minecraft.util.IProgressUpdate`

  throws: net.minecraft.world.MinecraftException"
  ([^WorldServer this ^Boolean p-73044-1 ^net.minecraft.util.IProgressUpdate progress-callback]
    (-> this (.saveAllChunks p-73044-1 progress-callback))))

(defn update-all-players-sleeping-flag
  ""
  ([^WorldServer this]
    (-> this (.updateAllPlayersSleepingFlag))))

