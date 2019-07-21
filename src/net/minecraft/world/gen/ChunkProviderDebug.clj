(ns net.minecraft.world.gen.ChunkProviderDebug
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen ChunkProviderDebug]))

(defn ->chunk-provider-debug
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^ChunkProviderDebug [^net.minecraft.world.World world-in]
    (new ChunkProviderDebug world-in)))

(defn *get-block-state-for
  "p-177461-0 - `int`
  p-177461-1 - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^Integer p-177461-0 ^Integer p-177461-1]
    (ChunkProviderDebug/getBlockStateFor p-177461-0 p-177461-1)))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkProviderDebug this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn populate
  "x - `int`
  z - `int`"
  ([^ChunkProviderDebug this ^Integer x ^Integer z]
    (-> this (.populate x z))))

(defn generate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^ChunkProviderDebug this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.generateStructures chunk-in x z))))

(defn get-possible-creatures
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^ChunkProviderDebug this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPossibleCreatures creature-type pos))))

(defn get-stronghold-gen
  "world-in - `net.minecraft.world.World`
  structure-name - `java.lang.String`
  position - `net.minecraft.util.math.BlockPos`
  p-180513-4 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ChunkProviderDebug this ^net.minecraft.world.World world-in ^java.lang.String structure-name ^net.minecraft.util.math.BlockPos position ^Boolean p-180513-4]
    (-> this (.getStrongholdGen world-in structure-name position p-180513-4))))

(defn recreate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`"
  ([^ChunkProviderDebug this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.recreateStructures chunk-in x z))))

