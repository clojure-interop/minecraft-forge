(ns net.minecraft.world.WorldProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldProvider]))

(defn ->world-provider
  "Constructor."
  (^WorldProvider []
    (new WorldProvider )))

(def *-moon-phase-factors
  "Static Constant.

  type: float[]"
  WorldProvider/MOON_PHASE_FACTORS)

(defn get-weather-renderer
  "returns: `net.minecraftforge.client.IRenderHandler`"
  (^net.minecraftforge.client.IRenderHandler [^WorldProvider this]
    (-> this (.getWeatherRenderer))))

(defn get-light-brightness-table
  "returns: `float[]`"
  ([^WorldProvider this]
    (-> this (.getLightBrightnessTable))))

(defn get-actual-height
  "returns: `int`"
  (^Integer [^WorldProvider this]
    (-> this (.getActualHeight))))

(defn get-moon-phase
  "world-time - `long`

  returns: `int`"
  (^Integer [^WorldProvider this ^Long world-time]
    (-> this (.getMoonPhase world-time))))

(defn get-horizon
  "returns: `double`"
  (^Double [^WorldProvider this]
    (-> this (.getHorizon))))

(defn set-dimension
  "Sets the providers current dimension ID, used in default getSaveFolder()
   Added to allow default providers to be registered for multiple dimensions.
   This is to denote the exact dimension ID opposed to the 'type' in WorldType

  dim - Dimension ID - `int`"
  ([^WorldProvider this ^Integer dim]
    (-> this (.setDimension dim))))

(defn set-world
  "world-in - `net.minecraft.world.World`"
  ([^WorldProvider this ^net.minecraft.world.World world-in]
    (-> this (.setWorld world-in))))

(defn on-world-save
  ""
  ([^WorldProvider this]
    (-> this (.onWorldSave))))

(defn get-spawn-coordinate
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldProvider this]
    (-> this (.getSpawnCoordinate))))

(defn get-dimension-type
  "returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^WorldProvider this]
    (-> this (.getDimensionType))))

(defn can-do-rain-snow-ice?
  "chunk - `net.minecraft.world.chunk.Chunk`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^net.minecraft.world.chunk.Chunk chunk]
    (-> this (.canDoRainSnowIce chunk))))

(defn can-respawn-here?
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.canRespawnHere))))

(defn set-weather-renderer
  "renderer - `net.minecraftforge.client.IRenderHandler`"
  ([^WorldProvider this ^net.minecraftforge.client.IRenderHandler renderer]
    (-> this (.setWeatherRenderer renderer))))

(defn reset-rain-and-thunder
  ""
  ([^WorldProvider this]
    (-> this (.resetRainAndThunder))))

(defn get-sun-brightness-factor
  "The current sun brightness factor for this dimension.
   0.0f means no light at all, and 1.0f means maximum sunlight.
   This will be used for the \"calculateSkylightSubtracted\"
   which is for Sky light value calculation.

  par-1 - `float`

  returns: The current brightness factor - `float`"
  (^Float [^WorldProvider this ^Float par-1]
    (-> this (.getSunBrightnessFactor par-1))))

(defn get-sky-renderer
  "returns: `net.minecraftforge.client.IRenderHandler`"
  (^net.minecraftforge.client.IRenderHandler [^WorldProvider this]
    (-> this (.getSkyRenderer))))

(defn get-respawn-dimension
  "Determines the dimension the player will be respawned in, typically this brings them back to the overworld.

  player - The player that is respawning - `net.minecraft.entity.player.EntityPlayerMP`

  returns: The dimension to respawn the player in - `int`"
  (^Integer [^WorldProvider this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.getRespawnDimension player))))

(defn get-average-ground-level
  "returns: `int`"
  (^Integer [^WorldProvider this]
    (-> this (.getAverageGroundLevel))))

(defn can-snow-at?
  "pos - `net.minecraft.util.math.BlockPos`
  check-light - `boolean`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^net.minecraft.util.math.BlockPos pos ^Boolean check-light]
    (-> this (.canSnowAt pos check-light))))

(defn get-fog-color
  "p-76562-1 - `float`
  p-76562-2 - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^WorldProvider this ^Float p-76562-1 ^Float p-76562-2]
    (-> this (.getFogColor p-76562-1 p-76562-2))))

(defn get-cloud-color
  "partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^WorldProvider this ^Float partial-ticks]
    (-> this (.getCloudColor partial-ticks))))

