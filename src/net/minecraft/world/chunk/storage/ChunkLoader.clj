(ns net.minecraft.world.chunk.storage.ChunkLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage ChunkLoader]))

(defn ->chunk-loader
  "Constructor."
  (^ChunkLoader []
    (new ChunkLoader )))

(defn *load
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.world.chunk.storage.ChunkLoader$AnvilConverterData`"
  (^net.minecraft.world.chunk.storage.ChunkLoader$AnvilConverterData [^net.minecraft.nbt.NBTTagCompound nbt]
    (ChunkLoader/load nbt)))

(defn *convert-to-anvil-format
  "converter-data - `net.minecraft.world.chunk.storage.ChunkLoader$AnvilConverterData`
  compound - `net.minecraft.nbt.NBTTagCompound`
  provider - `net.minecraft.world.biome.BiomeProvider`"
  ([^net.minecraft.world.chunk.storage.ChunkLoader$AnvilConverterData converter-data ^net.minecraft.nbt.NBTTagCompound compound ^net.minecraft.world.biome.BiomeProvider provider]
    (ChunkLoader/convertToAnvilFormat converter-data compound provider)))

