(ns net.minecraft.world.gen.ChunkProviderSettings
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderSettings]))

(defn coordinate-scale
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-coordinateScale)))

(defn height-scale
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-heightScale)))

(defn upper-limit-scale
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-upperLimitScale)))

(defn lower-limit-scale
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-lowerLimitScale)))

(defn depth-noise-scale-x
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-depthNoiseScaleX)))

(defn depth-noise-scale-z
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-depthNoiseScaleZ)))

(defn depth-noise-scale-exponent
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-depthNoiseScaleExponent)))

(defn main-noise-scale-x
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-mainNoiseScaleX)))

(defn main-noise-scale-y
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-mainNoiseScaleY)))

(defn main-noise-scale-z
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-mainNoiseScaleZ)))

(defn base-size
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-baseSize)))

(defn stretch-y
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-stretchY)))

(defn biome-depth-weight
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-biomeDepthWeight)))

(defn biome-depth-off-set
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-biomeDepthOffSet)))

(defn biome-scale-weight
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-biomeScaleWeight)))

(defn biome-scale-offset
  "Instance Constant.

  type: float"
  (^Float [^ChunkProviderSettings this]
    (-> this .-biomeScaleOffset)))

(defn sea-level
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-seaLevel)))

(defn use-caves
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useCaves)))

(defn use-dungeons
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useDungeons)))

(defn dungeon-chance
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dungeonChance)))

(defn use-strongholds
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useStrongholds)))

(defn use-villages
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useVillages)))

(defn use-mine-shafts
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useMineShafts)))

(defn use-temples
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useTemples)))

(defn use-monuments
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useMonuments)))

(defn use-mansions
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useMansions)))

(defn use-ravines
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useRavines)))

(defn use-water-lakes
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useWaterLakes)))

(defn water-lake-chance
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-waterLakeChance)))

(defn use-lava-lakes
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useLavaLakes)))

(defn lava-lake-chance
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-lavaLakeChance)))

(defn use-lava-oceans
  "Instance Constant.

  type: boolean"
  (^Boolean [^ChunkProviderSettings this]
    (-> this .-useLavaOceans)))

(defn fixed-biome
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-fixedBiome)))

(defn biome-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-biomeSize)))

(defn river-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-riverSize)))

(defn dirt-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dirtSize)))

(defn dirt-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dirtCount)))

(defn dirt-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dirtMinHeight)))

(defn dirt-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dirtMaxHeight)))

(defn gravel-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-gravelSize)))

(defn gravel-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-gravelCount)))

(defn gravel-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-gravelMinHeight)))

(defn gravel-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-gravelMaxHeight)))

(defn granite-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-graniteSize)))

(defn granite-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-graniteCount)))

(defn granite-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-graniteMinHeight)))

(defn granite-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-graniteMaxHeight)))

(defn diorite-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dioriteSize)))

(defn diorite-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dioriteCount)))

(defn diorite-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dioriteMinHeight)))

(defn diorite-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-dioriteMaxHeight)))

(defn andesite-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-andesiteSize)))

(defn andesite-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-andesiteCount)))

(defn andesite-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-andesiteMinHeight)))

(defn andesite-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-andesiteMaxHeight)))

(defn coal-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-coalSize)))

(defn coal-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-coalCount)))

(defn coal-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-coalMinHeight)))

(defn coal-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-coalMaxHeight)))

(defn iron-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-ironSize)))

(defn iron-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-ironCount)))

(defn iron-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-ironMinHeight)))

(defn iron-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-ironMaxHeight)))

(defn gold-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-goldSize)))

(defn gold-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-goldCount)))

(defn gold-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-goldMinHeight)))

(defn gold-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-goldMaxHeight)))

(defn redstone-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-redstoneSize)))

(defn redstone-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-redstoneCount)))

(defn redstone-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-redstoneMinHeight)))

(defn redstone-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-redstoneMaxHeight)))

(defn diamond-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-diamondSize)))

(defn diamond-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-diamondCount)))

(defn diamond-min-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-diamondMinHeight)))

(defn diamond-max-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-diamondMaxHeight)))

(defn lapis-size
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-lapisSize)))

(defn lapis-count
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-lapisCount)))

(defn lapis-center-height
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-lapisCenterHeight)))

(defn lapis-spread
  "Instance Constant.

  type: int"
  (^Integer [^ChunkProviderSettings this]
    (-> this .-lapisSpread)))