(defn surface-world?
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.isSurfaceWorld))))

(defn get-biome-for-coords
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.world.biome.Biome`"
  (^net.minecraft.world.biome.Biome [^WorldProvider this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBiomeForCoords pos))))

(defn create-world-border
  "returns: `net.minecraft.world.border.WorldBorder`"
  (^net.minecraft.world.border.WorldBorder [^WorldProvider this]
    (-> this (.createWorldBorder))))

(defn set-allowed-spawn-types
  "allow-hostile - `boolean`
  allow-peaceful - `boolean`"
  ([^WorldProvider this ^Boolean allow-hostile ^Boolean allow-peaceful]
    (-> this (.setAllowedSpawnTypes allow-hostile allow-peaceful))))

(defn get-dimension
  "returns: `int`"
  (^Integer [^WorldProvider this]
    (-> this (.getDimension))))

(defn does-xz-show-fog
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^Integer x ^Integer z]
    (-> this (.doesXZShowFog x z))))

(defn get-movement-factor
  "The dimensions movement factor. Relative to normal overworld.
   It is applied to the players position when they transfer dimensions.
   Exa: Nether movement is 8.0

  returns: The movement factor - `double`"
  (^Double [^WorldProvider this]
    (-> this (.getMovementFactor))))

(defn set-spawn-point
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^WorldProvider this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.setSpawnPoint pos))))

(defn has-sky-light?
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.hasSkyLight))))

(defn has-no-sky?
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.hasNoSky))))

(defn get-world-time
  "returns: `long`"
  (^Long [^WorldProvider this]
    (-> this (.getWorldTime))))

(defn should-map-spin?
  "Determine if the cursor on the map should 'spin' when rendered, like it does for the player in the nether.

  entity - The entity holding the map, playername, or frame-ENTITYID - `java.lang.String`
  x - X Position - `double`
  y - Y Position - `double`
  z - Z Position - `double`

  returns: True to 'spin' the cursor - `boolean`"
  (^Boolean [^WorldProvider this ^java.lang.String entity ^Double x ^Double y ^Double z]
    (-> this (.shouldMapSpin entity x y z))))

(defn can-drop-chunk?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^Integer x ^Integer z]
    (-> this (.canDropChunk x z))))

(defn set-world-time
  "time - `long`"
  ([^WorldProvider this ^Long time]
    (-> this (.setWorldTime time))))

(defn get-cloud-height
  "returns: `float`"
  (^Float [^WorldProvider this]
    (-> this (.getCloudHeight))))

(defn can-coordinate-be-spawn?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^Integer x ^Integer z]
    (-> this (.canCoordinateBeSpawn x z))))

(defn can-do-lightning?
  "chunk - `net.minecraft.world.chunk.Chunk`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^net.minecraft.world.chunk.Chunk chunk]
    (-> this (.canDoLightning chunk))))

(defn get-biome-provider
  "returns: `net.minecraft.world.biome.BiomeProvider`"
  (^net.minecraft.world.biome.BiomeProvider [^WorldProvider this]
    (-> this (.getBiomeProvider))))

(defn block-high-humidity?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockHighHumidity pos))))

(defn get-height
  "returns: `int`"
  (^Integer [^WorldProvider this]
    (-> this (.getHeight))))

(defn get-randomized-spawn-point
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldProvider this]
    (-> this (.getRandomizedSpawnPoint))))

(defn set-cloud-renderer
  "renderer - `net.minecraftforge.client.IRenderHandler`"
  ([^WorldProvider this ^net.minecraftforge.client.IRenderHandler renderer]
    (-> this (.setCloudRenderer renderer))))

(defn get-void-fog-y-factor
  "returns: `double`"
  (^Double [^WorldProvider this]
    (-> this (.getVoidFogYFactor))))

(defn create-chunk-generator
  "returns: `net.minecraft.world.chunk.IChunkGenerator`"
  (^net.minecraft.world.chunk.IChunkGenerator [^WorldProvider this]
    (-> this (.createChunkGenerator))))

(defn does-water-vaporize
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.doesWaterVaporize))))

(defn get-save-folder
  "Returns the sub-folder of the world folder that this WorldProvider saves to.
   EXA: DIM1, DIM-1

  returns: The sub-folder name to save this world's chunks to. - `java.lang.String`"
  (^java.lang.String [^WorldProvider this]
    (-> this (.getSaveFolder))))

(defn get-current-moon-phase-factor
  "Calculates the current moon phase factor.
   This factor is effective for slimes.
   (This method do not affect the moon rendering)

  returns: `float`"
  (^Float [^WorldProvider this]
    (-> this (.getCurrentMoonPhaseFactor))))

(defn get-cloud-renderer
  "returns: `net.minecraftforge.client.IRenderHandler`"
  (^net.minecraftforge.client.IRenderHandler [^WorldProvider this]
    (-> this (.getCloudRenderer))))

(defn get-star-brightness
  "Gets the Star Brightness for rendering sky.

  par-1 - `float`

  returns: `float`"
  (^Float [^WorldProvider this ^Float par-1]
    (-> this (.getStarBrightness par-1))))

(defn get-sky-color
  "camera-entity - `net.minecraft.entity.Entity`
  partial-ticks - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^WorldProvider this ^net.minecraft.entity.Entity camera-entity ^Float partial-ticks]
    (-> this (.getSkyColor camera-entity partial-ticks))))

(defn can-mine-block?
  "player - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos pos]
    (-> this (.canMineBlock player pos))))

(defn calculate-celestial-angle
  "world-time - `long`
  partial-ticks - `float`

  returns: `float`"
  (^Float [^WorldProvider this ^Long world-time ^Float partial-ticks]
    (-> this (.calculateCelestialAngle world-time partial-ticks))))

(defn on-world-update-entities
  ""
  ([^WorldProvider this]
    (-> this (.onWorldUpdateEntities))))

(defn daytime?
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.isDaytime))))

(defn can-block-freeze?
  "pos - `net.minecraft.util.math.BlockPos`
  by-water - `boolean`

  returns: `boolean`"
  (^Boolean [^WorldProvider this ^net.minecraft.util.math.BlockPos pos ^Boolean by-water]
    (-> this (.canBlockFreeze pos by-water))))

(defn get-seed
  "returns: `long`"
  (^Long [^WorldProvider this]
    (-> this (.getSeed))))

(defn update-weather
  ""
  ([^WorldProvider this]
    (-> this (.updateWeather))))

(defn get-welcome-message
  "A message to display to the user when they transfer to this dimension.

  returns: The message to be displayed - `java.lang.String`"
  (^java.lang.String [^WorldProvider this]
    (-> this (.getWelcomeMessage))))

(defn init-capabilities
  "Called from World.initCapabilities(), to gather capabilities for this world.
   It's safe to access world here since this is called after world is registered.

   On server, called directly after mapStorage and world data such as Scoreboard and VillageCollection are initialized.
   On client, called when world is constructed, just before world load event is called.
   Note that this method is always called before the world load event.

  returns: initial holder for capabilities on the world - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^net.minecraftforge.common.capabilities.ICapabilityProvider [^WorldProvider this]
    (-> this (.initCapabilities))))

(defn get-spawn-point
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldProvider this]
    (-> this (.getSpawnPoint))))

(defn on-player-added
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^WorldProvider this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.onPlayerAdded player))))

(defn get-depart-message
  "A Message to display to the user when they transfer out of this dismension.

  returns: The message to be displayed - `java.lang.String`"
  (^java.lang.String [^WorldProvider this]
    (-> this (.getDepartMessage))))

(defn calculate-initial-weather
  ""
  ([^WorldProvider this]
    (-> this (.calculateInitialWeather))))

(defn calc-sunrise-sunset-colors
  "celestial-angle - `float`
  partial-ticks - `float`

  returns: `float[]`"
  ([^WorldProvider this ^Float celestial-angle ^Float partial-ticks]
    (-> this (.calcSunriseSunsetColors celestial-angle partial-ticks))))

(defn set-sky-renderer
  "sky-renderer - `net.minecraftforge.client.IRenderHandler`"
  ([^WorldProvider this ^net.minecraftforge.client.IRenderHandler sky-renderer]
    (-> this (.setSkyRenderer sky-renderer))))

(defn get-sun-brightness
  "Gets the Sun Brightness for rendering sky.

  par-1 - `float`

  returns: `float`"
  (^Float [^WorldProvider this ^Float par-1]
    (-> this (.getSunBrightness par-1))))

(defn sky-colored?
  "returns: `boolean`"
  (^Boolean [^WorldProvider this]
    (-> this (.isSkyColored))))

(defn on-player-removed
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^WorldProvider this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.onPlayerRemoved player))))

