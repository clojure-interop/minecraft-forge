(ns net.minecraft.world.chunk.Chunk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk Chunk]))

(defn ->chunk
  "Constructor.

  world-in - `net.minecraft.world.World`
  primer - `net.minecraft.world.chunk.ChunkPrimer`
  x - `int`
  z - `int`"
  (^Chunk [^net.minecraft.world.World world-in ^net.minecraft.world.chunk.ChunkPrimer primer ^Integer x ^Integer z]
    (new Chunk world-in primer x z))
  (^Chunk [^net.minecraft.world.World world-in ^Integer x ^Integer z]
    (new Chunk world-in x z)))

(def *-null-block-storage
  "Static Constant.

  type: net.minecraft.world.chunk.storage.ExtendedBlockStorage"
  Chunk/NULL_BLOCK_STORAGE)

(defn x-position
  "Instance Constant.

  type: int"
  (^Integer [^Chunk this]
    (-> this .-xPosition)))

(defn z-position
  "Instance Constant.

  type: int"
  (^Integer [^Chunk this]
    (-> this .-zPosition)))

(defn unloaded
  "Instance Field.

  type: boolean"
  (^Boolean [^Chunk this]
    (-> this .-unloaded)))

(defn set-biome-array
  "biome-array - `byte[]`"
  ([^Chunk this biome-array]
    (-> this (.setBiomeArray biome-array))))

(defn fill-chunk
  "buf - `net.minecraft.network.PacketBuffer`
  p-186033-2 - `int`
  p-186033-3 - `boolean`"
  ([^Chunk this ^net.minecraft.network.PacketBuffer buf ^Integer p-186033-2 ^Boolean p-186033-3]
    (-> this (.fillChunk buf p-186033-2 p-186033-3))))

(defn set-terrain-populated
  "terrain-populated - `boolean`"
  ([^Chunk this ^Boolean terrain-populated]
    (-> this (.setTerrainPopulated terrain-populated))))

(defn set-has-entities
  "has-entities-in - `boolean`"
  ([^Chunk this ^Boolean has-entities-in]
    (-> this (.setHasEntities has-entities-in))))

(defn loaded?
  "returns: `boolean`"
  (^Boolean [^Chunk this]
    (-> this (.isLoaded))))

(defn set-inhabited-time
  "new-inhabited-time - `long`"
  ([^Chunk this ^Long new-inhabited-time]
    (-> this (.setInhabitedTime new-inhabited-time))))

(defn get-light-subtracted
  "pos - `net.minecraft.util.math.BlockPos`
  amount - `int`

  returns: `int`"
  (^Integer [^Chunk this ^net.minecraft.util.math.BlockPos pos ^Integer amount]
    (-> this (.getLightSubtracted pos amount))))

(defn get-inhabited-time
  "returns: `long`"
  (^Long [^Chunk this]
    (-> this (.getInhabitedTime))))

(defn terrain-populated?
  "returns: `boolean`"
  (^Boolean [^Chunk this]
    (-> this (.isTerrainPopulated))))

(defn get-precipitation-height
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPrecipitationHeight pos))))

(defn get-height-map
  "returns: `int[]`"
  ([^Chunk this]
    (-> this (.getHeightMap))))

(defn light-populated?
  "returns: `boolean`"
  (^Boolean [^Chunk this]
    (-> this (.isLightPopulated))))

(defn get-entities-within-aabb-for-entity
  "entity-in - `net.minecraft.entity.Entity`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  list-to-fill - `java.util.List`
  p-177414-4 - `com.google.common.base.Predicate`"
  ([^Chunk this ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.AxisAlignedBB aabb ^java.util.List list-to-fill ^com.google.common.base.Predicate p-177414-4]
    (-> this (.getEntitiesWithinAABBForEntity entity-in aabb list-to-fill p-177414-4))))

(defn set-light-populated
  "light-populated - `boolean`"
  ([^Chunk this ^Boolean light-populated]
    (-> this (.setLightPopulated light-populated))))

