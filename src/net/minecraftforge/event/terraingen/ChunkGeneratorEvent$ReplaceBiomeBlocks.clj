(ns net.minecraftforge.event.terraingen.ChunkGeneratorEvent$ReplaceBiomeBlocks
  "This event is fired when a chunks blocks are replaced by a biomes top and
  filler blocks.

  You can set the result to DENY to prevent the default replacement."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen ChunkGeneratorEvent$ReplaceBiomeBlocks]))

(defn ->replace-biome-blocks
  "Constructor.

  chunk-provider - `net.minecraft.world.chunk.IChunkGenerator`
  x - `int`
  z - `int`
  primer - `net.minecraft.world.chunk.ChunkPrimer`
  world - `net.minecraft.world.World`"
  (^ChunkGeneratorEvent$ReplaceBiomeBlocks [^net.minecraft.world.chunk.IChunkGenerator chunk-provider ^Integer x ^Integer z ^net.minecraft.world.chunk.ChunkPrimer primer ^net.minecraft.world.World world]
    (new ChunkGeneratorEvent$ReplaceBiomeBlocks chunk-provider x z primer world)))

(defn get-x
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$ReplaceBiomeBlocks this]
    (-> this (.getX))))

(defn get-z
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$ReplaceBiomeBlocks this]
    (-> this (.getZ))))

(defn get-primer
  "returns: `net.minecraft.world.chunk.ChunkPrimer`"
  (^net.minecraft.world.chunk.ChunkPrimer [^ChunkGeneratorEvent$ReplaceBiomeBlocks this]
    (-> this (.getPrimer))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ChunkGeneratorEvent$ReplaceBiomeBlocks this]
    (-> this (.getWorld))))

