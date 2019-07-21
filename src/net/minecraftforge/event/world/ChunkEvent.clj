(ns net.minecraftforge.event.world.ChunkEvent
  "ChunkEvent is fired when an event involving a chunk occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  chunk contains the Chunk this event is affecting.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkEvent]))

(defn ->chunk-event
  "Constructor.

  chunk - `net.minecraft.world.chunk.Chunk`"
  (^ChunkEvent [^net.minecraft.world.chunk.Chunk chunk]
    (new ChunkEvent chunk)))

(defn get-chunk
  "returns: `net.minecraft.world.chunk.Chunk`"
  (^net.minecraft.world.chunk.Chunk [^ChunkEvent this]
    (-> this (.getChunk))))

