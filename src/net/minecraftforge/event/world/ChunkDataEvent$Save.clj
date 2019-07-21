(ns net.minecraftforge.event.world.ChunkDataEvent$Save
  "ChunkDataEvent.Save is fired when vanilla Minecraft attempts to save Chunk data.
  This event is fired during chunk saving in
  AnvilChunkLoader.saveChunk(World, Chunk).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkDataEvent$Save]))

(defn ->save
  "Constructor.

  chunk - `net.minecraft.world.chunk.Chunk`
  data - `net.minecraft.nbt.NBTTagCompound`"
  (^ChunkDataEvent$Save [^net.minecraft.world.chunk.Chunk chunk ^net.minecraft.nbt.NBTTagCompound data]
    (new ChunkDataEvent$Save chunk data)))

