(ns net.minecraftforge.event.world.ChunkWatchEvent$UnWatch
  "ChunkWatchEvent.UnWatch is fired when an EntityPlayer stops watching a chunk.
  This event is fired when a chunk is removed from the watched chunks of an EntityPlayer in
  PlayerChunkMapEntry.removePlayer(EntityPlayerMP).

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkWatchEvent$UnWatch]))

(defn ->un-watch
  "Constructor.

  chunk-location - `net.minecraft.util.math.ChunkPos`
  player - `net.minecraft.entity.player.EntityPlayerMP`"
  (^ChunkWatchEvent$UnWatch [^net.minecraft.util.math.ChunkPos chunk-location ^net.minecraft.entity.player.EntityPlayerMP player]
    (new ChunkWatchEvent$UnWatch chunk-location player)))

