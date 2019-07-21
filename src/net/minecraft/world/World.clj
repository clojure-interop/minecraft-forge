(ns net.minecraft.world.World
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world World]))

(defn *-max-entity-radius
  "Static Field.

  Used in the getEntitiesWithinAABB functions to expand the search area for entities.
   Modders should change this variable to a higher value if it is less then the radius
   of one of there entities.

  type: double"
  []
  World/MAX_ENTITY_RADIUS)

(defn loaded-entity-list
  "Instance Constant.

  type: java.util.List<net.minecraft.entity.Entity>"
  (^java.util.List [^World this]
    (-> this .-loadedEntityList)))

(defn loaded-tile-entity-list
  "Instance Constant.

  type: java.util.List<net.minecraft.tileentity.TileEntity>"
  (^java.util.List [^World this]
    (-> this .-loadedTileEntityList)))

(defn tickable-tile-entities
  "Instance Constant.

  type: java.util.List<net.minecraft.tileentity.TileEntity>"
  (^java.util.List [^World this]
    (-> this .-tickableTileEntities)))

(defn player-entities
  "Instance Constant.

  type: java.util.List<net.minecraft.entity.player.EntityPlayer>"
  (^java.util.List [^World this]
    (-> this .-playerEntities)))

(defn weather-effects
  "Instance Constant.

  type: java.util.List<net.minecraft.entity.Entity>"
  (^java.util.List [^World this]
    (-> this .-weatherEffects)))

(defn prev-raining-strength
  "Instance Field.

  type: float"
  (^Float [^World this]
    (-> this .-prevRainingStrength)))

(defn raining-strength
  "Instance Field.

  type: float"
  (^Float [^World this]
    (-> this .-rainingStrength)))

(defn prev-thundering-strength
  "Instance Field.

  type: float"
  (^Float [^World this]
    (-> this .-prevThunderingStrength)))

(defn thundering-strength
  "Instance Field.

  type: float"
  (^Float [^World this]
    (-> this .-thunderingStrength)))

(defn rand
  "Instance Constant.

  type: java.util.Random"
  (^java.util.Random [^World this]
    (-> this .-rand)))

(defn provider
  "Instance Constant.

  type: net.minecraft.world.WorldProvider"
  (^net.minecraft.world.WorldProvider [^World this]
    (-> this .-provider)))

(defn village-collection-obj
  "Instance Field.

  type: net.minecraft.village.VillageCollection"
  (^net.minecraft.village.VillageCollection [^World this]
    (-> this .-villageCollectionObj)))

(defn the-profiler
  "Instance Constant.

  type: net.minecraft.profiler.Profiler"
  (^net.minecraft.profiler.Profiler [^World this]
    (-> this .-theProfiler)))

(defn is-remote
  "Instance Constant.

  type: boolean"
  (^Boolean [^World this]
    (-> this .-isRemote)))

(defn restoring-block-snapshots
  "Instance Field.

  type: boolean"
  (^Boolean [^World this]
    (-> this .-restoringBlockSnapshots)))

(defn capture-block-snapshots
  "Instance Field.

  type: boolean"
  (^Boolean [^World this]
    (-> this .-captureBlockSnapshots)))

(defn captured-block-snapshots
  "Instance Field.

  type: java.util.ArrayList<net.minecraftforge.common.util.BlockSnapshot>"
  (^java.util.ArrayList [^World this]
    (-> this .-capturedBlockSnapshots)))

(defn get-actual-height
  "returns: `int`"
  (^Integer [^World this]
    (-> this (.getActualHeight))))

(defn get-moon-phase
  "returns: `int`"
  (^Integer [^World this]
    (-> this (.getMoonPhase))))

(defn block-modifiable?
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockModifiable player pos))))

(defn unload-entities
  "entity-collection - `java.util.Collection`"
  ([^World this ^java.util.Collection entity-collection]
    (-> this (.unloadEntities entity-collection))))

(defn set-initial-spawn-location
  ""
  ([^World this]
    (-> this (.setInitialSpawnLocation))))

(defn get-horizon
  "returns: `double`"
  (^Double [^World this]
    (-> this (.getHorizon))))

(defn load-data
  "clazz - `java.lang.Class`
  data-id - `java.lang.String`

  returns: `net.minecraft.world.WorldSavedData`"
  (^net.minecraft.world.WorldSavedData [^World this ^java.lang.Class clazz ^java.lang.String data-id]
    (-> this (.loadData clazz data-id))))

(defn set-data
  "data-id - `java.lang.String`
  world-saved-data-in - `net.minecraft.world.WorldSavedData`"
  ([^World this ^java.lang.String data-id ^net.minecraft.world.WorldSavedData world-saved-data-in]
    (-> this (.setData data-id world-saved-data-in))))

(defn mark-block-range-for-render-update
  "x-1 - `int`
  y-1 - `int`
  z-1 - `int`
  x-2 - `int`
  y-2 - `int`
  z-2 - `int`"
  ([^World this ^Integer x-1 ^Integer y-1 ^Integer z-1 ^Integer x-2 ^Integer y-2 ^Integer z-2]
    (-> this (.markBlockRangeForRenderUpdate x-1 y-1 z-1 x-2 y-2 z-2)))
  ([^World this ^net.minecraft.util.math.BlockPos range-min ^net.minecraft.util.math.BlockPos range-max]
    (-> this (.markBlockRangeForRenderUpdate range-min range-max))))

(defn get-unique-data-id
  "key - `java.lang.String`

  returns: `int`"
  (^Integer [^World this ^java.lang.String key]
    (-> this (.getUniqueDataId key))))

(defn tick
  ""
  ([^World this]
    (-> this (.tick))))

(defn get-chunks-lowest-horizon
  "Deprecated.

  x - `int`
  z - `int`

  returns: `int`"
  (^Integer [^World this ^Integer x ^Integer z]
    (-> this (.getChunksLowestHorizon x z))))