(defn get-block-storage-array
  "returns: `net.minecraft.world.chunk.storage.ExtendedBlockStorage[]`"
  ([^Chunk this]
    (-> this (.getBlockStorageArray))))

(defn get-entity-lists
  "returns: `net.minecraft.util.ClassInheritanceMultiMap<net.minecraft.entity.Entity>[]`"
  ([^Chunk this]
    (-> this (.getEntityLists))))

(defn reset-relight-checks
  ""
  ([^Chunk this]
    (-> this (.resetRelightChecks))))

(defn chunk-ticked?
  "returns: `boolean`"
  (^Boolean [^Chunk this]
    (-> this (.isChunkTicked))))

(defn get-tile-entity-map
  "returns: `java.util.Map<net.minecraft.util.math.BlockPos,net.minecraft.tileentity.TileEntity>`"
  (^java.util.Map [^Chunk this]
    (-> this (.getTileEntityMap))))

(defn get-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`
  p-177424-2 - `net.minecraft.world.chunk.Chunk$EnumCreateEntityType`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^Chunk this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.chunk.Chunk$EnumCreateEntityType p-177424-2]
    (-> this (.getTileEntity pos p-177424-2))))

(defn needs-saving
  "p-76601-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^Chunk this ^Boolean p-76601-1]
    (-> this (.needsSaving p-76601-1))))

(defn remove-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.removeTileEntity pos))))

(defn get-biome-array
  "returns: `byte[]`"
  ([^Chunk this]
    (-> this (.getBiomeArray))))

(defn set-height-map
  "new-height-map - `int[]`"
  ([^Chunk this new-height-map]
    (-> this (.setHeightMap new-height-map))))

(defn get-biome
  "pos - `net.minecraft.util.math.BlockPos`
  provider - `net.minecraft.world.biome.BiomeProvider`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^Chunk this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.biome.BiomeProvider provider]
    (-> this (.getBiome pos provider))))

(defn get-lowest-height
  "returns: `int`"
  (^Integer [^Chunk this]
    (-> this (.getLowestHeight))))

(defn on-tick
  "p-150804-1 - `boolean`"
  ([^Chunk this ^Boolean p-150804-1]
    (-> this (.onTick p-150804-1))))

(defn get-block-state
  "x - `int`
  y - `int`
  z - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Chunk this ^Integer x ^Integer y ^Integer z]
    (-> this (.getBlockState x y z)))
  (^net.minecraft.block.state.IBlockState [^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockState pos))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^Chunk this]
    (-> this (.getWorld))))

(defn set-last-save-time
  "save-time - `long`"
  ([^Chunk this ^Long save-time]
    (-> this (.setLastSaveTime save-time))))

(defn get-random-with-seed
  "seed - `long`

  returns: `java.util.Random`"
  (^java.util.Random [^Chunk this ^Long seed]
    (-> this (.getRandomWithSeed seed))))

(defn get-top-filled-segment
  "returns: `int`"
  (^Integer [^Chunk this]
    (-> this (.getTopFilledSegment))))

(defn get-height
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getHeight pos))))

(defn set-chunk-modified
  ""
  ([^Chunk this]
    (-> this (.setChunkModified))))

(defn get-height-value
  "x - `int`
  z - `int`

  returns: `int`"
  (^Integer [^Chunk this ^Integer x ^Integer z]
    (-> this (.getHeightValue x z))))

(defn on-chunk-load
  ""
  ([^Chunk this]
    (-> this (.onChunkLoad))))

(defn generate-skylight-map
  ""
  ([^Chunk this]
    (-> this (.generateSkylightMap))))

(defn set-storage-arrays
  "new-storage-arrays - `net.minecraft.world.chunk.storage.ExtendedBlockStorage[]`"
  ([^Chunk this new-storage-arrays]
    (-> this (.setStorageArrays new-storage-arrays))))

(defn add-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^Chunk this ^net.minecraft.entity.Entity entity-in]
    (-> this (.addEntity entity-in))))

(defn remove-invalid-tile-entity
  "Removes the tile entity at the specified position, only if it's
   marked as invalid.

  pos - `net.minecraft.util.math.BlockPos`"
  ([^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.removeInvalidTileEntity pos))))

(defn add-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`
  tile-entity-in - `net.minecraft.tileentity.TileEntity`"
  ([^Chunk this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.addTileEntity pos tile-entity-in)))
  ([^Chunk this ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.addTileEntity tile-entity-in))))

