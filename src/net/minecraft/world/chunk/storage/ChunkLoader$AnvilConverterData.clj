(ns net.minecraft.world.chunk.storage.ChunkLoader$AnvilConverterData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage ChunkLoader$AnvilConverterData]))

(defn ->anvil-converter-data
  "Constructor.

  x-in - `int`
  z-in - `int`"
  (^ChunkLoader$AnvilConverterData [^Integer x-in ^Integer z-in]
    (new ChunkLoader$AnvilConverterData x-in z-in)))

(defn last-updated
  "Instance Field.

  type: long"
  (^Long [^ChunkLoader$AnvilConverterData this]
    (-> this .-lastUpdated)))

(defn terrain-populated
  "Instance Field.

  type: boolean"
  (^Boolean [^ChunkLoader$AnvilConverterData this]
    (-> this .-terrainPopulated)))

(defn heightmap
  "Instance Field.

  type: byte[]"
  ([^ChunkLoader$AnvilConverterData this]
    (-> this .-heightmap)))

(defn block-light
  "Instance Field.

  type: net.minecraft.world.chunk.storage.NibbleArrayReader"
  (^net.minecraft.world.chunk.storage.NibbleArrayReader [^ChunkLoader$AnvilConverterData this]
    (-> this .-blockLight)))

(defn sky-light
  "Instance Field.

  type: net.minecraft.world.chunk.storage.NibbleArrayReader"
  (^net.minecraft.world.chunk.storage.NibbleArrayReader [^ChunkLoader$AnvilConverterData this]
    (-> this .-skyLight)))

(defn data
  "Instance Field.

  type: net.minecraft.world.chunk.storage.NibbleArrayReader"
  (^net.minecraft.world.chunk.storage.NibbleArrayReader [^ChunkLoader$AnvilConverterData this]
    (-> this .-data)))

(defn blocks
  "Instance Field.

  type: byte[]"
  ([^ChunkLoader$AnvilConverterData this]
    (-> this .-blocks)))

(defn entities
  "Instance Field.

  type: net.minecraft.nbt.NBTTagList"
  (^net.minecraft.nbt.NBTTagList [^ChunkLoader$AnvilConverterData this]
    (-> this .-entities)))

(defn tile-entities
  "Instance Field.

  type: net.minecraft.nbt.NBTTagList"
  (^net.minecraft.nbt.NBTTagList [^ChunkLoader$AnvilConverterData this]
    (-> this .-tileEntities)))

(defn tile-ticks
  "Instance Field.

  type: net.minecraft.nbt.NBTTagList"
  (^net.minecraft.nbt.NBTTagList [^ChunkLoader$AnvilConverterData this]
    (-> this .-tileTicks)))

(defn x
  "Instance Constant.

  type: int"
  (^Integer [^ChunkLoader$AnvilConverterData this]
    (-> this .-x)))

(defn z
  "Instance Constant.

  type: int"
  (^Integer [^ChunkLoader$AnvilConverterData this]
    (-> this .-z)))