(defn can-block-freeze-no-water?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canBlockFreezeNoWater pos))))

(defn get-block-density
  "vec - `net.minecraft.util.math.Vec3d`
  bb - `net.minecraft.util.math.AxisAlignedBB`

  returns: `float`"
  (^Float [^World this ^net.minecraft.util.math.Vec3d vec ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.getBlockDensity vec bb))))

(defn get-collision-boxes
  "entity-in - `net.minecraft.entity.Entity`
  aabb - `net.minecraft.util.math.AxisAlignedBB`

  returns: `java.util.List<net.minecraft.util.math.AxisAlignedBB>`"
  (^java.util.List [^World this ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.AxisAlignedBB aabb]
    (-> this (.getCollisionBoxes entity-in aabb))))

(defn may-place
  "p-190527-1 - `net.minecraft.block.Block`
  p-190527-2 - `net.minecraft.util.math.BlockPos`
  p-190527-3 - `boolean`
  p-190527-4 - `net.minecraft.util.EnumFacing`
  p-190527-5 - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.block.Block p-190527-1 ^net.minecraft.util.math.BlockPos p-190527-2 ^Boolean p-190527-3 ^net.minecraft.util.EnumFacing p-190527-4 ^net.minecraft.entity.Entity p-190527-5]
    (-> this (.mayPlace p-190527-1 p-190527-2 p-190527-3 p-190527-4 p-190527-5))))

(defn raining?
  "returns: `boolean`"
  (^Boolean [^World this]
    (-> this (.isRaining))))

(defn mark-tile-entity-for-removal
  "tile-entity-in - `net.minecraft.tileentity.TileEntity`"
  ([^World this ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.markTileEntityForRemoval tile-entity-in))))

(defn get-current-date
  "returns: `java.util.Calendar`"
  (^java.util.Calendar [^World this]
    (-> this (.getCurrentDate))))

(defn get-precipitation-height
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPrecipitationHeight pos))))

(defn set-random-seed
  "p-72843-1 - `int`
  p-72843-2 - `int`
  p-72843-3 - `int`

  returns: `java.util.Random`"
  (^java.util.Random [^World this ^Integer p-72843-1 ^Integer p-72843-2 ^Integer p-72843-3]
    (-> this (.setRandomSeed p-72843-1 p-72843-2 p-72843-3))))

(defn get-entity-by-id
  "id - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^World this ^Integer id]
    (-> this (.getEntityByID id))))

(defn notify-neighbors-of-state-except
  "pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`
  skip-side - `net.minecraft.util.EnumFacing`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type ^net.minecraft.util.EnumFacing skip-side]
    (-> this (.notifyNeighborsOfStateExcept pos block-type skip-side))))

(defn any-player-within-range-at?
  "x - `double`
  y - `double`
  z - `double`
  range - `double`

  returns: `boolean`"
  (^Boolean [^World this ^Double x ^Double y ^Double z ^Double range]
    (-> this (.isAnyPlayerWithinRangeAt x y z range))))

(defn tick-updates
  "p-72955-1 - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^Boolean p-72955-1]
    (-> this (.tickUpdates p-72955-1))))

(defn get-persistent-chunk-iterable
  "chunk-iterator - `java.util.Iterator`

  returns: `java.util.Iterator<net.minecraft.world.chunk.Chunk>`"
  (^java.util.Iterator [^World this ^java.util.Iterator chunk-iterator]
    (-> this (.getPersistentChunkIterable chunk-iterator))))

(defn spawn-always-visible-particle
  "p-190523-1 - `int`
  p-190523-2 - `double`
  p-190523-4 - `double`
  p-190523-6 - `double`
  p-190523-8 - `double`
  p-190523-10 - `double`
  p-190523-12 - `double`
  p-190523-14 - `int`"
  ([^World this ^Integer p-190523-1 ^Double p-190523-2 ^Double p-190523-4 ^Double p-190523-6 ^Double p-190523-8 ^Double p-190523-10 ^Double p-190523-12 ^Integer p-190523-14]
    (-> this (.spawnAlwaysVisibleParticle p-190523-1 p-190523-2 p-190523-4 p-190523-6 p-190523-8 p-190523-10 p-190523-12 p-190523-14))))

(defn spawn-chunk?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^World this ^Integer x ^Integer z]
    (-> this (.isSpawnChunk x z))))

(defn calculate-initial-weather-body
  ""
  ([^World this]
    (-> this (.calculateInitialWeatherBody))))

(defn on-entity-added
  "entity-in - `net.minecraft.entity.Entity`"
  ([^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityAdded entity-in))))

(defn get-light
  "pos - `net.minecraft.util.math.BlockPos`
  check-neighbors - `boolean`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean check-neighbors]
    (-> this (.getLight pos check-neighbors)))
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLight pos))))

(defn get-players
  "player-type - `java.lang.Class`
  filter - `com.google.common.base.Predicate`

  returns: `<T extends net.minecraft.entity.Entity> java.util.List<T>`"
  ([^World this ^java.lang.Class player-type ^com.google.common.base.Predicate filter]
    (-> this (.getPlayers player-type filter))))

(defn raining-at?
  "strike-position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos strike-position]
    (-> this (.isRainingAt strike-position))))

(defn calculate-initial-skylight
  ""
  ([^World this]
    (-> this (.calculateInitialSkylight))))

(defn block-full-cube?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockFullCube pos))))

(defn get-world-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^World this]
    (-> this (.getWorldType))))

(defn remove-event-listener
  "listener - `net.minecraft.world.IWorldEventListener`"
  ([^World this ^net.minecraft.world.IWorldEventListener listener]
    (-> this (.removeEventListener listener))))

