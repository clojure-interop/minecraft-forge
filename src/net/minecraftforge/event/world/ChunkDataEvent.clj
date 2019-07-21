(ns net.minecraftforge.event.world.ChunkDataEvent
  "ChunkDataEvent is fired when an event involving chunk data occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  data contains the NBTTagCompound containing the chunk data for this event.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ChunkDataEvent]))

(defn ->chunk-data-event
  "Constructor.

  chunk - `net.minecraft.world.chunk.Chunk`
  data - `net.minecraft.nbt.NBTTagCompound`"
  (^ChunkDataEvent [^net.minecraft.world.chunk.Chunk chunk ^net.minecraft.nbt.NBTTagCompound data]
    (new ChunkDataEvent chunk data)))

(defn get-data
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ChunkDataEvent this]
    (-> this (.getData))))

