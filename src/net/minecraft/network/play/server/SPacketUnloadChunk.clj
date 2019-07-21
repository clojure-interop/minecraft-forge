(ns net.minecraft.network.play.server.SPacketUnloadChunk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUnloadChunk]))

(defn ->s-packet-unload-chunk
  "Constructor.

  x-in - `int`
  z-in - `int`"
  (^SPacketUnloadChunk [^Integer x-in ^Integer z-in]
    (new SPacketUnloadChunk x-in z-in))
  (^SPacketUnloadChunk []
    (new SPacketUnloadChunk )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUnloadChunk this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUnloadChunk this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketUnloadChunk this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `int`"
  (^Integer [^SPacketUnloadChunk this]
    (-> this (.getX))))

(defn get-z
  "returns: `int`"
  (^Integer [^SPacketUnloadChunk this]
    (-> this (.getZ))))