(defn get-entities
  "entity-type - `java.lang.Class`
  filter - `com.google.common.base.Predicate`

  returns: `<T extends net.minecraft.entity.Entity> java.util.List<T>`"
  ([^World this ^java.lang.Class entity-type ^com.google.common.base.Predicate filter]
    (-> this (.getEntities entity-type filter))))

(defn get-sky-color-body
  "entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^World this ^net.minecraft.entity.Entity entity-in ^Float partial-ticks]
    (-> this (.getSkyColorBody entity-in partial-ticks))))

(defn get-celestial-angle
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getCelestialAngle partial-ticks))))

(defn count-entities
  "Returns a count of entities that classify themselves as the specified creature type.

  type - `net.minecraft.entity.EnumCreatureType`
  for-spawn-count - `boolean`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.entity.EnumCreatureType type ^Boolean for-spawn-count]
    (-> this (.countEntities type for-spawn-count)))
  (^Integer [^World this ^java.lang.Class entity-type]
    (-> this (.countEntities entity-type))))

(defn get-redstone-power
  "pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing]
    (-> this (.getRedstonePower pos facing))))

(defn notify-light-set
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.notifyLightSet pos))))

(defn neighbor-changed
  "pos - `net.minecraft.util.math.BlockPos`
  p-190524-2 - `net.minecraft.block.Block`
  p-190524-3 - `net.minecraft.util.math.BlockPos`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block p-190524-2 ^net.minecraft.util.math.BlockPos p-190524-3]
    (-> this (.neighborChanged pos p-190524-2 p-190524-3))))

(defn get-sea-level
  "returns: `int`"
  (^Integer [^World this]
    (-> this (.getSeaLevel))))

(defn mark-chunk-dirty
  "pos - `net.minecraft.util.math.BlockPos`
  unused-tile-entity - `net.minecraft.tileentity.TileEntity`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.tileentity.TileEntity unused-tile-entity]
    (-> this (.markChunkDirty pos unused-tile-entity))))

(defn get-sun-brightness-factor
  "The current sun brightness factor for this dimension.
   0.0f means no light at all, and 1.0f means maximum sunlight.
   Highly recommended for sunlight detection like solar panel.

  partial-ticks - `float`

  returns: The current brightness factor - `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getSunBrightnessFactor partial-ticks))))

(defn get-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTileEntity pos))))

(defn set-total-world-time
  "world-time - `long`"
  ([^World this ^Long world-time]
    (-> this (.setTotalWorldTime world-time))))

(defn set-block-to-air
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setBlockToAir pos))))

(defn check-block-collision
  "bb - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.checkBlockCollision bb))))

(defn remove-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.removeTileEntity pos))))

(defn set-entity-state
  "entity-in - `net.minecraft.entity.Entity`
  state - `byte`"
  ([^World this ^net.minecraft.entity.Entity entity-in ^Byte state]
    (-> this (.setEntityState entity-in state))))

(defn get-game-rules
  "returns: `net.minecraft.world.GameRules`"
  (^net.minecraft.world.GameRules [^World this]
    (-> this (.getGameRules))))

(defn get-entities-within-aabb
  "clazz - `java.lang.Class`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  filter - `com.google.common.base.Predicate`

  returns: `<T extends net.minecraft.entity.Entity> java.util.List<T>`"
  ([^World this ^java.lang.Class clazz ^net.minecraft.util.math.AxisAlignedBB aabb ^com.google.common.base.Predicate filter]
    (-> this (.getEntitiesWithinAABB clazz aabb filter)))
  ([^World this ^java.lang.Class class-entity ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.getEntitiesWithinAABB class-entity bb))))

(defn load-entities
  "entity-collection - `java.util.Collection`"
  ([^World this ^java.util.Collection entity-collection]
    (-> this (.loadEntities entity-collection))))

(defn can-snow-at?
  "pos - `net.minecraft.util.math.BlockPos`
  check-light - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean check-light]
    (-> this (.canSnowAt pos check-light))))

(defn update-entities
  ""
  ([^World this]
    (-> this (.updateEntities))))

(defn can-snow-at-body?
  "pos - `net.minecraft.util.math.BlockPos`
  check-light - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean check-light]
    (-> this (.canSnowAtBody pos check-light))))

(defn get-fog-color
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^World this ^Float partial-ticks]
    (-> this (.getFogColor partial-ticks))))

(defn is-block-indirectly-getting-powered
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockIndirectlyGettingPowered pos))))

(defn set-thunder-strength
  "strength - `float`"
  ([^World this ^Float strength]
    (-> this (.setThunderStrength strength))))

(defn get-save-handler
  "returns: `net.minecraft.world.storage.ISaveHandler`"
  (^net.minecraft.world.storage.ISaveHandler [^World this]
    (-> this (.getSaveHandler))))

(defn get-biome
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiome pos))))

(defn get-difficulty-for-location
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.DifficultyInstance`"
  (^net.minecraft.world.DifficultyInstance [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDifficultyForLocation pos))))

(defn mark-blocks-dirty-vertical
  "x-1 - `int`
  z-1 - `int`
  x-2 - `int`
  z-2 - `int`"
  ([^World this ^Integer x-1 ^Integer z-1 ^Integer x-2 ^Integer z-2]
    (-> this (.markBlocksDirtyVertical x-1 z-1 x-2 z-2))))

(defn get-nearest-attackable-player
  "pos-x - `double`
  pos-y - `double`
  pos-z - `double`
  max-xz-distance - `double`
  max-y-distance - `double`
  player-to-double - `com.google.common.base.Function`
  p-184150-12 - `com.google.common.base.Predicate`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^World this ^Double pos-x ^Double pos-y ^Double pos-z ^Double max-xz-distance ^Double max-y-distance ^com.google.common.base.Function player-to-double ^com.google.common.base.Predicate p-184150-12]
    (-> this (.getNearestAttackablePlayer pos-x pos-y pos-z max-xz-distance max-y-distance player-to-double p-184150-12)))
  (^net.minecraft.entity.player.EntityPlayer [^World this ^net.minecraft.entity.Entity entity-in ^Double max-xz-distance ^Double max-y-distance]
    (-> this (.getNearestAttackablePlayer entity-in max-xz-distance max-y-distance))))

