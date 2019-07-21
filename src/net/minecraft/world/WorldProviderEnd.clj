(ns net.minecraft.world.WorldProviderEnd
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldProviderEnd]))

(defn ->world-provider-end
  "Constructor."
  (^WorldProviderEnd []
    (new WorldProviderEnd )))

(defn on-world-save
  ""
  ([^WorldProviderEnd this]
    (-> this (.onWorldSave))))

(defn get-spawn-coordinate
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^WorldProviderEnd this]
    (-> this (.getSpawnCoordinate))))

(defn get-dimension-type
  "returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^WorldProviderEnd this]
    (-> this (.getDimensionType))))

(defn can-respawn-here?
  "returns: `boolean`"
  (^Boolean [^WorldProviderEnd this]
    (-> this (.canRespawnHere))))

(defn get-average-ground-level
  "returns: `int`"
  (^Integer [^WorldProviderEnd this]
    (-> this (.getAverageGroundLevel))))

(defn get-fog-color
  "p-76562-1 - `float`
  p-76562-2 - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^WorldProviderEnd this ^Float p-76562-1 ^Float p-76562-2]
    (-> this (.getFogColor p-76562-1 p-76562-2))))

(defn surface-world?
  "returns: `boolean`"
  (^Boolean [^WorldProviderEnd this]
    (-> this (.isSurfaceWorld))))

(defn does-xz-show-fog
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProviderEnd this ^Integer x ^Integer z]
    (-> this (.doesXZShowFog x z))))

(defn get-dragon-fight-manager
  "returns: `net.minecraft.world.end.DragonFightManager`"
  (^net.minecraft.world.end.DragonFightManager [^WorldProviderEnd this]
    (-> this (.getDragonFightManager))))

(defn get-cloud-height
  "returns: `float`"
  (^Float [^WorldProviderEnd this]
    (-> this (.getCloudHeight))))

(defn can-coordinate-be-spawn?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProviderEnd this ^Integer x ^Integer z]
    (-> this (.canCoordinateBeSpawn x z))))

(defn create-chunk-generator
  "returns: `net.minecraft.world.chunk.IChunkGenerator`"
  (^net.minecraft.world.chunk.IChunkGenerator [^WorldProviderEnd this]
    (-> this (.createChunkGenerator))))

(defn init
  ""
  ([^WorldProviderEnd this]
    (-> this (.init))))

(defn calculate-celestial-angle
  "world-time - `long`
  partial-ticks - `float`

  returns: `float`"
  (^Float [^WorldProviderEnd this ^Long world-time ^Float partial-ticks]
    (-> this (.calculateCelestialAngle world-time partial-ticks))))

(defn on-world-update-entities
  ""
  ([^WorldProviderEnd this]
    (-> this (.onWorldUpdateEntities))))

(defn calc-sunrise-sunset-colors
  "celestial-angle - `float`
  partial-ticks - `float`

  returns: `float[]`"
  ([^WorldProviderEnd this ^Float celestial-angle ^Float partial-ticks]
    (-> this (.calcSunriseSunsetColors celestial-angle partial-ticks))))

(defn sky-colored?
  "returns: `boolean`"
  (^Boolean [^WorldProviderEnd this]
    (-> this (.isSkyColored))))

