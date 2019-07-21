(ns net.minecraft.network.status.server.SPacketPong
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.status.server SPacketPong]))

(defn ->s-packet-pong
  "Constructor.

  client-time-in - `long`"
  (^SPacketPong [^Long client-time-in]
    (new SPacketPong client-time-in))
  (^SPacketPong []
    (new SPacketPong )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPong this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketPong this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.status.INetHandlerStatusClient`"
  ([^SPacketPong this ^net.minecraft.network.status.INetHandlerStatusClient handler]
    (-> this (.processPacket handler))))