(defn func-191503-g
  "p-191503-1 - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.entity.Entity p-191503-1]
    (-> this (.func_191503_g p-191503-1))))

(defn play-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  type - `int`
  pos - `net.minecraft.util.math.BlockPos`
  data - `int`"
  ([^World this ^net.minecraft.entity.player.EntityPlayer player ^Integer type ^net.minecraft.util.math.BlockPos pos ^Integer data]
    (-> this (.playEvent player type pos data)))
  ([^World this ^Integer type ^net.minecraft.util.math.BlockPos pos ^Integer data]
    (-> this (.playEvent type pos data))))

(defn get-total-world-time
  "returns: `long`"
  (^Long [^World this]
    (-> this (.getTotalWorldTime))))

(defn immediate-block-tick
  "pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  random - `java.util.Random`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random random]
    (-> this (.immediateBlockTick pos state random))))

(defn set-allowed-spawn-types
  "hostile - `boolean`
  peaceful - `boolean`"
  ([^World this ^Boolean hostile ^Boolean peaceful]
    (-> this (.setAllowedSpawnTypes hostile peaceful))))

(defn make-fireworks
  "x - `double`
  y - `double`
  z - `double`
  motion-x - `double`
  motion-y - `double`
  motion-z - `double`
  compund - `net.minecraft.nbt.NBTTagCompound`"
  ([^World this ^Double x ^Double y ^Double z ^Double motion-x ^Double motion-y ^Double motion-z ^net.minecraft.nbt.NBTTagCompound compund]
    (-> this (.makeFireworks x y z motion-x motion-y motion-z compund))))

(defn create-explosion
  "entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  strength - `float`
  is-smoking - `boolean`

  returns: `net.minecraft.world.Explosion`"
  (^net.minecraft.world.Explosion [^World this ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float strength ^Boolean is-smoking]
    (-> this (.createExplosion entity-in x y z strength is-smoking))))

(defn get-ground-above-sea-level
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getGroundAboveSeaLevel pos))))

(defn block-normal-cube?
  "pos - `net.minecraft.util.math.BlockPos`
  default - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean default]
    (-> this (.isBlockNormalCube pos default))))

(defn extinguish-fire
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.extinguishFire player pos side))))

(defn spawn-entity
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.spawnEntity entity-in))))

(defn set-spawn-point
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setSpawnPoint pos))))

(defn notify-neighbors-respect-debug
  "pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`
  p-175722-3 - `boolean`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type ^Boolean p-175722-3]
    (-> this (.notifyNeighborsRespectDebug pos block-type p-175722-3))))

(defn get-capability
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: The requested capability. Returns null when ICapabilityProvider.hasCapability(Capability, EnumFacing) would return false. - `<T> T`"
  ([^World this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.getCapability capability facing))))

(defn new-explosion
  "entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  strength - `float`
  is-flaming - `boolean`
  is-smoking - `boolean`

  returns: `net.minecraft.world.Explosion`"
  (^net.minecraft.world.Explosion [^World this ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float strength ^Boolean is-flaming ^Boolean is-smoking]
    (-> this (.newExplosion entity-in x y z strength is-flaming is-smoking))))

(defn contains-any-liquid
  "bb - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.containsAnyLiquid bb))))

(defn send-block-break-progress
  "breaker-id - `int`
  pos - `net.minecraft.util.math.BlockPos`
  progress - `int`"
  ([^World this ^Integer breaker-id ^net.minecraft.util.math.BlockPos pos ^Integer progress]
    (-> this (.sendBlockBreakProgress breaker-id pos progress))))

(defn play-record
  "block-position-in - `net.minecraft.util.math.BlockPos`
  sound-event-in - `net.minecraft.util.SoundEvent`"
  ([^World this ^net.minecraft.util.math.BlockPos block-position-in ^net.minecraft.util.SoundEvent sound-event-in]
    (-> this (.playRecord block-position-in sound-event-in))))

(defn get-pending-block-updates
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  p-72920-2 - `boolean`

  returns: `java.util.List<net.minecraft.world.NextTickListEntry>`"
  (^java.util.List [^World this ^net.minecraft.world.chunk.Chunk chunk-in ^Boolean p-72920-2]
    (-> this (.getPendingBlockUpdates chunk-in p-72920-2))))

(defn get-current-moon-phase-factor-body
  "returns: `float`"
  (^Float [^World this]
    (-> this (.getCurrentMoonPhaseFactorBody))))

(defn get-light-brightness
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `float`"
  (^Float [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightBrightness pos))))

(defn get-world-time
  "returns: `long`"
  (^Long [^World this]
    (-> this (.getWorldTime))))

(defn get-closest-player-to-entity
  "entity-in - `net.minecraft.entity.Entity`
  distance - `double`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^World this ^net.minecraft.entity.Entity entity-in ^Double distance]
    (-> this (.getClosestPlayerToEntity entity-in distance))))

(defn get-loot-table-manager
  "returns: `net.minecraft.world.storage.loot.LootTableManager`"
  (^net.minecraft.world.storage.loot.LootTableManager [^World this]
    (-> this (.getLootTableManager))))

(defn get-entities-within-aabb-excluding-entity
  "entity-in - `net.minecraft.entity.Entity`
  bb - `net.minecraft.util.math.AxisAlignedBB`

  returns: `java.util.List<net.minecraft.entity.Entity>`"
  (^java.util.List [^World this ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.getEntitiesWithinAABBExcludingEntity entity-in bb))))

(defn get-block-state
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockState pos))))

