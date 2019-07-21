(ns net.minecraft.network.play.client.CPacketKeepAlive
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketKeepAlive]))

(defn ->c-packet-keep-alive
  "Constructor.

  id-in - `int`"
  (^CPacketKeepAlive [^Integer id-in]
    (new CPacketKeepAlive id-in))
  (^CPacketKeepAlive []
    (new CPacketKeepAlive )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketKeepAlive this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketKeepAlive this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketKeepAlive this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-key
  "returns: `int`"
  (^Integer [^CPacketKeepAlive this]
    (-> this (.getKey))))

