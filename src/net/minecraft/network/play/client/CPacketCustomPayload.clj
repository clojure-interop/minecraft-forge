(ns net.minecraft.network.play.client.CPacketCustomPayload
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketCustomPayload]))

(defn ->c-packet-custom-payload
  "Constructor.

  channel-in - `java.lang.String`
  buf-in - `net.minecraft.network.PacketBuffer`"
  (^CPacketCustomPayload [^java.lang.String channel-in ^net.minecraft.network.PacketBuffer buf-in]
    (new CPacketCustomPayload channel-in buf-in))
  (^CPacketCustomPayload []
    (new CPacketCustomPayload )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketCustomPayload this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketCustomPayload this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketCustomPayload this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-channel-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CPacketCustomPayload this]
    (-> this (.getChannelName))))

(defn get-buffer-data
  "returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^CPacketCustomPayload this]
    (-> this (.getBufferData))))