(defn handle-material-acceleration
  "bb - `net.minecraft.util.math.AxisAlignedBB`
  material-in - `net.minecraft.block.material.Material`
  entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb ^net.minecraft.block.material.Material material-in ^net.minecraft.entity.Entity entity-in]
    (-> this (.handleMaterialAcceleration bb material-in entity-in))))

(defn get-celestial-angle-radians
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getCelestialAngleRadians partial-ticks))))

(defn side-powered?
  "pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isSidePowered pos side))))

(defn add-block-event
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  event-id - `int`
  event-param - `int`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer event-id ^Integer event-param]
    (-> this (.addBlockEvent pos block-in event-id event-param))))

(defn get-player-entity-by-uuid
  "uuid - `java.util.UUID`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^World this ^java.util.UUID uuid]
    (-> this (.getPlayerEntityByUUID uuid))))

(defn set-world-time
  "time - `long`"
  ([^World this ^Long time]
    (-> this (.setWorldTime time))))

(defn has-capability?
  "Description copied from interface: ICapabilityProvider

  capability - The capability to check - `net.minecraftforge.common.capabilities.Capability`
  facing - The Side to check from: CAN BE NULL. Null is defined to represent 'internal' or 'self' - `net.minecraft.util.EnumFacing`

  returns: True if this object supports the capability. - `boolean`"
  (^Boolean [^World this ^net.minecraftforge.common.capabilities.Capability capability ^net.minecraft.util.EnumFacing facing]
    (-> this (.hasCapability capability facing))))

(defn get-chunk-provider
  "returns: `net.minecraft.world.chunk.IChunkProvider`"
  (^net.minecraft.world.chunk.IChunkProvider [^World this]
    (-> this (.getChunkProvider))))

(defn get-biome-provider
  "returns: `net.minecraft.world.biome.BiomeProvider`"
  (^net.minecraft.world.biome.BiomeProvider [^World this]
    (-> this (.getBiomeProvider))))

(defn get-chunk-from-chunk-coords
  "chunk-x - `int`
  chunk-z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^World this ^Integer chunk-x ^Integer chunk-z]
    (-> this (.getChunkFromChunkCoords chunk-x chunk-z))))

(defn thundering?
  "returns: `boolean`"
  (^Boolean [^World this]
    (-> this (.isThundering))))

(defn get-map-storage
  "returns: `net.minecraft.world.storage.MapStorage`"
  (^net.minecraft.world.storage.MapStorage [^World this]
    (-> this (.getMapStorage))))

(defn get-per-world-storage
  "returns: `net.minecraft.world.storage.MapStorage`"
  (^net.minecraft.world.storage.MapStorage [^World this]
    (-> this (.getPerWorldStorage))))

(defn get-top-solid-or-liquid-block
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTopSolidOrLiquidBlock pos))))

(defn block-tick-pending?
  "pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type]
    (-> this (.isBlockTickPending pos block-type))))

(defn check-light-for
  "light-type - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.world.EnumSkyBlock light-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.checkLightFor light-type pos))))

(defn mark-and-notify-block
  "pos - `net.minecraft.util.math.BlockPos`
  chunk - `net.minecraft.world.chunk.Chunk`
  iblockstate - `net.minecraft.block.state.IBlockState`
  new-state - `net.minecraft.block.state.IBlockState`
  flags - `int`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.chunk.Chunk chunk ^net.minecraft.block.state.IBlockState iblockstate ^net.minecraft.block.state.IBlockState new-state ^Integer flags]
    (-> this (.markAndNotifyBlock pos chunk iblockstate new-state flags))))

(defn get-thunder-strength
  "delta - `float`

  returns: `float`"
  (^Float [^World this ^Float delta]
    (-> this (.getThunderStrength delta))))

(defn get-height
  "x - `int`
  z - `int`

  returns: `int`"
  (^Integer [^World this ^Integer x ^Integer z]
    (-> this (.getHeight x z)))
  (^net.minecraft.util.math.BlockPos [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getHeight pos)))
  (^Integer [^World this]
    (-> this (.getHeight))))

(defn get-loaded-entity-list
  "returns: `java.util.List<net.minecraft.entity.Entity>`"
  (^java.util.List [^World this]
    (-> this (.getLoadedEntityList))))

(defn block-loaded?
  "pos - `net.minecraft.util.math.BlockPos`
  allow-empty - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean allow-empty]
    (-> this (.isBlockLoaded pos allow-empty)))
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockLoaded pos))))

(defn area-loaded?
  "center - `net.minecraft.util.math.BlockPos`
  radius - `int`
  allow-empty - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos center ^Integer radius ^Boolean allow-empty]
    (-> this (.isAreaLoaded center radius allow-empty)))
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos center ^Integer radius]
    (-> this (.isAreaLoaded center radius)))
  (^Boolean [^World this ^net.minecraft.world.gen.structure.StructureBoundingBox box]
    (-> this (.isAreaLoaded box))))

(defn add-world-info-to-crash-report
  "report - `net.minecraft.crash.CrashReport`

  returns: `net.minecraft.crash.CrashReportCategory`"
  (^net.minecraft.crash.CrashReportCategory [^World this ^net.minecraft.crash.CrashReport report]
    (-> this (.addWorldInfoToCrashReport report))))

(defn update-comparator-output-level
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in]
    (-> this (.updateComparatorOutputLevel pos block-in))))

(defn get-scoreboard
  "returns: `net.minecraft.scoreboard.Scoreboard`"
  (^net.minecraft.scoreboard.Scoreboard [^World this]
    (-> this (.getScoreboard))))

(defn get-world-border
  "returns: `net.minecraft.world.border.WorldBorder`"
  (^net.minecraft.world.border.WorldBorder [^World this]
    (-> this (.getWorldBorder))))

(defn schedule-update
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  delay - `int`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer delay]
    (-> this (.scheduleUpdate pos block-in delay))))

