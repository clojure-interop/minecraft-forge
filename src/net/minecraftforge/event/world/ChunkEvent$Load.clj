(ns net.minecraftforge.event.world.ChunkEvent$Load
  "ChunkEvent.Load is fired when vanilla Minecraft attempts to load a Chunk into the world.
  This event is fired during chunk loading in
  ChunkProviderClient.loadChunk(int, int),
  Chunk.onChunkLoad().

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkEvent$Load]))

(defn ->load
  "Constructor.

  chunk - `net.minecraft.world.chunk.Chunk`"
  (^ChunkEvent$Load [^net.minecraft.world.chunk.Chunk chunk]
    (new ChunkEvent$Load chunk)))

