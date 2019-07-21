(ns net.minecraft.world.gen.ChunkProviderEnd
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderEnd]))

(defn ->chunk-provider-end
  "Constructor.

  p-i-47241-1 - `net.minecraft.world.World`
  p-i-47241-2 - `boolean`
  p-i-47241-3 - `long`
  p-i-47241-5 - `net.minecraft.util.math.BlockPos`"
  (^ChunkProviderEnd [^net.minecraft.world.World p-i-47241-1 ^Boolean p-i-47241-2 ^Long p-i-47241-3 ^net.minecraft.util.math.BlockPos p-i-47241-5]
    (new ChunkProviderEnd p-i-47241-1 p-i-47241-2 p-i-47241-3 p-i-47241-5)))

(defn noise-gen-5
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderEnd this]
    (-> this .-noiseGen5)))

(defn noise-gen-6
  "Instance Field.

  type: net.minecraft.world.gen.NoiseGeneratorOctaves"
  (^net.minecraft.world.gen.NoiseGeneratorOctaves [^ChunkProviderEnd this]
    (-> this .-noiseGen6)))

(defn populate
  "x - `int`
  z - `int`"
  ([^ChunkProviderEnd this ^Integer x ^Integer z]
    (-> this (.populate x z))))

(defn island-chunk?
  "p-185961-1 - `int`
  p-185961-2 - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderEnd this ^Integer p-185961-1 ^Integer p-185961-2]
    (-> this (.isIslandChunk p-185961-1 p-185961-2))))

(defn generate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderEnd this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.generateStructures chunk-in x z))))

(defn get-stronghold-gen
  "world-in - `net.minecraft.world.World`
  structure-name - `java.lang.String`
  position - `net.minecraft.util.math.BlockPos`
  p-180513-4 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ChunkProviderEnd this ^net.minecraft.world.World world-in ^java.lang.String structure-name ^net.minecraft.util.math.BlockPos position ^Boolean p-180513-4]
    (-> this (.getStrongholdGen world-in structure-name position p-180513-4))))

(defn set-blocks-in-chunk
  "x - `int`
  z - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`"
  ([^ChunkProviderEnd this ^Integer x ^Integer z ^net.minecraft.world.chunk.ChunkPrimer primer]
    (-> this (.setBlocksInChunk x z primer))))

(defn recreate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`"
  ([^ChunkProviderEnd this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.recreateStructures chunk-in x z))))

(defn get-possible-creatures
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^ChunkProviderEnd this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPossibleCreatures creature-type pos))))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderEnd this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn build-surfaces
  "primer - `net.minecraft.world.chunk.ChunkPrimer`"
  ([^ChunkProviderEnd this ^net.minecraft.world.chunk.ChunkPrimer primer]
    (-> this (.buildSurfaces primer))))