(defn send-quitting-disconnecting-packet
  ""
  ([^World this]
    (-> this (.sendQuittingDisconnectingPacket))))

(defn get-debug-loaded-entities
  "returns: `java.lang.String`"
  (^java.lang.String [^World this]
    (-> this (.getDebugLoadedEntities))))

(defn get-provider-name
  "returns: `java.lang.String`"
  (^java.lang.String [^World this]
    (-> this (.getProviderName))))

(defn air-block?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isAirBlock pos))))

(defn set-tile-entity
  "pos - `net.minecraft.util.math.BlockPos`
  tile-entity-in - `net.minecraft.tileentity.TileEntity`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.setTileEntity pos tile-entity-in))))

(defn add-tile-entity
  "tile - `net.minecraft.tileentity.TileEntity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.tileentity.TileEntity tile]
    (-> this (.addTileEntity tile))))

(defn material-in-bb?
  "bb - `net.minecraft.util.math.AxisAlignedBB`
  material-in - `net.minecraft.block.material.Material`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb ^net.minecraft.block.material.Material material-in]
    (-> this (.isMaterialInBB bb material-in))))

(defn add-weather-effect
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.addWeatherEffect entity-in))))

(defn get-block-light-opacity
  "Readded as it was removed, very useful helper function

  pos - Block position - `net.minecraft.util.math.BlockPos`

  returns: The blocks light opacity - `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBlockLightOpacity pos))))

(defn update-entity-with-optional-force
  "entity-in - `net.minecraft.entity.Entity`
  force-update - `boolean`"
  ([^World this ^net.minecraft.entity.Entity entity-in ^Boolean force-update]
    (-> this (.updateEntityWithOptionalForce entity-in force-update))))

(defn blockin-high-humidity?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockinHighHumidity pos))))

(defn initialize
  "settings - `net.minecraft.world.WorldSettings`"
  ([^World this ^net.minecraft.world.WorldSettings settings]
    (-> this (.initialize settings))))

(defn get-current-moon-phase-factor
  "returns: `float`"
  (^Float [^World this]
    (-> this (.getCurrentMoonPhaseFactor))))

(defn update-scheduled?
  "pos - `net.minecraft.util.math.BlockPos`
  blk - `net.minecraft.block.Block`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block blk]
    (-> this (.isUpdateScheduled pos blk))))

(defn on-entity-removed
  "entity-in - `net.minecraft.entity.Entity`"
  ([^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityRemoved entity-in))))

(defn can-block-see-sky?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canBlockSeeSky pos))))

(defn set-rain-strength
  "strength - `float`"
  ([^World this ^Float strength]
    (-> this (.setRainStrength strength))))

(defn find-nearest-structure
  "p-190528-1 - `java.lang.String`
  p-190528-2 - `net.minecraft.util.math.BlockPos`
  p-190528-3 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^World this ^java.lang.String p-190528-1 ^net.minecraft.util.math.BlockPos p-190528-2 ^Boolean p-190528-3]
    (-> this (.findNearestStructure p-190528-1 p-190528-2 p-190528-3))))

(defn can-block-freeze-body?
  "pos - `net.minecraft.util.math.BlockPos`
  no-water-adj - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean no-water-adj]
    (-> this (.canBlockFreezeBody pos no-water-adj))))

(defn get-world-info
  "returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^World this]
    (-> this (.getWorldInfo))))

(defn check-session-lock
  "throws: net.minecraft.world.MinecraftException"
  ([^World this]
    (-> this (.checkSessionLock))))

(defn init
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^World this]
    (-> this (.init))))

(defn get-star-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getStarBrightness partial-ticks))))

(defn get-player-entity-by-name
  "name - `java.lang.String`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^World this ^java.lang.String name]
    (-> this (.getPlayerEntityByName name))))

(defn get-sky-color
  "entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^World this ^net.minecraft.entity.Entity entity-in ^Float partial-ticks]
    (-> this (.getSkyColor entity-in partial-ticks))))

(defn chunk-generated-at?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^World this ^Integer x ^Integer z]
    (-> this (.isChunkGeneratedAt x z))))

(defn flammable-within?
  "bb - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.isFlammableWithin bb))))

(defn play-broadcast-sound
  "id - `int`
  pos - `net.minecraft.util.math.BlockPos`
  data - `int`"
  ([^World this ^Integer id ^net.minecraft.util.math.BlockPos pos ^Integer data]
    (-> this (.playBroadcastSound id pos data))))

(defn get-cloud-color-body
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^World this ^Float partial-ticks]
    (-> this (.getCloudColorBody partial-ticks))))

(defn check-no-entity-collision
  "bb - `net.minecraft.util.math.AxisAlignedBB`
  entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb ^net.minecraft.entity.Entity entity-in]
    (-> this (.checkNoEntityCollision bb entity-in)))
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.checkNoEntityCollision bb))))

(defn ray-trace-blocks
  "vec-31 - `net.minecraft.util.math.Vec3d`
  vec-32 - `net.minecraft.util.math.Vec3d`
  stop-on-liquid - `boolean`
  ignore-block-without-bounding-box - `boolean`
  return-last-uncollidable-block - `boolean`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^World this ^net.minecraft.util.math.Vec3d vec-31 ^net.minecraft.util.math.Vec3d vec-32 ^Boolean stop-on-liquid ^Boolean ignore-block-without-bounding-box ^Boolean return-last-uncollidable-block]
    (-> this (.rayTraceBlocks vec-31 vec-32 stop-on-liquid ignore-block-without-bounding-box return-last-uncollidable-block)))
  (^net.minecraft.util.math.RayTraceResult [^World this ^net.minecraft.util.math.Vec3d start ^net.minecraft.util.math.Vec3d end ^Boolean stop-on-liquid]
    (-> this (.rayTraceBlocks start end stop-on-liquid)))
  (^net.minecraft.util.math.RayTraceResult [^World this ^net.minecraft.util.math.Vec3d start ^net.minecraft.util.math.Vec3d end]
    (-> this (.rayTraceBlocks start end))))

(defn set-block-state
  "pos - `net.minecraft.util.math.BlockPos`
  new-state - `net.minecraft.block.state.IBlockState`
  flags - `int`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState new-state ^Integer flags]
    (-> this (.setBlockState pos new-state flags)))
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.setBlockState pos state))))

(defn get-biome-for-coords-body
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiomeForCoordsBody pos))))

(defn update-block-tick
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  delay - `int`
  priority - `int`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer delay ^Integer priority]
    (-> this (.updateBlockTick pos block-in delay priority))))

(defn remove-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntity entity-in))))

(defn update-observing-blocks-at
  "pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type]
    (-> this (.updateObservingBlocksAt pos block-type))))

(defn set-skylight-subtracted
  "new-skylight-subtracted - `int`"
  ([^World this ^Integer new-skylight-subtracted]
    (-> this (.setSkylightSubtracted new-skylight-subtracted))))

(defn get-last-lightning-bolt
  "returns: `int`"
  (^Integer [^World this]
    (-> this (.getLastLightningBolt))))

(defn daytime?
  "returns: `boolean`"
  (^Boolean [^World this]
    (-> this (.isDaytime))))

(defn schedule-block-update
  "pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  delay - `int`
  priority - `int`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^Integer delay ^Integer priority]
    (-> this (.scheduleBlockUpdate pos block-in delay priority))))

(defn can-block-freeze?
  "pos - `net.minecraft.util.math.BlockPos`
  no-water-adj - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean no-water-adj]
    (-> this (.canBlockFreeze pos no-water-adj))))

(defn get-seed
  "returns: `long`"
  (^Long [^World this]
    (-> this (.getSeed))))

(defn notify-block-update
  "pos - `net.minecraft.util.math.BlockPos`
  old-state - `net.minecraft.block.state.IBlockState`
  new-state - `net.minecraft.block.state.IBlockState`
  flags - `int`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState old-state ^net.minecraft.block.state.IBlockState new-state ^Integer flags]
    (-> this (.notifyBlockUpdate pos old-state new-state flags))))

(defn observed-neighbor-changed
  "pos - `net.minecraft.util.math.BlockPos`
  p-190529-2 - `net.minecraft.block.Block`
  p-190529-3 - `net.minecraft.util.math.BlockPos`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block p-190529-2 ^net.minecraft.util.math.BlockPos p-190529-3]
    (-> this (.observedNeighborChanged pos p-190529-2 p-190529-3))))

(defn set-sea-level
  "sea-level-in - `int`"
  ([^World this ^Integer sea-level-in]
    (-> this (.setSeaLevel sea-level-in))))

(defn update-weather-body
  ""
  ([^World this]
    (-> this (.updateWeatherBody))))

(defn join-entity-in-surroundings
  "entity-in - `net.minecraft.entity.Entity`"
  ([^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.joinEntityInSurroundings entity-in))))

(defn play-sound
  "player - `net.minecraft.entity.player.EntityPlayer`
  x - `double`
  y - `double`
  z - `double`
  sound-in - `net.minecraft.util.SoundEvent`
  category - `net.minecraft.util.SoundCategory`
  volume - `float`
  pitch - `float`"
  ([^World this ^net.minecraft.entity.player.EntityPlayer player ^Double x ^Double y ^Double z ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category ^Float volume ^Float pitch]
    (-> this (.playSound player x y z sound-in category volume pitch)))
  ([^World this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category ^Float volume ^Float pitch]
    (-> this (.playSound player pos sound-in category volume pitch))))

(defn find-nearest-entity-within-aabb
  "entity-type - `java.lang.Class`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  closest-to - `T`

  returns: `<T extends net.minecraft.entity.Entity> T`"
  ([^World this ^java.lang.Class entity-type ^net.minecraft.util.math.AxisAlignedBB aabb closest-to]
    (-> this (.findNearestEntityWithinAABB entity-type aabb closest-to))))

(defn get-combined-light
  "pos - `net.minecraft.util.math.BlockPos`
  light-value - `int`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos ^Integer light-value]
    (-> this (.getCombinedLight pos light-value))))

(defn get-entities-in-aab-bexcluding
  "entity-in - `net.minecraft.entity.Entity`
  bounding-box - `net.minecraft.util.math.AxisAlignedBB`
  predicate - `com.google.common.base.Predicate`

  returns: `java.util.List<net.minecraft.entity.Entity>`"
  (^java.util.List [^World this ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.AxisAlignedBB bounding-box ^com.google.common.base.Predicate predicate]
    (-> this (.getEntitiesInAABBexcluding entity-in bounding-box predicate))))

(defn spawn-particle
  "particle-type - `net.minecraft.util.EnumParticleTypes`
  ignore-range - `boolean`
  x-coord - `double`
  y-coord - `double`
  z-coord - `double`
  x-speed - `double`
  y-speed - `double`
  z-speed - `double`
  parameters - `int`"
  ([^World this ^net.minecraft.util.EnumParticleTypes particle-type ^Boolean ignore-range ^Double x-coord ^Double y-coord ^Double z-coord ^Double x-speed ^Double y-speed ^Double z-speed ^Integer parameters]
    (-> this (.spawnParticle particle-type ignore-range x-coord y-coord z-coord x-speed y-speed z-speed parameters)))
  ([^World this ^net.minecraft.util.EnumParticleTypes particle-type ^Double x-coord ^Double y-coord ^Double z-coord ^Double x-speed ^Double y-speed ^Double z-speed ^Integer parameters]
    (-> this (.spawnParticle particle-type x-coord y-coord z-coord x-speed y-speed z-speed parameters))))

(defn get-rain-strength
  "delta - `float`

  returns: `float`"
  (^Float [^World this ^Float delta]
    (-> this (.getRainStrength delta))))

(defn set-last-lightning-bolt
  "last-lightning-bolt-in - `int`"
  ([^World this ^Integer last-lightning-bolt-in]
    (-> this (.setLastLightningBolt last-lightning-bolt-in))))

(defn side-solid?
  "Determine if the given block is considered solid on the
   specified side.  Used by placement logic.

  pos - Block Position - `net.minecraft.util.math.BlockPos`
  side - The Side in question - `net.minecraft.util.EnumFacing`
  default - The default to return if the block doesn't exist. - `boolean`

  returns: True if the side is solid - `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^Boolean default]
    (-> this (.isSideSolid pos side default)))
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.isSideSolid pos side))))

