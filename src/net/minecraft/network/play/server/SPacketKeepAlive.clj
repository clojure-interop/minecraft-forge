(ns net.minecraft.network.play.server.SPacketKeepAlive
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketKeepAlive]))

(defn ->s-packet-keep-alive
  "Constructor.

  id-in - `int`"
  (^SPacketKeepAlive [^Integer id-in]
    (new SPacketKeepAlive id-in))
  (^SPacketKeepAlive []
    (new SPacketKeepAlive )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketKeepAlive this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketKeepAlive this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketKeepAlive this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-id
  "returns: `int`"
  (^Integer [^SPacketKeepAlive this]
    (-> this (.getId))))

