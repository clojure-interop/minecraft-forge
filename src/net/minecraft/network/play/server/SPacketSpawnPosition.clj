(ns net.minecraft.network.play.server.SPacketSpawnPosition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnPosition]))

(defn ->s-packet-spawn-position
  "Constructor.

  pos-in - `net.minecraft.util.math.BlockPos`"
  (^SPacketSpawnPosition [^net.minecraft.util.math.BlockPos pos-in]
    (new SPacketSpawnPosition pos-in))
  (^SPacketSpawnPosition []
    (new SPacketSpawnPosition )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnPosition this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnPosition this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnPosition this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-spawn-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketSpawnPosition this]
    (-> this (.getSpawnPos))))

