(ns net.minecraftforge.event.terraingen.ChunkGeneratorEvent$InitNoiseField
  "This event is fired before a chunks terrain noise field is initialized.

  You can set the result to DENY to substitute your own noise field."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen ChunkGeneratorEvent$InitNoiseField]))

(defn ->init-noise-field
  "Constructor.

  chunk-provider - `net.minecraft.world.chunk.IChunkGenerator`
  noisefield - `double[]`
  pos-x - `int`
  pos-y - `int`
  pos-z - `int`
  size-x - `int`
  size-y - `int`
  size-z - `int`"
  (^ChunkGeneratorEvent$InitNoiseField [^net.minecraft.world.chunk.IChunkGenerator chunk-provider noisefield ^Integer pos-x ^Integer pos-y ^Integer pos-z ^Integer size-x ^Integer size-y ^Integer size-z]
    (new ChunkGeneratorEvent$InitNoiseField chunk-provider noisefield pos-x pos-y pos-z size-x size-y size-z)))

(defn get-noisefield
  "returns: `double[]`"
  ([^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getNoisefield))))

(defn set-noisefield
  "noisefield - `double[]`"
  ([^ChunkGeneratorEvent$InitNoiseField this noisefield]
    (-> this (.setNoisefield noisefield))))

(defn get-pos-x
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getPosX))))

(defn get-pos-y
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getPosY))))

(defn get-pos-z
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getPosZ))))

(defn get-size-x
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getSizeX))))

(defn get-size-y
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getSizeY))))

(defn get-size-z
  "returns: `int`"
  (^Integer [^ChunkGeneratorEvent$InitNoiseField this]
    (-> this (.getSizeZ))))

