(ns net.minecraftforge.event.world.ChunkDataEvent$Load
  "ChunkDataEvent.Load is fired when vanilla Minecraft attempts to load Chunk data.
  This event is fired during chunk loading in
  ChunkIOProvider.syncCallback().

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkDataEvent$Load]))

(defn ->load
  "Constructor.

  chunk - `net.minecraft.world.chunk.Chunk`
  data - `net.minecraft.nbt.NBTTagCompound`"
  (^ChunkDataEvent$Load [^net.minecraft.world.chunk.Chunk chunk ^net.minecraft.nbt.NBTTagCompound data]
    (new ChunkDataEvent$Load chunk data)))