(defn get-block-light-opacity
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockLightOpacity pos))))

(defn get-entities-of-type-within-aaab
  "entity-class - `java.lang.Class`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  list-to-fill - `java.util.List`
  filter - `com.google.common.base.Predicate`

  returns: `<T extends net.minecraft.entity.Entity> void`"
  ([^Chunk this ^java.lang.Class entity-class ^net.minecraft.util.math.AxisAlignedBB aabb ^java.util.List list-to-fill ^com.google.common.base.Predicate filter]
    (-> this (.getEntitiesOfTypeWithinAAAB entity-class aabb list-to-fill filter))))

(defn set-chunk-loaded
  "loaded - `boolean`"
  ([^Chunk this ^Boolean loaded]
    (-> this (.setChunkLoaded loaded))))

(defn populate-chunk
  "chunk-provider - `net.minecraft.world.chunk.IChunkProvider`
  chunk-genrator - `net.minecraft.world.chunk.IChunkGenerator`"
  ([^Chunk this ^net.minecraft.world.chunk.IChunkProvider chunk-provider ^net.minecraft.world.chunk.IChunkGenerator chunk-genrator]
    (-> this (.populateChunk chunk-provider chunk-genrator))))

(defn on-chunk-unload
  ""
  ([^Chunk this]
    (-> this (.onChunkUnload))))

(defn get-are-levels-empty?
  "start-y - `int`
  end-y - `int`

  returns: `boolean`"
  (^Boolean [^Chunk this ^Integer start-y ^Integer end-y]
    (-> this (.getAreLevelsEmpty start-y end-y))))

(defn set-modified
  "modified - `boolean`"
  ([^Chunk this ^Boolean modified]
    (-> this (.setModified modified))))

(defn get-pos
  "returns: `net.minecraft.util.math.ChunkPos`"
  (^net.minecraft.util.math.ChunkPos [^Chunk this]
    (-> this (.getPos))))

(defn set-block-state
  "pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Chunk this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.setBlockState pos state))))

(defn populated?
  "returns: `boolean`"
  (^Boolean [^Chunk this]
    (-> this (.isPopulated))))

(defn remove-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^Chunk this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntity entity-in))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^Chunk this]
    (-> this (.isEmpty))))

(defn enqueue-relight-checks
  ""
  ([^Chunk this]
    (-> this (.enqueueRelightChecks))))

(defn can-see-sky?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^Chunk this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canSeeSky pos))))

(defn set-light-for
  "p-177431-1 - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`
  value - `int`"
  ([^Chunk this ^net.minecraft.world.EnumSkyBlock p-177431-1 ^net.minecraft.util.math.BlockPos pos ^Integer value]
    (-> this (.setLightFor p-177431-1 pos value))))

(defn at-location?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^Chunk this ^Integer x ^Integer z]
    (-> this (.isAtLocation x z))))

(defn remove-entity-at-index
  "entity-in - `net.minecraft.entity.Entity`
  index - `int`"
  ([^Chunk this ^net.minecraft.entity.Entity entity-in ^Integer index]
    (-> this (.removeEntityAtIndex entity-in index))))

(defn get-light-for
  "p-177413-1 - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^Chunk this ^net.minecraft.world.EnumSkyBlock p-177413-1 ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightFor p-177413-1 pos))))

(defn check-light
  ""
  ([^Chunk this]
    (-> this (.checkLight))))

