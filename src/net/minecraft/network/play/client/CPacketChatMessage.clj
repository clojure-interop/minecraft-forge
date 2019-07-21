(ns net.minecraft.network.play.client.CPacketChatMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketChatMessage]))

(defn ->c-packet-chat-message
  "Constructor.

  message-in - `java.lang.String`"
  (^CPacketChatMessage [^java.lang.String message-in]
    (new CPacketChatMessage message-in))
  (^CPacketChatMessage []
    (new CPacketChatMessage )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketChatMessage this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketChatMessage this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketChatMessage this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^CPacketChatMessage this]
    (-> this (.getMessage))))

