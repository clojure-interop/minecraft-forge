(ns net.minecraft.world.gen.ChunkProviderOverworld
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderOverworld]))

(defn ->chunk-provider-overworld
  "Constructor.

  world-in - `net.minecraft.world.World`
  seed - `long`
  map-features-enabled-in - `boolean`
  p-i-46668-5 - `java.lang.String`"
  (^ChunkProviderOverworld [^net.minecraft.world.World world-in ^Long seed ^Boolean map-features-enabled-in ^java.lang.String p-i-46668-5]
    (new ChunkProviderOverworld world-in seed map-features-enabled-in p-i-46668-5)))

(defn scale-noise
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderOverworld this]
    (-> this .-scaleNoise)))

(defn depth-noise
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderOverworld this]
    (-> this .-depthNoise)))

(defn forest-noise
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderOverworld this]
    (-> this .-forestNoise)))

(defn set-blocks-in-chunk
  "x - `int`
  z - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`"
  ([^ChunkProviderOverworld this ^Integer x ^Integer z ^net.minecraft.world.chunk.ChunkPrimer primer]
    (-> this (.setBlocksInChunk x z primer))))

(defn replace-biome-blocks
  "x - `int`
  z - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`
  biomes-in - `net.minecraft.world.biome.Biome[]`"
  ([^ChunkProviderOverworld this ^Integer x ^Integer z ^net.minecraft.world.chunk.ChunkPrimer primer biomes-in]
    (-> this (.replaceBiomeBlocks x z primer biomes-in))))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderOverworld this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn populate
  "x - `int`
  z - `int`"
  ([^ChunkProviderOverworld this ^Integer x ^Integer z]
    (-> this (.populate x z))))

(defn generate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderOverworld this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.generateStructures chunk-in x z))))

(defn get-possible-creatures
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^ChunkProviderOverworld this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPossibleCreatures creature-type pos))))

(defn get-stronghold-gen
  "world-in - `net.minecraft.world.World`
  structure-name - `java.lang.String`
  position - `net.minecraft.util.math.BlockPos`
  p-180513-4 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ChunkProviderOverworld this ^net.minecraft.world.World world-in ^java.lang.String structure-name ^net.minecraft.util.math.BlockPos position ^Boolean p-180513-4]
    (-> this (.getStrongholdGen world-in structure-name position p-180513-4))))

(defn recreate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`"
  ([^ChunkProviderOverworld this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.recreateStructures chunk-in x z))))

