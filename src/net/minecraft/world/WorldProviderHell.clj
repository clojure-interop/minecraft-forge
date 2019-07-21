(ns net.minecraft.world.WorldProviderHell
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world WorldProviderHell]))

(defn ->world-provider-hell
  "Constructor."
  (^WorldProviderHell []
    (new WorldProviderHell )))

(defn get-dimension-type
  "returns: `net.minecraft.world.DimensionType`"
  (^net.minecraft.world.DimensionType [^WorldProviderHell this]
    (-> this (.getDimensionType))))

(defn can-respawn-here?
  "returns: `boolean`"
  (^Boolean [^WorldProviderHell this]
    (-> this (.canRespawnHere))))

(defn get-fog-color
  "p-76562-1 - `float`
  p-76562-2 - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^WorldProviderHell this ^Float p-76562-1 ^Float p-76562-2]
    (-> this (.getFogColor p-76562-1 p-76562-2))))

(defn surface-world?
  "returns: `boolean`"
  (^Boolean [^WorldProviderHell this]
    (-> this (.isSurfaceWorld))))

(defn create-world-border
  "returns: `net.minecraft.world.border.WorldBorder`"
  (^net.minecraft.world.border.WorldBorder [^WorldProviderHell this]
    (-> this (.createWorldBorder))))

(defn does-xz-show-fog
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProviderHell this ^Integer x ^Integer z]
    (-> this (.doesXZShowFog x z))))

(defn can-coordinate-be-spawn?
  "x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^WorldProviderHell this ^Integer x ^Integer z]
    (-> this (.canCoordinateBeSpawn x z))))

(defn create-chunk-generator
  "returns: `net.minecraft.world.chunk.IChunkGenerator`"
  (^net.minecraft.world.chunk.IChunkGenerator [^WorldProviderHell this]
    (-> this (.createChunkGenerator))))

(defn init
  ""
  ([^WorldProviderHell this]
    (-> this (.init))))

(defn calculate-celestial-angle
  "world-time - `long`
  partial-ticks - `float`

  returns: `float`"
  (^Float [^WorldProviderHell this ^Long world-time ^Float partial-ticks]
    (-> this (.calculateCelestialAngle world-time partial-ticks))))

