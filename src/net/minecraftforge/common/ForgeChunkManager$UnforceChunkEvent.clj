(ns net.minecraftforge.common.ForgeChunkManager$UnforceChunkEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$UnforceChunkEvent]))

(defn ->unforce-chunk-event
  "Constructor.

  ticket - `net.minecraftforge.common.ForgeChunkManager$Ticket`
  location - `net.minecraft.util.math.ChunkPos`"
  (^ForgeChunkManager$UnforceChunkEvent [^net.minecraftforge.common.ForgeChunkManager$Ticket ticket ^net.minecraft.util.math.ChunkPos location]
    (new ForgeChunkManager$UnforceChunkEvent ticket location)))

(defn get-ticket
  "returns: `net.minecraftforge.common.ForgeChunkManager$Ticket`"
  (^net.minecraftforge.common.ForgeChunkManager$Ticket [^ForgeChunkManager$UnforceChunkEvent this]
    (-> this (.getTicket))))

(defn get-location
  "returns: `net.minecraft.util.math.ChunkPos`"
  (^net.minecraft.util.math.ChunkPos [^ForgeChunkManager$UnforceChunkEvent this]
    (-> this (.getLocation))))

