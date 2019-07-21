(ns net.minecraft.world.gen.ChunkProviderServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderServer]))

(defn ->chunk-provider-server
  "Constructor.

  world-obj-in - `net.minecraft.world.WorldServer`
  chunk-loader-in - `net.minecraft.world.chunk.storage.IChunkLoader`
  chunk-generator-in - `net.minecraft.world.chunk.IChunkGenerator`"
  (^ChunkProviderServer [^net.minecraft.world.WorldServer world-obj-in ^net.minecraft.world.chunk.storage.IChunkLoader chunk-loader-in ^net.minecraft.world.chunk.IChunkGenerator chunk-generator-in]
    (new ChunkProviderServer world-obj-in chunk-loader-in chunk-generator-in)))

(defn chunk-generator
  "Instance Constant.

  type: net.minecraft.world.chunk.IChunkGenerator"
  (^net.minecraft.world.chunk.IChunkGenerator [^ChunkProviderServer this]
    (-> this .-chunkGenerator)))

(defn chunk-loader
  "Instance Constant.

  type: net.minecraft.world.chunk.storage.IChunkLoader"
  (^net.minecraft.world.chunk.storage.IChunkLoader [^ChunkProviderServer this]
    (-> this .-chunkLoader)))

(defn id-2-chunk-map
  "Instance Constant.

  type: it.unimi.dsi.fastutil.longs.Long2ObjectMap<net.minecraft.world.chunk.Chunk>"
  (^it.unimi.dsi.fastutil.longs.Long2ObjectMap [^ChunkProviderServer this]
    (-> this .-id2ChunkMap)))

(defn world
  "Instance Constant.

  type: net.minecraft.world.WorldServer"
  (^net.minecraft.world.WorldServer [^ChunkProviderServer this]
    (-> this .-world)))

(defn get-loaded-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderServer this ^Integer x ^Integer z]
    (-> this (.getLoadedChunk x z))))

(defn tick
  "returns: `boolean`"
  (^Boolean [^ChunkProviderServer this]
    (-> this (.tick))))

(defn get-loaded-chunks
  "returns: `java.util.Collection<net.minecraft.world.chunk.Chunk>`"
  (^java.util.Collection [^ChunkProviderServer this]
    (-> this (.getLoadedChunks))))

(defn unload
  "chunk-in - `net.minecraft.world.chunk.Chunk`"
  ([^ChunkProviderServer this ^net.minecraft.world.chunk.Chunk chunk-in]
    (-> this (.unload chunk-in))))

(defn chunk-exists
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderServer this ^Integer x ^Integer z]
    (-> this (.chunkExists x z))))

(defn load-chunk
  "x - `int`
  z - `int`
  runnable - `java.lang.Runnable`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderServer this ^Integer x ^Integer z ^java.lang.Runnable runnable]
    (-> this (.loadChunk x z runnable)))
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderServer this ^Integer x ^Integer z]
    (-> this (.loadChunk x z))))

(defn get-stronghold-gen
  "world-in - `net.minecraft.world.World`
  structure-name - `java.lang.String`
  position - `net.minecraft.util.math.BlockPos`
  p-180513-4 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ChunkProviderServer this ^net.minecraft.world.World world-in ^java.lang.String structure-name ^net.minecraft.util.math.BlockPos position ^Boolean p-180513-4]
    (-> this (.getStrongholdGen world-in structure-name position p-180513-4))))

(defn unload-all-chunks
  ""
  ([^ChunkProviderServer this]
    (-> this (.unloadAllChunks))))

(defn save-extra-data
  ""
  ([^ChunkProviderServer this]
    (-> this (.saveExtraData))))

(defn save-chunks
  "p-186027-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^ChunkProviderServer this ^Boolean p-186027-1]
    (-> this (.saveChunks p-186027-1))))

(defn chunk-generated-at?
  "p-191062-1 - `int`
  p-191062-2 - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderServer this ^Integer p-191062-1 ^Integer p-191062-2]
    (-> this (.isChunkGeneratedAt p-191062-1 p-191062-2))))

(defn get-loaded-chunk-count
  "returns: `int`"
  (^Integer [^ChunkProviderServer this]
    (-> this (.getLoadedChunkCount))))

(defn make-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChunkProviderServer this]
    (-> this (.makeString))))

(defn get-possible-creatures
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^ChunkProviderServer this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPossibleCreatures creature-type pos))))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderServer this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn can-save?
  "returns: `boolean`"
  (^Boolean [^ChunkProviderServer this]
    (-> this (.canSave))))

