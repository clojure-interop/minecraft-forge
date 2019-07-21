(ns net.minecraft.world.gen.ChunkProviderHell
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderHell]))

(defn ->chunk-provider-hell
  "Constructor.

  world-in - `net.minecraft.world.World`
  p-i-45637-2 - `boolean`
  seed - `long`"
  (^ChunkProviderHell [^net.minecraft.world.World world-in ^Boolean p-i-45637-2 ^Long seed]
    (new ChunkProviderHell world-in p-i-45637-2 seed)))

(defn scale-noise
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderHell this]
    (-> this .-scaleNoise)))

(defn depth-noise
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderHell this]
    (-> this .-depthNoise)))

(defn prepare-heights
  "p-185936-1 - `int`
  p-185936-2 - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`"
  ([^ChunkProviderHell this ^Integer p-185936-1 ^Integer p-185936-2 ^net.minecraft.world.chunk.ChunkPrimer primer]
    (-> this (.prepareHeights p-185936-1 p-185936-2 primer))))

(defn build-surfaces
  "p-185937-1 - `int`
  p-185937-2 - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`"
  ([^ChunkProviderHell this ^Integer p-185937-1 ^Integer p-185937-2 ^net.minecraft.world.chunk.ChunkPrimer primer]
    (-> this (.buildSurfaces p-185937-1 p-185937-2 primer))))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderHell this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn populate
  "x - `int`
  z - `int`"
  ([^ChunkProviderHell this ^Integer x ^Integer z]
    (-> this (.populate x z))))

(defn generate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderHell this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.generateStructures chunk-in x z))))

(defn get-possible-creatures
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^ChunkProviderHell this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPossibleCreatures creature-type pos))))

(defn get-stronghold-gen
  "world-in - `net.minecraft.world.World`
  structure-name - `java.lang.String`
  position - `net.minecraft.util.math.BlockPos`
  p-180513-4 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ChunkProviderHell this ^net.minecraft.world.World world-in ^java.lang.String structure-name ^net.minecraft.util.math.BlockPos position ^Boolean p-180513-4]
    (-> this (.getStrongholdGen world-in structure-name position p-180513-4))))

(defn recreate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`"
  ([^ChunkProviderHell this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.recreateStructures chunk-in x z))))

