(ns net.minecraftforge.event.world.ChunkEvent$Unload
  "ChunkEvent.Unload is fired when vanilla Minecraft attempts to unload a Chunk from the world.
  This event is fired during chunk unloading in
  Chunk.onChunkUnload().

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkEvent$Unload]))

(defn ->unload
  "Constructor.

  chunk - `net.minecraft.world.chunk.Chunk`"
  (^ChunkEvent$Unload [^net.minecraft.world.chunk.Chunk chunk]
    (new ChunkEvent$Unload chunk)))

