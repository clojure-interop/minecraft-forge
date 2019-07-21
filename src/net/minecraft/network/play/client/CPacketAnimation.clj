(ns net.minecraft.network.play.client.CPacketAnimation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketAnimation]))

(defn ->c-packet-animation
  "Constructor.

  hand-in - `net.minecraft.util.EnumHand`"
  (^CPacketAnimation [^net.minecraft.util.EnumHand hand-in]
    (new CPacketAnimation hand-in))
  (^CPacketAnimation []
    (new CPacketAnimation )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketAnimation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketAnimation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketAnimation this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^CPacketAnimation this]
    (-> this (.getHand))))