(defn get-minecraft-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^World this]
    (-> this (.getMinecraftServer))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^World this]
    (-> this (.getDifficulty))))

(defn get-chunk-from-block-coords
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getChunkFromBlockCoords pos))))

(defn add-event-listener
  "listener - `net.minecraft.world.IWorldEventListener`"
  ([^World this ^net.minecraft.world.IWorldEventListener listener]
    (-> this (.addEventListener listener))))

(defn get-skylight-subtracted
  "returns: `int`"
  (^Integer [^World this]
    (-> this (.getSkylightSubtracted))))

(defn get-spawn-point
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^World this]
    (-> this (.getSpawnPoint))))

(defn get-persistent-chunks
  "Get the persistent chunks for this world

  returns: `com.google.common.collect.ImmutableSetMultimap<net.minecraft.util.math.ChunkPos,net.minecraftforge.common.ForgeChunkManager$Ticket>`"
  (^com.google.common.collect.ImmutableSetMultimap [^World this]
    (-> this (.getPersistentChunks))))

(defn get-cloud-colour
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^World this ^Float partial-ticks]
    (-> this (.getCloudColour partial-ticks))))

(defn collides-with-any-block
  "bbox - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.AxisAlignedBB bbox]
    (-> this (.collidesWithAnyBlock bbox))))

