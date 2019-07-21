(ns net.minecraft.world.gen.ChunkProviderSettings$Factory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderSettings$Factory]))

(defn ->factory
  "Constructor."
  (^ChunkProviderSettings$Factory []
    (new ChunkProviderSettings$Factory )))

(defn coordinate-scale
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-coordinateScale)))

(defn height-scale
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-heightScale)))

(defn upper-limit-scale
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-upperLimitScale)))

(defn lower-limit-scale
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-lowerLimitScale)))

(defn depth-noise-scale-x
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-depthNoiseScaleX)))

(defn depth-noise-scale-z
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-depthNoiseScaleZ)))

(defn depth-noise-scale-exponent
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-depthNoiseScaleExponent)))

(defn main-noise-scale-x
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-mainNoiseScaleX)))

(defn main-noise-scale-y
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-mainNoiseScaleY)))

(defn main-noise-scale-z
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-mainNoiseScaleZ)))

(defn base-size
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-baseSize)))

(defn stretch-y
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-stretchY)))

(defn biome-depth-weight
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-biomeDepthWeight)))

(defn biome-depth-offset
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-biomeDepthOffset)))

(defn biome-scale-weight
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-biomeScaleWeight)))

(defn biome-scale-offset
  "Instance Field.

  type: float"
  (^Float [^ChunkProviderSettings$Factory this]
    (-> this .-biomeScaleOffset)))

(defn sea-level
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-seaLevel)))

(defn use-caves
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useCaves)))

(defn use-dungeons
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useDungeons)))

(defn dungeon-chance
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dungeonChance)))

(defn use-strongholds
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useStrongholds)))

(defn use-villages
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useVillages)))

(defn use-mine-shafts
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useMineShafts)))

(defn use-temples
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useTemples)))

(defn use-monuments
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useMonuments)))

(defn use-mansions
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useMansions)))

(defn use-ravines
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useRavines)))

(defn use-water-lakes
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useWaterLakes)))

(defn water-lake-chance
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-waterLakeChance)))

(defn use-lava-lakes
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useLavaLakes)))

(defn lava-lake-chance
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-lavaLakeChance)))

(defn use-lava-oceans
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkProviderSettings$Factory this]
    (-> this .-useLavaOceans)))

(defn fixed-biome
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-fixedBiome)))

(defn biome-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-biomeSize)))

(defn river-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-riverSize)))

(defn dirt-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dirtSize)))

(defn dirt-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dirtCount)))

(defn dirt-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dirtMinHeight)))

(defn dirt-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dirtMaxHeight)))

(defn gravel-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-gravelSize)))

(defn gravel-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-gravelCount)))

(defn gravel-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-gravelMinHeight)))

(defn gravel-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-gravelMaxHeight)))

(defn granite-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-graniteSize)))

(defn granite-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-graniteCount)))

(defn granite-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-graniteMinHeight)))

(defn granite-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-graniteMaxHeight)))

(defn diorite-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dioriteSize)))

(defn diorite-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dioriteCount)))

(defn diorite-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dioriteMinHeight)))

(defn diorite-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-dioriteMaxHeight)))

(defn andesite-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-andesiteSize)))

(defn andesite-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-andesiteCount)))

(defn andesite-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-andesiteMinHeight)))

(defn andesite-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-andesiteMaxHeight)))

(defn coal-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-coalSize)))

(defn coal-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-coalCount)))

(defn coal-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-coalMinHeight)))

(defn coal-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-coalMaxHeight)))

(defn iron-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-ironSize)))

(defn iron-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-ironCount)))

(defn iron-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-ironMinHeight)))

(defn iron-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-ironMaxHeight)))

(defn gold-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-goldSize)))

(defn gold-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-goldCount)))

(defn gold-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-goldMinHeight)))

(defn gold-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-goldMaxHeight)))

(defn redstone-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-redstoneSize)))

(defn redstone-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-redstoneCount)))

(defn redstone-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-redstoneMinHeight)))

(defn redstone-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-redstoneMaxHeight)))

(defn diamond-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-diamondSize)))

(defn diamond-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-diamondCount)))

(defn diamond-min-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-diamondMinHeight)))

(defn diamond-max-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-diamondMaxHeight)))

(defn lapis-size
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-lapisSize)))

(defn lapis-count
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-lapisCount)))

(defn lapis-center-height
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-lapisCenterHeight)))

(defn lapis-spread
  "Instance Field.

  type: int"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this .-lapisSpread)))

(defn *json-to-factory
  "p-177865-0 - `java.lang.String`

  returns: `net.minecraft.world.gen.ChunkProviderSettings$Factory`"
  (^net.minecraft.world.gen.ChunkProviderSettings$Factory [^java.lang.String p-177865-0]
    (ChunkProviderSettings$Factory/jsonToFactory p-177865-0)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChunkProviderSettings$Factory this]
    (-> this (.toString))))

(defn set-defaults
  ""
  ([^ChunkProviderSettings$Factory this]
    (-> this (.setDefaults))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ChunkProviderSettings$Factory this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ChunkProviderSettings$Factory this]
    (-> this (.hashCode))))

(defn build
  "returns: `net.minecraft.world.gen.ChunkProviderSettings`"
  (^net.minecraft.world.gen.ChunkProviderSettings [^ChunkProviderSettings$Factory this]
    (-> this (.build))))

