(ns net.minecraft.network.login.server.SPacketDisconnect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login.server SPacketDisconnect]))

(defn ->s-packet-disconnect
  "Constructor.

  p-i-46853-1 - `net.minecraft.util.text.ITextComponent`"
  (^SPacketDisconnect [^net.minecraft.util.text.ITextComponent p-i-46853-1]
    (new SPacketDisconnect p-i-46853-1))
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
  "handler - `net.minecraft.network.login.INetHandlerLoginClient`"
  ([^SPacketDisconnect this ^net.minecraft.network.login.INetHandlerLoginClient handler]
    (-> this (.processPacket handler))))

(defn get-reason
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketDisconnect this]
    (-> this (.getReason))))

