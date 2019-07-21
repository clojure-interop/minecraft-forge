(ns net.minecraft.network.play.client.CPacketResourcePackStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketResourcePackStatus]))

(defn ->c-packet-resource-pack-status
  "Constructor.

  p-i-47156-1 - `net.minecraft.network.play.client.CPacketResourcePackStatus$Action`"
  (^CPacketResourcePackStatus [^net.minecraft.network.play.client.CPacketResourcePackStatus$Action p-i-47156-1]
    (new CPacketResourcePackStatus p-i-47156-1))
  (^CPacketResourcePackStatus []
    (new CPacketResourcePackStatus )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketResourcePackStatus this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketResourcePackStatus this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketResourcePackStatus this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