(defn block-powered?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockPowered pos))))

(defn get-village-collection
  "returns: `net.minecraft.village.VillageCollection`"
  (^net.minecraft.village.VillageCollection [^World this]
    (-> this (.getVillageCollection))))

(defn destroy-block
  "pos - `net.minecraft.util.math.BlockPos`
  drop-block - `boolean`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos ^Boolean drop-block]
    (-> this (.destroyBlock pos drop-block))))

(defn can-see-sky?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canSeeSky pos))))

(defn update-entity
  "ent - `net.minecraft.entity.Entity`"
  ([^World this ^net.minecraft.entity.Entity ent]
    (-> this (.updateEntity ent))))

(defn get-star-brightness-body
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getStarBrightnessBody partial-ticks))))

(defn set-light-for
  "type - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`
  light-value - `int`"
  ([^World this ^net.minecraft.world.EnumSkyBlock type ^net.minecraft.util.math.BlockPos pos ^Integer light-value]
    (-> this (.setLightFor type pos light-value))))

(defn add-tile-entities
  "tile-entity-collection - `java.util.Collection`"
  ([^World this ^java.util.Collection tile-entity-collection]
    (-> this (.addTileEntities tile-entity-collection))))

(defn notify-neighbors-of-state-change
  "pos - `net.minecraft.util.math.BlockPos`
  block-type - `net.minecraft.block.Block`
  update-observers - `boolean`"
  ([^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-type ^Boolean update-observers]
    (-> this (.notifyNeighborsOfStateChange pos block-type update-observers))))

(defn can-block-freeze-water?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canBlockFreezeWater pos))))

(defn can-mine-block-body?
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canMineBlockBody player pos))))

(defn remove-entity-dangerously
  "entity-in - `net.minecraft.entity.Entity`"
  ([^World this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntityDangerously entity-in))))

(defn get-nearest-player-not-creative
  "entity-in - `net.minecraft.entity.Entity`
  distance - `double`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^World this ^net.minecraft.entity.Entity entity-in ^Double distance]
    (-> this (.getNearestPlayerNotCreative entity-in distance))))

(defn get-light-from-neighbors
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightFromNeighbors pos))))

(defn get-light-for
  "type - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.world.EnumSkyBlock type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightFor type pos))))

(defn get-closest-player
  "pos-x - `double`
  pos-y - `double`
  pos-z - `double`
  distance - `double`
  spectator - `boolean`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^World this ^Double pos-x ^Double pos-y ^Double pos-z ^Double distance ^Boolean spectator]
    (-> this (.getClosestPlayer pos-x pos-y pos-z distance spectator))))

(defn get-strong-power
  "pos - `net.minecraft.util.math.BlockPos`
  direction - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing direction]
    (-> this (.getStrongPower pos direction)))
  (^Integer [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getStrongPower pos))))

(defn send-packet-to-server
  "packet-in - `net.minecraft.network.Packet`"
  ([^World this ^net.minecraft.network.Packet packet-in]
    (-> this (.sendPacketToServer packet-in))))

(defn get-sun-brightness-body
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getSunBrightnessBody partial-ticks))))

(defn get-sun-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^World this ^Float partial-ticks]
    (-> this (.getSunBrightness partial-ticks))))

(defn update-all-players-sleeping-flag
  ""
  ([^World this]
    (-> this (.updateAllPlayersSleepingFlag))))

(defn get-light-from-neighbors-for
  "type - `net.minecraft.world.EnumSkyBlock`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^World this ^net.minecraft.world.EnumSkyBlock type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getLightFromNeighborsFor type pos))))

(defn calculate-skylight-subtracted
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^World this ^Float partial-ticks]
    (-> this (.calculateSkylightSubtracted partial-ticks))))

(defn check-light
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^World this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.checkLight pos))))

