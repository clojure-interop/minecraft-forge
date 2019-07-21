(ns net.minecraft.network.play.server.SPacketCustomPayload
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCustomPayload]))

(defn ->s-packet-custom-payload
  "Constructor.

  channel-in - `java.lang.String`
  buf-in - `net.minecraft.network.PacketBuffer`"
  (^SPacketCustomPayload [^java.lang.String channel-in ^net.minecraft.network.PacketBuffer buf-in]
    (new SPacketCustomPayload channel-in buf-in))
  (^SPacketCustomPayload []
    (new SPacketCustomPayload )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCustomPayload this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCustomPayload this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCustomPayload this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-channel-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketCustomPayload this]
    (-> this (.getChannelName))))

(defn get-buffer-data
  "returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^SPacketCustomPayload this]
    (-> this (.getBufferData))))

