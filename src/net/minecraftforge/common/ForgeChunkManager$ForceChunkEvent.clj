(ns net.minecraftforge.common.ForgeChunkManager$ForceChunkEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$ForceChunkEvent]))

(defn ->force-chunk-event
  "Constructor.

  ticket - `net.minecraftforge.common.ForgeChunkManager$Ticket`
  location - `net.minecraft.util.math.ChunkPos`"
  (^ForgeChunkManager$ForceChunkEvent [^net.minecraftforge.common.ForgeChunkManager$Ticket ticket ^net.minecraft.util.math.ChunkPos location]
    (new ForgeChunkManager$ForceChunkEvent ticket location)))

(defn get-ticket
  "returns: `net.minecraftforge.common.ForgeChunkManager$Ticket`"
  (^net.minecraftforge.common.ForgeChunkManager$Ticket [^ForgeChunkManager$ForceChunkEvent this]
    (-> this (.getTicket))))

(defn get-location
  "returns: `net.minecraft.util.math.ChunkPos`"
  (^net.minecraft.util.math.ChunkPos [^ForgeChunkManager$ForceChunkEvent this]
    (-> this (.getLocation))))

