(ns net.minecraftforge.event.terraingen.ChunkGeneratorEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen ChunkGeneratorEvent]))

(defn ->chunk-generator-event
  "Constructor.

  gen - `net.minecraft.world.chunk.IChunkGenerator`"
  (^ChunkGeneratorEvent [^net.minecraft.world.chunk.IChunkGenerator gen]
    (new ChunkGeneratorEvent gen)))

(defn get-generator
  "returns: `net.minecraft.world.chunk.IChunkGenerator`"
  (^net.minecraft.world.chunk.IChunkGenerator [^ChunkGeneratorEvent this]
    (-> this (.getGenerator))))

(defn get-gen
  "returns: `net.minecraft.world.chunk.IChunkGenerator`"
  (^net.minecraft.world.chunk.IChunkGenerator [^ChunkGeneratorEvent this]
    (-> this (.getGen))))

