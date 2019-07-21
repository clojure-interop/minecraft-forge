(ns net.minecraft.network.status.client.CPacketPing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.status.client CPacketPing]))

(defn ->c-packet-ping
  "Constructor.

  client-time-in - `long`"
  (^CPacketPing [^Long client-time-in]
    (new CPacketPing client-time-in))
  (^CPacketPing []
    (new CPacketPing )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPing this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPing this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.status.INetHandlerStatusServer`"
  ([^CPacketPing this ^net.minecraft.network.status.INetHandlerStatusServer handler]
    (-> this (.processPacket handler))))

(defn get-client-time
  "returns: `long`"
  (^Long [^CPacketPing this]
    (-> this (.getClientTime))))

