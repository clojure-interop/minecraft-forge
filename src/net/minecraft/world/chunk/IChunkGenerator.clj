(ns net.minecraft.world.chunk.IChunkGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk IChunkGenerator]))

(defn provide-chunk
  "x - `int`
  z - `int`

  returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^IChunkGenerator this ^Integer x ^Integer z]
    (-> this (.provideChunk x z))))

(defn populate
  "x - `int`
  z - `int`"
  ([^IChunkGenerator this ^Integer x ^Integer z]
    (-> this (.populate x z))))

(defn generate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`

  returns: `boolean`"
  (^Boolean [^IChunkGenerator this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.generateStructures chunk-in x z))))

(defn get-possible-creatures
  "creature-type - `net.minecraft.entity.EnumCreatureType`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<net.minecraft.world.biome.Biome$SpawnListEntry>`"
  (^java.util.List [^IChunkGenerator this ^net.minecraft.entity.EnumCreatureType creature-type ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPossibleCreatures creature-type pos))))

(defn get-stronghold-gen
  "world-in - `net.minecraft.world.World`
  structure-name - `java.lang.String`
  position - `net.minecraft.util.math.BlockPos`
  p-180513-4 - `boolean`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^IChunkGenerator this ^net.minecraft.world.World world-in ^java.lang.String structure-name ^net.minecraft.util.math.BlockPos position ^Boolean p-180513-4]
    (-> this (.getStrongholdGen world-in structure-name position p-180513-4))))

(defn recreate-structures
  "chunk-in - `net.minecraft.world.chunk.Chunk`
  x - `int`
  z - `int`"
  ([^IChunkGenerator this ^net.minecraft.world.chunk.Chunk chunk-in ^Integer x ^Integer z]
    (-> this (.recreateStructures chunk-in x z))))

