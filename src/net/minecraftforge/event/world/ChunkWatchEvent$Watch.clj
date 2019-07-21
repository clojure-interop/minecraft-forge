(ns net.minecraftforge.event.world.ChunkWatchEvent$Watch
  "ChunkWatchEvent.Watch is fired when an EntityPlayer begins watching a chunk.
  This event is fired when a chunk is added to the watched chunks of an EntityPlayer in
  PlayerChunkMapEntry.addPlayer(EntityPlayerMP) and PlayerChunkMapEntry.sendToPlayers().

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkWatchEvent$Watch]))

(defn ->watch
  "Constructor.

  chunk - `net.minecraft.util.math.ChunkPos`
  player - `net.minecraft.entity.player.EntityPlayerMP`"
  (^ChunkWatchEvent$Watch [^net.minecraft.util.math.ChunkPos chunk ^net.minecraft.entity.player.EntityPlayerMP player]
    (new ChunkWatchEvent$Watch chunk player)))

