(ns net.minecraft.network.play.server.SPacketDisconnect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketDisconnect]))

(defn ->s-packet-disconnect
  "Constructor.

  message-in - `net.minecraft.util.text.ITextComponent`"
  (^SPacketDisconnect [^net.minecraft.util.text.ITextComponent message-in]
    (new SPacketDisconnect message-in))
  (^SPacketDisconnect []
    (new SPacketDisconnect )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketDisconnect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketDisconnect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketDisconnect this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-reason
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketDisconnect this]
    (-> this (.getReason))))

