(ns net.minecraftforge.event.world.ChunkWatchEvent
  "ChunkWatchEvent is fired when an event involving a chunk being watched occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  chunk contains the ChunkCoordIntPair of the Chunk this event is affecting.
  player contains the EntityPlayer that is involved with this chunk being watched.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkWatchEvent]))

(defn ->chunk-watch-event
  "Constructor.

  chunk - `net.minecraft.util.math.ChunkPos`
  player - `net.minecraft.entity.player.EntityPlayerMP`"
  (^ChunkWatchEvent [^net.minecraft.util.math.ChunkPos chunk ^net.minecraft.entity.player.EntityPlayerMP player]
    (new ChunkWatchEvent chunk player)))

(defn get-chunk
  "returns: `net.minecraft.util.math.ChunkPos`"
  (^net.minecraft.util.math.ChunkPos [^ChunkWatchEvent this]
    (-> this (.getChunk))))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayerMP`"
  (^net.minecraft.entity.player.EntityPlayerMP [^ChunkWatchEvent this]
    (-> this (.getPlayer))))

