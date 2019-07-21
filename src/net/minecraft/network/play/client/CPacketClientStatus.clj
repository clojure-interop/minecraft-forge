(ns net.minecraft.network.play.client.CPacketClientStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketClientStatus]))

(defn ->c-packet-client-status
  "Constructor.

  p-i-46886-1 - `net.minecraft.network.play.client.CPacketClientStatus$State`"
  (^CPacketClientStatus [^net.minecraft.network.play.client.CPacketClientStatus$State p-i-46886-1]
    (new CPacketClientStatus p-i-46886-1))
  (^CPacketClientStatus []
    (new CPacketClientStatus )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketClientStatus this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketClientStatus this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketClientStatus this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-status
  "returns: `net.minecraft.network.play.client.CPacketClientStatus$State`"
  (^net.minecraft.network.play.client.CPacketClientStatus$State [^CPacketClientStatus this]
    (-> this (.getStatus))))

